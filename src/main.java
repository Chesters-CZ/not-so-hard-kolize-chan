public class main {
    public static void main(String[] args) {
        Player player = new Player();
        Varel varel = new Varel();
        Wall wall = new Wall();

        try {
            System.out.println(Entitty.colliding("Player"));
            System.out.println(Entitty.colliding("Varel"));
            System.out.println(Entitty.colliding("SWall"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}