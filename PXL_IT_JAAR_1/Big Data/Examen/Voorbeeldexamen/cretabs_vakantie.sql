DROP SEQUENCE gemeente_id_seq;
DROP SEQUENCE klant_id_seq;

DROP SEQUENCE vakantie_id_seq;
DROP SEQUENCE inschrijving_id_seq;

DROP TABLE inschrijvingen_kindgegevens;
DROP TABLE inschrijvingen;
DROP TABLE vakanties;
DROP TABLE verblijfplaatsen;

DROP TABLE klanten;

DROP TABLE gemeenten;

DROP TABLE landen;


CREATE SEQUENCE gemeente_id_seq START WITH 1;
CREATE SEQUENCE klant_id_seq START WITH 100;
CREATE SEQUENCE vakantie_id_seq START WITH 2000;
CREATE SEQUENCE inschrijving_id_seq START WITH 1;


CREATE TABLE landen (land_id VARCHAR2(3) CONSTRAINT lan_landid_pk PRIMARY KEY,  landnaam VARCHAR2(30)
);


CREATE TABLE gemeenten (gemeente_id number(3)  CONSTRAINT gem_gemid_pk PRIMARY KEY, gemeente_naam VARCHAR2(30),postcode VARCHAR2(10)  , land_id VARCHAR2(3) CONSTRAINT gem_landid_fk REFERENCES landen(land_id)
);


CREATE TABLE klanten(klant_id VARCHAR2(20) CONSTRAINT klant_klantid_pk PRIMARY KEY,  klant_naam  VARCHAR2(20),  klant_voornaam VARCHAR2(20),
klant_adres  VARCHAR2(30),  klant_gemeente_id number(3) CONSTRAINT klant_gemid_fk REFERENCES gemeenten(gemeente_id),  klant_telefoonnummer  VARCHAR2(30),
  klant_email VARCHAR2(30)
,  klant_werkloos  VARCHAR2(1));


CREATE TABLE verblijfplaatsen(verbl_id varchar2(5) CONSTRAINT verbl_verblid_pk PRIMARY KEY, verbl_naam varchar2(30), verbl_adres varchar2(30), verbl_gem_id number(3) CONSTRAINT verbl_gemid_fk REFERENCES gemeenten(gemeente_id) );

CREATE TABLE Vakanties(vakantie_id  number(10) CONSTRAINT vak_vakid_pk PRIMARY KEY, vakantie_type VARCHAR2(30), verbl_id VARCHAR2(5) CONSTRAINT vak_verbl_fk REFERENCES verblijfplaatsen(verbl_id), van DATE, tot DATE,	vervoer VARCHAR2(30), opstapplaats VARCHAR2(30), mingeboortejaar NUMBER(4), maxgeboortejaar NUMBER(4), prijs NUMBER(6,2), max_aantal_inschrijvingen NUMBER(3) );

CREATE TABLE inschrijvingen(inschrijving_id number(10) CONSTRAINT inschr_inschrid_pk PRIMARY KEY,klant_id VARCHAR2(20) CONSTRAINT inschr_klantid_fk REFERENCES Klanten(klant_id), vak_id number(10) CONSTRAINT inschr_vakid_fk REFERENCES Vakanties(vakantie_id), boekingsdatum DATE, betaald_bedrag NUMBER(6,2) );

CREATE TABLE inschrijvingen_kindgegevens(inschr_id number(10) CONSTRAINT inschrkind_inschrid_fk REFERENCES inschrijvingen(inschrijving_id),  kind_voornaam VARCHAR2(30), kind_naam VARCHAR2(30), geboortedatum DATE, lengte NUMBER(3,2), schoenmaat NUMBER (2), cm_lid  VARCHAR2(1), CONSTRAINT inschrkind_pk PRIMARY KEY (inschr_id, kind_voornaam, kind_naam)  );


INSERT INTO landen VALUES ('BE', 'Belgie');

INSERT INTO landen VALUES ('NL', 'Nederland');

INSERT INTO landen VALUES ('ES', 'Spanje');

INSERT INTO landen VALUES ('AT', 'Oostenrijk');

INSERT INTO landen VALUES ('IT', 'Italie');

INSERT INTO landen VALUES ('FR', 'Frankrijk');

INSERT INTO landen VALUES ('PT', 'Portugal');

INSERT INTO landen VALUES ('DE', 'Duitsland');

INSERT INTO landen VALUES ('CH', 'Zwitserland');



INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Brugge',8000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Namen', 5000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Charleroi', 6000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Waver', 1300, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Genk', 3600, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bree', 3960, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Diepenbeek', 3590, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aalst', 9300, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aalter', 9880, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aarlen', 6700, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aarschot', 3200, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aartselaar', 2630, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Affligem', 1790, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Antwerpen', 2000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Balen', 2490, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bastogne', 6600, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Beernem', 8730, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Beerse', 2340, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Beersel', 1650, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bekkevoort', 3460, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bergen', 7000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bierbeek', 3360, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Borgworm', 4300, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Brussel', 1000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Chimay', 6460, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aartselaar', 2630, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Affligem', 1790, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Antwerpen', 2000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Balen', 2490, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bastogne', 6600, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Beernem', 8730, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Beerse', 2340, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Beersel', 1650, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bekkevoort', 3460, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bergen', 7000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bierbeek', 3360, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Borgworm', 4300, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Brussel', 1000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Chimay', 6460, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Chiny', 6810, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Celles', 7760, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Damme', 8340, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Deinze', 9800, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Dendermonde', 9200, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Doornik', 7500, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Eeklo', 9900, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Edegem',2650, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Erpe-Mere', 9420, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Erps-Kwerps', 3071, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Evere', 1140, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Elsene', 1050, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Faimes', 4317, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Fernelmont',5380, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Forrest', 1190, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Geel', 2440, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Geetbets',3450, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Gistel',8470, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Grobbendonk',2280, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Haacht',3150, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Hasselt',3500, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Zolder',3550, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Heusden',3550, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Heers',3870, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Hoegaarden',3320, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Houthalen',3530, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Helchteren',3530, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Ieper',8900, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Izegem',8870, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Jabbeke',8490, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Jette',1090, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Kampenhout',1910, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Koekelare',8680, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Leuven',3000, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Lommel',3920, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Maaseik',3680, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Meensel',3391, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Kiezegem',3391, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Nijvel',1400, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Ohey',5350, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Opglabbeek',3660, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Overpelt',3900, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Peer',3990, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Retie',2470, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Ronse',9600, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Scherpenheuvel',3270, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Tielt',3390, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Winge',3390, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Tienen',3300, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Ukkel',1180, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Verviers',4800, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Veurne',8630, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Voeren',3790, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Westerlo',2260, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Zaventem',1930, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Zichem',3271, 'BE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval,  'Grave',536, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Wijchen',660, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Berlium',528, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Vught',526, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Vlijmen',525, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Drunen',515, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Oss',534, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Helmond',570, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Eindhoven',561, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Oirschot',568, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Moergestel',506, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Uden',540, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Haaften',417, 'NL');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Lissabon',50214, 'PT');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Setubal',50222, 'PT');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Paris',502141, 'FR');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aken',52422, 'DE');

INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Rome',65482, 'IT');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Oberau',6311, 'AT');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Feldberg',79868, 'DE');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Saalbach-Hinterglemm',5753, 'AT');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Bilbao',48001, 'ES');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Fiesch',3984, 'CH');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Como',	22100, 'IT');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Aosta',11100, 'IT');
INSERT INTO gemeenten VALUES (gemeente_id_seq.nextval, 'Rimini',47900, 'IT');






INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Witte','Neil','Zonneweeldelaan 57',10, '0487/16 25 14', 'n.witte@telenet.be', 'J');
INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Klawitter','Nils','Zonnelaan 17',20, '0489/26 25 14', 'nils.klawitter@telenet.be', 'J');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Kenes','Jules','Statiestraat 74',30, '0467/22 33 44', 'jkenes@telenet.be' , 'N');
INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Franssen','Fons','Saliestraat 76',40,'0467/22 44 47','fons.franssen@skynet.be', 'J');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Hons','Albert','Bloemenstraat 12',76,'0467/22 44 20','albert.hons@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Huisjes','Bert','Bloemenstraat 22',76,'0467/22 42 36','bert.huisjes@telenet.be', 'N');
INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Willems','Bjorn','Vaarnstraat 25', 20,'0497/22 33 44','bjorn.willems@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Waterman','Wim','peertjesstraat 20',76,'0467/77 33 44','wim.waterman@gemial.com', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Janssens','Herman','Tulpenstraat 33',76,'0467/52 33 44','h.janssens@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Klimop','Fine','Meesstraat 14',76,'0467/22 33 54','fine.klimop@base.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Daenen','Jef','Jaagpad 5',2,'0467/22 33 47','jef.daenen@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Tilkens','Luciene','P.Ballingsstraat 102',76,'0488/22 33 44','ltilkes@telenet.be', 'N');
INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Tilkens','Anne','P.Ballingsstraat 106',76,'0496/56 33 44','atilkes@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Claes','Margaret','Kolenstraat 699',76,'0467/22 96 44','margaret.claes@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Kuppens','Johan','Madeliefstraat 57',62,'0467/22 43 44','johan.kuppens@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Beervoets','Kris','Dorpsstraat 58',42,'0467/22 16 44','kris.beervoets@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Berden','Johan','Blerebergstraat 61',22,'0467/74 73 44','johan.berden@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Spaelt','Annelies','Grensstraat 34',45,'0467/22 63 44','annelies.spaelt@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Vanneste','Truus','Lievensstraat 24',12,'0467/22 83 44','truus.vanneste@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Goedeman','Vincent','Kerkstraat 81',62,'0467/22 99 44','vincent.goedeman@gmail.com', 'J');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Verstreken','John','Koelstraat 73',65,'0467/22 33 99','john.verstreken@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Janssens','Janina','Tuinstraat 28',98,'0467/22 33 88','janina.janssens@base.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Heersel','Piet','Watermanstraat 10',48,'0467/22 33 14','piet.heersel@base.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Borders','Tim','Dorpsstraat 50',62,'0467/22 33 12','tim.borders@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Terriers','Steven','Sporkstraat 47',65,'0467/22 14 44','steven.terriers@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Teerain','Sven','Sportstraat 75',62,'0467/22 33 91','sven.teerain@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Bergen','Koen','Landweg 104',69,'0467/22 33 98','koen.bergen@skynet.be', 'J');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Bertels','Bert','Koekoeksstraat 77',62,'0467/98 33 44','bert.bertels@base.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'De Backer','Birgit','Merelstraat 2',62,'0467/97 33 44','birgit.debacker@politie.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Charlo','Jan','Veldstraat 17',22,'0467/22 33 65','jan.charlo@gmail.com', 'N');



INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Claessens','Mark','Keulenstraat 69',7,'0477/24 96 44','mark.claes@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Kuppens','Jan','Maatstraat 7',62,'0469/22 43 44','jan.kuppens@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Bevers','Kris','Kerkstraat 8',40,'0488/27 16 44','kris.bevers@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Beerden','Johan','Berebroekstraat 601',32,'0497/74 73 44','johan.beerden@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Spark','An','Grasstraat 344',15,'0497/22 63 44','an.spark@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Vandenneste','Tine','Loverstraat 246',21,'0497/22 83 44','tine123@outlook.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Gelders','Vincent','Kerkstraat 17',32,'0487/22 99 44','vincent555@gmail.com', 'J');
INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Verreken','Johannna','Keelstraat 3',5,'0477/37 33 99','j.verreken@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Jans','Bertina','Tuinierstraat 8',9,'0487/69 33 88','bertina.jans@base.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Daenen','Pieter','Waterstraat 1',38,'0468/71 33 14','pieter.daenen@base.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Beerts','Tom','Leliestraat 50',62,'0497/22 33 12','tom.beerts@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Donck','Steven','Krokusstraat 47',65,'0499/22 14 44','steven.donck@telenet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Adams','Sven','Sportstraat 5',32,'0499/22 33 91','sven.teerain@skynet.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Beerten','Koen','Landlaan 104',9,'0495/22 33 98','koen.bergen@skynet.be', 'J');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Bertels','Gert','Koekoeksstraat 7',42,'0498/98 33 44','gert.bertels@base.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'De Backer','Hans','Musstraat 29',22,'0484/97 33 44','hans.debacker@politie.be', 'N');

INSERT INTO klanten VALUES(klant_id_seq.NEXTVAL,'Poos', 'Carlo','Veldstraat 87',11,'0497/72 33 65','charlop@gmail.com', 'N');




INSERT INTO verblijfplaatsen VALUES('BE1', 'Ter Heide', 'Bosstraat 63', 74);
INSERT INTO verblijfplaatsen VALUES('BE2', 'Bos en meer', 'Zandvoordestraat 161', 67);
INSERT INTO verblijfplaatsen VALUES('BE3', 'Boerke Peer', 'Broekstraat 54', 82);
INSERT INTO verblijfplaatsen VALUES('FR1', 'Résidence Napoleon', 'Rue Riquet 222', 111);
INSERT INTO verblijfplaatsen VALUES('DE2', 'Aachener Hof', 'Schleidener Strasse 99', 112);
INSERT INTO verblijfplaatsen VALUES('DE1', 'Veltishof', 'Auf dem Berg 12', 115);
INSERT INTO verblijfplaatsen VALUES('AT1', 'Pferdestal', 'HinterglemmStrasse 7', 116);
INSERT INTO verblijfplaatsen VALUES('AT2', 'Walegghof', 'KirchStrasse 41', 116);
INSERT INTO verblijfplaatsen VALUES('AT3', 'Angerhof', 'HauptStrasse 21', 114);
INSERT INTO verblijfplaatsen VALUES('AT4', 'Leitnerhof', 'WiesenStrasse 17', 114);
INSERT INTO verblijfplaatsen VALUES('ES1', 'Egoitza CM Belgica', 'Gorte Kalea 155', 117);
INSERT INTO verblijfplaatsen VALUES('IT1', 'Residenza Roma', 'Via Collatina 623', 113);
INSERT INTO verblijfplaatsen VALUES('IT2', 'Villa Cecila', 'Via Cecillio 87', 119);
INSERT INTO verblijfplaatsen VALUES('IT3', 'Villa Pasquale', 'Via Pascarella 32', 121);
INSERT INTO verblijfplaatsen VALUES('IT4', 'Residenza Primavera', 'Via Torino 203', 120);
INSERT INTO verblijfplaatsen VALUES('CH1', 'Hof Sonne', 'Sonnestrasse 122', 118);

-- vullen van vakanties----------------------------------------------------------------
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'bosverkenning', 	'BE1',	to_date('07/04/2016', 'dd/mm/yyyy') ,	to_date('14/04/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Mechelen', 	2006	,	2008	,	159	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'hossen in de bossen', 	'BE1',	to_date('10/07/2016', 'dd/mm/yyyy') ,	to_date('17/07/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2006	,	2008	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'bosverkenning', 	'BE1',	to_date('09/04/2017', 'dd/mm/yyyy') ,	to_date('17/04/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Mechelen', 	2007	,	2009	,	159	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'hossen in de bossen', 	'BE1',	to_date('09/07/2017', 'dd/mm/yyyy') ,	to_date('17/07/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2007	,	2009	,	123	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'spelen in de natuur', 	'BE2',	to_date('03/04/2016', 'dd/mm/yyyy') ,	to_date('9/04/2016', 'dd/mm/yyyy') , 	'bus', 	'Aalst, Leuven', 	2006	,	2008	,	123	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'spelen in de natuur', 	'BE2',	to_date('03/04/2017', 'dd/mm/yyyy') ,	to_date('9/04/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2007	,	2009	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'hossen in de bossen', 	'BE2',	to_date('10/07/2016', 'dd/mm/yyyy') ,	to_date('17/07/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2006	,	2008	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'boerderijvakantie', 	'BE3',	to_date('03/04/2016', 'dd/mm/yyyy') ,	to_date('11/04/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Gent, Leuven', 	2006	,	2008	,	149	,	12);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'boerderijvakantie', 	'BE3',	to_date('03/08/2016', 'dd/mm/yyyy') ,	to_date('11/08/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Gent, Leuven', 	2006	,	2008	,	149	,	12);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'boerderijvakantie', 	'BE3',	to_date('08/07/2016', 'dd/mm/yyyy') ,	to_date('15/07/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Gent, Leuven', 	2006	,	2008	,	149	,	12);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'boerderijvakantie', 	'BE3',	to_date('03/04/2017', 'dd/mm/yyyy') ,	to_date('11/04/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Gent, Leuven', 	2007	,	2009	,	149	,	12);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'boerderijvakantie', 	'BE3',	to_date('03/08/2017', 'dd/mm/yyyy') ,	to_date('11/08/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Gent, Leuven', 	2007	,	2009	,	149	,	12);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'boerderijvakantie', 	'BE3',	to_date('08/07/2017', 'dd/mm/yyyy') ,	to_date('15/07/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Gent, Leuven', 	2007	,	2009	,	149	,	12);
													
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'Franse taal en cultuur', 	'FR1',	to_date('12/08/2016', 'dd/mm/yyyy') ,	to_date('19/08/2016', 'dd/mm/yyyy') , 	'bus', 	'Hasselt, Leuven', 	2002	,	2003	,	187	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'Franse taal en cultuur', 	'FR1',	to_date('20/07/2016', 'dd/mm/yyyy') ,	to_date('27/07/2016', 'dd/mm/yyyy') , 	'bus', 	'Hasselt, Leuven', 	2002	,	2003	,	187	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'Franse taal en cultuur', 	'FR1',	to_date('23/07/2017', 'dd/mm/yyyy') ,	to_date('30/07/2017', 'dd/mm/yyyy') , 	'bus', 	'Hasselt, Leuven', 	2003	,	2004	,	187	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'Franse taal en cultuur', 	'FR1',	to_date('03/08/2017', 'dd/mm/yyyy') ,	to_date('11/08/2017', 'dd/mm/yyyy') , 	'bus', 	'Hasselt, Leuven', 	2003	,	2004	,	187	,	20);
													
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'AT1',	to_date('03/04/2016', 'dd/mm/yyyy') ,	to_date('11/04/2016', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	1998	,	2000	,	249	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'AT2',	to_date('03/04/2016', 'dd/mm/yyyy') ,	to_date('11/04/2016', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	1998	,	2000	,	249	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'AT1',	to_date('03/04/2017', 'dd/mm/yyyy') ,	to_date('11/04/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	1999	,	2001	,	249	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'AT2',	to_date('03/04/2017', 'dd/mm/yyyy') ,	to_date('11/04/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	1999	,	2001	,	249	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'AT1',	to_date('27/12/2016', 'dd/mm/yyyy') ,	to_date('4/01/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	1998	,	2000	,	249	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'AT2',	to_date('27/12/2016', 'dd/mm/yyyy') ,	to_date('4/01/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	1998	,	2000	,	249	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'AT1',	to_date('07/07/2016', 'dd/mm/yyyy') ,	to_date('14/07/2016', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2003	,	2004	,	147	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'AT2',	to_date('07/08/2016', 'dd/mm/yyyy') ,	to_date('14/08/2016', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2003	,	2004	,	147	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'AT1',	to_date('07/07/2017', 'dd/mm/yyyy') ,	to_date('14/07/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2004	,	2005	,	147	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'AT2',	to_date('07/07/2017', 'dd/mm/yyyy') ,	to_date('14/07/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2004	,	2005	,	147	,	20);
													
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'loco Bilbao', 	'ES1',	to_date('10/07/2016', 'dd/mm/yyyy') ,	to_date('17/07/2016', 'dd/mm/yyyy') , 	'trein', 	'Brussel', 	2001	,	2002	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'loco Bilbao', 	'ES1',	to_date('07/07/2017', 'dd/mm/yyyy') ,	to_date('14/07/2017', 'dd/mm/yyyy') , 	'trein', 	'Brussel', 	2002	,	2003	,	149	,	20);
													
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'Viva Roma!!', 	'IT1',	to_date('07/04/2016', 'dd/mm/yyyy') ,	to_date('17/04/2016', 'dd/mm/yyyy') , 	'vliegtuig', 	'Zaventem', 	2001	,	2002	,	188	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'Viva Roma!!', 	'IT1',	to_date('07/04/2017', 'dd/mm/yyyy') ,	to_date('17/04/2017', 'dd/mm/yyyy') , 	'vliegtuig', 	'Zaventem', 	2002	,	2003	,	188	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berg en meer...', 	'IT2',	to_date('10/07/2016', 'dd/mm/yyyy') ,	to_date('17/07/2016', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2003	,	2004	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berg en meer...', 	'IT2',	to_date('07/07/2017', 'dd/mm/yyyy') ,	to_date('14/07/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2004	,	2005	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'zon en zeeeee', 	'IT3',	to_date('16/07/2016', 'dd/mm/yyyy') ,	to_date('26/07/2016', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2002	,	2003	,	210	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'zon en zeeeee', 	'IT3',	to_date('16/08/2017', 'dd/mm/yyyy') ,	to_date('26/08/2017', 'dd/mm/yyyy') , 	'trein - bus', 	'Brussel', 	2003	,	2004	,	210	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'IT4',	to_date('12/07/2016', 'dd/mm/yyyy') ,	to_date('21/07/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2004	,	2005	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'IT4',	to_date('12/07/2017', 'dd/mm/yyyy') ,	to_date('21/07/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2005	,	2006	,	149	,	20);
													
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'CH1',	to_date('07/04/2016', 'dd/mm/yyyy') ,	to_date('17/04/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Mechelen', 	2000	,	2001	,	300	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'skivakantie', 	'CH1',	to_date('07/04/2017', 'dd/mm/yyyy') ,	to_date('17/04/2017', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Mechelen', 	2001	,	2002	,	300	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'CH1',	to_date('10/07/2016', 'dd/mm/yyyy') ,	to_date('17/07/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2006	,	2008	,	149	,	20);
INSERT INTO vakanties VALUES(vakantie_id_seq.nextval, 	'berginitiatie', 	'CH1',	to_date('10/07/2016', 'dd/mm/yyyy') ,	to_date('17/07/2016', 'dd/mm/yyyy') , 	'bus', 	'Brugge, Hasselt', 	2006	,	2008	,	149	,	20);

-- vullen van inschrijvingen ------------------------------------------------------------------------------------------
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	100	,	2000	,	to_date('07/02/2016', 'dd/mm/yyyy') ,	400	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	101	,	2000	,	to_date('07/03/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	102	,	2000	,	to_date('17/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	103	,	2000	,	to_date('07/01/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	104	,	2000	,	to_date('27/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	105	,	2000	,	to_date('09/03/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	106	,	2000	,	to_date('17/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	107	,	2000	,	to_date('13/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	108	,	2000	,	to_date('11/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	109	,	2000	,	to_date('18/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	110	,	2000	,	to_date('17/03/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	111	,	2000	,	to_date('11/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	112	,	2000	,	to_date('11/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	113	,	2000	,	to_date('11/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	114	,	2000	,	to_date('11/02/2016', 'dd/mm/yyyy') ,	159	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	115	,	2000	,	to_date('11/02/2016', 'dd/mm/yyyy') ,	477	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	116	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	745	);
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	117	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	118	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	119	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	120	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	121	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	122	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	123	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	124	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	125	,	2001	,	to_date('01/04/2016', 'dd/mm/yyyy') ,	1000	);
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	126	,	2002	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	795	);
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	127	,	2002	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	950	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	128	,	2002	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	477	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	129	,	2003	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	492	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	130	,	2003	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	700	);
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	131	,	2003	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	350	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	132	,	2004	,	to_date('07/01/2016', 'dd/mm/yyyy') ,	492	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	133	,	2004	,	to_date('08/01/2016', 'dd/mm/yyyy') ,	984	);
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	134	,	2004	,	to_date('07/01/2016', 'dd/mm/yyyy') ,	492	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	135	,	2005	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	136	,	2005	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	550	);
							
							
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	137	,	2005	,	to_date('07/01/2017', 'dd/mm/yyyy') ,	500	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	138	,	2006	,	to_date('07/01/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	139	,	2006	,	to_date('07/01/2016', 'dd/mm/yyyy') ,	1000	);
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	140	,	2006	,	to_date('08/01/2016', 'dd/mm/yyyy') ,	596	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	141	,	2007	,	to_date('10/01/2016', 'dd/mm/yyyy') ,	447	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	142	,	2007	,	to_date('10/01/2016', 'dd/mm/yyyy') ,	1000	);
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	143	,	2008	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	149	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	144	,	2008	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	894	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	144	,	2010	,	to_date('02/01/2017', 'dd/mm/yyyy') ,	100	);
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	116	,	2010	,	to_date('02/01/2017', 'dd/mm/yyyy') ,	100	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	116	,	2011	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	100	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	144	,	2011	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	100	);
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	100	,	2013	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	100	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	133	,	2013	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	1122	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	133	,	2015	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	1122	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	143	,	2015	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	0	);
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	128	,	2017	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	1245	);
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	103	,	2017	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	900	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	128	,	2019	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	500	);
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	103	,	2019	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	500	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	104	,	2019	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	500	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	105	,	2027	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	400	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	106	,	2027	,	to_date('02/04/2016', 'dd/mm/yyyy') ,	400	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	105	,	2028	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	400	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	106	,	2028	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	400	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	107	,	2028	,	to_date('02/04/2017', 'dd/mm/yyyy') ,	200	);
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	108	,	2029	,	to_date('02/02/2016', 'dd/mm/yyyy') ,	752	);
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	109	,	2029	,	to_date('02/02/2016', 'dd/mm/yyyy') ,	1504	);
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	110	,	2029	,	to_date('02/02/2016', 'dd/mm/yyyy') ,	376	);
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	108	,	2030	,	to_date('02/02/2017', 'dd/mm/yyyy') ,	600	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	109	,	2030	,	to_date('02/02/2017', 'dd/mm/yyyy') ,	1000	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	110	,	2031	,	to_date('02/02/2016', 'dd/mm/yyyy') ,	1000	);
							
							
							
							
							
							
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	110	,	2032	,	to_date('02/02/2017', 'dd/mm/yyyy') ,	800	);
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	111	,	2032	,	to_date('02/02/2017', 'dd/mm/yyyy') ,	650	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	112	,	2033	,	to_date('02/02/2016', 'dd/mm/yyyy') ,	300	);
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	113	,	2033	,	to_date('03/02/2016', 'dd/mm/yyyy') ,	300	);
							
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	114	,	2034	,	to_date('02/02/2017', 'dd/mm/yyyy') ,	650	);
							
							
							
							
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	115	,	2034	,	to_date('02/02/2017', 'dd/mm/yyyy') ,	650	);
							
							
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	116	,	2035	,	to_date('07/02/2016', 'dd/mm/yyyy') ,	1192	);
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	117	,	2035	,	to_date('07/02/2016', 'dd/mm/yyyy') ,	894	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	117	,	2036	,	to_date('07/02/2017', 'dd/mm/yyyy') ,	400	);
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	118	,	2037	,	to_date('07/02/2016', 'dd/mm/yyyy') ,	3000	);
							
							
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	119	,	2037	,	to_date('07/02/2016', 'dd/mm/yyyy') ,	2100	);
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	118	,	2038	,	to_date('07/02/2017', 'dd/mm/yyyy') ,	400	);
							
							
							
							
							
							
							
							
							
INSERT INTO inschrijvingen VALUES(inschrijving_id_seq.nextval, 	119	,	2038	,	to_date('08/02/2017', 'dd/mm/yyyy') ,	800	);

INSERT INTO inschrijvingen_kindgegevens VALUES(							1	,	'An'	,	'Witte'	, to_date('07/07/2006', 'dd/mm/yyyy'),	1.55	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							1	,	'Gert'	,	'Witte'	, to_date('09/11/2007', 'dd/mm/yyyy'),	1.53	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							1	,	'Rien'	,	'Aerts'	, to_date('23/09/2006', 'dd/mm/yyyy'),	1.45	,	34	,	'N'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							2	,	'Matthias'	,	'Klawitter'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							3	,	'Mark'	,	'Kenes'	, to_date('26/05/2006', 'dd/mm/yyyy'),	1.52	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							4	,	'Eline'	,	'Franssen'	, to_date('13/08/2007', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							5	,	'Tom'	,	'Hons'	, to_date('07/10/2008', 'dd/mm/yyyy'),	1.31	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							6	,	'Leen'	,	'Huisjes'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							7	,	'Veerle'	,	'Willems'	, to_date('25/03/2006', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							8	,	'Marijke'	,	'Waterman'	, to_date('08/06/2007', 'dd/mm/yyyy'),	1.50	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							9	,	'Leen'	,	'Janssens'	, to_date('16/02/2006', 'dd/mm/yyyy'),	1.49	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							10	,	'Lotte'	,	'Klimop'	, to_date('18/08/2007', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							11	,	'Miet'	,	'Daenen'	, to_date('27/04/2006', 'dd/mm/yyyy'),	1.45	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							12	,	'Lies'	,	'Tilkens'	, to_date('16/09/2007', 'dd/mm/yyyy'),	1.52	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							13	,	'Louise'	,	'Tilkens'	, to_date('14/05/2006', 'dd/mm/yyyy'),	1.47	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							14	,	'Lowie'	,	'Claes'	, to_date('04/11/2006', 'dd/mm/yyyy'),	1.31	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							15	,	'Kyril'	,	'Kuppens'	, to_date('16/01/2006', 'dd/mm/yyyy'),	1.45	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							16	,	'Jonas'	,	'Beervoets'	, to_date('27/10/2006', 'dd/mm/yyyy'),	1.60	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							16	,	'Niels'	,	'Beervoets'	, to_date('27/10/2006', 'dd/mm/yyyy'),	1.60	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							16	,	'Dennis'	,	'Beervoets'	, to_date('27/10/2006', 'dd/mm/yyyy'),	1.60	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							17	,	'Jan'	,	'Berden'	, to_date('27/1/2006', 'dd/mm/yyyy'),	1.60	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							17	,	'Piet'	,	'Berden'	, to_date('27/10/2007', 'dd/mm/yyyy'),	1.52	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							17	,	'Jules'	,	'Berden'	, to_date('20/12/2008', 'dd/mm/yyyy'),	1.31	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							17	,	'Ali'	,	'Yilmaz'	, to_date('07/10/2006', 'dd/mm/yyyy'),	1.49	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							17	,	'Abdul'	,	'Yilmaz'	, to_date('23/12/2007', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							18	,	'An'	,	'Spaelt'	, to_date('27/10/2006', 'dd/mm/yyyy'),	1.60	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							19	,	'Indra'	,	'Vanneste'	, to_date('27/5/2007', 'dd/mm/yyyy'),	1.31	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							20	,	'Bram'	,	'Goedeman'	, to_date('27/4/2007', 'dd/mm/yyyy'),	1.49	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							21	,	'Kris'	,	'Verstreken'	, to_date('11/10/2006', 'dd/mm/yyyy'),	1.45	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							22	,	'Inge'	,	'Janssens'	, to_date('12/10/2006', 'dd/mm/yyyy'),	1.60	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							23	,	'Lieve'	,	'Heersel'	, to_date('15/11/2006', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							24	,	'Els'	,	'Borders'	, to_date('21/07/2006', 'dd/mm/yyyy'),	1.31	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							25	,	'Lien'	,	'Terriers'	, to_date('22/1/2006', 'dd/mm/yyyy'),	1.60	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							26	,	'Maurice'	,	'Teerain'	, to_date('27/10/2006', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							26	,	'Miel'	,	'Teerain'	, to_date('27/10/2006', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							26	,	'Mieke'	,	'Vanesch'	, to_date('26/8/2006', 'dd/mm/yyyy'),	1.48	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							26	,	'Marie'	,	'Vanesch'	, to_date('03/10/2007', 'dd/mm/yyyy'),	1.36	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							26	,	'Peter'	,	'Bex'	, to_date('15/02/2006', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							26	,	'Andy'	,	'Bex'	, to_date('02/05/2007', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							26	,	'Bjorn'	,	'Bex'	, to_date('25/12/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							27	,	'Nina'	,	'Bergen'	, to_date('22/11/2009', 'dd/mm/yyyy'),	1.33	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							27	,	'Kelly'	,	'Bergen'	, to_date('15/02/2007', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							27	,	'Dean'	,	'Bergen'	, to_date('25/08/2008', 'dd/mm/yyyy'),	1.40	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							27	,	'Eva'	,	'Jacobs'	, to_date('07/10/2009', 'dd/mm/yyyy'),	1.49	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							27	,	'Tineke'	,	'Jacobs'	, to_date('23/12/2007', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							28	,	'Ella'	,	'Bertels'	, to_date('23/02/2007', 'dd/mm/yyyy'),	1.55	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							28	,	'Tim'	,	'Bertels'	, to_date('23/04/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							28	,	'Tommy'	,	'Bertels'	, to_date('23/04/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							28	,	'Fatma'	,	'Gurus'	, to_date('23/06/2007', 'dd/mm/yyyy'),	1.50	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							28	,	'Mohammed'	,	'Gurus'	, to_date('23/07/2008', 'dd/mm/yyyy'),	1.45	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							28	,	'Ylias'	,	'Gurus'	, to_date('23/12/2009', 'dd/mm/yyyy'),	1.40	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							29	,	'Elly'	,	'De Backer'	, to_date('23/02/2007', 'dd/mm/yyyy'),	1.55	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							29	,	'Thomas'	,	'De Backer'	, to_date('23/04/2008', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							29	,	'Kasper'	,	'De Backer'	, to_date('03/11/2009', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							30	,	'Stijn'	,	'Charlo'	, to_date('03/03/2007', 'dd/mm/yyyy'),	1.56	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							30	,	'Steven'	,	'Charlo'	, to_date('23/09/2009', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							30	,	'Filip'	,	'Van Roy'	, to_date('03/07/2007', 'dd/mm/yyyy'),	1.56	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							30	,	'Kurt'	,	'Van Roy'	, to_date('03/10/2009', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Rien'	,	'Claessens'	, to_date('26/02/2007', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Matthias'	,	'Claessens'	, to_date('21/04/2008', 'dd/mm/yyyy'),	1.50	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Mark'	,	'Claessens'	, to_date('29/04/2009', 'dd/mm/yyyy'),	1.45	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Eva'	,	'Jans'	, to_date('25/08/2008', 'dd/mm/yyyy'),	1.40	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Tineke'	,	'Jans'	, to_date('07/10/2009', 'dd/mm/yyyy'),	1.49	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Ella'	,	'Jans'	, to_date('23/12/2007', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Tim'	,	'Jans'	, to_date('24/02/2007', 'dd/mm/yyyy'),	1.55	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							31	,	'Tommy'	,	'Jans'	, to_date('02/04/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							32	,	'Miel'	,	'Kuppens'	, to_date('02/04/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							32	,	'Mieke'	,	'Kuppens'	, to_date('09/10/2009', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							32	,	'Marie'	,	'Adams'	, to_date('24/08/2007', 'dd/mm/yyyy'),	1.56	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							32	,	'Peter'	,	'Adams'	, to_date('12/05/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							33	,	'An'	,	'Bevers'	, to_date('08/03/2007', 'dd/mm/yyyy'),	1.56	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							33	,	'Gert'	,	'Bevers'	, to_date('24/09/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							33	,	'Kelly'	,	'Bevers'	, to_date('06/07/2007', 'dd/mm/yyyy'),	1.56	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							33	,	'Dean'	,	'Bevers'	, to_date('09/10/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Rien'	,	'Beerden'	, to_date('26/02/2007', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Matthias'	,	'Beerden'	, to_date('21/04/2008', 'dd/mm/yyyy'),	1.50	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Mark'	,	'Beerden'	, to_date('19/04/2008', 'dd/mm/yyyy'),	1.55	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Jos'	,	'Peeters'	, to_date('15/08/2008', 'dd/mm/yyyy'),	1.40	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Eveline'	,	'Peeters'	, to_date('07/11/2008', 'dd/mm/yyyy'),	1.54	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Evert'	,	'Peeters'	, to_date('23/10/2007', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Brent'	,	'Peeters'	, to_date('24/03/2007', 'dd/mm/yyyy'),	1.55	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							34	,	'Jordy'	,	'Peeters'	, to_date('12/05/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							35	,	'Miel'	,	'Spark'	, to_date('02/06/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							35	,	'Mieke'	,	'Spark'	, to_date('09/11/2008', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							35	,	'Kerim'	,	'Agim'	, to_date('24/05/2007', 'dd/mm/yyyy'),	1.56	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							35	,	'Wasla'	,	'Agim'	, to_date('12/03/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							36	,	'Wasla'	,	'Vandenneste'	, to_date('10/03/2008', 'dd/mm/yyyy'),	1.39	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Marcel'	,	'Gelders'	, to_date('27/10/2007', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Mia'	,	'Gelders'	, to_date('27/10/2007', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Miek'	,	'Gelders'	, to_date('26/08/2007', 'dd/mm/yyyy'),	1.48	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Maria'	,	'Gelders'	, to_date('03/10/2007', 'dd/mm/yyyy'),	1.36	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Pieter'	,	'Gelders'	, to_date('15/02/2007', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Annemie'	,	'Gelders'	, to_date('02/05/2007', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Ben'	,	'Gelders'	, to_date('25/12/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Karina'	,	'Gelders'	, to_date('22/11/2009', 'dd/mm/yyyy'),	1.33	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Ken'	,	'Gelders'	, to_date('15/02/2007', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							37	,	'Danny'	,	'Gelders'	, to_date('25/08/2008', 'dd/mm/yyyy'),	1.40	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							38	,	'Emiel'	,	'Verreken'	, to_date('28/06/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							38	,	'Joke'	,	'Verreken'	, to_date('19/11/2009', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							38	,	'Rustu'	,	'Aliustaoglu'	, to_date('04/05/2007', 'dd/mm/yyyy'),	1.56	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							38	,	'Mira'	,	'Aliustaoglu'	, to_date('12/07/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							39	,	'Kiara'	,	'Jans'	, to_date('22/09/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Thijs'	,	'Daenen'	, to_date('07/07/2006', 'dd/mm/yyyy'),	1.55	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Jelle'	,	'Daenen'	, to_date('09/11/2007', 'dd/mm/yyyy'),	1.53	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Koen'	,	'Daenen'	, to_date('23/09/2006', 'dd/mm/yyyy'),	1.45	,	34	,	'N'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Adam'	,	'Daenen'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Ali'	,	'Demir'	, to_date('26/05/2006', 'dd/mm/yyyy'),	1.52	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Mehdi'	,	'Demir'	, to_date('13/08/2007', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Aron'	,	'Demir'	, to_date('07/10/2008', 'dd/mm/yyyy'),	1.31	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							40	,	'Sinan'	,	'Demir'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							41	,	'Emiel'	,	'Beerts'	, to_date('28/06/2008', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							41	,	'Joke'	,	'Beerts'	, to_date('19/11/2008', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							41	,	'Betul'	,	'Ozdemir'	, to_date('08/06/2007', 'dd/mm/yyyy'),	1.50	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							41	,	'Taner'	,	'Ozdemir'	, to_date('12/07/2008', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							42	,	'Jorben'	,	'Donck'	, to_date('26/05/2006', 'dd/mm/yyyy'),	1.52	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							42	,	'Brecht'	,	'Donck'	, to_date('13/08/2007', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							42	,	'Jo'	,	'Donck'	, to_date('07/10/2008', 'dd/mm/yyyy'),	1.31	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Thijs'	,	'Adams'	, to_date('07/07/2006', 'dd/mm/yyyy'),	1.55	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Eveline'	,	'Adams'	, to_date('09/11/2007', 'dd/mm/yyyy'),	1.53	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Evert'	,	'Adams'	, to_date('23/09/2006', 'dd/mm/yyyy'),	1.45	,	34	,	'N'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Brent'	,	'Adams'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Jordy'	,	'Adams'	, to_date('26/05/2006', 'dd/mm/yyyy'),	1.52	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Miel'	,	'Adams'	, to_date('13/08/2007', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Emiel'	,	'Adams'	, to_date('07/10/2008', 'dd/mm/yyyy'),	1.31	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							43	,	'Joke'	,	'Adams'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							44	,	'Wim'	,	'Beerten'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							45	,	'Jorn'	,	'Bertels'	, to_date('07/07/2006', 'dd/mm/yyyy'),	1.55	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							45	,	'Evy'	,	'Bertels'	, to_date('09/11/2007', 'dd/mm/yyyy'),	1.53	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							45	,	'Gerben'	,	'Bertels'	, to_date('23/09/2006', 'dd/mm/yyyy'),	1.45	,	34	,	'N'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							45	,	'Anya'	,	'Kilic'	, to_date('07/02/2006', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							45	,	'Jawad'	,	'Kilic'	, to_date('26/05/2006', 'dd/mm/yyyy'),	1.52	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							45	,	'Soufyan'	,	'Kilic'	, to_date('13/08/2007', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							46	,	'Evy'	,	'Bertels'	, to_date('09/11/2007', 'dd/mm/yyyy'),	1.53	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							46	,	'Soufyan'	,	'Kilic'	, to_date('13/08/2007', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							47	,	'Piet'	,	'Berden'	, to_date('27/10/2007', 'dd/mm/yyyy'),	1.55	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							47	,	'Jules'	,	'Berden'	, to_date('20/12/2008', 'dd/mm/yyyy'),	1.36	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							47	,	'Abdul'	,	'Yilmaz'	, to_date('23/12/2007', 'dd/mm/yyyy'),	1.48	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							48	,	'Piet'	,	'Berden'	, to_date('27/10/2007', 'dd/mm/yyyy'),	1.55	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							48	,	'Jules'	,	'Berden'	, to_date('20/12/2008', 'dd/mm/yyyy'),	1.36	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							48	,	'Abdul'	,	'Yilmaz'	, to_date('23/12/2007', 'dd/mm/yyyy'),	1.48	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							49	,	'Evy'	,	'Bertels'	, to_date('09/11/2007', 'dd/mm/yyyy'),	1.53	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							49	,	'Soufyan'	,	'Kilic'	, to_date('13/08/2007', 'dd/mm/yyyy'),	1.47	,	32	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							50	,	'John'	,	'Witte'	, to_date('13/08/2002', 'dd/mm/yyyy'),	1.66	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							50	,	'Nick'	,	'Witte'	, to_date('13/08/2002', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							50	,	'Veronique'	,	'Witte'	, to_date('13/08/2003', 'dd/mm/yyyy'),	1.70	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							50	,	'Zoe'	,	'Witte'	, to_date('13/08/2003', 'dd/mm/yyyy'),	1.67	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							51	,	'Zoe'	,	'Beerden'	, to_date('13/05/2003', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							51	,	'Piet'	,	'Beerden'	, to_date('23/05/2003', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							51	,	'Jules'	,	'Beerden'	, to_date('13/08/2003', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							51	,	'Wim'	,	'Beerden'	, to_date('23/09/2003', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							51	,	'Gerben'	,	'Beerden'	, to_date('23/10/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							51	,	'Zef'	,	'Beerden'	, to_date('23/11/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							52	,	'Zoe'	,	'Beerden'	, to_date('13/05/2003', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							52	,	'Piet'	,	'Beerden'	, to_date('23/05/2003', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							52	,	'Jules'	,	'Beerden'	, to_date('13/08/2003', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							52	,	'Wim'	,	'Beerden'	, to_date('23/09/2003', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							52	,	'Gerben'	,	'Beerden'	, to_date('23/10/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							52	,	'Zef'	,	'Beerden'	, to_date('23/11/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							53	,	'Jannes'	,	'Beerten'	, to_date('08/11/2003', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							54	,	'Erik'	,	'De Backer'	, to_date('16/02/1999', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							54	,	'Lea'	,	'De Backer'	, to_date('18/08/2000', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							54	,	'Cecile'	,	'De Backer'	, to_date('27/04/1999', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							54	,	'Valerie'	,	'De Backer'	, to_date('16/09/2000', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							54	,	'Helene'	,	'De Backer'	, to_date('14/05/2000', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							55	,	'Helene'	,	'Franssen'	, to_date('14/08/2000', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							55	,	'Emiel'	,	'Franssen'	, to_date('22/03/1999', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							55	,	'Joke'	,	'Franssen'	, to_date('19/09/1999', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							55	,	'Jenna'	,	'Franssen'	, to_date('04/03/2000', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							56	,	'Erik'	,	'De Backer'	, to_date('16/02/1999', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							56	,	'Lea'	,	'De Backer'	, to_date('18/08/2000', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							56	,	'Cecile'	,	'De Backer'	, to_date('27/04/1999', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							56	,	'Valerie'	,	'De Backer'	, to_date('16/09/2000', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							56	,	'Helene'	,	'De Backer'	, to_date('14/05/2000', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							57	,	'Helene'	,	'Franssen'	, to_date('14/08/2000', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							57	,	'Emiel'	,	'Franssen'	, to_date('22/03/1999', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							57	,	'Joke'	,	'Franssen'	, to_date('19/09/1999', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							57	,	'Jenna'	,	'Franssen'	, to_date('04/03/2000', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							58	,	'Brecht'	,	'Hons'	, to_date('04/03/2000', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							58	,	'Steve'	,	'Hons'	, to_date('20/03/1999', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							58	,	'Dieter'	,	'Verstappen'	, to_date('29/01/1999', 'dd/mm/yyyy'),	1.88	,	43	,	'N'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							58	,	'Dave'	,	'Verstappen'	, to_date('01/03/2000', 'dd/mm/yyyy'),	1.67	,	40	,	'N'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							59	,	'Dave'	,	'Huisjes'	, to_date('01/03/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							59	,	'Leo'	,	'Huisjes'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							59	,	'Angelo'	,	'Huisjes'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							59	,	'Bob'	,	'Huisjes'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							60	,	'Bob'	,	'Willems'	, to_date('21/01/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							60	,	'Bert'	,	'Willems'	, to_date('28/12/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							60	,	'Billy'	,	'Moors'	, to_date('02/01/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							60	,	'Bo'	,	'Moors'	, to_date('20/12/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							60	,	'Abdel'	,	'Achaaray'	, to_date('26/01/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							60	,	'Adem'	,	'Achaaray'	, to_date('02/12/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							61	,	'Dave'	,	'Huisjes'	, to_date('01/03/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							61	,	'Leo'	,	'Huisjes'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							61	,	'Angelo'	,	'Huisjes'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							61	,	'Bob'	,	'Huisjes'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							62	,	'Bob'	,	'Willems'	, to_date('21/01/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							62	,	'Bert'	,	'Willems'	, to_date('28/12/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							62	,	'Billy'	,	'Moors'	, to_date('02/01/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							62	,	'Bo'	,	'Moors'	, to_date('20/12/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							62	,	'Abdel'	,	'Achaaray'	, to_date('26/01/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							62	,	'Adem'	,	'Achaaray'	, to_date('02/12/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							63	,	'Vera'	,	'Waterman'	, to_date('02/10/2003', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							63	,	'Tanja'	,	'Wissels'	, to_date('12/8/2002', 'dd/mm/yyyy'),	1.64	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							64	,	'Ruud'	,	'Janssens'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							64	,	'Robin'	,	'Janssens'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							64	,	'Tina'	,	'Janssens'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							64	,	'Babette'	,	'Janssens'	, to_date('21/01/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Babette'	,	'Klimop'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Hanne'	,	'Klimop'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Toon'	,	'Klimop'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Ruben'	,	'Klimop'	, to_date('20/12/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Maarten'	,	'Klimop'	, to_date('28/12/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Cedric'	,	'Klimop'	, to_date('02/01/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Turpal'	,	'Gadamauri'	, to_date('02/10/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							65	,	'Turan'	,	'Gadamauri'	, to_date('12/8/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							66	,	'Jente'	,	'Daenen'	, to_date('12/10/2001', 'dd/mm/yyyy'),	1.75	,	44	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							66	,	'Jenny'	,	'Daenen'	, to_date('12/10/2001', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							67	,	'Ruud'	,	'Janssens'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							67	,	'Robin'	,	'Janssens'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							67	,	'Babette'	,	'Janssens'	, to_date('21/01/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							68	,	'Babette'	,	'Klimop'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							68	,	'Hanne'	,	'Klimop'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							68	,	'Toon'	,	'Klimop'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							68	,	'Cedric'	,	'Klimop'	, to_date('02/01/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							68	,	'Turpal'	,	'Gadamauri'	, to_date('02/10/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							68	,	'Turan'	,	'Gadamauri'	, to_date('12/08/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Kevin'	,	'Daenen'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.67	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Kristof'	,	'Daenen'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Koen'	,	'Daenen'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Clarisse'	,	'Verbruggen'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Melanie'	,	'Verbruggen'	, to_date('23/09/2003', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Emely'	,	'Verbruggen'	, to_date('23/10/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Vincent'	,	'Verbruggen'	, to_date('23/11/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Sandra'	,	'Wertels'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Liesbeth'	,	'Wertels'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Mario'	,	'Cox'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Willem'	,	'Cox'	, to_date('23/09/2004', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Guido'	,	'Delfs'	, to_date('23/10/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Anneleen'	,	'Delfs'	, to_date('23/11/2003', 'dd/mm/yyyy'),	1.64	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							69	,	'Dorien'	,	'Delfs'	, to_date('08/11/2003', 'dd/mm/yyyy'),	1.61	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Kevin'	,	'Daenen'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.67	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Kristof'	,	'Daenen'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Koen'	,	'Daenen'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Clarisse'	,	'Verbruggen'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.65	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Sandra'	,	'Wertels'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.64	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Liesbeth'	,	'Wertels'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.63	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Mario'	,	'Cox'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.62	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							70	,	'Willem'	,	'Cox'	, to_date('23/09/2004', 'dd/mm/yyyy'),	1.61	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							71	,	'Esther'	,	'Tilkens'	, to_date('23/09/2005', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							71	,	'Emely'	,	'Tilkens'	, to_date('23/10/2005', 'dd/mm/yyyy'),	1.59	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							71	,	'Vincent'	,	'Tilkens'	, to_date('23/11/2005', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							71	,	'Valeria'	,	'Angiolillo'	, to_date('23/10/2005', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							71	,	'Emilia'	,	'Angiolillo'	, to_date('23/11/2005', 'dd/mm/yyyy'),	1.65	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							71	,	'Vincenzo'	,	'Angiolillo'	, to_date('08/11/2005', 'dd/mm/yyyy'),	1.64	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							72	,	'Vicky'	,	'Tilkens'	, to_date('23/08/2003', 'dd/mm/yyyy'),	1.77	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							72	,	'Bea'	,	'Meertens'	, to_date('22/01/2003', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							72	,	'Marthe'	,	'Meertens'	, to_date('18/11/2003', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'David'	,	'Claes'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.64	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Jolien'	,	'Claes'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.63	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Dirk'	,	'Claes'	, to_date('21/01/2002', 'dd/mm/yyyy'),	1.62	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Jeroen'	,	'Claes'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.70	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Jasper'	,	'Claes'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.64	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Quinten'	,	'Claes'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.63	,	41	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Ada'	,	'Claes'	, to_date('02/01/2002', 'dd/mm/yyyy'),	1.62	,	42	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Edouw'	,	'Claes'	, to_date('02/10/2002', 'dd/mm/yyyy'),	1.70	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							73	,	'Merle'	,	'Claes'	, to_date('12/08/2002', 'dd/mm/yyyy'),	1.64	,	44	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Willem'	,	'Kuppens'	, to_date('23/09/2004', 'dd/mm/yyyy'),	1.70	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Guido'	,	'Kuppens'	, to_date('23/10/2003', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Anneleen'	,	'Kuppens'	, to_date('23/11/2003', 'dd/mm/yyyy'),	1.64	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Dorien'	,	'Kuppens'	, to_date('08/11/2003', 'dd/mm/yyyy'),	1.61	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Sanae'	,	'Yilmaz'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.67	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Faiza'	,	'Yilmaz'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Dalda'	,	'Yilmaz'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Latifa'	,	'Ozdemir'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.65	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Mina'	,	'Ozdemir'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.64	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Jawad'	,	'Ozdemir'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.63	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Luca'	,	'Cox'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.62	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							74	,	'Sarah'	,	'Cox'	, to_date('23/09/2004', 'dd/mm/yyyy'),	1.61	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Edouw'	,	'Beervoets'	, to_date('23/10/2003', 'dd/mm/yyyy'),	1.45	,	33	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Merle'	,	'Beervoets'	, to_date('24/03/2004', 'dd/mm/yyyy'),	1.55	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Willem'	,	'Beervoets'	, to_date('12/05/2003', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Anneleen'	,	'Beervoets'	, to_date('02/06/2004', 'dd/mm/yyyy'),	1.55	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Dorien'	,	'Spark'	, to_date('09/11/2003', 'dd/mm/yyyy'),	1.48	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Ali'	,	'Agim'	, to_date('24/05/2004', 'dd/mm/yyyy'),	1.56	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Wasla'	,	'Agim'	, to_date('12/03/2003', 'dd/mm/yyyy'),	1.36	,	34	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Annick'	,	'Vandenneste'	, to_date('10/03/2004', 'dd/mm/yyyy'),	1.39	,	35	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Berre'	,	'Gelders'	, to_date('27/10/2003', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							75	,	'Mika'	,	'Gelders'	, to_date('27/10/2004', 'dd/mm/yyyy'),	1.60	,	36	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Kris'	,	'Berden'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.67	,	38	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Eddy'	,	'Berden'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Karel'	,	'Berden'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Cynthia'	,	'Berden'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.65	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Sandrina'	,	'Wertels'	, to_date('13/05/2004', 'dd/mm/yyyy'),	1.64	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Lies'	,	'Wertels'	, to_date('23/05/2004', 'dd/mm/yyyy'),	1.63	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Miquele'	,	'Cox'	, to_date('13/08/2004', 'dd/mm/yyyy'),	1.62	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							76	,	'Willy'	,	'Cox'	, to_date('23/09/2004', 'dd/mm/yyyy'),	1.61	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							77	,	'Hilde'	,	'Spaelt'	, to_date('23/09/2005', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							77	,	'Ivo'	,	'Spaelt'	, to_date('23/10/2005', 'dd/mm/yyyy'),	1.59	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							77	,	'Joeri'	,	'Spaelt'	, to_date('23/11/2005', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							77	,	'Guiseppe'	,	'Angiolillo'	, to_date('23/10/2005', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							77	,	'Maria'	,	'Angiolillo'	, to_date('23/11/2005', 'dd/mm/yyyy'),	1.65	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							77	,	'Enrico'	,	'Angiolillo'	, to_date('08/11/2005', 'dd/mm/yyyy'),	1.64	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							78	,	'Hilde'	,	'Spaelt'	, to_date('23/09/2005', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							78	,	'Ivo'	,	'Spaelt'	, to_date('23/10/2005', 'dd/mm/yyyy'),	1.59	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							78	,	'Joeri'	,	'Spaelt'	, to_date('23/11/2005', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							78	,	'Guiseppe'	,	'Angiolillo'	, to_date('23/10/2005', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							78	,	'Maria'	,	'Angiolillo'	, to_date('23/11/2005', 'dd/mm/yyyy'),	1.65	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							78	,	'Enrico'	,	'Angiolillo'	, to_date('08/11/2005', 'dd/mm/yyyy'),	1.64	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Dorien'	,	'Vanneste'	, to_date('02/10/2001', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Ruud'	,	'Vanneste'	, to_date('12/8/2000', 'dd/mm/yyyy'),	1.64	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Willy'	,	'Vanneste'	, to_date('01/04/2000', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Hilde'	,	'Vanneste'	, to_date('31/03/2000', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Ivo'	,	'Vanneste'	, to_date('21/08/2000', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Mina'	,	'Achaaray'	, to_date('21/01/2000', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Joeri'	,	'Waterman'	, to_date('01/04/2000', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Luca'	,	'Wissels'	, to_date('31/03/2000', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Sarah'	,	'Janssens'	, to_date('21/08/2000', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							79	,	'Edouw'	,	'Klimop'	, to_date('20/12/2000', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							80	,	'Sanae'	,	'Ozdemir'	, to_date('28/12/2000', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							80	,	'Cedric'	,	'Goedeman'	, to_date('02/01/2000', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							80	,	'Turpal'	,	'Gadamauri'	, to_date('02/10/2000', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							80	,	'Marco'	,	'Angiolillo'	, to_date('12/8/2000', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							80	,	'Jente'	,	'Goedeman'	, to_date('12/10/2001', 'dd/mm/yyyy'),	1.75	,	44	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							80	,	'Jenny'	,	'Meertens'	, to_date('12/10/2001', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							80	,	'Anne'	,	'Meertens'	, to_date('01/04/2000', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Dorien'	,	'Vanneste'	, to_date('02/10/2001', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Mario'	,	'Adams'	, to_date('12/8/2002', 'dd/mm/yyyy'),	1.64	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Willem'	,	'Beerten'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Esther'	,	'Bertels'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Emely'	,	'Jans'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Vincent'	,	'Kuppens'	, to_date('21/01/2002', 'dd/mm/yyyy'),	1.60	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Valeria'	,	'Kuppens'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Emilia'	,	'Adams'	, to_date('31/03/2002', 'dd/mm/yyyy'),	1.67	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Vincenzo'	,	'Janssens'	, to_date('21/08/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							81	,	'Vicky'	,	'Klimop'	, to_date('20/12/2002', 'dd/mm/yyyy'),	1.88	,	43	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							82	,	'Bea'	,	'Ozdemir'	, to_date('28/12/2002', 'dd/mm/yyyy'),	1.62	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							82	,	'Marthe'	,	'Goedeman'	, to_date('02/01/2002', 'dd/mm/yyyy'),	1.64	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							82	,	'Faiza'	,	'Gadamauri'	, to_date('02/10/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							82	,	'Dalda'	,	'Angiolillo'	, to_date('12/8/2002', 'dd/mm/yyyy'),	1.88	,	37	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							82	,	'Jente'	,	'Goedeman'	, to_date('12/10/2001', 'dd/mm/yyyy'),	1.75	,	40	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							82	,	'Jenny'	,	'Meertens'	, to_date('12/10/2001', 'dd/mm/yyyy'),	1.67	,	39	,	'J'	);
INSERT INTO inschrijvingen_kindgegevens VALUES(							82	,	'Cindy'	,	'Meertens'	, to_date('01/04/2002', 'dd/mm/yyyy'),	1.66	,	39	,	'J'	);
