package OrientaçãoObjetos;

public class ProdutoEletronico {

	//Atributos
	
		private String marca;
		private double ip;
		private int mac;
		
	//Métodos construtores
		
		public ProdutoEletronico (String marca, double ip, int mac)
		{
			this.marca = marca;
			this.ip = ip;
			this.mac =mac;
		}
		
		public void Imprima()
		{
		
			System.out.println("\n A marca do seu produto eletrônico: "+marca+"\n IP do aparelho "+ip+"\n MAC "+mac);
		}
}
		
