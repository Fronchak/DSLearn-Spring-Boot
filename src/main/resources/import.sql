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