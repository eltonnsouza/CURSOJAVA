package cesao17;

public class carro {
     
    

     // atributos ou propriedades

      String marca;
      String modelo;
      int ano; // 2010

      double velocidadeAtual = 0;
      boolean MotorLigado = false;
     // metodos

      void acelerar() {
   System.out.println("estamos acelerando o carro!");
     }

      void exibirInfo(){
      System.out.println("marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
      }
    // 3 - Métodos

    void MotorLigado(){

      if(!MotorLigado){

         MotorLigado = true;
         System.out.println("ligando motor...");

      }else {
        System.out.println("o motor ja esta ligado!");
      }
    }

    void aumentarVelocidade(double incremento){
      if(MotorLigado){

           velocidadeAtual += incremento;
           System.out.println("A velocidade atual é: " + velocidadeAtual);

      }else {

        System.out.println("primeiro precisa ligar o motor.");
      }
    }




}
    


