package cesao14;

import java.util.ArrayList;
import java.util.Arrays;

public class exercicios {
    
    public static void main(String[] args) {
        
    // exercico 1) invertrer o Array

    int [] arrayOriginal = {1, 2, 3, 4, 5};
    int [] arrayInvertido = new int [arrayOriginal.length];

    // loop para percorrer o array original usando o (length)
    for(int i = 0; i < arrayOriginal.length; i++){
        
        arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
    }

    System.out.println(Arrays.toString(arrayOriginal));
    System.out.println(Arrays.toString(arrayInvertido));


   // exercicio 2)

int [] arrayInteros = {1, 2, 3, 4, 4, 4, 5};

int maisFrequente = arrayInteros[0];

int maxContagem = 1;


for(int i =0; i < arrayInteros.length; i++){

       int contagem = 1;

for(int j = 0; j < arrayInteros.length; j++){
     if(arrayInteros[j] == arrayInteros[i]) {
        contagem++;
     }

}

if(contagem > maxContagem){
maxContagem = contagem;
maisFrequente = arrayInteros[i];

}


}

System.out.println("o mais frequente é: " + maisFrequente);


// exercicio 3) transpor matrix
int [][] matriz = {
   {1,2,3},
   {4,5,6}
};
 int [][] matizTramposta = new int[matriz[0].length][matriz.length];

 for(int[] linha : matizTramposta){
    System.out.println(Arrays.toString(linha));

 }

 for(int i =0; i < matriz.length; i++){
    for(int j = 0; j < matriz[0].length; j++){
        matizTramposta[j][i] =  matriz[i][j];
       }
 }

 // for each matriz
for(int[] linha : matizTramposta){
    System.out.println(Arrays.toString(linha));
}


// exercicio - 4) mprimir lista original com negativos e depois imprimir 
// substituindo os negativos por zero.

int [] arrayConNegativo = {1, -2, 3, -4, 5, -6};

System.out.println(Arrays.toString(arrayConNegativo));

for(int i = 0; i < arrayConNegativo.length; i++){

    if(arrayConNegativo[i] < 0){
        arrayConNegativo[i] = 0;
    }
}

     System.out.println(Arrays.toString(arrayConNegativo));


// exercicio 5) criar um array duplicado e depois substituir os duplicados


int [] arrayConDuplicados = {1, 2, 2, 3, 3, 4, 4, 5};

// primeiro a impressao da lista

     System.out.println(Arrays.toString(arrayConDuplicados));

// segundo, importar o ArrayListe

// arrayList , numerico sem quantidade de elements definido

          ArrayList<Integer> arraysemDuplicados =  new ArrayList<>();

// loop for

          for(int numero : arrayConDuplicados){

            if(!arraysemDuplicados.contains(numero)){
                arraysemDuplicados.add(numero);
            }
          }

        System.out.println(Arrays.toString(arrayConDuplicados));
        System.out.println(arraysemDuplicados);

    }
}
