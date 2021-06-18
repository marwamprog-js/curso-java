package principio.responsabilidade;

public class testeConta {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		
		bancaria.setDescricao("Conta bancaria do Marwam");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);

		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(2000);
		
		System.out.println(bancaria);
		
	}

}
