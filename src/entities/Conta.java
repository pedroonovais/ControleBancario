package entities;

public class Conta {
	
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void atualizarSaldo(double valor) {
		if (saldo < 0) {
			double val = saldo * 0.08;
			saldo -= val;
		}
	}
}
