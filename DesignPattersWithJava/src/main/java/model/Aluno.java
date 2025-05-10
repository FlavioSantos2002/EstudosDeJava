package model;

import java.util.ArrayList;
import java.util.List;

public final class Aluno extends AgenteEscolar{

    private List<Aula> listaDeAulas = new ArrayList<>();


    public Aluno(String name, Integer idade, String email) {
        super(name, idade, email);
    }

    @Override
    public String exibirPerfil() {
        return "aluno: " + getName() + " email: " + getEmail();
    }

    public void matricular(Aula aula){
        listaDeAulas.add(aula);
    }
}
