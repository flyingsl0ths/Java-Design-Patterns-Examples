public class Quicksilver extends Style {

   public Quicksilver(){
     styleType = "quicksilver";
   }

   @Override
   public void changed() {
      System.out.println("Change!: " + this.styleType);
   }
}