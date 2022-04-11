package controle_modelo;

import modelo.Animal;

public class Executando_Animal {
     
    public static void main(String[] args) {
        //método construtor simples
        Animal a1 = new Animal(); 
        a1.setNome("Cavalo");
        a1.setHabitat("Campos Verdes");
        a1.setPeso(200);
        a1.setOrigem("Ásia");
        a1.setPerigoso(false);
        
        Animal a2 = new Animal();
        a2.setNome("Elefante");
        a2.setPeso(343);
        
        System.out.println( a1.detalhes_Animal() );
            
        System.out.println( a2.peso_Animal() );
        
        
    }
}
