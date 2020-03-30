public abstract class EnemyShip {
    
    private String name;
    private double amntDamage;

    public String getName() { return this.name; }
    public void setName(String newName) { this.name = newName; }

    public double getDamage() { return this.amntDamage; }
    public void setDamage(double amntDamage) { this.amntDamage = amntDamage; }

    public void followHeroShip() {
        System.out.println(this.getName() + " is following the hero");
    }    

    public void displayEnemyShip() {
        System.out.println(this.getName() + " appeared");
    }

    public void enemyShipShoots() {
        System.out.println(this.getName() + " attacks and deals " + this.getDamage() + " points of damage");
    }


}

