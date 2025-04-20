package cesao14;

// array => subs. a classe  array
import java.util.Arrays;
public class listas {

    public static void main(String[] args) {
        
    // sintaxe
     int [] numeros = {1, 2 , 3 , 4 , 5, 6, 7, 8};

     // para acessar o primeiro elemento, variavel[1], indice dentro dos cochetes
     System.out.println("acessando primeiro elemento : " + numeros[0]);

     // tamnho fixo , só que vazio, delimita a lista em 3 elementos

     String[] frutas = new String[3];

     // 0, 1, 2, => add elementos
     //
     frutas[0] = "maçã";
     frutas[1] = "pera";
     frutas[2] = "uva";

     // referencia da classe

     System.out.println(frutas[0]);

     // para mudar um elemento

     double[] precos = {1.99 , 2.45 , 4.97};

      precos[2] = 5;
      System.out.println(precos[2]);

      // 2 - loops em arrays
      // somar todos os elementos de um array
      // acessar od elementos e condensar a soma deles emum var.

      int soma = 0;

      // length => a quantidade de elementos de um array
      // ideal para percorrer o array todo
      // no lugar de i < 8 / numeros.length
      for(int i = 0; i < numeros.length; i++){
      
       soma += numeros[i];

      }

       System.out.println("soma dos elementos: " + soma);


    // for each - so repeti a quantidade de elementos que o array tiver
    // nomear o item => Array
    // pessoas => pessoa , frutas => fruta
    //sintaxe (singular (fruta) plural (frutas))
    for(String fruta : frutas){
      System.out.println(fruta);
    }

     // encontrar o maior valor de um Array
      // criar array (tipo nome = {1 ,5, 5, ...})
      int [] valores = {10, 54, 87, 95, 72, 83, 16, 64, 84, };
      // criar uma variavel (maiorValor) , indice (valores[0])
      int maiorValor = valores[0];
      // variavel de referencia ( int j = 0)
      int j = 0;
      // criar o loop de verificação
      while (j < valores.length) {
      // verificar se os (valores j ) é maior que (maiorValor)
        if(valores[j] > maiorValor){
          maiorValor = valores[j];
        }
        j++;
      }

         System.out.println("o maior valor é : " + maiorValor);

     // 3 - for each / nao tem a nececidade de gerenciar o indice
     for(int numero : numeros){
      System.out.println("o numero é : " + numero);
     }

     // concatenar elementos de um array

     String[] palavras = {"java" , "é" , "bom!"};

     String frase = "";

     for(String palavra : palavras) {
      frase += palavra + " "; 
     }

     System.out.println(frase);

     // verificar se valor esta presente em Array

         char [] letras = {'a', 'b', 'c', 'd', 'e'};

        char letraProcurada = 'd';

         for(char letra : letras){

         if(letra == letraProcurada){
         System.out.println("encontramos a letra " + letra);
         break;
        }
      }

     // 4 - loops com if

     // filtrar e somar numeros pares
     int somaPares = 0;
     // for aech
     for(int numero : numeros){

        if(numero % 2 == 0){
          somaPares += numero;
        }
     }
         
     System.out.println("soma pares : " + somaPares);
      
     // exibir valores maiores que um determinado valor
     int[] nums = {12, 5, 45, 8, 7,2};
    // da minha lista eu so preciso os numeros maiores que 10
     int limite = 10;

     for(int i = 0; i < nums.length; i++){
           if(nums[i] > limite){
            System.out.println("numero encontrado: " + nums[i]);
           }
     }


     String[] linguagens = {"java", "php", "c", "python", "kotlen"};

     String linguagemAlvo = "php";

     for(String linguagen : linguagens){
         
        if(linguagemAlvo == linguagen){
          System.out.println("linguagem encontrada! parando o loop");
          break;
        }else{
          System.out.println("linguagem ainda nao encontrada!");
        }
  
     }

     // atualizar valores
     for(int i = 0; i < numeros.length; i++){

        numeros[i] *= 2;

      }
       System.out.println(numeros[1]);

       for(int numero : numeros){
        System.out.println("numeros dobrados: " + numero);
       }

       // especificar um unico elemento alterado
      numeros[5] = 1;

      System.out.println(numeros[5]);
    
     // alterar valor por meio de uma condição

     for(int i = 0 ; i < frutas.length; i++){
  
      // comparação de Strings metodo (equals)
          if(frutas[i].equals("Macã")){
            frutas[i] = "abacate";
          }
     }


           System.out.println(frutas[0]);

       // 6 - metodo toString
       // classes no java que vao ter metodos utilitarios, o arrays é uma delas
       // esse metodo precisa ser iportado (inport java.util.Arrays)
        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);
        

        String dadosFrutas = Arrays.toString(frutas);

         System.out.println(dadosFrutas);

         int [] teste = new int[3];

         System.out.println(Arrays.toString(teste));

        // 7 - adicionando novos itens a Arrays

        // ex1: criando um novo array maior e copiando os elementos

        int[] novoArray = new int[numeros.length + 1];

        for(int i = 0; i < numeros.length; i++){
          novoArray[i] = numeros[i];
        }

        System.out.println(Arrays.toString(novoArray));

        // como acessar o ultimo elemento do array , sem saber quantos elementos tem

        novoArray[novoArray.length - 1] = 4;

        System.out.println(Arrays.toString(novoArray));

        // ex2: utilizar arraycopy para copiar o els.

        String [] novofrutas = new String[frutas.length + 1];

        // (array inicial , posição inicial , array final , posição inicial do array final, limite\
        System.arraycopy(frutas, 0, novofrutas, 0, frutas.length);

        novofrutas[novofrutas.length - 1] = "jaca";

        System.out.println(Arrays.toString(novofrutas));

       // ex3 - ArrayList

       // sintaxe <tipo> nome da variavel = instanciar o array vazio <> dentro dos parenteses metodo(Arrays.list)
       java.util.ArrayList<String> listafrutas = new java.util.ArrayList<>(Arrays.asList("maçã" , "Banana" , "laranja"));

     System.out.println(listafrutas);

     listafrutas.add("manga");

     System.out.println(listafrutas);

     //  8- referece trap / arrayCopia , apontam para o mesmo lugar.

     int []  arrayOriginal = {1, 2, 3};
     
     // programou bastante coisa...
     // se criar uma copia do arrayOriginal e modificar, vai tambem
     // nodificar o arrayOriginal , 

     int[] arrayCopia = arrayOriginal;
                          
      arrayCopia[0] = 10;

      System.out.println(Arrays.toString(arrayOriginal));
      System.out.println(Arrays.toString(arrayCopia));

    // como evitar / usando o (clone) criando uma copia independente

    int [] arrayClone = arrayOriginal.clone();

    arrayClone[0] = 999;

    System.out.println(Arrays.toString(arrayOriginal));
    System.out.println(Arrays.toString(arrayClone));

    // 9 - arrays 2d (Matriz)
    // [[1,2],[2,3]]

    int[][] matriz = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
    };

      System.out.println(matriz[2][2]);

    // criando array vazio e preenchendo

     int [] [] tabela = new int [3][3];

     

     tabela[0][0] = 10;
     tabela[1][1] = 20;
     tabela[2][2] = 30;
     

      for(int[] linha : tabela){
        
        System.out.println(Arrays.toString(tabela));
      }
      

      int [] [] grade = new int[4][5];

      for(int m = 0; m < grade.length; m++){
            for(int n = 0; n < grade[m].length; n++){
              grade [m][n] = m * n;
            }

      }


      for(int[] linha : grade){
             
        System.out.println(Arrays.toString(linha));
      }



























    }
    
}
