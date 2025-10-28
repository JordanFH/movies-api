-- Inserciones de películas
INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Shrek', 90, 'ANIMATED', '2024-06-01', NULL, 'D') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Inception', 148, 'SCIENCE FICTION', '2010-07-16', 8.8, 'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'The Dark Knight', 152, 'ACTION', '2008-07-18', 9.0, 'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Interstellar', 169, 'SCIENCE FICTION', '2014-11-07', 8.6,
        'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'The Godfather', 175, 'CRIME', '1972-03-24', 9.2, 'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Finding Nemo', 100, 'ANIMATED', '2003-05-30', 8.1, 'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Gladiator', 155, 'DRAMA', '2000-05-05', 8.5, 'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Avatar', 162, 'SCIENCE FICTION', '2009-12-18', 7.8, 'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Titanic', 195, 'ROMANCE', '1997-12-19', 7.9, 'A') ON CONFLICT (title) DO NOTHING;

INSERT INTO movies (id, title, duration, genre, release_date, rating, status)
VALUES (gen_random_uuid(), 'Pulp Fiction', 154, 'CRIME', '1994-10-14', 8.9, 'A') ON CONFLICT (title) DO NOTHING;
