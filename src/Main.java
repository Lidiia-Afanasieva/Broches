import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> white = new ArrayList<String>(16);
        List<String> black = new ArrayList<String>(16);
        white = complain("WPawn  ", 8, white);
        white = complain("WRook  ", 2, white);
        white = complain("WKnight", 2, white);
        white = complain("WBishop", 2, white);
        white.add("WKing  ");
        white.add("WQueen ");
        black = complain("BPawn  ", 8, black);
        black = complain("BRook  ", 2, black);
        black = complain("BKnight", 2, black);
        black = complain("BBishop", 2, black);
        black.add("BKing  ");
        black.add("BQueen ");
        Collections.shuffle(white);
        Collections.shuffle(black);
        System.out.println("_________________________________________________________");
        division(white);
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
        division(black);
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
    }
    public static List complain(String rank, int quantity, List list){
        for (int i = 0; i < quantity; i++) {
            list.add(rank);
        }
        return list;
    }
    public static void division(List list){
        List<String> list_1 = new ArrayList<String>(8);
        List<String> list_2 = new ArrayList<String>(8);
        list_1 = list.subList(0 ,7);
        list_2 = list.subList(8 , 15);
        for (String s: list_1
             ) {
            System.out.print("|" + s);
        }
        System.out.println("|");
        System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
        for (String s: list_2
        ) {
            System.out.print("|" + s);
        }
        System.out.println("|");
    }
}
