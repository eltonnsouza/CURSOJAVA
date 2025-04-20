package cesao17;



public class POO {
     
  // 1 - criar uma classe
  // criação de carro.java
    public static void main(String[] args) {
    
       carro fusca = new carro();

       // acessar props e métodos sintaxe:


     fusca.marca = "VW";
     fusca.modelo = "Fusca";
     fusca.ano = 1964;

    fusca.acelerar();
    fusca.exibirInfo();

    carro carro2 = new carro();

    carro2.marca = "Fiat";
    carro2.modelo = "fusca";

    carro2.exibirInfo();

     System.out.println(fusca == carro2);

     // 3 - Método
        
     fusca.aumentarVelocidade(10.0);

     fusca.MotorLigado();

     fusca.aumentarVelocidade(20.0);

     fusca.aumentarVelocidade(30.0);


     fusca.MotorLigado();

     System.out.println(fusca.MotorLigado);

     // 4 - criando propriedades

      pessoa joao = new pessoa();

      joao.setNome("joao");

      System.out.println("o nome é : " + joao.getNome());


     joao.setIdade(40);

     System.out.println("sua idade é : " + joao.getidade());


   // 5 - Setters / permite alterar os dados garantindo a integridade

   ContaBancaria contaDaAna = new ContaBancaria();

   contaDaAna.setTitular("Ana");

   contaDaAna.setSlado(1000);

   contaDaAna.exibirInfo(0);

   // 6 - getters // resgata os dados do objeto ou classe

   System.out.println(contaDaAna.getTitular());

   System.out.println(contaDaAna.getSaldo());

// 6- logica em get/set

      produto camisa = new produto();

      camisa.setnome("camisa regata");

      System.out.println(camisa.getnome());

      camisa.setpreco(29.89999999999999);

      System.out.println(camisa.getpreco());


// 7 - metodos dentro de metodos

   System.out.println(camisa.getprodutoInfo());


  camisa.aplicarDesconto(12.5);

  // 8 - construtores

    Livro meuLivro = new Livro("harry potter" ,"  jrr tolkien " ,31.99);

   meuLivro.exibirInfo();


Livro meuLivro2 = new Livro();

meuLivro2.exibirInfo();























   }


}
