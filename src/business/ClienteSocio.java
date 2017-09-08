package business;

public class ClienteSocio extends Cliente {

	private String numeroSocio;
	
	public ClienteSocio(String nome, String cpf, int idade, Genero sexo, String numeroSocio) {
		
		super(nome, cpf, idade, sexo);
		this.numeroSocio = numeroSocio;
		
	}

	public String getNumeroSocio()
	{
		return numeroSocio;
	}
	
}
