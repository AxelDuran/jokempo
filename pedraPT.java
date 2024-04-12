import java.util.Scanner;
import java.io.Console;
import java.math.*;

public class pedraPT {
    public static int pontosJ = 0, pontosC = 0;
    public static void main(String[] args) {
        int rodada = 1;
        while (rodada < 4) {
            JogarPedraPaTe();
            rodada += 1;
        }
        System.out.println("placar final: Jogador " + pontosJ + " computador " + pontosC);
        if (pontosJ > pontosC) {
            System.out.println("------------------------------------------/////------------------------------------------");
            System.out.println("tu ganhou padrinho!!!!!");
        }else{
            System.out.println("------------------------------------------/////------------------------------------------");
            System.out.println("tu perdeu e agora ta devendo o bixeiro da região");
        }
    }

    public static void JogarPedraPaTe(){
        
        Scanner inp1 = new Scanner(System.in);
        System.out.println("escolha: pedra, papel ou tesoura");
        String escolha = inp1.nextLine();

        double aiEscolha = Math.floor(Math.random()*3)+1;

        if((escolha.contains("pedra") && aiEscolha == 3)||(escolha.contains("papel") && aiEscolha == 1)||(escolha.contains("tesoura") && aiEscolha == 2)) {
            pontosJ += 1;
            System.out.println("tu ganhou meu rei");
            System.out.println("placar: " + pontosJ + " " + pontosC);
        }

        if((escolha.contains("pedra") && aiEscolha == 2)||(escolha.contains("papel") && aiEscolha == 3)||(escolha.contains("tesoura") && aiEscolha == 1)) {
            pontosC += 1;
            System.out.println("tu perdeu menor");
            System.out.println("placar: " + pontosJ + " " + pontosC);
        }

        if ((escolha.contains("pedra") && aiEscolha == 1)||(escolha.contains("papel") && aiEscolha == 2)||(escolha.contains("tesoura") && aiEscolha == 3)) {
            System.out.println("tente de novo");
            System.out.println("placar: " + pontosJ + " " + pontosC);
        }
        
    }
}

