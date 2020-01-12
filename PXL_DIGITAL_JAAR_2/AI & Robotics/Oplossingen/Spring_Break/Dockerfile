# Let's start from Ubuntu 18.04
FROM ubuntu:18.04

# We love UTF!
ENV LANG C.UTF-8

# Make the container ready to install extra software,
# update & upgrade it, install Python 3 and clean all archives.
RUN set -x \
        && apt-get update \
        && apt-get upgrade -y \
        && apt-get install -y  ca-certificates sudo \
        && apt-get install -y git python3.7 \ 
        && apt-get install -y libsm6 libxext6 libxrender1 libfontconfig1

RUN apt-get install -y python3-pip \
        && pip3 install fastai==0.7 \
        && pip3 install jupyter==1 \
        && pip3 install flask==1.0.2 \
        && pip3 install opencv-python opencv-contrib-python \
        && rm -rf /var/lib/apt/lists/* \
        && useradd -ms /bin/bash user \
        && echo "user:user" | chpasswd && adduser user sudo

USER user
WORKDIR /home/user
RUN mkdir app
RUN mkdir jupyter

# Set some decent colors if the container needs to be accessed via /bin/bash.
RUN echo LS_COLORS=$LS_COLORS:\'di=1\;33:ln=36\' >> ~/.bashrc \
&& echo export LS_COLORS >> ~/.bashrc \
&& touch ~/.sudo_as_admin_successful # To surpress the sudo message at run.

STOPSIGNAL SIGTERM

CMD /bin/bash
