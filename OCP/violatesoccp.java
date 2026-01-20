class classifier{
    int number;
    String name;
    String playertype;
    classifier(int number, String name, String playertype){
        this.number = number;
        this.name = name;
        this.playertype = playertype;
    }

    public void getPlayerType(){
        if(playertype.equals("offspinner")){
            System.out.println(name+" is an circketer");
        }
        else if(playertype.equals(("legspinner"))){
           System.out.println(name+" is an circketer");
        }
        else if(playertype.equals(("Keeper"))){
           System.out.println(name+" is an circketer");
        }
        else if(playertype.equals(("defender"))){
            System.out.println(name+" is a footballer");
        }
         else if(playertype.equals(("goalkeeper"))){
            System.out.println(name+" is a footballer");
        }
    }
}

public class violatesoccp {
    public static void main(String[] args) {
        classifier player1 = new classifier(100, "xyz", "offspinner");
        player1.getPlayerType();
        classifier player2 = new classifier(102, "abc", "legspinner");
        player2.getPlayerType();
    }    
}
