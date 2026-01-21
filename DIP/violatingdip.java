class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saved to MySQL");
    }
}

class UserService {
    private MySQLDatabase db = new MySQLDatabase();

    public void registerUser(String name) {
        db.save(name);
    }
}

public class violatingdip{
    public static void main(String[] args) {
        UserService object = new UserService();
        object.registerUser("xyz");
    }
}
