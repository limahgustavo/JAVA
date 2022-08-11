public class ControleFluxo3 {
    public static void main (String[] args) {

        int idade = 0;
        while (idade < 21){
        if (idade <=7 )
            System.out.println("Ainda é uma criança");
        else if (idade > 7 && idade <= 18) 
            System.out.println("É uma adolencente");
        else if (idade > 18 && idade <=20)
            System.out.println("Esta na melhor idade");
            idade++;
        }
    }
}



