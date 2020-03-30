public class UFOEnemyShip {

    private String idCode = "100";
    private String name = "UFO";

    private Pilot p = null;

    private String getPrivate() {
        return "How did you get this";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getOtherPrivate(int thisInt, String thatString) {
		
		return "How did you get here " + thisInt + " " + thatString;
		
	}
	
	public UFOEnemyShip(int number, String randString){
		
		System.out.println("You sent: " + number + " " + randString);
		
    }
    
    public UFOEnemyShip(Pilot p) {
        this.p = p;
    }
	
	public void makeShip() {
		
		System.out.println("Making enemy ship " + getName());
		
	}
	
}