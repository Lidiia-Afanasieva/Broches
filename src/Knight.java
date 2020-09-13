public class Knight extends Main {
    public Knight(String color){
        if (color.equals("white")){
            this.name = "  WKnit";
            this.worth = 25;
            this.color = "white";

        }
        else if (color.equals("black")){
            this.name = "  BKnit";
            this.worth = 50000;
            this.color = "black";
        }
    }
    public static void moving(Main figure, int x, int y) {
        boolean flag;
        //ТУПИТ. РАЗОБРАТЬ ПОТОМ
        if (x == figure.x + 1 && y == figure.y + 2) flag = true;
        else if (x == figure.x - 1 && y == figure.y + 2) flag = true;
        else if (x == figure.x - 2 && y == figure.y + 1) flag = true;
        else if (x == figure.x - 2 && y == figure.y - 1) flag = true;
        else if (x == figure.x + 2 && y == figure.y + 1) flag = true;
        else if (x == figure.x + 2 && y == figure.y - 1) flag = true;
        else if (x == figure.x + 1 && y == figure.y - 2) flag = true;
        else if (x == figure.x - 1 && y == figure.y - 2) flag = true;
        else flag = false;
        if (flag && main_row[x][y] instanceof Null) {
            main_row[x][y] = main_row[figure.x][figure.y];
            main_row[figure.x][figure.y] = null;
        } else if (flag && main_row[x][y].color.equals("black") && main_row[figure.x][figure.y].color.equals("white")) {
            whitePoint += main_row[x][y].worth;
        } else if (flag && main_row[x][y].color.equals("white") && main_row[figure.x][figure.y].color.equals("black")) {
            blackPoint += main_row[x][y].worth;
        } else {
            System.out.println("Error in way \n" + "Try one more time ");
        }
    }
}
