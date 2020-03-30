public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String shipType) {
        EnemyShip newShip = null;

        shipType = shipType.toUpperCase();

        switch(shipType) {
            case "U": newShip = new UFOEnemyShip();
            break;
            case "R": newShip = new RocketEnemyShip();
            break;
            case "B": newShip = new BigUFOEnemyShip();
            break;
            default: System.out.println("\nPlease Select A Valid Option\n");
            break;
        }

        return newShip;
    }
}