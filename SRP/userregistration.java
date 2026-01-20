class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { 
        return name; 
    }
    public String getEmail() { 
        return email; 
    }
}

class UserValidator {
    public boolean isValid(User user) {
        return user.getEmail().contains("@") && !user.getName().isEmpty();
    }
}

class UserRepository {
    public void save(User user) {
        System.out.println("Saving user " + user.getEmail() + " to database");
    }
}

class EmailService {
    public void sendWelcomeMail(User user) {
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}


public class userregistration {
    public static void main(String[] args) {

        User user = new User("abc", "abc@mail.com");
        UserValidator vali = new UserValidator();
        UserRepository repo = new UserRepository();
        EmailService email = new EmailService();

        if (vali.isValid(user)) {
            repo.save(user);
            email.sendWelcomeMail(user);
        } 
        else {
            System.out.println("Invalid user data");
        }
    }
}
