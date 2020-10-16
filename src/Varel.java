public class Varel extends Entitty{
    public Varel() {
        polohaX1 = 15;
        polohaY1 = 8;
        velx = 5;
        vely = 2;
        type = "player";
    }

    public static boolean colliding() {

        if (Varel.polohaX1 < Player.polohaX1 + Player.velx &&
                Varel.polohaX1 + Varel.velx > Player.polohaX1 &&
                Varel.polohaY1 < Player.polohaY1 + Player.vely &&
                Varel.polohaY1 + Varel.vely > Player.polohaY1){
            return true;
        }
        else{
            return false;
        }
    }
}
