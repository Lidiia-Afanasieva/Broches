public class Bishop extends Main {
    public Bishop(String color){
        if (color.equals("white")){
            this.name = " WBishp";
            this.worth = 30;
        }
        else if (color.equals("black")){
            this.name = " BBishp";
            this.worth = 30;
        }
    }
    public static void moving(Main figure, int x, int y){
        boolean flag;
        if (x == figure.x + 1 && y == figure.y + 1 || x == figure.x + 2 && y == figure.y + 2 || x == figure.x + 3 && y == figure.y + 3 || x == figure.x + 4 && y == figure.y + 4 || x == figure.x + 5 && y == figure.y + 5 || x == figure.x + 6 && y == figure.y + 6 || x == figure.x + 7 && y == figure.y + 7) flag = true;
        else if (x == figure.x - 1 && y == figure.y - 1 || x == figure.x - 2 && y == figure.y - 2 || x == figure.x - 3 && y == figure.y - 3 || x == figure.x - 4 && y == figure.y - 4 || x == figure.x - 5 && y == figure.y - 5 || x == figure.x - 6 && y == figure.y - 6 || x == figure.x - 7 && y == figure.y - 7) flag = true;
        else if (x == figure.x + 1 && y == figure.y - 1 || x == figure.x + 2 && y == figure.y - 2 || x == figure.x + 3 && y == figure.y - 3 || x == figure.x + 4 && y == figure.y - 4 || x == figure.x + 5 && y == figure.y - 5 || x == figure.x + 6 && y == figure.y - 6 || x == figure.x + 7 && y == figure.y - 7) flag = true;
        else if (x == figure.x - 1 && y == figure.y + 1 || x == figure.x - 2 && y == figure.y + 2 || x == figure.x - 3 && y == figure.y + 3 || x == figure.x - 4 && y == figure.y + 4 || x == figure.x - 5 && y == figure.y + 5 || x == figure.x - 6 && y == figure.y + 6 || x == figure.x - 7 && y == figure.y + 7) flag = true;
        else flag = false;
        if (flag && main_row[x][y] instanceof Null){
            main_row[x][y] = main_row[figure.x][figure.y];
            main_row[figure.x][figure.y] = null;
        }
        else if (flag && main_row[x][y].color.equals("black") && main_row[figure.x][figure.y].color.equals("white")){
            whitePoint += main_row[x][y].worth;
        }
        else if (flag && main_row[x][y].color.equals("white") && main_row[figure.x][figure.y].color.equals("black")){
            blackPoint += main_row[x][y].worth;
        }
        else {
            System.out.println("Error in way \n" + "Try one more time ");
        }
    }
}
