public class Knight extends Main {
    public Knight(String color){
        if (color.equals("white")){
            this.name = " WKn ";
            this.worth = 25;
            this.color = "white";

        }
        else if (color.equals("black")){
            this.name = " BKn ";
            this.worth = 50000;
            this.color = "black";
        }
    }
    public static void moving(Main figure, int x, int y) {
        boolean flag;
        if (x == figure.x + 1 && y == figure.y + 2) flag = true;
        else if (x == figure.x - 1 && y == figure.y + 2) flag = true;
        else if (x == figure.x - 2 && y == figure.y + 1) flag = true;
        else if (x == figure.x - 2 && y == figure.y - 1) flag = true;
        else if (x == figure.x + 2 && y == figure.y + 1) flag = true;
        else if (x == figure.x + 2 && y == figure.y - 1) flag = true;
        else if (x == figure.x + 1 && y == figure.y - 2) flag = true;
        else if (x == figure.x - 1 && y == figure.y - 2) flag = true;
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
        }
        else System.out.println("Error in way \n" + "Try one more time ");
    }
}
