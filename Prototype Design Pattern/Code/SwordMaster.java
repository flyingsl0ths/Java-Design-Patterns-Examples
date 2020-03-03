public class SwordMaster extends Style {

    public SwordMaster(){
      styleType = "swordmaster";
    }
 
    @Override
    public void changed() {
       System.out.println("Change!: " + this.styleType);
    }
 }