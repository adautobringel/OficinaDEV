package dao;

import java.util.List;

import entidade.Cliente;

public interface ClienteDAO {
	public void inserirCliente(Cliente cliente);
	public void alterarCliente(Cliente cliente);
	public void excluirCliente(Cliente cliente);
	public Cliente pesquisarCliente(String cpf);
	public List<Cliente> listarTodos();
}
