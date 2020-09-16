public class King extends Main {
    public King(String color){
        if (color.equals("white")){
            this.name = " WKg ";
            this.worth = 100000;
            this.color = "white";
        }
        else if (color.equals("black")){
            this.name = " BKg ";
            this.worth = 0;
            this.color = "black";
        }
    }
    public static void moving(Main figure, int x, int y){

        boolean flag;
        System.out.println(x + " " + figure.x);
        System.out.println(y + " " + (figure.y + 1));
        if (x == figure.x + 1 && y == figure.y + 1) flag = true;
        else if (x == figure.x + 1 && y == figure.y - 1) flag = true;
        else if (x == figure.x - 1 && y == figure.y + 1) flag = true;
        else if (x == figure.x - 1 && y == figure.y - 1) flag = true;
        else if (x == figure.x + 1 && y == figure.y) flag = true;
        else if (x == figure.x - 1 && y == figure.y) flag = true;
        else if (x == figure.x && y == figure.y + 1) flag = true;
        else if (x == figure.x && y == figure.y - 1) flag = true;
        else flag = false;
        if (flag && main_row[x][y] instanceof Null){
            main_row[y][x] = main_row[figure.y][figure.x];
            main_row[figure.y][figure.x] = null;
        }
        else if (flag && main_row[y][x].color.equals("black") && main_row[figure.y][figure.x].color.equals("white")){
            main_row[y][x] = main_row[figure.y][figure.x];
            main_row[figure.y][figure.x] = null;
            whitePoint += main_row[y][x].worth;
        }
        else if (flag && main_row[y][x].color.equals("white") && main_row[figure.y][figure.x].color.equals("black")){
            main_row[y][x] = main_row[figure.y][figure.x];
            main_row[figure.y][figure.x] = null;
            blackPoint += main_row[y][x].worth;
        }
        else {
            System.out.println("Error in way \n" + "Try one more time ");
        }

    }
}
