create table track_points (
    id bigint auto_increment,
    time date,
    latitude float(10, 2),
    longitude float(10, 2),
    activity_id bigint,
    constraint pk_track_points primary key (id)
);