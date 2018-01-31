REM Groep 1TINA2
REM Groepsleden: Ian Angillis, Sisto van Den Eerdewegh, Ward Poel, Jan van Ruyssevelt, Joachim Veulemans
REM Vak: Data (6 studiepunten)
REM Lector: Carina Medats
REM Script aanmaken tabellen

REM ***************************************
REM Drop (bestaande) tabellen voor creatie
REM ***************************************

DROP TABLE lector_andere_taken;
DROP TABLE studentenscores;
DROP TABLE examenkansen;
DROP TABLE examenperiodes;
DROP TABLE examenplanning;
DROP TABLE lokalen;
DROP TABLE klas_perstudent_perolod;
DROP TABLE studenten;
DROP TABLE gemeenten;
DROP TABLE lector_lesopdracht;
DROP TABLE lectoren;
DROP TABLE examendatum_olod;
DROP TABLE olods;

REM ***************************************
REM olods tabel
REM ***************************************

CREATE TABLE olods 
	(olodcode				VARCHAR2(9)		CONSTRAINT O_OLODC_CH CHECK (LENGTH(olodcode) = 9), 		
	 lesperiode_nr			NUMBER(1),		
	 olodnaam				VARCHAR2(30)	CONSTRAINT O_OLODN_NN NOT NULL,
	 onderwijsvorm			VARCHAR2(2),
	 groepsoort				VARCHAR2(6),
	 uren	            	FLOAT(4)		CONSTRAINT O_U_CH CHECK (uren >= 0),
	 norm					NUMBER(3)		CONSTRAINT O_N_CH CHECK (norm >= 0),
	 exsoort				VARCHAR2(2),
	 opleidingsprogramma	VARCHAR2(3),
	 wegingscoefficient		NUMBER(2)		CONSTRAINT O_WE_CH CHECK (wegingscoefficient >= 0),
	 studiepunten			NUMBER(2)		CONSTRAINT O_SP_CH CHECK (studiepunten >= 0),
	 PRIMARY KEY(olodcode)
	);

REM ***************************************
REM Creatie lector_andere_taken
REM ***************************************

CREATE TABLE lector_andere_taken
	(acjaar							VARCHAR2(9)		CONSTRAINT LAT_ACJ_CH CHECK (LENGTH(acjaar) = 9), 	
	 lectorcode						NUMBER(8)		CONSTRAINT LAT_LCC_CH CHECK (LENGTH(lectorcode) = 8),		
	 andere_taken_opleiding			VARCHAR2(3)		CONSTRAINT LAT_ATO_NN NOT NULL, 	
	 andere_taken_omschrijving		VARCHAR2(50), 	
	 andere_taken_jaar				NUMBER(1),
	 andere_taken_uren				FLOAT(4)		CONSTRAINT LAT_ATU_CH CHECK (andere_taken_uren >= 0),
	 PRIMARY KEY(acjaar, lectorcode, andere_taken_opleiding, andere_taken_omschrijving)
	);

REM ***************************************
REM Creatie lectoren
REM ***************************************

CREATE TABLE lectoren
(
	lectorcode 		NUMBER(8)		CONSTRAINT L_LCC_CH CHECK (LENGTH(lectorcode) = 8), 		
	lectornaam 		VARCHAR2(30)	CONSTRAINT L_LN_NN NOT NULL,
	lectorvnaam 	VARCHAR2(30)	CONSTRAINT L_LVN_NN NOT NULL,
	PRIMARY KEY(lectorcode)
);

REM ***************************************
REM Creatie lector_lesopdracht
REM ***************************************

CREATE TABLE lector_lesopdracht
(
	acjaar 		VARCHAR2(9)		CONSTRAINT LL_ACJ_CH CHECK (LENGTH(acjaar) = 9),
	olodcode 	VARCHAR2(9)		CONSTRAINT LL_OLODC_CH CHECK (LENGTH(olodcode) = 9),
	klasgroep 	VARCHAR2(5),
	lectorcode 	NUMBER(8)		CONSTRAINT LL_LCC_CH CHECK (LENGTH(lectorcode) = 8),
	PRIMARY KEY(acjaar, olodcode, klasgroep)
);

REM ***************************************
REM Creatie examenplanning
REM ***************************************

CREATE TABLE examenplanning
(
	acjaar 			VARCHAR2(9)		CONSTRAINT E_ACJ_CH CHECK (LENGTH(acjaar) = 9),
	examenmaand 	NUMBER(2),
	olodcode 		VARCHAR2(9)		CONSTRAINT E_OLODC_CH CHECK (LENGTH(olodcode) = 9),
	studentnr 		NUMBER(8)		CONSTRAINT E_STDNR_CH CHECK (LENGTH(studentnr) = 8),
	plaatszijde 	VARCHAR2(1), 
	plaatsrij		VARCHAR2(2),
	lokaal			VARCHAR2(5)		CONSTRAINT E_LOK_NN NOT NULL,
	exbeginuur 		VARCHAR2(5)		CONSTRAINT E_EXBU_NN NOT NULL, 	
	PRIMARY KEY(acjaar, examenmaand, olodcode, studentnr)
);

REM ***************************************
REM Creatie lokalen
REM ***************************************
CREATE TABLE lokalen
(
	lokaal			VARCHAR2(5),
	lokaalsoort 	VARCHAR2(20),
	PRIMARY KEY(lokaal)
);

REM ***************************************
REM Creatie examendatum_olod
REM ***************************************

CREATE TABLE examendatum_olod
(
	acjaar		VARCHAR2(9)			CONSTRAINT EO_ACJ_CH CHECK (LENGTH(acjaar) = 9),
	examenmaand	NUMBER(2),
	olodcode	VARCHAR2(9)			CONSTRAINT EO_OLODC_CH CHECK (LENGTH(olodcode) = 9),
	exdatum		DATE				CONSTRAINT EO_EXD_NN NOT NULL, 		
	PRIMARY KEY(acjaar, examenmaand, olodcode)
);

REM ***************************************
REM Creatie klas_perstudent_perolod
REM ***************************************

CREATE TABLE klas_perstudent_perolod
(
	acjaar		VARCHAR2(9)		CONSTRAINT KPP_ACJ_CH CHECK (LENGTH(acjaar) = 9),
	studentnr	NUMBER(8)		CONSTRAINT KPP_STDNR_CH CHECK (LENGTH(studentnr) = 8),
	olodcode	VARCHAR2(9)		CONSTRAINT KPP_OLODC_CH CHECK (LENGTH(olodcode) = 9),
	klasgroep	VARCHAR2(5),
	PRIMARY KEY(acjaar, studentnr, olodcode)
);

REM ***************************************
REM Creatie studenten
REM ***************************************

CREATE TABLE studenten
(
	studentnr		NUMBER(8)		CONSTRAINT S_STDNR_CH CHECK (LENGTH(studentnr) = 8),
	studentnaam 	VARCHAR2(20)	CONSTRAINT S_SN_NN NOT NULL,
	studentvnaam 	VARCHAR2(20)	CONSTRAINT S_SVN_NN NOT NULL,
	studentadres 	VARCHAR2(40)	CONSTRAINT S_SADR_NN NOT NULL,
	postcode 		NUMBER(4)		CONSTRAINT S_PC_CH CHECK (LENGTH(postcode) = 4)
									CONSTRAINT S_PC_NN NOT NULL,
	PRIMARY KEY(studentnr)
);

REM ***************************************
REM Creatie gemeenten
REM ***************************************

CREATE TABLE gemeenten
(
	postcode	NUMBER(4)		CONSTRAINT G_PC_CH CHECK (LENGTH(postcode) = 4)
								CONSTRAINT G_PC_NN NOT NULL,
	gemeente	VARCHAR2(30)	CONSTRAINT G_GEM_NN NOT NULL,
	PRIMARY KEY(postcode)
);

REM ***************************************
REM Creatie studentenscores
REM ***************************************

CREATE TABLE studentenscores
(
	acjaar					VARCHAR2(9)		CONSTRAINT SC_ACJ_CH CHECK (LENGTH(acjaar) = 9),
	studentnr				NUMBER(8)		CONSTRAINT SC_STDNR_CH CHECK (LENGTH(studentnr) = 8),
	examenkanscode			NUMBER(1),
	olodcode				VARCHAR2(9)		CONSTRAINT SC_OLODC_CH CHECK (LENGTH(olodcode) = 9),
	examenperiodecode		NUMBER(1), 
	score     				NUMBER(2)		CONSTRAINT SC_SC_CH CHECK (score >= 0), 		
	PRIMARY KEY(acjaar, studentnr, examenkanscode, olodcode)
);

REM ***************************************
REM Creatie examenkansen
REM ***************************************

CREATE TABLE examenkansen
(
	examenkanscode				NUMBER(1),
	examenkans_omschrijving	VARCHAR2(50), 
	PRIMARY KEY(examenkanscode)
);

REM ***************************************
REM Creatie examenperiodes
REM ***************************************

CREATE TABLE examenperiodes
(
	examenperiodecode				NUMBER(1),
	examenperiode_omschrijving		VARCHAR2(50),
	PRIMARY KEY(examenperiodecode) 
);

REM **********************************************
REM References tussen tabellen
REM **********************************************

ALTER TABLE lector_lesopdracht
ADD CONSTRAINT LL_OLODC_FK FOREIGN KEY (olodcode) REFERENCES olods(olodcode)
ADD CONSTRAINT LL_LCC_FK FOREIGN KEY (lectorcode) REFERENCES lectoren(lectorcode);

ALTER TABLE lector_andere_taken
ADD CONSTRAINT LAT_LCC_FK FOREIGN KEY (lectorcode) REFERENCES lectoren(lectorcode);

ALTER TABLE studenten
ADD CONSTRAINT S_PC_FK FOREIGN KEY (postcode) REFERENCES gemeenten(postcode);

ALTER TABLE examenplanning
ADD CONSTRAINT E_OLODC_FK FOREIGN KEY (olodcode) REFERENCES olods(olodcode)
ADD CONSTRAINT E_STDNR_FK FOREIGN KEY (studentnr) REFERENCES studenten(studentnr)
ADD CONSTRAINT E_LOK_FK FOREIGN KEY (lokaal) REFERENCES lokalen(lokaal)
ADD CONSTRAINT E_ASO_FK FOREIGN KEY (acjaar, studentnr, olodcode) REFERENCES klas_perstudent_perolod(acjaar, studentnr, olodcode)
ADD CONSTRAINT E_AEO_FK FOREIGN KEY (acjaar, examenmaand, olodcode) REFERENCES examendatum_olod(acjaar, examenmaand, olodcode);

ALTER TABLE examendatum_olod
ADD CONSTRAINT EO_OLODC_FK FOREIGN KEY (olodcode) REFERENCES olods(olodcode);

ALTER TABLE klas_perstudent_perolod
ADD CONSTRAINT KPP_STDNR_FK FOREIGN KEY (studentnr) REFERENCES studenten(studentnr)
ADD CONSTRAINT KPP_OLODC_FK FOREIGN KEY (olodcode) REFERENCES olods(olodcode)
ADD CONSTRAINT KPP_AOK_FK FOREIGN KEY (acjaar, olodcode, klasgroep) REFERENCES lector_lesopdracht(acjaar, olodcode, klasgroep);

ALTER TABLE studentenscores
ADD CONSTRAINT SS_STDNR_FK FOREIGN KEY (studentnr) REFERENCES studenten(studentnr)
ADD CONSTRAINT SS_EXKC_FK FOREIGN KEY (examenkanscode) REFERENCES examenkansen(examenkanscode)
ADD CONSTRAINT SS_OLODC_FK FOREIGN KEY (olodcode) REFERENCES olods(olodcode)
ADD CONSTRAINT SS_EXPC_FK FOREIGN KEY (examenperiodecode) REFERENCES examenperiodes(examenperiodecode);

REM **********************************************
REM gegevens inserten in tabellen
REM **********************************************

REM **********************************************
REM tabel olods vullen
REM **********************************************

INSERT INTO olods VALUES ('41TIN1580', 1, 'SOFTWARE ANALYSIS', 'PR', '42TINA', 56.0, 560, 'KL', 'TIN', 06, 06);
INSERT INTO olods VALUES ('41TIN1100', 3, 'WEB ESSENSTIALS', 'PR', '41TINA', 56.0, 560, 'KL', 'TIN', 06, 06 );
INSERT INTO olods VALUES ('41TIN1140', 3, '.NET ESSENTIALS', 'PR', '41TINA', 56.0, 560, 'KL', 'TIN', 06, 06 );
INSERT INTO olods VALUES ('41TIN1250', 2, 'DATA ANALYSIS', 'PR', '41TINA', 56.0, 560, 'KL', 'TIN', 06, 06);
INSERT INTO olods VALUES ('41TIN1130', 2, 'JAVA ESSENTIALS', 'PR', '41TINA', 56.0, 560, 'KL', 'TIN', 06, 06);
INSERT INTO olods VALUES ('41TIW1010', 2, 'PROGRAMMING BASICS', 'PR', '41TINA', 14.0, 476, 'BA', 'TIN', 03, 03);
INSERT INTO olods VALUES ('41TIN1277', 2, 'CISCO ACADEMY:CCNA2', 'PR', '42TINA', 14.0, 476, 'BA', 'TIN', 03, 03);
INSERT INTO olods VALUES ('41TIN1280', 1, 'COMMUNICATIONS1', 'PR', '42TINA', 14.0, 476, 'KL', 'TIN', 03, 03);

REM **********************************************
REM tabel examendatum_olod vullen (Eerste zit)
REM **********************************************

INSERT INTO examendatum_olod VALUES ('2017_2018', 11, '41TIN1580', TO_DATE('18/11/2017', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 06, '41TIN1100', TO_DATE('13/06/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 06, '41TIN1140', TO_DATE('15/06/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 01, '41TIN1250', TO_DATE('25/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 01, '41TIN1130', TO_DATE('27/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 01, '41TIW1010', TO_DATE('29/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 01, '41TIN1277', TO_DATE('31/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 11, '41TIN1280', TO_DATE('21/11/2017', 'DD/MM/YYYY'));

REM **********************************************
REM tabel examendatum_olod vullen (Tweede zit)
REM **********************************************

INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIN1580', TO_DATE('18/11/2017', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIN1100', TO_DATE('13/06/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIN1140', TO_DATE('15/06/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIN1250', TO_DATE('25/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIN1130', TO_DATE('27/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIW1010', TO_DATE('29/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIN1277', TO_DATE('31/01/2018', 'DD/MM/YYYY'));
INSERT INTO examendatum_olod VALUES ('2017_2018', 08, '41TIN1280', TO_DATE('21/11/2017', 'DD/MM/YYYY'));

REM **********************************************
REM tabel lectoren vullen
REM **********************************************

INSERT INTO lectoren VALUES (11111111, 'ALLAERTS', 'ANN');
INSERT INTO lectoren VALUES (11111112, 'RUTS', 'ROEL');
INSERT INTO lectoren VALUES (11111121, 'GOELS', 'ALEX');
INSERT INTO lectoren VALUES (11111122, 'KROMS', 'BERT');
INSERT INTO lectoren VALUES (11666420, 'GEURTS', 'CELINE');

REM **********************************************
REM tabel lector_lesopdracht vullen
REM **********************************************

INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIN1580', '1TINA', 11111111);
INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIN1100', '1TINA', 11111121);
INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIN1140', '1TINA', 11111112);
INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIN1250', '1TINA', 11666420);
INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIN1130', '1TINA', 11111122);
INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIW1010', '1TINA', 11111111);
INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIN1277', '1TINA', 11666420);
INSERT INTO lector_lesopdracht VALUES ('2017_2018', '41TIN1280', '1TINA', 11111121);

REM **********************************************
REM tabel gemeenten vullen
REM **********************************************

INSERT INTO gemeenten VALUES (3270, 'SHERPENHEUVEL');
INSERT INTO gemeenten VALUES (3545, 'HALEN');
INSERT INTO gemeenten VALUES (3583, 'PAAL');
INSERT INTO gemeenten VALUES (6666, 'WEB');

REM **********************************************
REM tabel studenten vullen
REM **********************************************

INSERT INTO  studenten VALUES (11701170,'Angillis','Ian','Diestersteenweg 55', 3545);
INSERT INTO  studenten VALUES (11700247,'Veulemans','Joachim','Koning bouwdewijnstraat 22', 3270);
INSERT INTO  studenten VALUES (11702618,'Poel','Ward','Sint antiniusstraat 26', 3583);
INSERT INTO  studenten VALUES (11702082,'Van den Eerdewegh','Sisto','Lijsterlaan 46', 3270);
INSERT INTO  studenten VALUES (11701540,'Van Ruyssevelt', 'Jan','Prinsessenbosstraat 137', 3270);
INSERT INTO  studenten VALUES (11701839,'De Bot', 'Sarah','Onlinestraat 404', 6666);

REM **********************************************
REM tabel klas_perstudent_perolod vullen (voor student 11701170)
REM **********************************************

INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIN1580','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIN1100','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIN1140','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIN1250','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIN1130','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIW1010','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIN1277','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701170,'41TIN1280','1TINA');

REM **********************************************
REM tabel klas_perstudent_perolod vullen (voor student 11700247)
REM **********************************************

INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIN1580','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIN1100','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIN1140','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIN1250','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIN1130','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIW1010','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIN1277','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11700247,'41TIN1280','1TINA');

REM **********************************************
REM tabel klas_perstudent_perolod vullen (voor student 11702618)
REM **********************************************

INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIN1580','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIN1100','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIN1140','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIN1250','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIN1130','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIW1010','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIN1277','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702618,'41TIN1280','1TINA');

REM **********************************************
REM tabel klas_perstudent_perolod vullen (voor student 11702082)
REM **********************************************

INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIN1580','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIN1100','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIN1140','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIN1250','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIN1130','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIW1010','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIN1277','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11702082,'41TIN1280','1TINA');

REM **********************************************
REM tabel klas_perstudent_perolod vullen (voor student 11701540)
REM **********************************************

INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIN1580','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIN1100','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIN1140','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIN1250','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIN1130','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIW1010','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIN1277','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701540,'41TIN1280','1TINA');

REM **********************************************
REM tabel klas_perstudent_perolod vullen (voor student 11701839)
REM **********************************************

INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIN1580','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIN1100','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIN1140','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIN1250','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIN1130','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIW1010','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIN1277','1TINA');
INSERT INTO  klas_perstudent_perolod VALUES ('2017_2018',11701839,'41TIN1280','1TINA');

REM **********************************************
REM tabel lokalen vullen
REM **********************************************

INSERT INTO  lokalen VALUES ('EB041','laptoplokaal');
INSERT INTO  lokalen VALUES ('EB141','laptoplokaal');
INSERT INTO  lokalen VALUES ('EB342','aula');
INSERT INTO  lokalen VALUES ('EB151', 'laptoplokaal');
INSERT INTO  lokalen VALUES ('EB122', 'laptoplokaal');

REM **********************************************
REM tabel examenplanning vullen (Eerste zit)
REM **********************************************

INSERT INTO  examenplanning VALUES ('2017_2018',11,'41TIN1580',11701170,'L','1','EB122', '13:30');
INSERT INTO  examenplanning VALUES ('2017_2018',06,'41TIN1100',11701170,'L','1','EB151', '13:30');
INSERT INTO  examenplanning VALUES ('2017_2018',06,'41TIN1140',11701170,'R','4','EB041', '10:30');
INSERT INTO  examenplanning VALUES ('2017_2018',01,'41TIN1250',11701170,'L','15','EB122', '08:30');
INSERT INTO  examenplanning VALUES ('2017_2018',01,'41TIN1130',11701170,'R','2','EB141', '13:30');
INSERT INTO  examenplanning VALUES ('2017_2018',01,'41TIW1010',11701170,'R','6','EB151', '09:30');
INSERT INTO  examenplanning VALUES ('2017_2018',01,'41TIN1277',11701170,'L','2','EB122', '08:30');
INSERT INTO  examenplanning VALUES ('2017_2018',11,'41TIN1280',11701170,'L','1','EB141', '08:30');

REM **********************************************
REM tabel examenplanning vullen (Tweede zit)
REM **********************************************

INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIN1580',11701170,'L','1','EB151', '13:30');
INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIN1100',11701170,'L','1','EB122', '13:30');
INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIN1140',11701170,'R','4','EB151', '10:30');
INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIN1250',11701170,'L','15','EB041', '08:30');
INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIN1130',11701170,'R','2','EB141', '13:30');
INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIW1010',11701170,'R','6','EB122', '09:30');
INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIN1277',11701170,'L','2','EB151', '08:30');
INSERT INTO  examenplanning VALUES ('2017_2018',08,'41TIN1280',11701170,'L','1','EB141', '08:30');

REM **********************************************
REM tabel examenperiodes vullen
REM **********************************************

INSERT INTO examenperiodes VALUES (1, 'NOVEMBER');
INSERT INTO examenperiodes VALUES (2, 'JANUARI');
INSERT INTO examenperiodes VALUES (3, 'JUNI');
INSERT INTO examenperiodes VALUES (4, 'AUGUSTUS');

REM **********************************************
REM tabel examenkansen vullen
REM **********************************************

INSERT INTO examenkansen VALUES (1, 'EERSTEZIT');
INSERT INTO examenkansen VALUES (2, 'TWEEDEZIT');

REM **********************************************
REM tabel studentenscores vullen (Eerste zit)
REM **********************************************

INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIN1580',1,9);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIN1100',3,8);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIN1140',3,6);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIN1250',2,4);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIN1130',2,7);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIW1010',2,5);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIN1277',2,3);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,1,'41TIN1280',1,4);

REM **********************************************
REM tabel studentenscores vullen (Tweede zit)
REM **********************************************

INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIN1580',4,19);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIN1100',4,18);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIN1140',4,16);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIN1250',4,14);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIN1130',4,17);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIW1010',4,15);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIN1277',4,13);
INSERT INTO studentenscores VALUES ('2017_2018',11701170,2,'41TIN1280',4,14);

REM **********************************************
REM tabel lector_andere_taken vullen
REM **********************************************

INSERT INTO lector_andere_taken VALUES ('2017_2018', 11111111, 'DEP', 'I_TALENT', 0, 29.46);
INSERT INTO lector_andere_taken VALUES ('2017_2018', 11111121, 'AON', 'STAGEBEGELEIDING EN BACHELORPROJECTOR', 3, 28);
INSERT INTO lector_andere_taken VALUES ('2017_2018', 11111122, 'SNB', 'STAGEBEGELEIDING EN BACHELORPROJECTOR', 3, 14);
INSERT INTO lector_andere_taken VALUES ('2017_2018', 11666420, 'AON', 'ONDERZOEKSLERLIJN/AUTHENTIEK LEREN', 3, 69.95);
INSERT INTO lector_andere_taken VALUES ('2017_2018', 11111112, 'TIW', 'SWITCH2IT JAR BLT BEGELEIDING EN ONDERSTEUNING', 3, 52.23);