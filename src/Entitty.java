public abstract class Entitty {
    public static int polohaX1;
    public static int polohaY1;
    public static int velx;
    public static int vely;

    public static boolean colliding(String typ) throws Exception {
        switch (typ) {
            case "SWall":
                if (Varel.polohaY1 < Wall.polohaY1 || Player.polohaY1 < Wall.polohaY1) {
                    return true;
                } else {
                    return false;
                }
            case "Varel":
                if (Varel.polohaX1 < Player.polohaX1 + Player.velx &&
                        Varel.polohaX1 + Varel.velx > Player.polohaX1 &&
                        Varel.polohaY1 < Player.polohaY1 + Player.vely &&
                        Varel.polohaY1 + Varel.vely > Player.polohaY1) {
                    return true;
                } else {
                    return false;
                }
            case "Player":
                if (Player.polohaX1 < Varel.polohaX1 + Varel.velx &&
                        Player.polohaX1 + Player.velx > Varel.polohaX1 &&
                        Player.polohaY1 < Varel.polohaY1 + Varel.vely &&
                        Player.polohaY1 + Player.vely > Varel.polohaY1) {
                    return true;
                } else {
                    return false;
                }
            default:
                throw new Exception("no parameter given");
        }
    }

    public static enum type {
        Player, Obstacle
    }
}