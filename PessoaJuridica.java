
public class PessoaJuridica extends Cliente{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;  
    }


    @Override
    public String toString() { //sobrescreve o método dentro da classe
        return "[nome: " + getNome() + 
               " cnpj: " + getCnpj()  + "]";
    }
}


