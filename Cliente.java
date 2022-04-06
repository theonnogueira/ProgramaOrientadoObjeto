package OrientaçãoObjetos;

public class Cliente {
	
	//Atributos
	
	private String nome;
	private int idade;
	private int salario;
	
	//Métodos construtor
	
	public Cliente (String nome,int idade,int salario)
	{
		
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		
	}
	
	//Métodos Gerais
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public int getIdade(int idade)
	{
		return idade;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	
	public short getSalario(int salario)
	{
		return (short) salario;
		
	}
	
	public void setSalario(int salario)
	{
		this.salario = (int) salario;
	}
	
	public void printarInformacoes()
	{
		System.out.println("\n Nome do cliente: "+nome+" idade: "+idade+" com renda bruta individual: "+salario);
	}

}
