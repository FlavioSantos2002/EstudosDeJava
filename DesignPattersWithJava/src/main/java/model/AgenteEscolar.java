package model;

public abstract class AgenteEscolar {

    protected String name;
    protected Integer idade;
    protected String email;

    public AgenteEscolar(String name, Integer idade, String email){
        this.name = name;
        this.idade = idade;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



    public abstract String exibirPerfil();
}
