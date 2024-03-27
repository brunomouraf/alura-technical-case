
CREATE TABLE TB_COURSE(
                       ID BIGINT PRIMARY KEY,
                       NAME VARCHAR(30),
                       CODE VARCHAR(30),
                       DESCRIPTION VARCHAR(30),
                       STATUS ENUM ("enable", "disable"),
                       CREATION_DATE DATE,
                       INACTIVATION_DATE DATE
);

CREATE TABLE TB_REGISTRATION(
                       ID BIGINT PRIMARY KEY,
                       USER_ID INT,
                       COURSE VARCHAR(30),
                       REGISTRATION_DATE DATE
);

CREATE TABLE TB_USER(
                       ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                       NAME VARCHAR(30) NOT NULL,
                       USER_NAME VARCHAR(20) NOT NULL,
                       EMAIL VARCHAR(30) NOT NULL,
                       PASSWORD VARCHAR(30) NOT NULL,
                       ROLE ENUM('STUDENT', 'INSTRUCTOR', 'ADMINISTRATOR') NOT NULL,
                       CREATION_DATE DATE NOT NULL
);








