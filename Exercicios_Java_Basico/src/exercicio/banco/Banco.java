package exercicio.banco;

public class Banco {
	
	private float saldo;
	private float chequeEspecial;
	private float taxaChequeEspecial = 0;

	public Banco(float saldo) {
		
		if(saldo <= 500) {
			this.saldo = saldo;
			this.chequeEspecial = 50;
		}else{
			this.saldo = saldo;
			this.chequeEspecial = saldo/2;
		}	
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo é: " + this.saldo);
	}
	
	public void consultarChequeEspecial() {
		System.out.println("Seu cheque especial é: " + this.chequeEspecial);
	}
	
	public void depositarDinheiro(float deposito){
		this.saldo = this.saldo + deposito;
	}
	
	private boolean subtrairDinheiro(float quantia) {
		float saldoTotal = this.saldo + this.chequeEspecial;
		float usoChequeEspecial = 0;
		float usoSaldo = 0;
		
		if(quantia > this.saldo) {
			if(quantia > saldoTotal) {	
				return false;
			}else if(quantia <= saldoTotal) {
				usoChequeEspecial = Math.abs(saldoTotal - quantia);
				usoSaldo = Math.abs(this.chequeEspecial - quantia);
				this.saldo = this.saldo - usoSaldo;				
				this.chequeEspecial = this.chequeEspecial - usoChequeEspecial;
				this.taxaChequeEspecial = (float) (usoChequeEspecial*0.2);
				return true;
			}
		}else if (quantia <= this.saldo) {
			this.saldo = this.saldo - quantia;
			return true;
		}
		
		return false;
	}
	
	public void sacarDinheiro(float sacar) {
		boolean validaTransacao = this.subtrairDinheiro(sacar);
		
		if(validaTransacao) {
			System.out.println("A transação foi um sucesso!");
		}else {
			System.out.println("A transação não pode ocorrer pois seu saldo é insuficiente!");
		}
	}
	
	public void verificaUsoChequeEspecial() {
		if (this.taxaChequeEspecial > 0) {
			System.out.println("Você está usando seu cheque especial!");
			System.out.println("Sua taxa de uso do cheque especial é: " + this.taxaChequeEspecial);
			
		}else {
			System.out.println("Você não está usando seu cheque especial!");
		}
	}
	
	
	
}


