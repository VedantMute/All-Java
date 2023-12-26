class Player{
    String name;
    int age;
    int rank;
    Player(String n, int a, int r){

        name=n;
        age=a;
        rank=r;
    }
    public void display()
    {
        System.out.println("Name"+name+"age"+age+"rank"+rank);
    }
}
class CricketPlayer extends Player{
    String rol, g;
    public CricketPlayer (String role, String game, String n, int a, int r)
    {
        super(n, a, r);
        rol=role;
        g=game;
    }
    public void display(){
        super.display();
        System.out.println(rol+g);
    }
}
public class PlayerCode{
    public static void main(String[] args) {
        CricketPlayer cric = new CricketPlayer("batter", "cricket", "Vedant", 20, 1);
        cric.display();
    }
}