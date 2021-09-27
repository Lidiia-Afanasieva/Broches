import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Figures.arrayCreating();

        //  НЕПОСРЕДСТВЕННО ЦИКЛ
        int flag = 0;
        while (flag == 0){
            sout();
            flag = Figures.gameCycle();
        }
    }

    public static void sout(){
        /*System.out.println("______________________________________________________");
        System.out.println("MOTION " + Figures.round);
        System.out.println("______________________________________________________");*/
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print("  " + (i + 1) + "  ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                try {
                    if (j == 0) System.out.print((i + 1) + "  ");
                    System.out.print(Figures.main_row[i][j].name);
                    if (j == 7) System.out.print("  " + (i + 1));
                } catch (NullPointerException e){
                    Null nCell = new Null();
                    System.out.print(nCell.name);
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print("  " + (i + 1) + "  ");
        }
        System.out.println("\n");
        System.out.println("White point is " + Figures.whitePoint);
        System.out.println("Black point is " + Figures.blackPoint);
        System.out.println();
    }
}
