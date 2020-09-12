public class Pawn extends Main {
    public Pawn(String color){
        if (color == "white"){
            this.name = "W_Pawn";
            this.worth = 10;//МБ ПОНАДОБИТСЯ
        }
        else if (color == "black"){
            this.name = "B_Pawn";
            this.worth = 10;//ИБО МОЙ КОРОЛЬ БЕСПОЛЕЗЕН
        }
    }
    public void moving(){
        //НУЖНО ВСТАВИТЬ ОБРЕДЕЛЕНИЕ ТОГО
        if (this.color == "black") this.y =- 1;
        else if (this.color == "white") this.y =+ 1;
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
