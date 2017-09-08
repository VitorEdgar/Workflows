package business;


import java.util.ArrayList;

import business.Cliente.Genero;


public class DAO {

	private ArrayList<Cliente> clientes;

	public DAO() {
		clientes = new ArrayList<>();
	}

	public boolean add(Cliente c) {
		return clientes.add(c);
	}
	
	public boolean remove(String cpf) {
		boolean result = false;
		for (Cliente c : clientes) {
			if (c.getCpf().equals(cpf)) {
				clientes.remove(c);
				result = true;
			}
		}
		return result;
	}

	public Cliente pesquisaCPF(String cpf) {
		for (Cliente c : clientes) {
			if (c.getCpf().equals(cpf)) {
				return c;
			}
				
			
		}
		return null;
	}

	public void pesquisaTotalGenero() {
		int countmasc = 0, countfem = 0, counttotal = 0;
		for (Cliente c : clientes) {
			if (c.getSexo()==Genero.MASC ) {
				countmasc++;
			} else {
				countfem++;
			}
			counttotal++;
		}
		System.out.println("Total de clientes no bar: " + counttotal);
		System.out.println("Clientes masculinos presentes: " + countmasc);
		System.out.println("Clientes femininos presentes: " + countfem);
		int porcentmasc = (countmasc * 100) / counttotal;
		int porcentfem = (countfem * 100) / counttotal;
		System.out.println("Porcentagem de publico masculino: " + porcentmasc);
		System.out.println("Porcentagem de publico masculino: " + porcentfem);

	}
	
	public void pesquisaSocioCli() {
		int countcli = 0, countsoci = 0;
		for (Cliente c : clientes) {
			if(c instanceof ClienteSocio) {
				countsoci++;
			}else {
				countcli++;
			}
		}
		System.out.println("Clientes não socios no bar: " + countcli);
		System.out.println("Sócios no bar: " + countsoci);
	}
	
	
}
