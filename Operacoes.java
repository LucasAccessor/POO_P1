import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operacoes {
    
    //métodos menu
	private static Restaurante restaurante = new Restaurante();
    
    private static ArrayList<Reserva> reservas = new ArrayList<>();

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
        reservas.add(r);
        restaurante.count++;
        if(restaurante.count > 6){
            JOptionPane.showMessageDialog(null, "Aviso, o cliente se encontra na lista de espera!");
        }
    }

    public static void pesquisarReserva(){
        String busca = null, msgResultado = null, avisoListEsp = null;
        boolean found = false;
        busca = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da reserva");
        for(int i = 0; i < reservas.size(); i++){
            if(reservas.get(i).getCliente() instanceof PessoaFisica){
                Cliente cliente = reservas.get(i).getCliente();
                PessoaFisica pf = (PessoaFisica) cliente;
                if(pf.getCpf().equals(busca)){
                    found = true;
                    if(i >= 6){ //verifica se está na lista de espera
                        avisoListEsp = "\nA reserva está na lista de espera";
                    } else {
                        avisoListEsp = "\nA reserva está na lista principal! (:";
                    }
                    msgResultado = "Parabéns, você possui uma reserva!";
                }
            }

            if(reservas.get(i).getCliente() instanceof PessoaJuridica){
                Cliente cliente = reservas.get(i).getCliente();
                PessoaJuridica pj = (PessoaJuridica) cliente;
                if(pj.getCnpj().equals(busca)){
                    found = true;
                    if(i >= 6){ //verifica se está na lista de espera
                        avisoListEsp = "\nA reserva está na lista de espera";
                    } else {
                        avisoListEsp = "\nA reserva está na lista principal! (:";
                    }
                    msgResultado = "Parabéns, você possui uma reserva!";
                }
            }
        }

        if(!found){
            msgResultado = "Não foi possível encontrar uma reserva com este dado ):";
            avisoListEsp = null;
        }

        JOptionPane.showMessageDialog(null, msgResultado + avisoListEsp);

    }

    public static void listarReservas(){
        //List<Reserva> reservas;
        //reservas = restaurante.getReservas();
        String lista = "lista das reservas: \n";
        if (reservas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma reserva até o momento!");
        } else {
            for(int i = 0; i < 6 && i < reservas.size(); i++){
                lista += Integer.toString(i+1) + ". " + reservas.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, lista);
        }
    }

    public static void listarEspera(){
        String lista = "lista das esperas: \n";
        if (reservas.size() <= 6) {
            JOptionPane.showMessageDialog(null, "Nenhuma reserva na lista de espera até o momento!");
        } else {
            for(int i = 6; i < reservas.size(); i++){
                lista += Integer.toString(i+1) + ". " + reservas.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, lista);
        }
    }

    public static void cancelamento(){
        String busca = null, msgResultado = null;
        boolean found = false;
        busca = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da reserva");
        for(int i = 0; i < reservas.size(); i++){
            if(reservas.get(i).getCliente() instanceof PessoaFisica){
                Cliente cliente = reservas.get(i).getCliente();
                PessoaFisica pf = (PessoaFisica) cliente;
                if(pf.getCpf().equals(busca)){
                    found = true;
                    reservas.remove(i);
                    msgResultado = "Reserva removida com sucesso \n Uma pena te ver partir  ):";
                    restaurante.count--;
                }
            }

            if(reservas.get(i).getCliente() instanceof PessoaJuridica){
                Cliente cliente = reservas.get(i).getCliente();
                PessoaJuridica pj = (PessoaJuridica) cliente;
                if(pj.getCnpj().equals(busca)){
                    found = true;
                    reservas.remove(i);
                    msgResultado = "Reserva removida com sucesso \n Uma pena te ver partir  ):";
                    restaurante.count--;
                }
            }
        }

        if(!found){
            msgResultado = "Não foi possível encontrar uma reserva com este dado ):";
        }

        JOptionPane.showMessageDialog(null, msgResultado);

    }

}
