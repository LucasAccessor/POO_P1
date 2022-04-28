
import javax.swing.JOptionPane;

public class Main{

	// FEITO POR LUCAS ACCESSOR - 177350

    public static void main(String[] args) {
    
		int sel = 0;


		do {
			sel = Integer.parseInt(JOptionPane.showInputDialog(menu()));
			if (sel < 1 || sel > 6) {
				JOptionPane.showMessageDialog(null, "Opção inválida ):");
			} else {
				switch(sel) {
				case 1: // reserva mesa
					Operacoes.reservar();
					break;
				case 2: // pesquisar reserva  
					Operacoes.pesquisarReserva();
					break; 
				case 3: // imprimir lista de reservas
					Operacoes.listarReservas();
					break;
				case 4: // imprimir lista de espera
					Operacoes.listarEspera();
					break;
				case 5: // cancelar reserva
					Operacoes.cancelamento();
					break;
				case 6: // fim
					JOptionPane.showMessageDialog(null, "Obrigado! \n Feito por Lucas Accessor - 177350");
					break;
				}
			}
			
		} while (sel != 6);
		
		
    }

    public static String menu() {
		String mensagemMenu = "Restaurante Sabor Sofisticado \n";
		mensagemMenu += "Escolha um opção: \n";
		mensagemMenu += "1. Reservar Mesa \n";
		mensagemMenu += "2. Pesquisar Reserva \n";
		mensagemMenu += "3. Imprimir Reserva \n";
		mensagemMenu += "4. Imprimir Lista de Espera \n";
		mensagemMenu += "5. Cancelar Reserva \n";
		mensagemMenu += "6. Encerrar a Aplicação \n";
		return mensagemMenu;
	}

}