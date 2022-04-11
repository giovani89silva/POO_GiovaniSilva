package modelo;

public class Animal {
    
    //Atributos
    private String nome;
    private String habitat;
    private int peso;
    private String origem;
    private boolean perigoso;
    public boolean detalhes_Animal;
    
    public String peso_Animal(){
        System.out.println(" O  " + this.nome +  " tem " +  this.peso +  " quilos! ");
        return "";
    }
 
    public String detalhes_Animal(){
        System.out.println("-----------ANIMAL-------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Habitat: " + this.habitat);
        System.out.println("Peso: " + this.peso);
        System.out.println("Origem: " + this.habitat);
        System.out.println("É Perigoso?: " + this.perigoso + "\n");
        return "";
    }
          
    //Método construtor simples
    public Animal() {   
    }
    
    //Método construtor completo
    public Animal(String nome, String habitat, int peso, String origem, boolean perigoso) {
        this.nome = nome;
        this.habitat = habitat;
        this.peso = peso;
        this.origem = origem;
        this.perigoso = perigoso;
    }
    
    //Terceiro Método Construtor
    public Animal (String nome, String habitat, int peso, String origem) {
        this.nome = nome;
        this.habitat = habitat;
        this.peso = peso;
        this.origem = origem;
        this.perigoso = false;
      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }
}

    
    
   

