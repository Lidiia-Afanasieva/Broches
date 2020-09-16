import java.io.IOException;

public class Pawn extends Figures {
    public Pawn(String color){
        if (color.equals("white")){
            this.name = " WPw ";
            this.worth = 10;
            this.color = "white";
        }
        else if (color.equals("black")){
            this.name = " BPw ";
            this.worth = 10;
            this.color = "black";
        }
    }

    public static void moving(Figures figure, int x, int y) throws IOException {// [2][7] fig.x(7)   fig.y(2) 7, 3
        boolean flag;
        int i = 0;//for switch-case

        if (figure.color.equals("white") && figure.x == x && (figure.y + 1 == y || figure.y + 2 == y)) {
            flag = true;
            i = 1;
        }
        else if (figure.color.equals("white") && x == figure.x + 1 && y == figure.y + 1) {
            i = 2;
            flag = true;
        }
        else if (figure.color.equals("white") && x == figure.x - 1 && y == figure.y + 1) {
            i = 2;
            flag = true;
        }
        else if (figure.color.equals("black") && x == figure.x - 1 && y == figure.y - 1) {
            i = 3;
            flag = true;
        }
        else if (figure.color.equals("black") && x == figure.x + 1 && y == figure.y - 1) {
            i = 3;
            flag = true;
        }
        else if (figure.color.equals("black") && x == figure.x && (figure.y - 1 == y || figure.y - 2 == y)) {
            i = 1;
            flag = true;
        }
        else {
            //System.out.println("FUCK");
            flag = false;
        }

        switch (i){
            case 1 : {
                if (flag && main_row[y][x] instanceof Null){
                    main_row[y][x] = main_row[figure.y][figure.x];
                    Null Null = new Null();
                    main_row[figure.y][figure.x] = Null;
                    break;
                }
            }
            case 2 : {
                if (flag) {
                    System.out.println(y + " " + x);
                    whitePoint = whitePoint + main_row[y][x].worth;
                    main_row[y][x] = main_row[figure.y][figure.x];
                    Null Null = new Null();
                    main_row[figure.y][figure.x] = Null;
                    break;
                }
            }
            case 3 : {
                if (flag) {
                    blackPoint = whitePoint + main_row[y][x].worth;
                    main_row[y][x] = main_row[figure.y][figure.x];
                    Null Null = new Null();
                    main_row[figure.y][figure.x] = Null;
                    break;
                }
            }
            default : {
                System.out.println("Error in way \n" + "Try one more time ");
            }
        }

        //CHANGING OF THE PAWN

        if (figure.color.equals("white") && x == 8){
            System.out.println("\nNow you can change your pawn rank. Write Queen, Rook, Bishop, Knight or Pawn\n");
            String newFig = reader.readLine();
            switch (newFig){
                case "Queen" : {
                    Queen WQueen = new Queen ("white");
                    main_row[y][x] = WQueen;
                }
                case "Rook" : {
                    Rook WRook = new Rook ("white");
                    main_row[y][x] = WRook;
                }
                case "Bishop" : {
                    Bishop WBishop = new Bishop("white");
                    main_row[y][x] = WBishop;
                }
                case "Knight" : {
                    Knight WKnight = new Knight("white");
                    main_row[y][x] = WKnight;
                }
            }
        }
        else if (figure.color.equals("black") && x == 8){
            System.out.println("\nNow you can change your pawn rank. Write King, Rook, Bishop or Pawn\n");
            String newFig = reader.readLine();
            switch (newFig){
                case "Rook" : {
                    Rook BRook = new Rook ("black");
                    main_row[y][x] = BRook;
                }
                case "Bishop" : {
                    Bishop BBishop = new Bishop("black");
                    main_row[y][x] = BBishop;
                }
                case "King" : {
                    King BKing = new King("black");
                    main_row[y][x] = BKing;
                }
            }
        }
    }
}
