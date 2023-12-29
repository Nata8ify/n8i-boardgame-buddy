create database boardgame_buddy;

create table boardgame(
    boga_id bigint generated always as identity,
    boga_name varchar(255) not null,
    boga_media_content jsonb,
    boga_created_datetime timestamp not null default current_timestamp,
    boga_updated_datetime timestamp not null default current_timestamp
);