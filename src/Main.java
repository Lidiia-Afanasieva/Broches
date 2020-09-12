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

        System.out.println(white);
        System.out.println(black);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++){
                for (Object rank : white
                    ) {
                    main_row[i][j] = rank;

                }
            }
        }

        for (Object rank : black
             ) {
            for (int i = 6; i <= 7; i++) {
                for (int j = 0; j < 8; j++){
                    main_row[i][j] = rank;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(main_row[i][j] + " ");
            }
            System.out.println();
        }
    }
}
