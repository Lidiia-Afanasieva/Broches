public class King extends Main {
    public King(String color){
        if (color.equals("white")){
            this.name = " W_King ";
            this.worth = 100000;//МБ ПОНАДОБИТСЯ
        }
        else if (color.equals("black")){
            this.name = " B_King ";
            this.worth = 0;//ИБО МОЙ КОРОЛЬ БЕСПОЛЕЗЕН
        }
    }
    public void moving(){
        //НУЖНО ВСТАВИТЬ ОБРЕДЕЛЕНИЕ ТОГО
        //ПРИБАВЛЯТЬ ИЛИ УБОВЛЯТЬ 1 И ЗАПИЛИТЬ В IF
        this.x =+ 1;
        this.y =+ 1;
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
