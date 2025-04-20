package cesao17;

public class produto {
    


private String nome;
private double preco;

// cria um metordo

public void setnome(String nome){
    // se tudas essas condicoes forem atendidas, vou alterar o nome
    if(nome != null && !nome.isEmpty() && nome.length() > 3){
                this.nome = nome;
    // se nao, enviar uma mensagem de nao conformidade
    }else{
        System.out.println("o nome enviado nao atende aos criterios!");
    }
}
// resgata nome com letra miuscula touppercase
public String getnome(){
    return nome.toUpperCase();
}

public void setpreco(double preco){
    if(preco > 0){
         this.preco = preco;
    }else{
        System.out.println("preço precisa ser positivo");
    }


}

public String getpreco(){

    // metodo (format) limita a quantidade de casas decimais
    // sintaxe %.2f
   return String.format("preço: R$%.2f " , preco);
   
}
    
    public String getprodutoInfo(){

        return "Nome: " + this.getnome() +  " " + this.getpreco();   
      }

    public void aplicarDesconto(double porcentagem){
        // primeiro se faz a validação
        // logica de aplicaçãp de desconto
        if(porcentagem > 0 && porcentagem <= 100 ){

           double desconto = calcularDesconto( porcentagem);

             double precoFinal = this.preco -= desconto;
             this.setpreco(precoFinal);

              System.out.println("desconto de " + porcentagem + " % aplicado!");

              System.out.println(this.getprodutoInfo());
        }else{
            System.out.println("porcentagem de desconto invalida!");
        }
    }

    private double calcularDesconto(double porcentagem){
        return (this.preco * porcentagem) / 100;
    }
























}
