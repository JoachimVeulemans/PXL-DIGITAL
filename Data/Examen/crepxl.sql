REM   Script:   creatie tabellen voor puntenadministratie PXL

SET FEEDBACK 1
SET NUMWIDTH 10
SET LINESIZE 80
SET TRIMSPOOL ON
SET TAB OFF
SET PAGESIZE 100
SET ECHO OFF 
CLEAR SCREEN

REM *******************************************************************
REM drop tables
REM *******************************************************************
DROP table studentscores cascade constraints;
DROP table examenplanning cascade constraints;
DROP table examendatum_olod cascade constraints;
DROP table klas_perstudent_perolod cascade constraints;
DROP table lector_lesopdracht cascade constraints;
DROP table lector_anderetaken cascade constraints;
DROP table examenkansen cascade constraints;
DROP table examenperiodes cascade constraints;
DROP table olods cascade constraints;
DROP TABLE lokalen cascade constraints;
DROP TABLE studenten cascade constraints;
DROP TABLE lectoren cascade constraints;
DROP TABLE gemeenten cascade constraints;

Prompt ******  Creating examenkansen table ....  and inserting

CREATE TABLE examenkansen
    ( examenkanscode    VARCHAR2(3)
	   CONSTRAINT  exkans_PK PRIMARY KEY 
    , examenkans_omschrijving  VARCHAR2(25)
	   CONSTRAINT  exkans_omschr_nn  NOT NULL
    ) ;
	
INSERT INTO examenkansen VALUES ('EK1', 'Eerste examenkans');
INSERT INTO examenkansen VALUES ('EK2', 'Tweede examenkans');

Prompt ******  Creating examenperiodes table ....  and inserting

CREATE TABLE examenperiodes
    ( examenperiodecode    VARCHAR2(3)
		CONSTRAINT  exper_PK PRIMARY KEY 
    , examenperiode_omschrijving  VARCHAR2(25)
	    CONSTRAINT  exper_per_nn  NOT NULL
    ) ;
	
INSERT INTO examenperiodes VALUES ('K1', 'Kwartaal1');
INSERT INTO examenperiodes VALUES ('S1', 'Semester1');
INSERT INTO examenperiodes VALUES ('S2', 'Semester2');
INSERT INTO examenperiodes VALUES ('Z2', 'Zittijd augustus');


Prompt ******  Creating gemeenten table ....

CREATE TABLE gemeenten
    ( postcode    NUMBER(4)
		   CONSTRAINT  gemeenten_PK PRIMARY KEY 
    , gemeente  VARCHAR2(25)
	CONSTRAINT  gemeenten_gemeente_nn  NOT NULL
    ) ;


Prompt ******  Creating lectoren table ....

CREATE TABLE lectoren
    ( lectorcode      NUMBER 
       CONSTRAINT  lectoren_PK PRIMARY KEY
    , lectornaam    VARCHAR2(25) 
			CONSTRAINT  lectoren_lecnm_nn  NOT NULL
	, lectorvoornaam   VARCHAR2(25) 
			CONSTRAINT  lectoren_lecvnm_nn  NOT NULL
    );


Prompt ******  Creating studenten table ....

CREATE TABLE studenten 
    ( studentnr      NUMBER
       CONSTRAINT  studenten_PK PRIMARY KEY 
	   CONSTRAINT  studenten_stunr_CHK CHECK (studentnr >= 1000000 and studentnr < 99999999)
    , studentnaam    VARCHAR2(25) 
		CONSTRAINT  studenten_studnm_nn  NOT NULL
    , studentvoornaam      VARCHAR2(25) 
		CONSTRAINT  studenten_studvnm_nn  NOT NULL
    , studentadres     VARCHAR2(25) 
		CONSTRAINT  studenten_studadr_nn  NOT NULL
	, postcode NUMBER
	   CONSTRAINT studenten_pc_nn NOT NULL
	   CONSTRAINT studenten_pc_fk REFERENCES gemeenten(postcode)
    ) ;
	

Prompt ******  Creating lokalen table ....

CREATE TABLE lokalen
    ( lokaal    VARCHAR2(4)      
	   CONSTRAINT  lokalen_PK PRIMARY KEY 
	   CONSTRAINT  lokalen_lokaal_CHK  CHECK (LENGTH(lokaal) = 4 AND substr(lokaal,1,1) IN ('A','B','C','D','E') AND to_number(substr(lokaal, 2,3)) BETWEEN 0 AND 999)
    , lokaalsoort VARCHAR2(25)
		CONSTRAINT  lokalen_loksoort_nn  NOT NULL
    ) ;


Prompt ******  Creating olods table ....

CREATE TABLE olods
    ( olodcode         VARCHAR2(9)
		   CONSTRAINT  olods_PK PRIMARY KEY 
		   CONSTRAINT  olods_olcode_CHK  CHECK (LENGTH(olodcode) = 9 AND to_number(substr(olodcode,1,2)) BETWEEN 41 AND 43 
		                                   AND substr(olodcode, 3, 3) IN ('TIN','TIW') AND to_number(substr(olodcode, 6)) BETWEEN 0 AND 9999)
    , lesperiodenr      NUMBER
	       CONSTRAINT     olods_per_nn  NOT NULL
	       CONSTRAINT  olods_per_CHK  CHECK (lesperiodenr BETWEEN 1 AND 3)
    , olodnaam     VARCHAR2(25)
	       CONSTRAINT     olods_nm_nn  NOT NULL
    , onderwijsvorm      VARCHAR2(25)
		CONSTRAINT     olods_ov_nn  NOT NULL
    , olodcategorie      VARCHAR2(3)
		CONSTRAINT     olods_grsoort_nn  NOT NULL
    , uren      NUMBER
		CONSTRAINT     olods_u_nn  NOT NULL
    , norm     NUMBER
		CONSTRAINT     olods_norm_nn  NOT NULL
    , exsoort      VARCHAR2(25)
		CONSTRAINT     olods_exsoort_nn  NOT NULL
    , opleidingsprogramma      VARCHAR2(25)
		CONSTRAINT     olods_oplprog_nn  NOT NULL
    , wegingscoef     NUMBER
		CONSTRAINT     olods_wc_nn  NOT NULL
    , studiepunten      NUMBER
		CONSTRAINT     olods_stp_nn  NOT NULL
    ) ;
	

Prompt ******  Creating lector_lesopdracht table ....

CREATE TABLE lector_lesopdracht
    ( acjaar         VARCHAR2(25)
    , olodcode       VARCHAR2(9)
	   CONSTRAINT lectles_olcode_FK REFERENCES olods(olodcode)
    , klasgroep      VARCHAR2(5)
	   CONSTRAINT     lectles_klgr_CHK CHECK (length(klasgroep) = 5 AND substr(klasgroep,1,1) IN ('1','2','3') 
	                                   AND substr(klasgroep,2,3) IN ('TIN','TIW') AND  substr(klasgroep,5) BETWEEN 'A' AND 'Z' )
    , lectorcode          NUMBER
	   CONSTRAINT     lectles_leccode_nn  NOT NULL
	   CONSTRAINT     lectles_leccode_FK REFERENCES lectoren(lectorcode)  
	, CONSTRAINT lectles_PK PRIMARY KEY(acjaar, olodcode, klasgroep)
    ) ;


Prompt ******  Creating lector_anderetaken table ....

CREATE TABLE lector_anderetaken
    ( acjaar         VARCHAR2(25)
    , lectorcode          NUMBER
	   CONSTRAINT     lectand_leccode_FK REFERENCES lectoren(lectorcode)  
	, anderetakenopleiding VARCHAR2(3) 
	   CONSTRAINT     lectand_opl_CHK CHECK (anderetakenopleiding IN ('TIN','TIW', 'AON', 'SNB','SWM'))
	, anderetakenomschrijving VARCHAR2(25) 
	, anderetakenjaar NUMBER(1)
	   CONSTRAINT     lectand_jr_nn  NOT NULL
	   CONSTRAINT     lectand_jr_CHK CHECK (anderetakenjaar IN (1,2,3))
	, anderetakenuren NUMBER(4)
	   CONSTRAINT     lectand_u_nn  NOT NULL
    , CONSTRAINT lectand_PK PRIMARY KEY(acjaar, lectorcode, anderetakenopleiding, anderetakenomschrijving)
    ) ;


Prompt ******  Creating examendatum_olod table ....

CREATE TABLE examendatum_olod
     ( acjaar         VARCHAR2(25)
	 , examenmaand    VARCHAR2(25)
     , olodcode       VARCHAR2(9)
	   CONSTRAINT exdatolod_olcode_FK REFERENCES olods(olodcode)
	 , exdatum  DATE
	   CONSTRAINT     exdatolod_datum  NOT NULL
	 , CONSTRAINT exdatolod_PK PRIMARY KEY(acjaar, examenmaand, olodcode)
	 ) ;
	
	   
Prompt ******  Creating klas_perstudent_perolod table ....

CREATE TABLE klas_perstudent_perolod
     ( acjaar         VARCHAR2(25)
	 , studentnr      NUMBER
	   CONSTRAINT     klasperstudperolod_studnr_FK REFERENCES studenten(studentnr)  
     , olodcode       VARCHAR2(9)
	   CONSTRAINT klasperstudperolod_olcode_FK REFERENCES olods(olodcode)
	 , klasgroep    VARCHAR2(5)
	   CONSTRAINT     klasperstudperolod_klgroep  NOT NULL
	   CONSTRAINT     klasperstudperolod_klgr_CHK CHECK (length(klasgroep) = 5 AND substr(klasgroep,1,1) IN ('1','2','3') 
	                                   AND substr(klasgroep,2,3) IN ('TIN','TIW') AND  substr(klasgroep,5) BETWEEN 'A' AND 'Z' )
     , CONSTRAINT klasperstudperolod_PK PRIMARY KEY(acjaar, studentnr, olodcode)
	 , CONSTRAINT klasperstudperolod_lector_FK FOREIGN KEY (acjaar, olodcode, klasgroep) REFERENCES lector_lesopdracht(acjaar, olodcode, klasgroep)
	 ) ;


Prompt ******  Creating examenplanning table ....

CREATE TABLE examenplanning
     ( acjaar         VARCHAR2(25)
	 , examenmaand    VARCHAR2(25)
     , olodcode       VARCHAR2(9)
	   CONSTRAINT expl_olcode_FK REFERENCES olods(olodcode)
     , studentnr      NUMBER
	   CONSTRAINT     expl_studnr_FK REFERENCES studenten(studentnr)  
     , plaatszijde          VARCHAR2(1)
	   CONSTRAINT     expl_plzijde_nn  NOT NULL
	   CONSTRAINT     expl_plzijde_chk CHECK (plaatszijde IN ('L','R'))
	 , plaatsrij          NUMBER(3)
	   CONSTRAINT     expl_plrij_nn  NOT NULL
	 , lokaal  VARCHAR2(4)
	   CONSTRAINT     expl_lokaal_nn  NOT NULL
	   CONSTRAINT expl_lokaal_fk REFERENCES lokalen(lokaal)
     , beginuur VARCHAR2(10)
	   CONSTRAINT expl_bu_nn NOT NULL
	, CONSTRAINT expl_PK PRIMARY KEY(acjaar, examenmaand, olodcode, studentnr)
	, CONSTRAINT expl_studolod_FK FOREIGN KEY (acjaar, studentnr, olodcode) REFERENCES klas_perstudent_perolod(acjaar, studentnr, olodcode)
	, CONSTRAINT expl_olodperiode_FK FOREIGN KEY (acjaar,examenmaand,olodcode) REFERENCES examendatum_olod(acjaar,examenmaand,olodcode)
    ) ;


Prompt ******  Creating studentscores table ....

CREATE TABLE studentscores
     ( acjaar         VARCHAR2(25)
	 , studentnr      NUMBER
	   CONSTRAINT     studscores_studnr_FK REFERENCES studenten(studentnr) 
	 , examenkanscode  VARCHAR2(3)
	   CONSTRAINT studscores_exkans_FK REFERENCES examenkansen(examenkanscode)
	 , olodcode       VARCHAR2(9)
	   CONSTRAINT studscores_olcode_FK REFERENCES olods(olodcode)
	 , examenperiodecode    VARCHAR2(3)
	   CONSTRAINT studscores_exper_FK REFERENCES examenperiodes(examenperiodecode)
     , score  NUMBER
	 	   CONSTRAINT     studscores_score_nn  NOT NULL
		   CONSTRAINT     studscores_score_CHK  CHECK (score between 0 AND 20)
     , CONSTRAINT studscores_PK PRIMARY KEY(acjaar,  studentnr, examenkanscode, olodcode) 
       ) ;


COMMIT;


Prompt --> insert data into the gemeenten table
INSERT INTO gemeenten VALUES(3500, 'Hasselt');
INSERT INTO gemeenten VALUES(3600, 'Genk');
INSERT INTO gemeenten VALUES(3700, 'Tongeren');
INSERT INTO gemeenten VALUES(3800, 'St-Truiden');

Prompt --> insert data into the lectoren table
INSERT INTO lectoren VALUES(20001000, 'Nys', 'Kerstin');
INSERT INTO lectoren VALUES(20002000, 'Medats', 'Carina');
INSERT INTO lectoren VALUES(20003000, 'Gemers', 'Mia');
INSERT INTO lectoren VALUES(20004000, 'Derkoningen', 'Carine');
INSERT INTO lectoren VALUES(20005000, 'Raymaekers', 'Josepha');
INSERT INTO lectoren VALUES(20006000, 'Vanderstraeten', 'Sam');
INSERT INTO lectoren VALUES(20007000, 'Swinnen', 'Dries');
INSERT INTO lectoren VALUES(20008000, 'Lambrechts', 'Rita');

Prompt --> insert data into the studenten table
INSERT INTO studenten VALUES(17001000, 'Aerts', 'An', 'kerkstraat 5', 3500);
INSERT INTO studenten VALUES(17002000, 'Vermesen', 'Erik', 'lindestraat 52', 3600);
INSERT INTO studenten VALUES(17003000, 'Kaes', 'John', 'zomerstraat 7', 3700);
INSERT INTO studenten VALUES(	16003001	, 	'Vandenborre'	, 	'Marie'	,	'sparstraat 15'	,	3600	);
INSERT INTO studenten VALUES(	16003002	, 	'Alberty'	, 	'Philippe'	,	'oude luikerbaan 71'	,	3500	);
INSERT INTO studenten VALUES(	17003001	, 	'Appelmans'	, 	'Kris'	,	'kerkstraat 55'	,	3600	);
INSERT INTO studenten VALUES(	17003002	, 	'Witte'	, 	'Gert'	,	'lindestraat 71'	,	3500	);
INSERT INTO studenten VALUES(	17003003	, 	'Aerts'	, 	'Rien'	,	'winterstraat 6'	,	3700	);
INSERT INTO studenten VALUES(	17003004	, 	'Klawitter'	, 	'Matthias'	,	'lentestraat 7'	,	3800	);
INSERT INTO studenten VALUES(	17003005	, 	'Kenes'	, 	'Mark'	,	'sparrestraat 71'	,	3600	);
INSERT INTO studenten VALUES(	17003006	, 	'Franssen'	, 	'Eline'	,	'dorpstraat 14'	,	3500	);
INSERT INTO studenten VALUES(	17003007	, 	'Hons'	, 	'Tom'	,	'koestraat 17'	,	3700	);
INSERT INTO studenten VALUES(	17003008	, 	'Huisjes'	, 	'Leen'	,	'wolvenstraat 27'	,	3800	);
INSERT INTO studenten VALUES(	17003009	, 	'Willems'	, 	'Veerle'	,	'heistraat 37'	,	3600	);
INSERT INTO studenten VALUES(	17003010	, 	'Waterman'	, 	'Marijke'	,	'elfde liniestraat 7'	,	3500	);
INSERT INTO studenten VALUES(	17003011	, 	'Janssens'	, 	'Leen'	,	'grote straat 47'	,	3700	);
INSERT INTO studenten VALUES(	17003012	, 	'Klimop'	, 	'Lotte'	,	'lange straat 69'	,	3800	);
INSERT INTO studenten VALUES(	17003013	, 	'Daenen'	, 	'Miet'	,	'nieuwstraat 32'	,	3600	);
INSERT INTO studenten VALUES(	17003014	, 	'Tilkens'	, 	'Lies'	,	'kromme straat 21'	,	3500	);
INSERT INTO studenten VALUES(	17003015	, 	'Tilkens'	, 	'Louise'	,	'bosstraat 214'	,	3700	);
INSERT INTO studenten VALUES(	17003016	, 	'Claes'	, 	'Lowie'	,	'schoolstraat 97'	,	3800	);
INSERT INTO studenten VALUES(	17003017	, 	'Kuppens'	, 	'Kyril'	,	'demerstraat 61'	,	3600	);
INSERT INTO studenten VALUES(	17003018	, 	'Beervoets'	, 	'Jonas'	,	'rode kruisstraat 72'	,	3500	);
INSERT INTO studenten VALUES(	17003019	, 	'Yilmaz'	, 	'Niels'	,	'casterstraat 22'	,	3700	);
INSERT INTO studenten VALUES(	17003020	, 	'Spaelt'	, 	'Dennis'	,	'st janstraat 103'	,	3800	);
INSERT INTO studenten VALUES(	17003021	, 	'Vanneste'	, 	'Jan'	,	'hoogstraat 46'	,	3600	);
INSERT INTO studenten VALUES(	17003022	, 	'Goedeman'	, 	'Piet'	,	'beekstraat 7'	,	3500	);
INSERT INTO studenten VALUES(	17003023	, 	'Verstreken'	, 	'Jules'	,	'hendriksstraat 7'	,	3700	);
INSERT INTO studenten VALUES(	17003024	, 	'Janssens'	, 	'Ali'	,	'ossekopstraat 6'	,	3800	);
INSERT INTO studenten VALUES(	17003025	, 	'Heersel'	, 	'Abdul'	,	'putstraat 97'	,	3600	);
INSERT INTO studenten VALUES(	17003026	, 	'Borders'	, 	'An'	,	'sasstraat 53'	,	3500	);
INSERT INTO studenten VALUES(	17003027	, 	'Terriers'	, 	'Indra'	,	'holle straat 19'	,	3700	);
INSERT INTO studenten VALUES(	17003028	, 	'Teerain'	, 	'Bram'	,	'kerkstraat 27'	,	3800	);



Prompt --> insert data into the lokalen table
INSERT INTO lokalen VALUES('B046', 'laptoplokaal');
INSERT INTO lokalen VALUES('B047', 'laptoplokaal');
INSERT INTO lokalen VALUES('B057', 'laptoplokaal');
INSERT INTO lokalen VALUES('B051', 'laptoplokaal');
INSERT INTO lokalen VALUES('B014', 'laptoplokaal');
INSERT INTO lokalen VALUES('B147', 'laptoplokaal');
INSERT INTO lokalen VALUES('B146', 'laptoplokaal');
INSERT INTO lokalen VALUES('B145', 'laptoplokaal');
INSERT INTO lokalen VALUES('B144', 'laptoplokaal');
INSERT INTO lokalen VALUES('B141', 'laptoplokaal');
INSERT INTO lokalen VALUES('B151', 'laptoplokaal');
INSERT INTO lokalen VALUES('B152', 'laptoplokaal');
INSERT INTO lokalen VALUES('B153', 'laptoplokaal');
INSERT INTO lokalen VALUES('B015', 'aula');

Prompt --> insert data into the olods table
INSERT INTO olods VALUES(	'41TIN1240', 1, 'Desktop OS: Windows', 'PR', 'KL', 21, 560, 'SL', 'Systems and networks', 3, 3);
INSERT INTO olods VALUES(	'41TIW1090', 1, 'SQL Essentials', 'PR', 'BA', 7, 476, 'SL', 'Problem solving', 3, 3);
INSERT INTO olods VALUES(	'41TIN1320', 1, 'Data', 'PR', 'KL', 56, 560, 'SL', 'Problem solving', 6, 6);
INSERT INTO olods VALUES(	'41TIN1130', 1, 'java essentials', 'PR', 'KL', 56, 560, 'SL', 'application development', 6, 6);
INSERT INTO olods VALUES(	'41TIN1100', 1, 'Web essentials', 'PR', 'KL', 56, 560, 'SL', 'application development', 6, 6);
INSERT INTO olods VALUES(	'41TIN1140', 1, '.Net essentials', 'PR', 'KL', 56, 560, 'SL', 'application development', 6, 6);
INSERT INTO olods VALUES(	'41TIN1180', 1, 'Business flow essentials', 'PR', 'KL', 56, 560, 'SC', 'problem solving', 6, 6);
INSERT INTO olods VALUES(	'41TIN1220', 1, 'Computer systems', 'PR', 'KL', 56, 560, 'SL', 'problem solving', 6, 6);
INSERT INTO olods VALUES(	'41TIN1230', 1, 'Cisco academy CCNA1', 'PR', 'KL', 56, 560, 'SL', 'application development', 6, 6);
INSERT INTO olods VALUES(	'41TIN1290', 1, 'Math for IT', 'PR', 'KL', 56, 560, 'SL', 'problem solving', 6, 6);
INSERT INTO olods VALUES(	'41TIN1310', 1, 'Big data', 'PR', 'KL', 56, 560, 'SL', 'problem solving', 6, 6);

Prompt --> insert data into the lector_lesopdracht table
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1240','1TINA' , 20001000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1240','1TINB' , 20001000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1240','1TINC' , 20002000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1240','1TIND' , 20002000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1320','1TINB' , 20001000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1320','1TINA' , 20003000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1320','1TINC' , 20004000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1320','1TIND' , 20003000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1130','1TINA' , 20003000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1130','1TINB' , 20005000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1130','1TINC' , 20007000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1130','1TIND' , 20008000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1100','1TINA' , 20004000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1100','1TINB' , 20004000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1100','1TINC' , 20006000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1100','1TIND' , 20006000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1140','1TINA' , 20004000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1140','1TINB' , 20005000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1140','1TINC' , 20005000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1140','1TIND' , 20005000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1180','1TINA' , 20003000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1180','1TINB' , 20004000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1180','1TINC' , 20007000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1180','1TIND' , 20007000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1220','1TINA' , 20008000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1220','1TINB' , 20008000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1220','1TINC' , 20008000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1220','1TIND' , 20001000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1230','1TINA' , 20002000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1230','1TINB' , 20002000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1230','1TINC' , 20003000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1230','1TIND' , 20003000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1290','1TINA' , 20004000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1290','1TINB' , 20004000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1290','1TINC' , 20005000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1290','1TIND' , 20005000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1310','1TINA' , 20006000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1310','1TINB' , 20006000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1310','1TINC' , 20005000 );
INSERT INTO lector_lesopdracht VALUES('2017 - 2018', '41TIN1310','1TIND' , 20003000 );

INSERT INTO lector_lesopdracht
     SELECT '2016 - 2017', olodcode, klasgroep, lectorcode FROM lector_lesopdracht;
UPDATE lector_lesopdracht
     SET lectorcode = 20008000
     WHERE lectorcode = 20006000 AND acjaar = '2016 - 2017';


Prompt --> insert data into the lector_anderetaken table
INSERT INTO lector_anderetaken VALUES('2017 - 2018', 20002000, 'AON', 'stagebegeleiding', 3, 21 );
INSERT INTO lector_anderetaken VALUES('2017 - 2018', 20004000, 'SWM', 'stagebegeleiding', 3, 49 );
INSERT INTO lector_anderetaken VALUES('2017 - 2018', 20001000, 'TIN', 'studentenbegeleiding', 1, 200 );
INSERT INTO lector_anderetaken VALUES('2016 - 2017', 20003000, 'AON', 'stagebegeleiding', 3, 27 );
INSERT INTO lector_anderetaken VALUES('2016 - 2017', 20004000, 'SWM', 'stagebegeleiding', 3, 39 );
INSERT INTO lector_anderetaken VALUES('2016 - 2017', 20001000, 'TIN', 'studentenbegeleiding', 1, 200 );

Prompt --> insert data into the examendatum_olod table
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'januari', '41TIN1130', to_date('2018-01-22', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1130', to_date('2018-08-22', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'november', '41TIN1240', to_date('2017-11-22', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1240', to_date('2018-08-28', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'januari', '41TIN1320', to_date('2018-01-27', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1320', to_date('2018-08-30', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1140', to_date('2018-09-01', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'juni',    '41TIN1140', to_date('2018-06-11', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1100', to_date('2018-08-31', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'juni',    '41TIN1100', to_date('2018-06-13', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'november', '41TIN1220', to_date('2017-11-24', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1220', to_date('2018-09-06', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1230', to_date('2018-09-05', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'juni',    '41TIN1230', to_date('2018-06-15', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1290', to_date('2018-09-04', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'juni',    '41TIN1290', to_date('2018-06-09', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'januari', '41TIN1180', to_date('2018-01-26', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1180', to_date('2018-08-29', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'juni',    '41TIN1310', to_date('2018-06-16', 'yyyy-mm-dd') );
INSERT INTO examendatum_olod VALUES('2017 - 2018', 'aug-sep', '41TIN1310', to_date('2018-09-03', 'yyyy-mm-dd') );

INSERT INTO examendatum_olod
     SELECT '2016 - 2017', examenmaand, olodcode, add_months(exdatum,-12) 
     FROM examendatum_olod;
	 
UPDATE examendatum_olod
     SET exdatum = exdatum - 1
     WHERE to_char(exdatum ,'DY') = 'SUN';

Prompt --> insert data into the klas_perstudent_perolod table
DECLARE
  v_klasgroep   klas_perstudent_perolod.klasgroep%type ;
BEGIN
   for rec in (select studentnr from studenten WHERE SUBSTR(studentnr, 1,2) = '17') loop
       IF SUBSTR(rec.studentnr, -1, 1) < 3 THEN v_klasgroep := '1TINA';
         ELSIF  SUBSTR(rec.studentnr, -1, 1) < 6 THEN v_klasgroep := '1TINB';
         ELSIF  SUBSTR(rec.studentnr, -1, 1) < 8 THEN v_klasgroep := '1TINC';
         ELSE   v_klasgroep := '1TIND';
       END IF;
       insert into klas_perstudent_perolod
         select  '2017 - 2018', rec.studentnr, olodcode, v_klasgroep 
         from olods WHERE olodcode LIKE '%TIN%';
   end loop;
END;
/

DECLARE
  v_klasgroep   klas_perstudent_perolod.klasgroep%type ;
BEGIN
   for rec in (select studentnr from studenten WHERE SUBSTR(studentnr, 1,2) = '16') loop
       IF SUBSTR(rec.studentnr, -1, 1) < 2 THEN v_klasgroep := '1TINA';
         ELSE   v_klasgroep := '1TIND';
       END IF;
       insert into klas_perstudent_perolod
         select  '2016 - 2017', rec.studentnr, olodcode, v_klasgroep 
         from olods WHERE olodcode LIKE '%TIN%';
   end loop;
END;
/

-- de studenten van 1617 moeten nog olods van 1718 toegevoegd krijgen afhankelijk van hun res van 1617 !!!!!!!


Prompt --> insert data into the examenplanning table: eerste zit
-- alle studenten hebben een planning voor eerste zit
DECLARE   
  v_lokaal      lokalen.lokaal%type ;
  v_volgnr      number := 1;
  v_examenmaand examendatum_olod.examenmaand%type;
BEGIN
   for rec in (select * from klas_perstudent_perolod order by acjaar, olodcode, klasgroep) loop
       IF rec.klasgroep = '1TINA' THEN v_lokaal := 'B046';
         ELSIF rec.klasgroep = '1TINB' THEN v_lokaal := 'B047';
         ELSIF rec.klasgroep = '1TINC' THEN v_lokaal := 'B144';
         ELSE  v_lokaal := 'B152';
       END IF;
       IF v_volgnr < 17 THEN v_volgnr := v_volgnr + 1;
       ELSE v_volgnr := 1;
       END IF;
       SELECT examenmaand INTO v_examenmaand
          FROM examendatum_olod 
          WHERE acjaar = rec.acjaar
          AND olodcode = rec.olodcode
          AND examenmaand != 'aug-sep';
       insert into examenplanning values(rec.acjaar, v_examenmaand, rec.olodcode, rec.studentnr, 'L', 
                                         v_volgnr, v_lokaal, '8:30');
   end loop;
END;
/

Prompt --> insert data into the studentscores table: eerste zit
DECLARE
  v_score             number := 6;
  v_examenperiodecode studentscores.examenperiodecode%type;
BEGIN
   FOR rec in (select * from examenplanning order by olodcode) LOOP
      IF rec.examenmaand like '%nov%' THEN
	       v_examenperiodecode := 'K1';
	  ELSIF rec.examenmaand like '%jan%' THEN
	  	   v_examenperiodecode := 'S1';
	  ELSIF rec.examenmaand like '%jun%' THEN
	  	   v_examenperiodecode := 'S1';
	  ELSE v_examenperiodecode := 'Z2';
	  END IF;
	  IF substr(rec.studentnr, -1,1) > 6 AND v_score < 10 
	     THEN v_score := v_score + 8;
	  END IF;
      INSERT INTO studentscores VALUES(rec.acjaar, rec.studentnr,
          'EK1', rec.olodcode, v_examenperiodecode, v_score);
      v_score := MOD(v_score + 8, 21);
   END LOOP;
END;
/

Prompt --> insert data into the examenplanning table: tweede zit
DECLARE   
  v_lokaal      lokalen.lokaal%type ;
  v_volgnr      number := 1;
  v_examenmaand examendatum_olod.examenmaand%type  := 'aug-sep';
BEGIN
   for rec in (select * from studentscores where score < 10 order by acjaar, olodcode) loop
       IF substr(rec.studentnr,-1,1) < 4 THEN v_lokaal := 'B153';
         ELSE  v_lokaal := 'B141';
       END IF;
       IF v_volgnr < 17 THEN v_volgnr := v_volgnr + 1;
       ELSE v_volgnr := 1;
       END IF;
       insert into examenplanning values(rec.acjaar, v_examenmaand, rec.olodcode, rec.studentnr, 'R', 
                                         v_volgnr, v_lokaal, '8:30');
   end loop;
END;
/

Prompt --> insert data into the studentscores table: tweede zit
DECLARE
  v_score             number := 6;
  v_examenperiodecode studentscores.examenperiodecode%type;
BEGIN
   FOR rec in (select * from examenplanning where examenmaand = 'aug-sep' order by olodcode) LOOP
      v_examenperiodecode := 'Z2';
	  IF substr(rec.studentnr, -1,1) > 5 AND v_score < 10 
	     THEN v_score := v_score + 8;
	  END IF;
      INSERT INTO studentscores VALUES(rec.acjaar, rec.studentnr,
          'EK2', rec.olodcode, v_examenperiodecode, v_score);
      v_score := MOD(v_score + 8, 21);
   END LOOP;
END;
/

Prompt *****************************************************************************************
Prompt nu nog studenten toevoegen die in 1617 begonnen zijn en nog olods moeten hernemen in 1718
Prompt *****************************************************************************************
Prompt --> insert studenten into the klas_perstudent_perolod table 

DECLARE
  v_klasgroep   klas_perstudent_perolod.klasgroep%type ;
BEGIN
   for rec in (select studentnr, olodcode from klas_perstudent_perolod WHERE SUBSTR(studentnr, 1,2) = '16'
               minus
			   select studentnr, olodcode from studentscores WHERE SUBSTR(studentnr, 1,2) = '16' and score >= 10) loop
       IF SUBSTR(rec.studentnr, -1, 1) < 2 THEN v_klasgroep := '1TINA';
         ELSE   v_klasgroep := '1TINB';
       END IF;
       insert into klas_perstudent_perolod
         VALUES(  '2017 - 2018', rec.studentnr, rec.olodcode, v_klasgroep);
   end loop;
END;
/

Prompt --> insert data into the examenplanning table: eerste zit
DECLARE   
  v_lokaal      lokalen.lokaal%type := 'B145' ;
  v_volgnr      number := 1;
  v_examenmaand examendatum_olod.examenmaand%type;
BEGIN
   for rec in (select * from klas_perstudent_perolod WHERE studentnr like '16%' AND acjaar like '2017%'
               order by acjaar, olodcode, klasgroep) loop
       SELECT examenmaand INTO v_examenmaand
          FROM examendatum_olod 
          WHERE acjaar = rec.acjaar
          AND olodcode = rec.olodcode
          AND examenmaand != 'aug-sep';
       insert into examenplanning values(rec.acjaar, v_examenmaand, rec.olodcode, rec.studentnr, 'L', 
                                         v_volgnr, v_lokaal, '8:30');
   end loop;
END;
/

Prompt --> insert data into the studentscores table: eerste zit
DECLARE
  v_score             number := 9;
  v_examenperiodecode studentscores.examenperiodecode%type;
BEGIN
   FOR rec in (select * from examenplanning WHERE studentnr like '16%' AND acjaar like '2017%') LOOP
      IF rec.examenmaand like '%nov%' THEN
	       v_examenperiodecode := 'K1';
	  ELSIF rec.examenmaand like '%jan%' THEN
	  	   v_examenperiodecode := 'S1';
	  ELSIF rec.examenmaand like '%jun%' THEN
	  	   v_examenperiodecode := 'S1';
	  ELSE v_examenperiodecode := 'Z2';
	  END IF;
      INSERT INTO studentscores VALUES(rec.acjaar, rec.studentnr,
          'EK1', rec.olodcode, v_examenperiodecode, v_score);
      v_score := MOD(v_score + 1, 10) + 10;
   END LOOP;
END;
/

Prompt --> insert data into the examenplanning table: tweede zit
insert into examenplanning values('2017 - 2018', 'aug-sep', '41TIN1180', 16003002, 'L', 
                                         17, 'B145', '8:30');

Prompt --> insert data into the studentscores table: tweede zit
INSERT INTO studentscores VALUES('2017 - 2018', 16003002,
          'EK2', '41TIN1180', 'Z2', 10);
COMMIT;
