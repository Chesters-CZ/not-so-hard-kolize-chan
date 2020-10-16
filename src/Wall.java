public class Wall extends Entitty{
    public void SouthBorder() {
        polohaX1 = 0;
        polohaY1 = 0;
        velx = 99;
        vely = 1;
        type = "obstacle";
    }

    public static boolean colliding() {
        if (Varel.polohaY1<Wall.polohaY1 || Player.polohaY1 < Wall.polohaY1){
            return true;
        }
        else {
            return false;
        }
    }
}
