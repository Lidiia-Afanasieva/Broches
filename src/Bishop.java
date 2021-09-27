public class Bishop extends Figures {
    public Bishop(String color){
        if (color.equals("white")){
            this.name = " WBi ";
            this.worth = 30;
            this.color = "white";
        }
        else if (color.equals("black")){
            this.name = " BBi ";
            this.worth = 30;
            this.color = "black";
        }
    }
    public static void moving(Figures figure, int x, int y){
        boolean flag;
        
        //  НАДО ЗАМЕНИТЬ
        
        if (x == figure.x + 1 && y == figure.y + 1 || x == figure.x + 2 && y == figure.y + 2 || x == figure.x + 3 && y == figure.y + 3 || x == figure.x + 4 && y == figure.y + 4 || x == figure.x + 5 && y == figure.y + 5 || x == figure.x + 6 && y == figure.y + 6 || x == figure.x + 7 && y == figure.y + 7) flag = true;
        else if (x == figure.x - 1 && y == figure.y - 1 || x == figure.x - 2 && y == figure.y - 2 || x == figure.x - 3 && y == figure.y - 3 || x == figure.x - 4 && y == figure.y - 4 || x == figure.x - 5 && y == figure.y - 5 || x == figure.x - 6 && y == figure.y - 6 || x == figure.x - 7 && y == figure.y - 7) flag = true;
        else if (x == figure.x + 1 && y == figure.y - 1 || x == figure.x + 2 && y == figure.y - 2 || x == figure.x + 3 && y == figure.y - 3 || x == figure.x + 4 && y == figure.y - 4 || x == figure.x + 5 && y == figure.y - 5 || x == figure.x + 6 && y == figure.y - 6 || x == figure.x + 7 && y == figure.y - 7) flag = true;
        else if (x == figure.x - 1 && y == figure.y + 1 || x == figure.x - 2 && y == figure.y + 2 || x == figure.x - 3 && y == figure.y + 3 || x == figure.x - 4 && y == figure.y + 4 || x == figure.x - 5 && y == figure.y + 5 || x == figure.x - 6 && y == figure.y + 6 || x == figure.x - 7 && y == figure.y + 7) flag = true;
        else flag = false;
        if (flag && main_row[y][x] instanceof Null){
            main_row[y][x] = main_row[figure.y][figure.x];
            Null Null = new Null();
            main_row[figure.y][figure.x] = Null;
        }
        else if (flag && main_row[y][x].color.equals("black") && main_row[figure.y][figure.x].color.equals("white")){
            whitePoint += main_row[y][x].worth;
            main_row[y][x] = main_row[figure.y][figure.x];
            Null Null = new Null();
            main_row[figure.y][figure.x] = Null;
        }
        else if (flag && main_row[y][x].color.equals("white") && main_row[figure.y][figure.x].color.equals("black")){
            blackPoint += main_row[y][x].worth;
            main_row[y][x] = main_row[figure.y][figure.x];
            Null Null = new Null();
            main_row[figure.y][figure.x] = Null;
        }
        else {
            System.out.println("Error in way \n" + "Try one more time ");
        }
    }
}
