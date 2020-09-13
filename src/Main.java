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
    public static int whitePoint = 0;
    public static int blackPoint = 0;
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

        for (int i = 2; i < 6; i++) {
            for (int j = 0; j <= 7; j++){
                Null nCell = new Null();
                main_row[i][j] = nCell;
                //System.out.print(nCell.nValue);
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
        int i = 0;
        while (true){
            sout();
            if (i == 0) System.out.println("Print exit if you want end the fight.\n" + "Firstly white step. Please enter the x of chosen figure ");
            else if (i % 2 == 0) System.out.println("White turn ");
            else System.out.println("Black turn ");
            s = reader.readLine();
            if (s.equals("exit")) break;
            int xStart = Integer.parseInt(s);
            System.out.println("Enter y ");
            s = reader.readLine();
            if (s.equals("exit")) break;
            int yStart = Integer.parseInt(s);
            System.out.println(main_row[yStart-1][xStart-1].name);
            main_row[yStart-1][xStart-1].x = yStart - 1;
            main_row[yStart-1][xStart-1].y = xStart - 1;
            System.out.println("Enter the x of the place, where you want to move this figure ");
            s = reader.readLine();
            if (s.equals("exit")) break;
            int xFin = Integer.parseInt(s);
            System.out.println("Enter y ");
            s = reader.readLine();
            if (s.equals("exit")) break;
            int yFin = Integer.parseInt(s);
            moving(main_row[yStart - 1][xStart - 1], yFin - 1, xFin - 1);
            if (whitePoint >= 100000){
                System.out.println("White is won\n" + "Idi n@Xyi");
                break;
            }
            else if(blackPoint >= 100000){
                System.out.println("Black is won\n" + "Ojidaemo, Typaya Tb| tR'asoguzka (;3)))");
                break;
            }
        }
    }
    public static void sout(){
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print("   " + (i + 1) + "   ");
            //if (i % 2 == 0) System.out.print(" ");

        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    if (j == 0) System.out.print((i + 1) + "  ");
                    System.out.print(main_row[i][j].name);
                    if (j == 7) System.out.print("  " + (i + 1));
                } catch (NullPointerException e){
                    Null nCell = new Null();
                    System.out.print(nCell.name);
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print("   " + (i + 1) + "   ");
            //if (i % 2 == 0) System.out.print(" ");
        }
        System.out.println();
    }

    public static void moving(Main figure, int x, int y){
        if (figure instanceof King){
            King.moving(figure, x, y);
        }
        else if (figure instanceof Queen){
            Queen.moving(figure, x, y);
        }
        else if (figure instanceof Pawn){
            Pawn.moving(figure, x, y);
        }
        else if (figure instanceof Rook){
            Rook.moving(figure, x, y);
        }
        else if (figure instanceof Knight){
            Knight.moving(figure, x, y);
        }
        else if (figure instanceof Bishop){
            Bishop.moving(figure, x, y);
        }
        else System.out.println("ERROR");
    }
}
