package cesao15;

/**
 * 1 - importar Scanner : importar a classe Scanner papturar a entrada do usuario
 * 
 * 2 - definir palavra secreta: creiar uma variavelmpalavraSecreta
 * com a palavra a ser adivinhada e inicializar um array palavraOculta
 * com caracteres sublinhado _ para representar a palavra oculta.
 *
 * 3 - configurar tentativas: definir o numero maximo de tentativas
 * e uma variavel para verificar se o usuario venceu.
 * 
 * 4 - loop principal: criar um loop que continua enquanto ouver tentativas restantes
 * 
 * 5 - exibir status: mostrar a palavra oculta e o numero de tentativas
 *  restantes. solicitar a entrada do usuario para uma letra.
 * 
 * 6 - verificar letra: comparar a letra inserida com a palavra secreta.
 * atualizar a palavra oculta se a letra for correta.
 * diminuir o numero de tentativas se a letra for incorreta.
 * 
 * 7 - verificar vitoria: verificar se a palavra oculta corresponde a palavra
 * secreta e sair do loop se o usuario vencer.
 * 
 * 8 - finalizar jogo: exibir mensagem de vitoria oou derrota e  mostra
 * a palavra secreta
 * 
 * 9 - fechar o Scanner: para limpar recurso
 * 
 */

 
import java.util.Scanner;

public class jogoDaForca {
    

   public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);

    // definir a palavra a ser advinhada
     String palavraSecreta = "JAVA";
     
     char[] palavraOculta = new char[palavraSecreta.length()];
          
          for(int i = 0; i < palavraSecreta.length(); i++){
           palavraOculta[i] = '_';    
        }


     // numero maximo de rentativas

     int tentativas = 6;
    boolean venceu = false;


    // loop de solicitação das letras do usuario

while(tentativas > 0) {

    System.out.println("palavra: " + String.valueOf(palavraOculta));
    System.out.println("tentativas: " + tentativas);
    System.out.println("digite uma letra: ");

     char letra = scanner.next().toUpperCase().charAt(0);
       
     System.out.println(letra);
     boolean acertou = false;

     for(int i = 0; i < palavraSecreta.length(); i ++){

        if(palavraSecreta.charAt(i) == letra){
            palavraOculta[i] = letra;
            acertou = true;
        }
     }

     // dedução da tentativa correta
      if(!acertou){
        tentativas--;
        System.out.println("letra incorreta.");
      }else{
        System.out.println("letra correta.");
      }

     
        if(String.valueOf(palavraOculta).equals(palavraSecreta)){
          venceu = true;
          break;
       }
    
}



//  a condição de vitoria

        if(venceu){
           System.out.println("parabens , voce venceu! " + tentativas + " tentativas");
           System.out.println("a palavra era: " + palavraSecreta);
        }else{
           System.out.println("voce perdeu, tente outra vez!");
           System.out.println("a palavra era: " + palavraSecreta);
        }
         scanner.close();


    }

}
