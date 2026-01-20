class User {
  constructor(private name: string, private email: string) {
  }

  getName(): string {
    return this.name;
  }

  getEmail(): string {
    return this.email;
  }
}

class UserValidator {
  isValid(user: User): boolean {
    return user.getEmail().includes("@") && user.getName().length > 0;
  }
}

class UserRepository {
  save(user: User): void {
    console.log(`Saving user ${user.getEmail()} to database`);
  }
}

class EmailService {
  sendWelcomeEmail(user: User): void {
    console.log(`Sending welcome email to ${user.getEmail()}`);
  }
}

const user = new User("abc", "abc@mail.com");

const vali = new UserValidator();
const repo = new UserRepository();
const email = new EmailService();

if (vali.isValid(user)) {
  repo.save(user);
  email.sendWelcomeEmail(user);
} else {
  console.log("Invalid user data");
}