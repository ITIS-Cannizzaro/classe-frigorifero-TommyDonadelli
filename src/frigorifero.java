public class frigorifero {
    int litri;
    String Classe;

    public frigorifero(int litri,String Classe){
        this.litri=litri;
        this.Classe=Classe;
    }

    public void calcolo(){
        Double mol=0.00;
        if (Classe=="A") 
        {
            mol=5.00;
        }
        if (Classe=="A+") 
        {
            mol=1.50;
        }
        if (Classe=="A++")
        {
            mol=2.00;
        }

        Double prezzo=5*litri*mol;
        
        System.out.println("il prezzo è "+ prezzo);


    }
}