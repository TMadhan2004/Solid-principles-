abstract class PlayerRole {
    abstract getSport(): string;
}

class OffSpinnerRole extends PlayerRole {
    getSport(): string {
        return "cricket";
    }
}

class LegSpinnerRole extends PlayerRole {
    getSport(): string {
        return "cricket";
    }
}

class KeeperRole extends PlayerRole {
    getSport(): string {
        return "cricket";
    }
}

class DefenderRole extends PlayerRole {
    getSport(): string {
        return "football";
    }
}

class GoalkeeperRole extends PlayerRole {
    getSport(): string {
        return "football";
    }
}

class Player {
    name: string;
    number: number;
    role: PlayerRole;

    constructor(name: string, number: number, role: PlayerRole) {
        this.name = name;
        this.number = number;
        this.role = role;
    }

    getSport(): string {
        return this.role.getSport();
    }
}

const p1 = new Player("xyz", 100, new OffSpinnerRole());
console.log(`${p1.name} is a ${p1.getSport()} player`);
const p2 = new Player("abc", 102, new DefenderRole());
console.log(`${p2.name} is a ${p2.getSport()} player`);

