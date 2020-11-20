package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import util.JpaUtil;

public class ClienteDAOImpl implements ClienteDAO{

	@Override
	public void inserirCliente(Cliente cliente) {
		EntityManager ent = JpaUtil.getEntityManager();

		EntityTransaction trans = ent.getTransaction();
		trans.begin();

		ent.persist(cliente);

		trans.commit();
		ent.close();
	}

	@Override
	public void alterarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente pesquisarCliente(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
