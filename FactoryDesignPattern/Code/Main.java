import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner uScanner = new Scanner(System.in);

        System.out.print("What Type of Ship?\n");
        System.out.println("UFO: U\nRocket: R\nBig-UFO: B");

        if(uScanner.hasNextLine()) {
            theEnemy = shipFactory.makeEnemyShip(uScanner.nextLine());
        }

        doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        if(anEnemyShip != null) {
            anEnemyShip.displayEnemyShip();
            anEnemyShip.followHeroShip();
            anEnemyShip.enemyShipShoots();
        }
    }
}