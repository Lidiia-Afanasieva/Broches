import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Figures extends Main {

    public int x;
    public int y;
    public String color;
    public String name;
    public static int whitePoint = 0;
    public static int blackPoint = 0;
    public int worth;
    public static Figures[][] main_row = new Figures[8][9];
    public static List<Figures> white = new ArrayList<>(16);
    public static List<Figures> black = new ArrayList<>(16);
    public static int round = 1;

    public static void arrayCreating(){

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

        List<Figures> list_1;
        List<Figures> list_2;
        list_1 = white.subList(0, 8);
        list_2 = white.subList(8, 16);

        //СБОРКА МАССИВА
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
    }
    public static int gameCycle() throws IOException {
        String s;
        if (round == 1) System.out.println("Print exit if you want end the fight.\n" + "Firstly white step. Please enter the x of chosen figure ");
        else if (round % 2 != 0){
            round++;
            System.out.println("White turn ");
        }
        else System.out.println("Black turn ");

        s = reader.readLine();
        if (s.equals("exit")) return 1;
        int xStart = Integer.parseInt(s) - 1;//is changed to normal view
        System.out.println("Enter y ");
        s = reader.readLine();
        if (s.equals("exit")) return 1;
        int yStart = Integer.parseInt(s) - 1;//is changed to normal view

        System.out.println(main_row[yStart][xStart].name);
        main_row[yStart][xStart].x = xStart;//[2][7] = 7
        main_row[yStart][xStart].y = yStart;//[2][7] = 2
        System.out.println("Enter the x of the place, where you want to move this figure ");

        s = reader.readLine();
        if (s.equals("exit")) return 1;
        int xFin = Integer.parseInt(s) - 1;// 7
        System.out.println("Enter y ");
        s = reader.readLine();
        if (s.equals("exit")) return 1;
        int yFin = Integer.parseInt(s) - 1;// 3
        movingFigure(main_row[yStart][xStart], xFin, yFin);// [3][7] , 7, 3

        if (whitePoint >= 100000){
            System.out.println("White is won\n" + "Idi n@Xyi");
            return 1;
        }
        else if(blackPoint >= 100000){
            System.out.println("Black is won\n" + "Ojidaemo, Typaya Tb| tR'asoguzka (;3)))");
            return 1;
        }
        return 0;
    }

    public static void movingFigure (Figures figure, int x, int y) throws IOException {
        if (figure instanceof  King){
            King.moving(figure, x, y);
        }
        else if (figure instanceof  Queen){
            Queen.moving(figure, x, y);
        }
        else if (figure instanceof  Knight){
            Knight.moving(figure, x, y);
        }
        else if (figure instanceof  Pawn){
            Pawn.moving(figure, x, y);
        }
        else if (figure instanceof  Bishop){
            Bishop.moving(figure, x, y);
        }
        else if (figure instanceof  Rook){
            Rook.moving(figure, x, y);
        }
        else System.out.println("ERROR");
    }
}
