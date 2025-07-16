create table addresses (
    id bigserial not null primary key,
    city varchar(50) not null,
    state varchar(50) not null,
    country varchar(50) not null,
    user_id bigint not null,
    foreign key (user_id) references users(id)
        on update cascade on delete cascade
);

insert into addresses (id, city, state, country, user_id) values
  (default,'Akosombo','Eastern Region', 'Ghana', 1),
  (default,'Madina','Greater-Accra Region', 'Ghana', 2),
  (default,'Lapaz','Greater-Accra Region', 'Ghana', 3);