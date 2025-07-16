create table categories (
    id serial not null primary key,
    name varchar(50) not null unique
);

create table products (
    id bigserial not null primary key,
    name varchar(50) not null,
    description text not null,
    price decimal(10,2) not null,
    quantity int not null,
    category_id int not null,
    foreign key (category_id) references
                      categories(id)
        on update cascade on delete cascade
);