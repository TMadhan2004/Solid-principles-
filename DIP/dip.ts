interface UserRepository {
    save(data: string): void;
}

class MySQLDatabase implements UserRepository {
    save(data: string): void {
        console.log("Saved to MySQL");
    }
}

class MongoDatabase implements UserRepository {
    save(data: string): void {
        console.log("Saved to MongoDB");
    }
}

class UserService {
    private repository: UserRepository;

    constructor(repository: UserRepository) {
        this.repository = repository;
    }

    registerUser(name: string): void {
        this.repository.save(name);
    }
}

class dip {
    static main(): void {
        const repo: UserRepository = new MongoDatabase();
        const service = new UserService(repo);

        service.registerUser("abc");
    }
}

dip.main();
