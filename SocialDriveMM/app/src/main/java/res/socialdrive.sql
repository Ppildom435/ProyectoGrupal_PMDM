DROP TABLE usuario;
DROP TABLE marcador;

CREATE TABLE usuario (
    CodUsuario VARCHAR(4),
    Nombre VARCHAR(20) NOT NULL,
    Password VARCHAR(30) NOT NULL
    PRIMARY KEY (CodUsuario)
 );

CREATE TABLE marcador(
    CodMarcador VARCHAR(4),
    Nombre VARCHAR(20),
    Descripcion VARCHAR(50),
    Ubicacion VARCHAR(30),
    CodUsuario VARCHAR(4),
    PRIMARY KEY (CodMarcador),
    FOREIGN KEY (CodUsuario) REFERENCES usuario(CodUsuario)
);