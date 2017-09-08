package business;

public class BO {

	private DAO dao = new DAO();

	public BO(DAO dao) {
		this.dao = dao;
	}

	public BO() {
	}

	public boolean add(Cliente c) {
		if (validaCliente(c)) {
			return dao.add(c);
		}
		return false;
	}
	public boolean remove(String cpf){
		if(cpf.length() == 11){
			return dao.remove(cpf);
		}
		return false;
	}
	public Cliente pesquisaCPF(String cpf){
		if(cpf.length() == 11){
			return dao.pesquisaCPF(cpf);
		}
		return null;
	}
	public void pesquisaTotalGenero(){
		dao.pesquisaTotalGenero();
	}
	public void pesquisaSocioCli(){
		dao.pesquisaTotalGenero();
	}

	public boolean validaCliente(Cliente c) {
		if (c == null || c.getNome() == null || c.getCpf() == null) {
			return false;
		}
		return true;
	}

}
