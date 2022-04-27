import javax.swing.JOptionPane;

public class Operacoes {
    
    //métodos menu
	private static Restaurante restaurante = new Restaurante();

    public static void reservar(){
        boolean pgto = false;
        int tpPessoa = 0, selPagto = 0;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o nome para a reserva");

        Cliente cliente = null;
        
        do{
            tpPessoa = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tipo de Pessoa: \n 1. Pessoa Fisica (CPF) \n 2. Pessoa Jurídica (CNPJ)"));
            switch(tpPessoa){
                case 1:
                    PessoaFisica pf = new PessoaFisica();
                    pf.setCpf(JOptionPane.showInputDialog("Pessoa Física \n Digite o CPF"));
                    cliente = pf;
                    break;
                case 2:
                    PessoaJuridica pj = new PessoaJuridica();
                    pj.setCnpj(JOptionPane.showInputDialog("Pessoa Jurídica \n Digite o CNPJ"));
                    cliente = pj;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro, por favor digite 1(CPF) ou 2(CNPJ)");
                    
            }

        }while (tpPessoa != 1 && tpPessoa != 2);

        do {
            selPagto = Integer.parseInt(JOptionPane.showInputDialog("Digite a Forma de Pagamento: \n 1. Pagamento à Vista \n 2. Pagamento à Prazo"));
            switch(selPagto){
                case 1:
                    pgto = true;
                    break;
                case 2:
                    pgto = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro, por favor digite 1(Pagamento à Vista) ou 2(Pagamento à Prazo)");
                    
            }
        } while (selPagto != 1 && selPagto != 2);

        cliente.setNome(nome);
        Reserva r = new Reserva(cliente, pgto);
        restaurante.addReserva(r);
        restaurante.count++;
        if(restaurante.count > 6){
            JOptionPane.showMessageDialog(null, "Aviso, o cliente se encontra na lista de espera!");
        }
    }

    public static void pesquisarReserva(){
        
    }

    public static void listarReservas(){
        
    }

    public static void listarEspera(){
        
    }

    public static void cancelamento(){
        
    }


    //metodos extras

}
