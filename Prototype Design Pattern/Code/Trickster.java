public class Trickster extends Style {

    public Trickster(){
      styleType = "trickster";
    }
 
    @Override
    public void changed() {
       System.out.println("Change!: " + this.styleType);
    }
 }