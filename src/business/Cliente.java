package business;

public class Cliente {
	
	public enum Genero { MASC, FEM };
	
	private String nome, cpf;
	private int idade;
	private Genero sexo;
	private static int totalClientes = 0, totalHomens = 0, totalMulheres = 0;
	
	public Cliente(String nome, String cpf, int idade, Genero sexo)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		totalClientes++;
		
		if(sexo==Genero.MASC) totalHomens++;
		else totalMulheres++;
		
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getCpf()
	{
		return cpf;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public Genero getSexo()
	{
		return sexo;
	}
	
	public int total()
	{
		return totalClientes;
	}
	
	public double percentualHomens()
	{
		return 100 * (double)totalHomens / (double)totalClientes;
	}
	
	public double percentualMulheres()
	{
		return 100 * (double)totalMulheres / (double)totalClientes;
	}
	
}

