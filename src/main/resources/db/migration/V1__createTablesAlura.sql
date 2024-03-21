CREATE TYPE STATUSENUM AS ENUM ('enable', 'disable');
CREATE TYPE ROLEENUM AS ENUM ('student', 'instructor', 'administrator');

CREATE TABLE TB_COURSE(
                       ID BIGINT PRIMARY KEY,
                       NAME VARCHAR,
                       CODE VARCHAR,
                       DESCRIPTION VARCHAR,
                       STATUS STATUSENUM,
                       CREATION_DATE DATE,
                       INACTIVATION_DATE DATE
);

create table TB_REGISTRATION(
                       ID BIGINT PRIMARY KEY,
                       USER_ID INT,
                       COURSE VARCHAR,
                       REGISTRATION_DATE DATE
);

create table TB_USER(
                       ID BIGINT PRIMARY KEY,
                       NAME VARCHAR,
                       USER_NAME VARCHAR,
                       EMAIL VARCHAR,
                       PASSWORD VARCHAR,
                       ROLE ROLEENUM,
                       CREATION_DATE DATE
);
