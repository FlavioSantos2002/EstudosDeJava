package model;

import java.util.ArrayList;
import java.util.List;

public final class Professor extends AgenteEscolar {

    private List<Aula> listaDeAulas = new ArrayList<>();
    private double salario;


    public Professor(String nome, Integer idade, String email, Double salario){
        super(nome, idade, email);
        salario = this.salario;
    }


    @Override
    public String exibirPerfil() {
        return "nome: " + getName() + " email: " + getEmail();
    }
}
