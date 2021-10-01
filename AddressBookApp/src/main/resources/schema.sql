CREATE TABLE address_book1 (id INTEGER unsigned NOT NULL,name VARCHAR(150) NOT NULL,address VARCHAR(150) NOT NULL,phoneNumber varchar(30) NOT NULL,
city varchar(20),state varchar(20),PRIMARY KEY (id));

create table address_book_dept (id integer unsigned primary key,department varchar(100) not null,foreign key(id) references address_book1(id));