import java.sql.SQLOutput;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Character ob = new Character();
        Scanner scan = new Scanner(System.in);
        System.out.println("printing stats...");
        System.out.print("Type your name: ");
        ob.name = scan.nextLine().trim();
        System.out.print("---Classes--- \n 'melee' -- 'ranged' -- 'magic' \n Type your class:");
        ob.characterType = scan.nextLine().toLowerCase().trim();
        ob.STR = ob.rollStats();
        ob.DEX = ob.rollStats();
        ob.CON = ob.rollStats();
        ob.INT = ob.rollStats();
        ob.WIS = ob.rollStats();
        ob.CHA = ob.rollStats();
        ob.displayStats();


    }
}
