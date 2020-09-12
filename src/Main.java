import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public static Main[][] main_row = new Main[8][9];

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Main> white = new ArrayList<>(16);
        List<Main> black = new ArrayList<>(16);

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

        List<Main> list_1 = new ArrayList<>();
        List<Main> list_2 = new ArrayList<>();
        list_1 = white.subList(0, 8);
        list_2 = white.subList(8, 16);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 7; j++){
                if (i == 0) {
                    main_row[i][j] = list_1.get(j);
                    main_row[i][j].x = i;
                    main_row[i][j].y = j;
                }
                else {
                    main_row[i][j] = list_2.get(j);
                    main_row[i][j].x = i;
                    main_row[i][j].y = j;
                }
            }
        }

        list_1 = black.subList(0, 8);
        list_2 = black.subList(8, 16);

        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                if (i == 6) {
                    main_row[i][j] = list_1.get(j);
                    main_row[i][j].x = i;
                    main_row[i][j].y = j;
                }
                else {
                    main_row[i][j] = list_2.get(j);
                    main_row[i][j].x = i;
                    main_row[i][j].y = j;
                }
            }
        }

        //НЕПОСРЕДСТВЕННО ЦИКЛ
        String s = "";
        while (true){
            sout();
            System.out.println("White step. Please enter the x of chosen figure ");
            s = reader.readLine();
            if (s.equals("exit")) break;
            int x = Integer.parseInt(s);
            System.out.println("Please enter the y of chosen figure ");
            s = reader.readLine();
            if (s.equals("exit")) break;
            int y = Integer.parseInt(s);
            System.out.println(main_row[y-1][x-1].name);
        }
    }
    public static void sout(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    System.out.print(main_row[i][j].name + " ");
                } catch (NullPointerException e){
                    System.out.print("|_______|");
                }
            }
            System.out.println();
        }
    }
}
