package cesao12;

/**
 * 
 * objetivo: criar uma calculadora que faz soma, multiplicação,
 * divisao e subtração
 * 
 * 1 - pedir dois numeros para o usuario (double)
 * 2 - apresentar uma tabela/texto para escolher a operação
 * 3 - resgatar a operação que o ususrio selecionou
 * 4 - realizar o calculo
 * 5 - exibir o resultado
 * 6 - se a operação escolhida for invalida, exibir mensagem de erro
 * 7 - se a adivisão for por zero , exibir uma mensage, de erro
*/

import java.util.Scanner;

public class calculadorasimples {
    
    public static void main(String[] args) {
        
     // resgatando numeros  

     Scanner scanner = new Scanner(System.in);

      System.out.println("digite o primeiro numero: ");

     // encapsula uma variavel

      double num1 = scanner.nextDouble();

      System.out.println("digite o segundo numero: ");

      double num2 = scanner.nextDouble();

     // resgatando operação

      System.out.println("escolha a operação: ");
      System.out.println("1) adição: (+)");
      System.out.println("2) subtração: (-) ");
      System.out.println("3) multiplicação: (*) ");
      System.out.println("4)divisão: (/) ");

      // realizando calculo
      // resgatar a ecolha do usuario (1 , 2 , 3 , 4) declara a variavel int
      int operação = scanner.nextInt();


      // ponto de verificação do projeto
      //System.out.println(num1);
      //System.out.println(num2);
      //System.out.println(operação);

      // fechar o scanner
      // realizando calculos

     double resultado = 0;


         switch (operação) {
             case 1 :
             resultado = adicionar(num1, num2);
             break;
             case 2:
             resultado = subtraiir(num1, num2); 
             break;
             case 3:
             resultado = multiplicação(num1, num2);
             case 4: 
             resultado = divisao(num1, num2);

             case 5:

                 if(num2 != 0){
                   resultado = divisao(num1, num2);
                 }else{
                 System.out.println("divisao por zero invalida!");
                 scanner.close();
                 return;
             }
             
             break;
             default:

              System.out.println("operação invalida");
              scanner.close();
              return;
     }

     // exibição do resultado


     System.out.println("o resultado da operação e: " + resultado);


       scanner.close();


    }

    // funcoes para calcular
      public static double adicionar(double a, double b){
    
      return  a + b;

 }

     public static double subtraiir(double a, double b){

      return a - b;
 }


     public static double multiplicação(double a , double b){

      return a * b;
}

     public static double divisao(double a , double b){

      return a / b;
}











}
