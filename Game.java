
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        
        //welcome();
        
        String name = getName();

        Hero player = new Hero(name,"john");

        strPrint(player.name);

        Villian villian1 = new Villian("vill1");

        strPrint(villian1.species);
    
    }

    public static String strInput(){

        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        
        return input;
    }

    public static void strPrint(String message){

        System.out.print(message);

    }

    public static void welcome() throws InterruptedException {
        
        strPrint("Welcome Player 1");
        
        for (int i = 0; i < 3; i++){
            TimeUnit.SECONDS.sleep(1);
            strPrint(".");
        }
    }

    public static String getName() throws InterruptedException {
       
        TimeUnit.SECONDS.sleep(1);
        strPrint("\nWhat is your name: ");
        String name = strInput();

        return name;
    }
}
