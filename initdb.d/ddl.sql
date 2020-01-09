CREATE TABLE thread(
    id integer not null AUTO_INCREMENT,
    title varchar(100) not null,
    reg_date timestamp not null,
    primary key(id)
);

CREATE TABLE thread_item(
    seq integer(4) not null AUTO_INCREMENT,
    thread_id integer not null,
    post_name varchar(20) not null,
    comment text not null,
    good_count integer not null default 0,
    reg_date timestamp not null,
    primary key(seq)
);



