\! clear

--Popolamento corso laurea
INSERT INTO CORSO_LAUREA VALUES('informatica',3,'laurea triennale');
INSERT INTO CORSO_LAUREA VALUES('matematica',3,'laurea triennale');
INSERT INTO CORSO_LAUREA VALUES('biotecnologie',3,'laurea triennale');
INSERT INTO CORSO_LAUREA VALUES('medicina',7,'laurea specialistica');
INSERT INTO CORSO_LAUREA VALUES('infermieristica',3,'laurea triennale');
INSERT INTO CORSO_LAUREA VALUES('bioinformatica',3,'laurea triennale');
INSERT INTO CORSO_LAUREA VALUES('scienze motorie',3,'laurea triennale');
INSERT INTO CORSO_LAUREA VALUES('economia',3,'laurea triennale');
INSERT INTO CORSO_LAUREA VALUES('visual computing',2,'laurea magistrale');
INSERT INTO CORSO_LAUREA VALUES('sistemi embedded',2,'laurea magistrale');

INSERT INTO CORSO_LAUREA (nomeCl, durata ,tipo) VALUES ('teologia',7,'magistrale');
INSERT INTO CORSO_LAUREA (nomeCl, durata ,tipo) VALUES ('penale',3,'specialistica');
INSERT INTO CORSO_LAUREA (nomeCl, durata ,tipo) VALUES ('lingue',3,'trienale');
INSERT INTO CORSO_LAUREA (nomeCl, durata ,tipo) VALUES ('filosofia',3,'trienale');
INSERT INTO CORSO_LAUREA (nomeCl, durata ,tipo) VALUES ('lettere',5,'quinquenale');




--Popolamento facoltà
INSERT INTO FACOLTA VALUES('scienze');
INSERT INTO FACOLTA VALUES('medicina');
INSERT INTO FACOLTA VALUES('scienze motorie');
INSERT INTO FACOLTA VALUES('economia');

INSERT INTO FACOLTA (nomeF) VALUES ('seminario');
INSERT INTO FACOLTA (nomeF) VALUES ('legge');
INSERT INTO FACOLTA (nomeF) VALUES ('F.L.&L.');





--Popolamento proposta
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('informatica','scienze');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('matematica','scienze');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('biotecnologie','scienze');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('medicina','scienze');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('infermieristica','medicina');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('bioinformatica','scienze');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('scienze motorie','scienze motorie');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('economia','economia');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('visual computing','scienze');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES('sistemi embedded','scienze');

INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES ('teologia','seminario');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES ('penale','legge');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES ('lingue','F.L.&L.');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES ('filosofia','F.L.&L.');
INSERT INTO PROPOSTA (corso_laureaP,facolta) VALUES ('lettere','F.L.&L.');



--Popolamento STUDENTE 
INSERT INTO STUDENTE VALUES('vr00000001','rossi','mario','uni boston', 'usa', '1993-01-08','vr00000001', '10000000rv', 'informatica', '2015-01-08');
INSERT INTO STUDENTE VALUES('vr00000002','verdi','maria','uni cambridge', 'inghilterra', '1992-01-08','vr00000002', '20000000rv', 'informatica', '2014-01-08','2014-08-08');
INSERT INTO STUDENTE VALUES('vr00000003','marroni','ambra','uni tokio', 'giappone', '1993-12-08','vr00000003', '30000000rv', 'matematica', '2013-12-08','2014-05-08');
INSERT INTO STUDENTE VALUES('vr00000004','gialli','fausto','uni pechino', 'cina', '1993-01-28','vr00000004', '40000000rv', 'matematica', '2012-01-28','2012-08-28');
INSERT INTO STUDENTE VALUES('vr00000005','blu','nicola','uni londra', 'inghilterra', '1989-01-20','vr00000005', '50000000rv', 'biotecnologie', '2011-01-20','2011-08-20');
INSERT INTO STUDENTE VALUES('vr00000006','viola','andrea','uni berlino', 'germania', '1995-04-08','vr0000006', '60000000rv', 'biotecnologie', '2015-04-08');
INSERT INTO STUDENTE VALUES('vr00000007','neri','susanna','uni parigi', 'francia', '1991-01-24','vr00000007', '70000000rv', 'medicina', '2015-01-24');
INSERT INTO STUDENTE VALUES('vr00000008','bianchi','carlo','uni mosca', 'russia', '1988-05-08','vr00000008', '80000000rv', 'medicina', '2015-03-08');
INSERT INTO STUDENTE VALUES('vr00000009','grigi','alberto','uni madrid', 'spagna', '1987-12-31','vr00000009', '90000000rv', 'infermieristica', '2014-12-31', '2015-04-30');
INSERT INTO STUDENTE VALUES('vr00000010','kaki','franco','uni barcellona', 'spagna', '1990-07-09','vr00000010', '10000000rv', 'sistemi embedded', '2009-07-09','2010-06-09');
INSERT INTO STUDENTE VALUES('vr00000011','lilla','graziano','uni oxford', 'inghilterra', '1992-03-29','vr00000011', '11000000rv', 'bioinformatica', '2010-03-29','2010-09-29');
INSERT INTO STUDENTE VALUES('vr00000012','magenta','massimo','uni sidney', 'australia', '1994-01-21','vr00000012', '12000000rv', 'bioinformatica', '2011-01-21','2011-09-21');
INSERT INTO STUDENTE VALUES('vr00000013','zaffiri','enrico','uni bruxelles', 'belgio', '1986-01-19','vr00000013', '13000000rv', 'visual computing', '2012-01-19','2012-09-19');
INSERT INTO STUDENTE VALUES('vr00000014','rubini','paolo','uni dublino', 'irlanda', '1985-01-17','vr00000014', '14000000rv', 'scienze motorie', '2013-01-17','2013-11-17');
INSERT INTO STUDENTE VALUES('vr00000015','diamanti','gloria','uni lisbona', 'portogallo', '1984-01-23','vr00000015', '15000000rv', 'economia', '2014-01-23','2014-12-23');

INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA, DR) VALUES ('vr00000016','Red','anna','oxford','inghilterra','10-02-90','ra123','12354','penale','02-03-13','27-02-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA, DR) VALUES ('vr00000017','Blu',	'john','oxford','inghilterra','11-07-93',	'bj855'	,'852471','lingue','12-04-13','12-04-15');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000018','Green','alex','cambridge','inghilterra','12-08-89','gs789','987529','filosofia','12-04-13');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000019','Brown','kate','cambridge','inghilterra','13-04-90',	'bk582','uhfd5','filosofia','14-04-13');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA, DR) VALUES ('vr00000020','Blua'	,'mark','amburgo','germania','14-02-90','bm145','5s4dfs65d','lettere','17-04-13','18-11-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA, DR) VALUES ('vr00000021','Weib'	,'frank','amburgo','germania','15-09-90','wf698','sd564f45s','lettere','24-05-13','22-01-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000022','lilla','yulian','berlino','germania','16-11-87','ly874','y5d4f','lettere','27-09-13');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000023','purpurrot','alfred','berlino','germania','17-02-90','pa142','5f4s65','filosofia','15-01-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA, DR) VALUES ('vr00000024','Bluaw','Ariel','Amsterdam','olanda','18-12-93','ba874','d5f6s5d4f','lingue','22-01-14','27-09-13');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA, DR) VALUES ('vr00000025','Wit','simon','Amsterdam','olanda','19-02-88','ws753','bfgh4dfh5','filosofia','27-02-14','18-11-15');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000026','paaras','michel','Amsterdam','olanda','20-02-90','pm743','hdf5g6','filosofia','13-05-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000027','White','george','Harvard','usa','21-02-88','wg934','fg45d6fg','lettere','22-08-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA, DR) VALUES ('vr00000028','Black','richard','Harvard','usa','22-12-91','br654','r4gd6fg','lingue','25-10-14','25-12-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000029','Yellow','sue','Harvard','usa','23-02-90','ys826','fg5d5fg','filosofia','18-11-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000030','Azul'	,'maria','Madrid','spagna','24-02-90','az254','dfg565','lettere','13-12-14');
INSERT INTO STUDENTE ( MAT , COG , NOME ,UNI ,STATO, DN, LOGIN, PW, CORSO_LAUREAS, DA) VALUES ('vr00000031','Rojo','pablo','Madrid','spagna','25-05-90','rp730','hyb5d2','filosofia','21-12-14');






--Popolamento insegnamenti
INSERT INTO INSEGNAMENTO VALUES('ins0000001','informatica','basi di dati', 'alberto belussi','2014/2015');
INSERT INTO INSEGNAMENTO VALUES('ins0000002','informatica','programmazione', 'fausto spoto','2013/2014');
INSERT INTO INSEGNAMENTO VALUES('ins0000003','informatica','immagini', 'gloria menegaz','2012/2013');
INSERT INTO INSEGNAMENTO VALUES('ins0000004','matematica','analisi 3', 'sisto baldo','2011/2012');
INSERT INTO INSEGNAMENTO VALUES('ins0000005','matematica','fondamenti della matematica', 'antonio marigonda','2010/2011');
INSERT INTO INSEGNAMENTO VALUES('ins0000006','infermieristica','patologia', 'massimiliano masetti','2009/2010');
INSERT INTO INSEGNAMENTO VALUES('ins0000007','biotecnologie','filosofia della scienza', 'emanuele ferri','2008/2019');
INSERT INTO INSEGNAMENTO VALUES('ins0000008','biotecnologie','genetica', 'immanuel kant','2007/2008');
INSERT INTO INSEGNAMENTO VALUES('ins0000009','bioinformatica','architettura', 'tommaso aquino','2006/2008');
INSERT INTO INSEGNAMENTO VALUES('ins0000010','medicina','farmacologia', 'thomas kuhn','2005/2006');
INSERT INTO INSEGNAMENTO VALUES('ins0000011','medicina','anatomia', 'galileo galilei','2004/2005');
INSERT INTO INSEGNAMENTO VALUES('ins0000012','scienze motorie','ginnastica', 'guglielmo marconi','2003/2004');
INSERT INTO INSEGNAMENTO VALUES('ins0000013','economia','microeconomia', 'harrison ford','2002/2003');
INSERT INTO INSEGNAMENTO VALUES('ins0000014','visual computing','ttr', 'andrea giacchetti','2001/2002');
INSERT INTO INSEGNAMENTO VALUES('ins0000015','sistemi embedded','sistemi operativi avanzati', 'graziano pravadelli','2000/2001');

INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ('teo0001', 'teologia','greco antico I' ,'marina gialli','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ('teo0002','teologia', 'cristianesimo', 'marco rossi','2013/2014');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'teo0003','teologia','latino','antonio bianchi','2014/2015' );
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'giu0001','penale','dirito civile I','sara bianchi','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'giu0002', 'penale','dirito penale I','teresa verdi','2013/2014');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'giu0003','penale','dirto penale II','luca monti','2012/2013');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0001','lingue','tedescoI','mark schwarz','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0002','lingue','spegnoli II','anna blanca','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0003','lingue','francese III','jaune claire','2014/2015' );
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0004','filosofia','filosofi I','mirco blu','2014/2015' );
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0005','filosofia','filosofi II','anna rossi','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0006','filosofia','storia I','antonio bianconi','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0007','lettere','testi anthi I','chiara verdoni','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0008','lettere','letteretura I','michela verdi','2014/2015');
INSERT INTO INSEGNAMENTO (cod, corso_laureaI, nomeI, doc ,AA) VALUES ( 'fll0009','lettere','letteratura II','simone rossi','2014/2015');




--Popolamento MESSAGGIO 
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000001','2014-01-23','java.lang.object 1','Lorem ipsum 1','generale');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000002','2013-01-17','java.lang.object 2','Lorem ipsum 2','generale');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000003','2012-01-19','java.lang.object 3','Lorem ipsum 3','didattica');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000004','2011-01-21','java.lang.object 4','Lorem ipsum 4','didattica');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000005','2010-03-29','java.lang.object 5','Lorem ipsum 5','vitto');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000006','2014-12-31','java.lang.object 6','Lorem ipsum 6','vitto');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000007','2015-03-08','java.lang.object 7','Lorem ipsum 7','alloggio');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000008','2015-01-24','java.lang.object 8','Lorem ipsum 8','alloggio');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000009','2015-04-08','java.lang.object 9','Lorem ipsum 9','iniziative');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000010','2015-01-08','java.lang.object 10','Lorem ipsum 10','iniziative');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000011','2014-01-08','java.lang.object 11','Lorem ipsum 11','lezioni');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000012','2013-12-08','java.lang.object 12','Lorem ipsum 12','lezioni');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000013','2011-01-20','java.lang.object 13','Lorem ipsum 13','consigli');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000014','2011-08-20','java.lang.object 14','Lorem ipsum 14','consigli');
INSERT INTO MESSAGGIO (studenteM, dataOraM, oggetto, testoM, tipologia) VALUES('vr00000015','2014-08-08','java.lang.object 15','Lorem ipsum 15','consigli');

INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000016','01-01-14 13:40:00','Oggetto 15','Messagio 1','generale');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000031','15-01-14 9:46','Oggetto 16','Messagio 2','diddatica');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000020','05-03-14 8:52','Oggetto 17','Messagio 3','vitto');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000017','03-04-14 7:53','Oggetto 18','Messagio 4','iniziative');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000021','10-04-14 3:54','Oggetto 19','Messagio 5','lezioni');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000025','02-05-14 23:51','Oggetto 20','Messagio 6','consigli');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000020','04-07-14 22:50','Oggetto 21','Messagio 7','generale');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000027','08-07-14 2:32','Oggetto 22','Messagio 8','generale');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000027','11-07-14 16:44','Oggetto 23','Messagio 9','consigli');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000025','14-08-14 4:41','Oggetto 24','Messagio 10','vitto');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000019','06-09-14 12:48','Oggetto 25','Messagio 11','iniziative');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000021','12-09-14 11:45','Oggetto 26','Messagio 12','diddatica');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000025','13-10-14 10:9','Oggetto 27','Messagio 13','diddatica');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000027','07-11-14 10:47','Oggetto 28','Messagio 14','generale');
INSERT INTO MESSAGGIO (STUDENTEM, DATAORAM, OGGETTO, TESTOM, TIPOLOGIA) VALUES ('vr00000019','09-12-14 1:35','Oggetto 29','Messagio 15','vitto');





--Popolamento commenti 
INSERT INTO COMMENTO VALUES(1,'vr00000001','2014-08-23 13:45:00','//un commento');
INSERT INTO COMMENTO VALUES(2,'vr00000002','2011-08-30 14:23:00','/*un commento*/');
INSERT INTO COMMENTO VALUES(3,'vr00000003','2011-01-29 15:11:00','#un commento');
INSERT INTO COMMENTO VALUES(4,'vr00000004','2013-12-21 16:49:00','<!-- un commento -->');
INSERT INTO COMMENTO VALUES(5,'vr00000005','2014-03-29 17:36:00','--un commento');
INSERT INTO COMMENTO VALUES(6,'vr00000006','2015-12-31 18:39:00','%un commento');
INSERT INTO COMMENTO VALUES(7,'vr00000007','2015-04-24 19:12:00','rem un commento');
INSERT INTO COMMENTO VALUES(8,'vr00000008','2015-04-08 20:04:00','{un commento}');
INSERT INTO COMMENTO VALUES(9,'vr00000009','2015-04-08 21:52:00','(*un commento*)');
INSERT INTO COMMENTO VALUES(10,'vr00000010','2015-01-08 22:25:00','#cs un commento');
INSERT INTO COMMENTO VALUES(11,'vr00000011','2010-12-08 23:19:00','! un commento');
INSERT INTO COMMENTO VALUES(12,'vr00000012','2011-01-22 08:23:00','; un commento');
INSERT INTO COMMENTO VALUES(13,'vr00000013','2011-01-22 09:51:00','#ce un commento');
INSERT INTO COMMENTO VALUES(14,'vr00000014','2011-01-23 10:23:00','~ un commento');
INSERT INTO COMMENTO VALUES(15,'vr00000015','2011-02-08 12:52:00','ˆun commento');

INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (16,'vr00000019','02-01-14 13:40:00','Testoc 1');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (17,'vr00000025','16-01-14 14:41:00','Testoc 2');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (25,'vr00000027','14-09-14 02:32:00','Testoc 3');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (28,'vr00000019','21-10-14 01:35:00','Testoc 4');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (19,'vr00000024','03-04-15 16:44:00','Testoc 5');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (20,'vr00000020','15-06-14 11:45:00','Testoc 6');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (21,'vr00000027','03-05-14 09:46:00','Testoc 7');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (20,'vr00000020','22-06-14 10:47:00','Testoc 8');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (16,'vr00000024','05-01-14 12:48:00','Testoc 9');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (23,'vr00000019','09-10-14 10:09:00','Testoc 10');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (22,'vr00000021','05-07-14 22:50:00','Testoc 11');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (17,'vr00000028','17-01-14 23:51:00','Testoc 12');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (19,'vr00000021','06-06-14 08:52:00','Testoc 13');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (18,'vr00000028','08-04-15 07:53:00','Testoc 14');
INSERT INTO COMMENTO ( MESSAGGIO, STUDENTEC, DATAORAC, TESTOC) VALUES (20,'vr00000031','09-05-15 03:54','Testoc 15');



--Popolamento SEGUITO 
INSERT INTO SEGUITO VALUES('vr00000001','ins0000001');
INSERT INTO SEGUITO VALUES('vr00000002','ins0000002');
INSERT INTO SEGUITO VALUES('vr00000003','ins0000003');
INSERT INTO SEGUITO VALUES('vr00000004','ins0000004');
INSERT INTO SEGUITO VALUES('vr00000005','ins0000005');
INSERT INTO SEGUITO VALUES('vr00000006','ins0000006');
INSERT INTO SEGUITO VALUES('vr00000007','ins0000007');
INSERT INTO SEGUITO VALUES('vr00000008','ins0000008');
INSERT INTO SEGUITO VALUES('vr00000009','ins0000009');
INSERT INTO SEGUITO VALUES('vr00000010','ins0000010');
INSERT INTO SEGUITO VALUES('vr00000011','ins0000011');
INSERT INTO SEGUITO VALUES('vr00000012','ins0000012');
INSERT INTO SEGUITO VALUES('vr00000013','ins0000013');
INSERT INTO SEGUITO VALUES('vr00000014','ins0000014');
INSERT INTO SEGUITO VALUES('vr00000015','ins0000015');

INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000016','giu0002');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000017','fll0001');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000018','fll0005');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000019','fll0005');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000020','fll0007');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000021','fll0008');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000022','fll0008');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000023','fll0004');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000024','fll0002');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000025','fll0005');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000026','fll0005');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000027','fll0008');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000028','fll0001');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000029','fll0004');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000030','fll0009');
INSERT INTO SEGUITO ( STUDENTES, INS_COD) VALUES ('vr00000031','fll0006');

