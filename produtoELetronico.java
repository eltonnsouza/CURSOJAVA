package cesao17;

public class produtoELetronico {
    
 // 1º atribustos da classe

     private String nome;
     private double preco;
     private int garantia; // em meses

// 2º contstrutor 
     
     public produtoELetronico(String nome, double preco, int garantia){

           this.nome = nome;
           this.preco = preco;
           this.garantia = garantia;

}

   // metodos parametrizados

    public void aplicarDesconto(double porcentagem){

   // fazer verificação , porcentagem é maior que zero e menor que 100
    if(porcentagem > 0 && porcentagem <= 100){
        // metodo dentro de metodo
        double valorDesconto = calcularDesconto(porcentagem);
        // decrementar
        preco -= valorDesconto;
        
        System.out.println("desconto aplicado, o preço agora é: " + preco);
    }else {
        System.out.println("porcentagem incorreta");
    }
 }
     // formula de desconto
     public double calcularDesconto(double porcentagem){
         return (preco * porcentagem) / 100;
    }

   public void exibirInfo(){
          System.out.println("o produto: " + nome + ", está com o preço de: " + preco + ", e tem " + garantia + "meses de garantia ");
   }




























}
