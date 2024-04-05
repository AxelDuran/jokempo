import java.util.Scanner;
import java.math.*;

public class pedraPT {
    public static void main(String[] args) {
        int rodada = 1;
        while (rodada < 4) {
            JogarPedraPaTe();
            rodada += 1;
        }
    }

    public static void JogarPedraPaTe(){
        Scanner inp1 = new Scanner(System.in);
        System.out.println("escolha: pedra, papel ou tesoura");
        String escolha = inp1.nextLine();

        double aiEscolha = Math.floor(Math.random()*3)+1;


        if(escolha.contains("pedra") && aiEscolha == 3) {
            System.out.println("tu ganhou meu rei");
        }
        if(escolha.contains("papel") && aiEscolha == 1){
            System.out.println("tu ganhou meu rei");
        }
        if(escolha.contains("tesoura") && aiEscolha == 2){
            System.out.println("tu ganhou meu rei");
        }


        if(escolha.contains("pedra") && aiEscolha == 2) {
            System.out.println("tu perdeu menor");
        }
        if(escolha.contains("papel") && aiEscolha == 3) {
            System.out.println("tu perdeu menor");
        }
        if(escolha.contains("tesoura") && aiEscolha == 1) {
            System.out.println("tu perdeu menor");
        }

        if ((escolha.contains("pedra") && aiEscolha == 1)||(escolha.contains("papel") && aiEscolha == 2)||(escolha.contains("papel") && aiEscolha == 3)) {
            System.out.println("tente de novo");
        }

        System.out.println(aiEscolha);
        
    }
}

