package numeropositivoounegativo;
import java.util.Scanner; // importando biblicoteca scanner
public class NumeroPositivoOuNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("### Programa para descocbrir se um número é positivo ou negativo ###\n");
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Informe um número inteiro: ");
    int numeroInformado = Scanner.nextInt();
    //If else para identificar se o número é positivo ou não.
    if (numeroInformado>=0){
        System.out.println("O número informado é um número positivo.");
    }else {
        System.out.println("O número informado é um número negativo.");
    
    }
        
    }
 }
