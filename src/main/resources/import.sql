INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Gabriel Blue', 'gabriel@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (id_user, id_role) VALUES (1, 1);
INSERT INTO tb_user_role (id_user, id_role) VALUES (2, 1);
INSERT INTO tb_user_role (id_user, id_role) VALUES (2, 2);
INSERT INTO tb_user_role (id_user, id_role) VALUES (3, 1);
INSERT INTO tb_user_role (id_user, id_role) VALUES (3, 2);
INSERT INTO tb_user_role (id_user, id_role) VALUES (3, 3);

INSERT INTO course(name, img_uri, img_gray_uri) VALUES ('Curso de HTML 5', 'D://BootStrap/ArtesUrbanas/assets/imgs/g_1.jpg', 'D://BootStrap/ArtesUrbanas/assets/imgs/g_2.jpg');
INSERT INTO course(name, img_uri, img_gray_uri) VALUES ('Curso de CSS 3', 'D://BootStrap/ArtesUrbanas/assets/imgs/g_1.jpg', 'D://BootStrap/ArtesUrbanas/assets/imgs/g_2.jpg');

INSERT INTO offer(edition, start_moment, end_moment, id_course) VALUES ('First Edition', TIMESTAMP WITH TIME ZONE '2022-11-15T12:00:00-03:00', TIMESTAMP WITH TIME ZONE '2023-05-15T12:00:00-03:00', 1);
INSERT INTO offer(edition, start_moment, end_moment, id_course) VALUES ('Second Edition', TIMESTAMP WITH TIME ZONE '2023-11-15T12:00:00-03:00', TIMESTAMP WITH TIME ZONE '2024-05-15T12:00:00-03:00', 1);

INSERT INTO resource(title, description, position, img_uri, type, external_link, id_offer) VALUES ('Aulas', 'Aulas do módulo 1', 1, '', 0, null, 2);

INSERT INTO section(title, description, position, img_uri, id_resource, id_prerequisite) VALUES ('Cap 1', 'Introduction', 1, 'img.jpeg', 1, null);
INSERT INTO section(title, description, position, img_uri, id_resource, id_prerequisite) VALUES ('Cap 2', 'Exercícios', 2, 'img.jpeg', 1, 1);

INSERT INTO enrollment(id_user, id_offer, enroll_moment, refund_moment, available, only_update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2022-11-18T12:00:00-03:00', null, true, false);
INSERT INTO enrollment(id_user, id_offer, enroll_moment, refund_moment, available, only_update) VALUES (1, 2, TIMESTAMP WITH TIME ZONE '2023-12-10T12:00:00-03:00', null, true, true);

INSERT INTO lesson(title, position, id_section) values ('Aula 1', 1, 1);
INSERT INTO lesson(title, position, id_section) values ('Aula 2', 2, 1);
INSERT INTO lesson(title, position, id_section) values ('Aula 3', 3, 1);

INSERT INTO content(text_content, video_uri, id) values ('text content 1', 'wwww.aulas/1', 1);
INSERT INTO content(text_content, video_uri, id) values ('text content 2', 'wwww.aulas/2', 2);

INSERT INTO task(description, question_count, approval_count, weight, due_date, id) VALUES ('Tarefa 01', 10, 6, 1.0, TIMESTAMP WITH TIME ZONE '2022-11-18T12:00:00-03:00', 3);

INSERT INTO enrollment_lessons_done(id_lesson, id_user, id_offer) VALUES (1, 1, 1);
INSERT INTO enrollment_lessons_done(id_lesson, id_user, id_offer) VALUES (2, 1, 1);


INSERT INTO notification(text, moment, read, route, id_user) VALUES ('Mudança de senha concluída', TIMESTAMP WITH TIME ZONE '2022-11-18T12:00:00-03:00', true, '', 1);