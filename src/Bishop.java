public class Bishop extends Main {
    public Bishop(String color){
        if (color.equals("white")){
            this.name = "W_Bishop";
            this.worth = 30;//МБ ПОНАДОБИТСЯ
        }
        else if (color.equals("black")){
            this.name = "B_Bishop";
            this.worth = 30;//ИБО МОЙ КОРОЛЬ БЕСПОЛЕЗЕН
        }
    }
    public void moving(){
        //НУЖНО ВСТАВИТЬ ОБРЕДЕЛЕНИЕ ТОГО
        //ПРИБАВЛЯТЬ ИЛИ УБАВЛЯТЬ
        //ЗАСУНУТЬ ЕЩЁ КОЛ-ВО КЛЕТОК И КУДА

        //НЕ СМОТРИ НА ЭТУ ХУЙНЮ
        if (this.color == "black") this.y =+ 1;
        else if (this.color == "white") this.y =+ 1;
    }
    public void killing(){
        //МОЖНО ИЗБАВИТЬСЯ
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
