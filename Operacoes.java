import javax.swing.JOptionPane;

public class Operacoes {
    
    //métodos menu

    public static void reservar(){
        boolean pgto = false;
        int tpPessoa = 0;
/*

        Reserva r = new Reserva(cliente, pgto)
        Restaurante.addReserva(r){

        }*/
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

    public String tipoPessoa(){
        int tpPessoa = 0;
        tpPessoa = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tipo de Pessoa: \n 1. Pessoa Fisica (CPF) \n 2. Pessoa Jurídica (CNPJ)"));
        do{

            switch(tpPessoa){
                case 1:
    
                    break;
                case 2:
    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro, por favor digite 1(CPF) ou 2(CNPJ)");
                    
            }

        } while (tpPessoa != 1 || tpPessoa != 2);
        return "ok";
    }
}
