public class Rook extends Main {
    public Rook(String color){
        if (color.equals("white")){
            this.name = " WRo ";
            this.worth = 30;
            this.color = "white";
        }
        else if (color.equals("black")){
            this.name = " BRo ";
            this.worth = 30;
            this.color = "black";
        }
    }
    public static void moving(Main figure, int x, int y) {
        boolean flag;
        if (x == figure.x && (y == figure.y + 1 || y == figure.y + 2 || y == figure.y + 3 || y == figure.y + 4 || y == figure.y + 5 || y == figure.y + 6 || y == figure.y + 7))
            flag = true;
        else if (x == figure.x && (y == figure.y - 1 || y == figure.y - 2 || y == figure.y - 3 || y == figure.y - 4 || y == figure.y - 5 || y == figure.y - 6 || y == figure.y - 7))
            flag = true;
        else if ((x == figure.x + 1 || x == figure.x + 2 || x == figure.x + 3 || x == figure.x + 4 || x == figure.x + 5 || x == figure.x + 6 || x == figure.x + 7) && y == figure.y)
            flag = true;
        else if ((x == figure.x - 1 || x == figure.x - 2 || x == figure.x - 3 || x == figure.x - 4 || x == figure.x - 5 || x == figure.x - 6 || x == figure.x - 7) && y == figure.y)
            flag = true;
        else flag = false;
        if (flag && main_row[y][x] instanceof Null) {
            main_row[y][x] = main_row[figure.y][figure.x];
            main_row[figure.y][figure.x] = null;
        }
        else if (flag && main_row[y][x].color.equals("black") && main_row[figure.y][figure.x].color.equals("white")) {
            whitePoint += main_row[y][x].worth;
            main_row[y][x] = main_row[figure.y][figure.x];
            main_row[figure.y][figure.x] = null;
        }
        else if (flag && main_row[y][x].color.equals("white") && main_row[figure.y][figure.x].color.equals("black")) {
            blackPoint += main_row[y][x].worth;
            main_row[y][x] = main_row[figure.y][figure.x];
            main_row[figure.y][figure.x] = null;
        } else System.out.println("Error in way \n" + "Try one more time ");
    }
}
