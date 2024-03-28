
CREATE TABLE TB_COURSE(
                       ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                       NAME VARCHAR(30),
                       CODE VARCHAR(30),
                       INSTRUCTOR VARCHAR(30),
                       DESCRIPTION VARCHAR(150),
                       STATUS ENUM('ENABLE', 'DISABLE') NOT NULL,
                       CREATION_DATE DATE,
                       INACTIVATION_DATE DATE
);

CREATE TABLE TB_ENROLLMENT(
                       ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                       USER_ID VARCHAR(20) NOT NULL,
                       COURSE VARCHAR(30) NOT NULL,
                       REGISTRATION_DATE DATE NOT NULL
);

CREATE TABLE TB_USER(
                       ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                       NAME VARCHAR(30) NOT NULL,
                       USER_NAME VARCHAR(20) NOT NULL,
                       EMAIL VARCHAR(30) NOT NULL,
                       PASSWORD VARCHAR(30) NOT NULL,
                       ROLE ENUM('STUDENT', 'INSTRUCTOR', 'ADMINISTRATOR') NOT NULL,
                       CREATION_DATE DATE
);








