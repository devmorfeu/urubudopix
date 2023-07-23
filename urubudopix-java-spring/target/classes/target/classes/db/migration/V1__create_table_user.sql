create table user_table(
    id bigint not null auto_increment,
    name varchar(50) not null,
    primary key(id)
);

insert into user_table values(1, 'Malvadeza');
insert into user_table values(2, 'Carimbo josé');