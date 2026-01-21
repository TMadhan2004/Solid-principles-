interface UserRepository {
    void save(String data);
}

class MySQLDatabase implements UserRepository {
    public void save(String data) {
        System.out.println("Saved to MySQL");
    }
}

class MongoDatabase implements UserRepository {
    public void save(String data) {
        System.out.println("Saved to MongoDB");
    }
}

class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void registerUser(String name) {
        repository.save(name);
    }
}

public class dip {
    public static void main(String[] args) {
        UserRepository repo = new MongoDatabase();
        UserService service = new UserService(repo);
        service.registerUser("abc");
    }
}

