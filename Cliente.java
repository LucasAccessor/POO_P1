

public abstract class Cliente {

    private String nome;

    //construtor  
    public Cliente(){
    
    }

    //getters & setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() { 
        return "nome: " + getNome();
    }


}