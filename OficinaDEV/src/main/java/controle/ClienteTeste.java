package controle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.ClienteDAO;
import dao.ClienteDAOImpl;
import entidade.Cliente;
import entidade.Veiculo;


public class ClienteTeste {
	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = new ClienteDAOImpl();
		Cliente cliente = new Cliente();
		cliente.setCpf("12219");
		cliente.setNome("Otavio");
		cliente.setEmail("o@o.com");
		cliente.setTelefone("2345432");
		
				
		
		clienteDAO.inserirCliente(cliente);
		
		
		
		
	}

}
