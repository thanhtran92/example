/*Init database*/
create database online_store;

use online_store;

create table products (
    id bigint(16) auto_increment primary key,
    name varchar(128),
    category varchar(64),
    image_path varchar(1024),
    price varchar(64),
    amount tinyint(16),
    info text
);
