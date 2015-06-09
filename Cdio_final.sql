/* must be dropped in this order to avoid constraint violations */
DROP TABLE IF EXISTS afvejning;
DROP TABLE IF EXISTS produktbatchkomponent;
DROP TABLE IF EXISTS produktbatch;
DROP TABLE IF EXISTS receptkomponent;
DROP TABLE IF EXISTS recept;
DROP TABLE IF EXISTS raavarebatch;
DROP TABLE IF EXISTS raavare;
DROP TABLE IF EXISTS users;


CREATE TABLE users(opr_id INT PRIMARY KEY, opr_navn TEXT, ini TEXT, cpr TEXT, password TEXT, gruppe INT) ENGINE=innoDB;
 
CREATE TABLE raavare(raavare_id INT PRIMARY KEY, raavare_navn TEXT, leverandoer TEXT) ENGINE=innoDB;

CREATE TABLE raavarebatch(rb_id INT PRIMARY KEY, raavare_id INT, maengde REAL, 
   FOREIGN KEY (raavare_id) REFERENCES raavare(raavare_id)) ENGINE=innoDB;

CREATE TABLE recept(recept_id INT PRIMARY KEY, recept_navn TEXT) ENGINE=innoDB;

CREATE TABLE receptkomponent(recept_id INT, raavare_id INT, nom_netto REAL, tolerance REAL, made_by INT,
   PRIMARY KEY (recept_id, raavare_id), 
   FOREIGN KEY (recept_id) REFERENCES recept(recept_id), 
   FOREIGN KEY (raavare_id) REFERENCES raavare(raavare_id),
   FOREIGN KEY (made_by) REFERENCES users(opr_id)) ENGINE=innoDB;

CREATE TABLE produktbatch(pb_id INT PRIMARY KEY, status INT, recept_id INT, made_by INT, 
   FOREIGN KEY (recept_id) REFERENCES recept(recept_id),
   FOREIGN KEY (made_by) REFERENCES users(opr_id)) ENGINE=innoDB;

CREATE TABLE produktbatchkomponent(pb_id INT, rb_id INT, tara REAL, netto REAL, opr_id INT, 
   PRIMARY KEY (pb_id, rb_id), 
   FOREIGN KEY (pb_id) REFERENCES produktbatch(pb_id), 
   FOREIGN KEY (rb_id) REFERENCES raavarebatch(rb_id), 
   FOREIGN KEY (opr_id) REFERENCES users(opr_id)) ENGINE=innoDB;
   
CREATE TABLE afvejning(pb_id INT, rb_id INT, recept_id INT, opr_id INT, 
   PRIMARY KEY (pb_id, rb_id, recept_id), 
   FOREIGN KEY (pb_id) REFERENCES produktbatch(pb_id), 
   FOREIGN KEY (rb_id) REFERENCES raavarebatch(rb_id), 
   FOREIGN KEY (recept_id) REFERENCES recept(recept_id),
   FOREIGN KEY (opr_id) REFERENCES users(opr_id)) ENGINE=innoDB;

   
INSERT INTO users(opr_id, opr_navn, ini, cpr, password, gruppe) VALUES
(0, 'Creater', '', '', '', 5),
(1, 'Angelo A', 'AA', '070770-7007', 'lKje4fa', 1),
(2, 'Antonella B', 'AB', '080880-8008', 'atoJ21v', 2),
(3, 'Luigi C', 'LC', '090990-9009', 'jEfm5aQ', 3),
(4, 'Nicklas', 'np', '060660-6006', 'jEfm5aQ', 5),
(5, 'Emda', '42', '050550-5005', 'jEfm5aQ', 4);


INSERT INTO raavare(raavare_id, raavare_navn, leverandoer) VALUES
(1, 'dej', 'Wawelka'),
(2, 'tomat', 'Knoor'),
(3, 'tomat', 'Veaubais'),
(4, 'tomat', 'Franz'),
(5, 'ost', 'Ost og Skinke A/S'),
(6, 'skinke', 'Ost og Skinke A/S'),
(7, 'champignon', 'Igloo Frostvarer');

INSERT INTO raavarebatch(rb_id, raavare_id, maengde) VALUES
(1, 1, 1000),
(2, 2, 300),
(3, 3, 300),
(4, 5, 100),
(5, 5, 100), 
(6, 6, 100),
(7, 7, 100);

INSERT INTO recept(recept_id, recept_navn) VALUES
(1, 'margherita'),
(2, 'prosciutto'),
(3, 'capricciosa'),
(4, 'emda');


INSERT INTO receptkomponent(recept_id, raavare_id, nom_netto, tolerance, made_by) VALUES
(1, 1, 10.0, 0.1, 0),
(1, 2, 2.0, 0.1, 0),
(1, 5, 2.0, 0.1, 0),

(2, 1, 10.0, 0.1, 0),
(2, 3, 2.0, 0.1, 0),  
(2, 5, 1.5, 0.1, 0),
(2, 6, 1.5, 0.1, 0),

(3, 1, 10.0, 0.1, 0),
(3, 4, 1.5, 0.1, 0),
(3, 5, 1.5, 0.1, 0),
(3, 6, 1.0, 0.1, 0),
(3, 7, 1.0, 0.1, 0),

(4, 1, 10.0, 0.1, 0),
(4, 3, 3.0, 0.1, 0),
(4, 5, 2.0, 0.1, 0);

INSERT INTO produktbatch(pb_id, recept_id, status, made_by) VALUES
(1, 1, 2, 0), 
(2, 1, 2, 0),
(3, 2, 2, 0),
(4, 3, 1, 0),
(5, 3, 0, 0),
(6, 1, 2, 0);

INSERT INTO produktbatchkomponent(pb_id, rb_id, tara, netto, opr_id) VALUES
(1, 1, 0.5, 10.05, 1),
(1, 2, 0.5, 2.03, 1),
(1, 4, 0.5, 1.98, 1),

(2, 1, 0.5, 10.01, 2),
(2, 2, 0.5, 1.99, 2),
(2, 5, 0.5, 1.47, 2),

(3, 1, 0.5, 10.07, 1),
(3, 3, 0.5, 2.06, 2),
(3, 4, 0.5, 1.55, 1),
(3, 6, 0.5, 1.53, 2),

(4, 1, 0.5, 10.02, 3),
(4, 5, 0.5, 1.57, 3),
(4, 6, 0.5, 1.03, 3),
(4, 7, 0.5, 0.99, 3);
 