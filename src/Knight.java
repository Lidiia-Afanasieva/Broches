public class Knight extends Main {
    public Knight(String color){
        if (color.equals("white")){
            this.name = "W_Knight";
            this.worth = 25;//МБ ПОНАДОБИТСЯ
        }
        else if (color.equals("black")){
            this.name = "B_Knight";
            this.worth = 25;//ИБО МОЙ КОРОЛЬ БЕСПОЛЕЗЕН
        }
    }
    public void moving(){
        //НУЖНО ВСТАВИТЬ ОБРЕДЕЛЕНИЕ ТОГО
        //ПРИБАВЛЯТЬ ИЛИ УБАВЛЯТЬ
        //НЕ ЕБУ, ЕСЛИ ЧЕСТНО

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
