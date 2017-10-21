CREATE TABLE users (
	id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    username VARCHAR(32) NOT NULL,
    password VARCHAR(32) NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

CREATE TABLE songs (
	id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    creation TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    CONSTRAINT song_pk PRIMARY KEY (id)
);

CREATE TABLE files (
	id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    type INTEGER NOT NULL,
    mime VARCHAR(50),
    content BLOB NOT NULL,
    hash VARCHAR(32),
    creation TIMESTAMP NOT NULL,
    CONSTRAINT file_pk PRIMARY KEY (id)
);

CREATE TABLE versions (
	id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    song_id INTEGER NOT NULL,
    user_id INTEGER NOT NULL,
    tab_file_id INTEGER,
    audio_file_id INTEGER,
    creation TIMESTAMP NOT NULL,
    CONSTRAINT version_pk PRIMARY KEY (id),
    CONSTRAINT version_song_fk FOREIGN KEY (song_id) REFERENCES songs(id),
    CONSTRAINT version_user_fk FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT version_tab_file_fk FOREIGN KEY (tab_file_id) REFERENCES files(id),
    CONSTRAINT version_audio_file_fk FOREIGN KEY (audio_file_id) REFERENCES files(id)
);

