package secao20;

// usando extends para usar atributos da superclasse

 public class Cachorro extends Animal {
    
     // é obrigado a usar as propriedades da classe pai

        public Cachorro(String nome) {
        // precisa usar a palavra super para usar os atributos da classe pai

         super(nome);
        }

         public void latir() {
         System.out.println(nome + "esta latindo!");
    }


}
