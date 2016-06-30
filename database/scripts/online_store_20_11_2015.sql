/*Init database*/
create database online_store;

use online_store;

create table products (
    id bigint(16) auto_increment primary key,
    name varchar(128),
    category varchar(64),
    image_path varchar(1024),
    price varchar(64),
    quantity tinyint(16),
    info text
);

create table users (
    username varchar(64) not null,
    password varchar(64) not null,
    enabled tinyint not null default 1 ,
    primary key (username));

create table user_roles (
    user_role_id int(16) not null auto_increment,
    username varchar(64) not null,
    role varchar(45) not null,
    primary key (user_role_id),
    unique key uni_username_role (role, username),
    key fk_username_idx (username),
    constraint fk_username foreign key (username) references users (username));
