package ExempleNullObject.scripts.Factory;

public class NullUser implements User{

    @Override
    public void exibirperfil() {
        System.out.println("User not find");
    }
}
