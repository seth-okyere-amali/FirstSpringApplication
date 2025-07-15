create table users (
   id bigserial not null primary key,
   first_name varchar(50) not null,
   last_name varchar(50) not null,
   gender varchar(10) not null,
   date_of_birth date not null,
   email varchar(50) not null,
   password varchar(50) not null
);