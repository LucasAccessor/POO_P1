

public class PessoaFisica extends Cliente{

    private String cpf;

    
    //getters & setters
    public String getCpf() {
        return cpf;  
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public String toString() { //sobrescreve o método dentro da classe
        return "nome: " + getNome() + 
               " cpf: " + cpf;
    }
}