package OrientaçãoObjetos;

public class Aviao {

	//Atributos
	private String empresa;
	private int numeracao;
	
	//Métodos
	
	public Aviao (String empresa,int numeracao)
	{
		this.empresa = empresa;
		this.numeracao = numeracao;
		}
		
		
		//Métodos gerais
		
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
			System.out.println("\n Nome da empresa: "+empresa+"\n Númeração da nave: "+numeracao);
		}
}
