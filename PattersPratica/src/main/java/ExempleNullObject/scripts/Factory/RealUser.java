package ExempleNullObject.scripts.Factory;

public class RealUser implements User{

    private String name;

    public RealUser(String name) {
        this.name = name;
    }

    @Override
    public void exibirperfil() {
        System.out.println("Usuario: " + name);
    }
}
