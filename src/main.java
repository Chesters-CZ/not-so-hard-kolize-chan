public class main {
    public static void main(String[] args) {
        Player player = new Player();
        Varel varel = new Varel();
        Wall wall = new Wall();

        System.out.println(Player.colliding());
        System.out.println(Varel.colliding());
        System.out.println(Wall.colliding());
    }
}