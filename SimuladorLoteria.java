


package cesao18_Loteria;


import java.util.Scanner;
import java.util.ArrayList;

public class SimuladorLoteria {
    
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();

     // solicitando bilhete do usuario

         while (true) {
            
            System.out.println("digite 6 numeros para o seu bilhete( entre 1 e 60: )");
            
            int[] numerosEscolhidos = new int[6];
    // usuario escolhe os numeros

            for(int i = 0; i < numerosEscolhidos.length; i++){
                 
                System.out.println("digite o numero " + (i + 1) + ": ");

                numerosEscolhidos[i] = scanner.nextInt();
            }
    // criamos o bilhete com os numeros escolhidos

            Bilhete bilhete = new Bilhete(numerosEscolhidos);

    
            bilhetes.add(bilhete);
    // perguntar se o usuario quer continuar

            System.out.println("deseja registrar outri bilhete? S/N");

            String resposta = scanner.next();
               
           
           if (resposta.equals("N")) {
              break;
           }

        }
        
        // realizar o sorteio

        System.out.println("realizando o sorteio");

        for(Bilhete bilhete : bilhetes) {
            bilhete.realizarSorteio();
            bilhete.exibirResultados();
        }

        scanner.close();
    }


}





