class Player {
    String name;
    int number;
    PlayerRole role;

    Player(String name, int number, PlayerRole role) {
        this.name = name;
        this.number = number;
        this.role = role;
    }

    public String getSport() {
        return role.getSport();
    }
}

abstract class PlayerRole {
    abstract String getSport();
}

class OffSpinnerRole extends PlayerRole {
    public String getSport() {
        return "cricket";
    }
}

class LegSpinnerRole extends PlayerRole {
    public String getSport() {
        return "cricket";
    }
}

class KeeperRole extends PlayerRole {
    public String getSport() {
        return "cricket";
    }
}
class DefenderRole extends PlayerRole {
    public String getSport() {
        return "football";
    }
}

class GoalkeeperRole extends PlayerRole {
    public String getSport() {
        return "football";
    }
}

public class ocp {
    public static void main(String[] args) {
        Player p1 = new Player("xyz", 100, new OffSpinnerRole());
        System.out.println(p1.name + " is a " + p1.getSport() + " player");
        Player p2 = new Player("abc", 102, new DefenderRole());
        System.out.println(p2.name + " is a " + p2.getSport() + " player");
    }
}
