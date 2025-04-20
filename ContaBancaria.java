package cesao17;

public class ContaBancaria {
    
    private String titular;
    private double saldo;
    
   // criar uma função para alterar o titular

   public void setTitular(String titular){

       
    // logica para validar ou manipular

         if(titular != null && !titular.isEmpty()){
        this.titular = titular;
        } else {

           System.out.println("nome do titular invalido");
        }
       
       
       
   }
   
   public void setSlado(double saldo){

      if(saldo >= 0){
         this.saldo = saldo;
      } else {
         System.out.println("o valor precisa ser positivo!");
      }
   }


   public void exibirInfo(double Extrato){

  System.out.println("titular: " + titular + ", saldo R$: " + saldo);
    
   }

    public String getTitular(){
      return titular;
    }

    public String getSaldo(){
      return "R$" + saldo;
    }

}
