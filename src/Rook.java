public class Rook extends Main {
    public Rook(String color){
        if (color.equals("white")){
            this.name = " W_Rook ";
            this.worth = 30;//МБ ПОНАДОБИТСЯ
        }
        else if (color.equals("black")){
            this.name = " B_Rook ";
            this.worth = 30;//ИБО МОЙ КОРОЛЬ БЕСПОЛЕЗЕН
        }
    }
    public void moving(){
        //НУЖНО ВСТАВИТЬ ОБРЕДЕЛЕНИЕ ТОГО
        //ПРИБАВЛЯТЬ ИЛИ УБАВЛЯТЬ
        //ЗАСУНУТЬ ЕЩЁ КОЛ-ВО КЛЕТОК И КУДА
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
