public class Pawn extends Main {
    public Pawn(String color){
        if (color.equals("white")){
            this.name = "  WPawn";
            this.worth = 10;
        }
        else if (color.equals("black")){
            this.name = "  BPawn";
            this.worth = 10;
        }
    }
    public static void moving(Main figure, int x, int y){
        boolean flag = true;
        //ТУПИТ. РАЗОБРАТЬ ПОТОМ
        if (figure.color.equals("white") && x == figure.x && y == figure.y + 1) flag = true;
        else if (figure.color.equals("white") && x == figure.x + 1&& y == figure.y + 1) flag = true;
        else if (figure.color.equals("white") && x == figure.x - 1&& y == figure.y + 1) flag = true;
        else if (figure.color.equals("black") && x == figure.x - 1&& y == figure.y - 1) flag = true;
        else if (figure.color.equals("black") && x == figure.x + 1&& y == figure.y - 1) flag = true;
        else if (figure.color.equals("black") && x == figure.x && y == figure.y - 1) flag = true;
        else flag = false;
        if (flag == true && main_row[x][y] instanceof Null && ((figure.color.equals("white") && x == figure.x && y == figure.y + 1) || (figure.color.equals("black") && x == figure.x && y == figure.y - 1))){
            main_row[x][y] = main_row[figure.x][figure.y];
            main_row[figure.x][figure.y] = null;
        }
        else if (flag == true && main_row[x][y].color.equals("black") && main_row[figure.x][figure.y].color.equals("white")){
            whitePoint += main_row[x][y].worth;
        }
        else if (flag == true && main_row[x][y].color.equals("white") && main_row[figure.x][figure.y].color.equals("black")){
            blackPoint += main_row[x][y].worth;
        }
        else {
            System.out.println("Error in way \n" + "Try one more time ");
        }
    }
}
