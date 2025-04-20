package cesao18_Loteria;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {
    

    private int[] numerosEscolhidos;
    private int[] resultadosDoSorteio;
    
    public Bilhete(int[] numerosEscolhidos) {
          this.numerosEscolhidos = numerosEscolhidos;
    }

    // metodo realizar sorteiio

    public void realizarSorteio(){
        Random random = new Random();

        resultadosDoSorteio = new int[6];

        for(int i = 0; i < resultadosDoSorteio.length; i++){
               
               resultadosDoSorteio[i] = random.nextInt(60) + 1;

        }

        Arrays.sort(resultadosDoSorteio);
        
    }

// metodo para contar quantos numeros o jogador acertou

     public int contarAcertos() {

         int acertos = 0;

         for(int numeroEscolhido : numerosEscolhidos){
             for(int numeroSorteado : resultadosDoSorteio){
                  if(numeroEscolhido == numeroSorteado){
                       acertos++;
                  }
             } 

         }

         return acertos;

    }

     // exibir os resultados

    public void exibirResultados() {
      System.out.println("numeros escolhidos: " + Arrays.toString(numerosEscolhidos));
      System.out.println("numeros sorteados: " + Arrays.toString(resultadosDoSorteio));

      int acertos = contarAcertos();

      System.out.println("voce acertou " + acertos + "acertos.");

    }
}
