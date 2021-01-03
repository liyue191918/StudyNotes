/* User */
insert into sn_users (user_id, password ,  ip           ,first_name , last_name , email                    , registration_time     , telephone_number     , nickname     , role   , is_active) values
                 ('demo'   , 'demo1'    ,  '127.0.0.1'  ,'Mrinmoy'  , 'Majumdar', 'arivera2@joomla.org'    , '2016-04-05'          , '7-(740)701-4547'    , 'jame'       , 'USER' , 1);
insert into sn_users (user_id, password ,  ip           ,first_name , last_name , email                    , registration_time     , telephone_number     , nickname     , role   , is_active) values
                 ('admin'   , 'admin'    ,  '127.0.0.1' ,'Yue'        ,'Li', 'liyue191918@hotmail.com'    , '2016-04-05'          , '7-(740)701-4547'    , 'herbert'     , 'ADMIN' , 1);
insert into sn_users (user_id, password ,  ip           ,first_name , last_name , email                    , registration_time     , telephone_number     , nickname     , role   , is_active) values
                 ('demo2'   , 'demo2'    ,  '127.0.0.1'  ,'Mrinmoy2'  , 'Majumdar2', 'arivera22@joomla.org'    , '2016-04-05'      , '7-(740)701-4547'    , 'jack'       , 'USER' , 1);

/* notes */
insert into sn_notes ( user_id , note_title , note_content    , note_views  , note_comment_count     , note_date     , security_leve    , note_like_count) values
                     ( 'demo'  ,'java spring mvc'      , 'i like java spring mvc', 1           , 1                      , '2016-05-05'  , 'PRIVATE'        , 1);
/* sorts */
insert into sn_sorts ( user_id , sort_name , sort_alias    , sort_description       , parent_sort_id) values
                     ( 'demo'  ,'java'     , ''            , 'about java article'   , 0                   );

/* sn_set_note_sort */
insert into sn_set_note_sort ( note_id , sort_id ) values
                             ( 3       ,1 );

/* sn_comments */
insert into sn_comments ( user_id , note_id , comment_like_count , comment_date , comment_content, parent_comment_id ) values
                        ( 'demo'  ,3        ,0                   ,'2016-06-06'  ,'very good'     ,0);

/* sn_user_friends */
insert into sn_user_friends ( user_id , user_friends_id , user_note , user_status ) values
                            ( 'demo'  ,'demo2'          ,'classmate','APPROVED');


