package cesao14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class avancandoArrays {
    
    public static void main(String[] args) {
        
     //  1 - ordenação

     // array de inteiros
     int [] numbers = {8, 5, 1, 7, 9, 3, 2, 0};

     // para ordenar esse array (sort) modifica o array orogonal
     Arrays.sort(numbers);

   // para imprimir 

   System.out.println(Arrays.toString(numbers));

//ex2) ordenação com (comparator)

String[] names = {"joao" , "pedro" , "bruno", "marco"};

// ordem alfabetica(sort)

   Arrays.sort(names);

// ordem reversa

Arrays.sort(names, Comparator.reverseOrder());

//System.out.println(Arrays.toString(names));

System.out.println(Arrays.toString(names));


// ex3) ordenação de matriz

int [][] matriz = {
    {4,5,1},
    {3,8,9},
    {2,3,1}
};

Arrays.sort(matriz, Comparator.comparingInt(a -> a[0]));

for(int[] linha : matriz) {
    System.out.println(Arrays.toString(linha));
}


// imorimir arrays de matriz  sem precisar fazer loop for each

System.out.println(Arrays.deepToString(matriz));

// manipulação avançada

// copia
int [] original = {1, 2, 3, 4};

int[] copia = Arrays.copyOf(original,2);

System.out.println(Arrays.toString(copia));


// fill - preenchimento

int[] numeros = new int[5];

System.out.println(Arrays.toString(numeros));

Arrays.fill(numeros, 5);

System.out.println(Arrays.toString(numeros));


// trsformação de array para stream

int[] values = {1, 2, 3, 4, 5};


// fazer a soma dos elementos
// sem usar o loop

int sum = Arrays.stream(values).sum();

System.out.println(sum);


// Arrays dinamico


ArrayList<String> frutas = new ArrayList<>();

System.out.println(frutas);

// adicionar elementos 
frutas.add("maçã" );
frutas.add("pera");

System.out.println(frutas);

for(String fruta : frutas){
    System.out.println(fruta);
}

// remover elementos
frutas.remove("pera");

System.out.println(frutas);


frutas.remove(0);

frutas.add("maçã");

System.out.println(frutas);

// remover elementod especificos no array

String frutaEspecifica = frutas.get(0);
// nao funciona com indice diretamente 
 //System.out.println(frutas[0]);

System.out.println(frutaEspecifica);





















    }
}
