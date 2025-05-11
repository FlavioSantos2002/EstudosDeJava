package ExempleNullObject.scripts;

import ExempleNullObject.scripts.Factory.User;
import ExempleNullObject.scripts.Factory.UserFactory;


public class Aplication {
    public static void main(String[] arg){
        User user01 = UserFactory.getUser("TesteNull");

        User user02 = UserFactory.getUser("RealUser");

        user01.exibirperfil();
        user02.exibirperfil();
    }
}
