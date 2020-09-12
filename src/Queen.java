public class Queen extends Main {
    public Queen(String color){
        if (color.equals("white")){
            this.name = "W_Queen ";
            this.worth = 50;
        }
        else if (color.equals("black")){
            this.name = "B_Queen ";
            this.worth = 100000;
        }
    }
    public void moving(){
        //РАЗЪЕБЁШЬ ПОТОМ
    }
    public void killing(){
        //
    }
    public void dying(){
        if (this.color == "white"){
            blackPoint =+ this.worth;
        }
        else if (this.color == "black"){
            whitePoint =+ this.worth;
        }
    }
}
