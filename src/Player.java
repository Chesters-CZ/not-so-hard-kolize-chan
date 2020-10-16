public class Player extends Entitty{
    public Player() {
        polohaX1 = 14;
        polohaY1 = 9;
        velx = 3;
        vely = 2;
        type = "player";
    }

    public static boolean colliding() {

        if (Player.polohaX1 < Varel.polohaX1 + Varel.velx &&
               Player.polohaX1 + Player.velx > Varel.polohaX1 &&
               Player.polohaY1 < Varel.polohaY1 + Varel.vely &&
               Player.polohaY1 + Player.vely > Varel.polohaY1){
            return true;
        }
        else{
            return false;
        }
    }
}
