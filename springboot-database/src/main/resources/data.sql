DROP TABLE IF EXISTS SUPERHERO;

CREATE TABLE SUPERHERO (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(150) UNIQUE NOT NULL,
   description VARCHAR(150) NOT NULL,
   capa BOOLEAN NOT NULL

);

INSERT INTO SUPERHERO (name, description,capa) VALUES
  ('spiderman', ' araña', false),
  ('superman', ' es fuerte ', true),
  ('lintena verde', ' es verde ', true),
  ('mujer maravilla', ' es mujer ', true);


