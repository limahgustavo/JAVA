import java.util.Arrays;
public class ControleFluxo6 {
    public static void main (String[] args) {

        String[] paises = {"BRASIL", "RÚSSIA", "INDIA", "CHINA"};
       
        

        System.out.println(paises[0]);
        System.out.println(Arrays.toString (paises));
        
        int posicao = Arrays.binarySearch (paises, "BRASIL");
        System.out.println (posicao);
    }
}  

