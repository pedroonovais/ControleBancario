package model.entities;

import model.exceptions.ValorExcedenteexceptions;
import model.exceptions.ValorInvalidoexceptions;

public class ContaCorrente extends Conta{

	private double limiteEspecial;

	public ContaCorrente(double saldo, double limiteEspecial) {
		super(saldo);
		this.limiteEspecial = limiteEspecial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	@Override
	public void sacar(double valor) throws ValorInvalidoexceptions {
		if(valor < this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
		}
		else if (valor > this.getSaldo() && (valor - this.getSaldo()) < limiteEspecial) {
			this.setSaldo(this.getSaldo() - valor);
		}
		else if (valor <= 0){
			throw new ValorInvalidoexceptions("Valor Invalido!");
		}
		else {
			throw new ValorExcedenteexceptions("Valor Excedeu o saldo e o limite especial");
		}
	}
	
	@Override
	public String toString() {
		return "Saldo: " + this.getSaldo() + "\nLimite Especial: " + limiteEspecial;
	}
}
