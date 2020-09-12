import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public int x;
    public int y;
    public String color;
    public String name;
    public int whitePoint;
    public int blackPoint;
    public int worth;
    public static Object[][] main_row = new Object[8][9];
    public static void main(String[] args) {
        List<Object> white = new ArrayList<Object>(16);
        List<Object> black = new ArrayList<Object>(16);

        King WKing = new King("white");
        white.add(WKing);
        Queen WQueen = new Queen ("white");
        white.add(WQueen);
        for (int i = 0; i < 2; i++) {
            Knight WKnight = new Knight("white");
            Rook WRook = new Rook("white");
            Bishop WBishop = new Bishop("white");
            white.add(WKnight);
            white.add(WBishop);
            white.add(WRook);
        }
        for (int i = 0; i < 8; i++) {
            Pawn WPawn = new Pawn("white");
            white.add(WPawn);
        }

        King BKing = new King("black");
        black.add(BKing);
        Queen BQueen = new Queen ("black");
        black.add(BQueen);
        for (int i = 0; i < 2; i++) {
            Knight BKnight = new Knight("black");
            Rook BRook = new Rook("black");
            Bishop BBishop = new Bishop("black");
            black.add(BKnight);
            black.add(BBishop);
            black.add(BRook);
        }
        for (int i = 0; i < 8; i++) {
            Pawn BPawn = new Pawn("black");
            black.add(BPawn);
        }

        Collections.shuffle(white);//случайное перемешивание коллекции
        Collections.shuffle(black);

        List<Object> list_1 = new ArrayList<Object>();
        List<Object> list_2 = new ArrayList<Object>();
        list_1 = white.subList(0, 7);
        list_2 = white.subList(8, 15);

        System.out.println(white);
        System.out.println(black);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++){
                if (i == 0) {
                    main_row[i][j] = list_1.get(j);
                }
                else {
                    main_row[i][j] = list_2.get(j);
                }
            }
        }

        list_1 = black.subList(0, 8);
        list_2 = black.subList(8, 16);
        System.out.println("list_1 now = " + list_1);
        System.out.println("___________________________");
        System.out.println("list_2 now = " + list_2);

        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                if (i == 6) {
                    main_row[i][j] = list_1.get(j);
                }
                else {
                    main_row[i][j] = list_2.get(j);
                }
            }
        }

        System.out.println(main_row[1][1]);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(main_row[i][j] + " ");
            }
            System.out.println();
        }
    }
}
