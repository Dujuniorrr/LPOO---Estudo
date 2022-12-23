create database SISTEMA_ESCOLAR;

use SISTEMA_ESCOLAR;

create table CURSO(
	cod_curso int primary key auto_increment,
    nome_curso varchar(35) not null,
    descricao_curso text null
);

create table ALUNO(
	cod_aluno int primary key auto_increment,
    nome_aluno varchar(35) not null,
    endereco_aluno varchar(100) not null,
    telefone_aluno varchar(20) not null,
    matricula_aluno varchar(35) not null,
    situacao_aluno varchar(20) not null,
    cod_curso_aluno int not null,
    constraint fk_cod_curso_aluno foreign key (cod_curso_aluno) REFERENCES CURSO(cod_curso)
);

create table PROFESSOR(
	cod_professor int primary key auto_increment,
    nome_professor varchar(35) not null,
    endereco_professor varchar(100) not null,
    telefone_professor varchar(20) not null,
    titulacao_max_professor varchar(20) not null,
	cod_curso_professor int not null,
    constraint fk_cod_curso_professor foreign key (cod_curso_professor) REFERENCES CURSO(cod_curso)
);

create table DISCIPLINA(
	cod_disciplina int primary key auto_increment,
	nome_disciplina varchar(35) not null,
    descricao_disciplina text not null,
    carga_horario int not null,
    cod_curso_disciplina int not null,
    constraint fk_cod_curso_disciplina foreign key (cod_curso_disciplina) REFERENCES CURSO(cod_curso)
);

create table TURMA(
	cod_turma int primary key auto_increment,
    ano_turma int not null,
    semeste_turma int not null,
    horario_turma time not null,
    cod_professor_turma int,
    cod_disciplina_turma int,
    constraint fk_cod_professor_turma foreign key (cod_professor_turma) references PROFESSOR(cod_professor),
    constraint fk_cod_disciplina_turma foreign key (cod_disciplina_turma) references DISCIPLINA(cod_disciplina)
);

create table AVALIACAO(
	nota1_avaliacao float(4,2) not null,
    nota2_avaliacao float(4,2) not null,
    prova_final_avaliacao float(4,2) not null,
    frequencia_avaliacao int not null,
    cod_aluno_avaliacao int,
    cod_turma_avaliacao int,
    constraint fk_cod_aluno_avaliacao foreign key (cod_aluno_avaliacao) references ALUNO(cod_aluno),
    constraint fk_cod_turma_avaliacao foreign key (cod_turma_avaliacao) references TURMA(cod_turma)
);

create table ALUNO_TURMA(
        cod_aluno_turma_tabela int primary key auto_increment,
	cod_aluno int,
    cod_turma int,
	constraint fk_cod_aluno_aluno_turma foreign key (cod_aluno) references ALUNO(cod_aluno),
	constraint fk_cod_professor_aluno_turma foreign key (cod_turma) references TURMA(cod_turma)
);

