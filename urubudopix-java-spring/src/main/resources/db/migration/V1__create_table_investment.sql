create table investment_table (
    id bigint not null,
    money decimal not null,
    user_id bigint not null,
    primary key(id),
    foreign key(user_id) references user_table(id)
);