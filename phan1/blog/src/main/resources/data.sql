INSERT INTO users(full_name) VALUES ('User 1');
INSERT INTO users(full_name) VALUES ('User 2');
INSERT INTO users(full_name) VALUES ('User 3');

INSERT INTO posts(user_id, title, content) VALUES(1, 'User 1 - Post 1', 'Content 1');
INSERT INTO posts(user_id, title, content) VALUES(1, 'User 1 - Post 2', 'Content 2');
INSERT INTO posts(user_id, title, content) VALUES(2, 'User 2 - Post 1', 'Content 3');
INSERT INTO posts(user_id, title, content) VALUES(2, 'User 2 - Post 2', 'Content 4');
INSERT INTO posts(user_id, title, content) VALUES(3, 'User 3 - Post 1', 'Content 5');
INSERT INTO posts(user_id, title, content) VALUES(3, 'User 3 - Post 2', 'Content 6');

INSERT INTO comments(user_id, post_id, title) VALUES(2, 1, 'User 2 - Post 1 - Comment 1');
INSERT INTO comments(user_id, post_id, title) VALUES(1, 1, 'User 1 - Post 1 - Comment 2');
INSERT INTO comments(user_id, post_id, title) VALUES(3, 1, 'User 3 - Post 2 - Comment 3');
INSERT INTO comments(user_id, post_id, title) VALUES(1, 2, 'User 1 - Post 1 - Comment 4');
INSERT INTO comments(user_id, post_id, title) VALUES(1, 2, 'User 1 - Post 2 - Comment 5');
INSERT INTO comments(user_id, post_id, title) VALUES(1, 4, 'User 1 - Post 1 - Comment 6');
INSERT INTO comments(user_id, post_id, title) VALUES(1, 5, 'User 1 - Post 2 - Comment 7');
INSERT INTO comments(user_id, post_id, title) VALUES(2, 6, 'User 2 - Post 2 - Comment 8');