public class Reserva implements Pagamento{
    
    private Cliente cliente;
    private boolean pagamentoAvista;

    public Reserva(Cliente cliente,  boolean pagamentoAVista){
        this.setCliente(cliente);
        this.pagamentoAvista = pagamentoAVista;
    }

    public double calcularPagamento(){
        double pagto = 3200.00;
        if(pagamentoAvista){
            pagto -= pagto * 0.1;
        } 
        return pagto;
    }

    @Override
    public String toString() { 
        Cliente c = null;
        c = cliente;
        String txtPgto, toStrg = "";
        // forma de pagamento
        if(pagamentoAvista){
            txtPgto = "à Vista";
        } else {
            txtPgto = "à Prazo";
        }
        // tipo pessoa
        if(c instanceof PessoaFisica){
            toStrg = "tipo cliente: Pessoa Física, "  +"nome: " + cliente.getNome() + ", Forma de Pagto: " + txtPgto;
        } else if (c instanceof PessoaJuridica) {
            toStrg = "tipo cliente: Pessoa Jurídica, "  +"nome: " + cliente.getNome() + ", Forma de Pagto: " + txtPgto;
        }

        return toStrg;
    }


    //getters & setters

    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean getPagamentoAVista() {
        return pagamentoAvista;
    }


    public void setPagamentoAVista(boolean pagamentoAvista) {
        this.pagamentoAvista = pagamentoAvista;
    }


   
}
