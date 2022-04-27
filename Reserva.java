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
        return "nome: " + cliente.getNome() + "";
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
