import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       System.out.println("Devil May Cry Style Switcher Demo\n");

       StyleChange.loadStyles();
       
       Style currentStyle = null;

       Scanner uInput = new Scanner(System.in);

       String choice = "";

       do {
           System.out.print("Style: ");
           choice = uInput.nextLine();
           currentStyle = StyleChange.changeStyle(choice);
           currentStyle.changed();
       } while(!choice.isEmpty());
    }
 }