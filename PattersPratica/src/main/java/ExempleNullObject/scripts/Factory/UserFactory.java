package ExempleNullObject.scripts.Factory;

public class UserFactory {

    public static User getUser(String name){
        if (name.equalsIgnoreCase("RealUser")){
            return new RealUser("RealUser");
        }
        else {
            return new NullUser();
        }
    }
}
