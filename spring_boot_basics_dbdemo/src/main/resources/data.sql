create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES (10001, 'SANTHOSH', 'INDIA', SYSDATE());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES (10002, 'KUMAR', 'TAMILNADU', SYSDATE());