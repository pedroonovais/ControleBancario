package model.entities;

import model.exceptions.ValorInvalidoexceptions;

public class ContaPoupanca extends Conta {

	private double reajusteMensal;

	public ContaPoupanca(double saldo, double reajusteMensal) {
		super(saldo);
		this.reajusteMensal = reajusteMensal;
	}

	public void atualizarSaldo(double reajuste) {
		if (reajuste <= 0) {
			throw new ValorInvalidoexceptions("Valor de Reajuste Invalido.");
		}
		this.setSaldo(this.getSaldo()+(this.getSaldo()*reajuste/100));
		this.reajusteMensal = (reajuste);
	}
	
	@Override
	public String toString() {
		return "Saldo: " + this.getSaldo() + "\nReajuste Mensal: " + reajusteMensal;
	}
}
