create table users (
   id bigserial not null primary key,
   first_name varchar(50) not null,
   last_name varchar(50) not null,
   gender varchar(10) not null,
   date_of_birth date not null,
   email varchar(50) not null unique,
   password varchar(50) not null
);

insert into users (id, first_name, last_name, gender, date_of_birth, email, password) values
     (default, 'Seth', 'Okyere', 'Male', '2002-09-15', 'eskay.dev7@gmail.com', 'demoPassword'),
     (default, 'Elijah', 'Okyere', 'Male', '1999-10-21', 'yaw.sam@gmail.com', 'demoPassword'),
     (default, 'Sandra', 'Okyere', 'Female', '1997-02-14', 'akua.sandy@gmail.com', 'demoPassword');