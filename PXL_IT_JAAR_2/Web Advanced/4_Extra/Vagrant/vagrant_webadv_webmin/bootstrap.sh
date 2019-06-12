#!/bin/bash

MYSQLPASSWORD='root'

XDEBUG=$(cat <<EOF
zend_extension=xdebug.so
xdebug.remote_enable = 1
xdebug.remote_connect_back = 1
xdebug.remote_port = 9000
EOF
)

VHOST=$(cat <<EOF
<VirtualHost *:80>
    DocumentRoot "/var/www/html/"
    ServerName webadv
    ServerAlias webadv
    <Directory "/var/www/html/">
        AllowOverride All
        Require all granted
    </Directory>
</VirtualHost>
EOF
)

apt-get update

apt-get install -y software-properties-common
apt-get install -y python-software-properties
add-apt-repository -y ppa:ondrej/php
add-apt-repository -y "deb [arch=amd64] http://download.webmin.com/download/repository sarge contrib"
wget -q http://www.webmin.com/jcameron-key.asc -O- | sudo apt-key add -

apt-get update

apt-get install -y php7.3 
apt-get install -ylibapache2-mod-php
apt-get install -y zip 
apt-get install -y unzip 
apt-get install -y php7.3-zip
apt-get install -y apache2

echo "${VHOST}" > /etc/apache2/sites-available/000-default.conf
echo "${XDEBUG}" >> /etc/php/7.3/apache2/php.ini

sed -i s/display_errors\ =\ Off/display_errors\ =\ On/g /etc/php/7.3/apache2/php.ini

debconf-set-selections <<< "mysql-server mysql-server/root_password password $MYSQLPASSWORD"
debconf-set-selections <<< "mysql-server mysql-server/root_password_again password $MYSQLPASSWORD"
apt-get install -y mysql-server
apt-get install -y php7.3-mysql
apt-get install -y php7.3-pdo-sqlite
apt-get install -y php-xdebug

apt -y install webmin

mysql -uroot -proot -e "GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY 'root' WITH GRANT OPTION; FLUSH PRIVILEGES;"
sed -ie s/^bind-address.*$/bind-address\ \ \ \ \ \ \ \ \ \ \ \ \=\ 0.0.0.0/g /etc/mysql/mysql.conf.d/mysqld.cnf

a2enmod rewrite

curl -Ss https://getcomposer.org/installer | php
mv composer.phar /usr/bin/composer

curl -sL https://deb.nodesource.com/setup_10.x | bash -
apt-get install -y nodejs

chown -R vagrant:www-data /var/www/html/
chmod g+s /var/www/html/

rm /var/www/html/index.html
echo '<?php phpinfo(); ' > /var/www/html/info.php
chown vagrant /var/www/html/info.php
echo '<?php oops ' > /var/www/html/error.php
chown vagrant /var/www/html/error.php

service apache2 restart
service mysql restart
