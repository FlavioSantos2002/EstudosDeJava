package model;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private Instrumento instrumento;
    private Professor professor;
    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public Aula(Instrumento instrumento, Professor professor) {
        this.instrumento = instrumento;
        this.professor = professor;
    }

    public void novoAluno(Aluno aluno){
        this.listaDeAlunos.add(aluno);
    }

    private String listaDeAlunosEmString(List<Aluno> listaDeAlunos){
        StringBuilder lista = new StringBuilder(" | ");
        for (Aluno a: listaDeAlunos){
            lista.append(a.name).append(" | ");
        }

        return lista.toString();
    }

    @Override
    public String toString() {
        return "Aula{" +
                "instrumento=" + instrumento.getClass().getSimpleName() +
                ", professor=" + professor.getName() +
                ", listaDeAlunos=" + listaDeAlunosEmString(this.listaDeAlunos) +
                '}';
    }
}
