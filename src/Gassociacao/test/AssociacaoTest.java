package Gassociacao.test;

import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Local;
import Gassociacao.dominio.Professor;
import Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Ruas das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = { aluno };
        Seminario seminario = new Seminario("Onde achar o One Piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};


        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
