package Orienta��oObjetos;

public class Aviao {

	//Atributos
	private String empresa;
	private int numeracao;
	
	//M�todos
	
	public Aviao (String empresa,int numeracao)
	{
		this.empresa = empresa;
		this.numeracao = numeracao;
		}
		
		
		//M�todos gerais
		
	public String getEmpresa()
	{
		return empresa;		
}
	
	public void setEmpresa(String empresa)
	{
		this.empresa = empresa;
	}
		public int getNumeracao()
		{
			return numeracao;
			
		}
		public void setNumeracao(int numeracao)
		{
			this.numeracao = numeracao;
			
		}
		public void Impressao()
		{
			System.out.println("\n Nome da empresa: "+empresa+"\n N�mera��o da nave: "+numeracao);
		}
}
