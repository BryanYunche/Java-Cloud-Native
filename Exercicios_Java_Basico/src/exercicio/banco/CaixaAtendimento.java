package exercicio.banco;

public class CaixaAtendimento {
	
	public static void main(String []args) {
		Banco contaBancaria = new Banco(400);
		
		contaBancaria.consultarSaldo();
		contaBancaria.consultarChequeEspecial();
		
		contaBancaria.depositarDinheiro(30);
		contaBancaria.consultarSaldo();
		
		contaBancaria.sacarDinheiro(60);
		contaBancaria.verificaUsoChequeEspecial();
		
		contaBancaria.consultarSaldo();
		
		contaBancaria.sacarDinheiro(410);
		contaBancaria.verificaUsoChequeEspecial();
		
		contaBancaria.consultarSaldo();
	}

}
