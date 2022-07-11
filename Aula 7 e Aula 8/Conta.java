
public class Conta {
	private double saldo;
	public boolean sacar (double val) throws SemSaldoException {
		if (saldo > val) {
			saldo -= val;
			return true;
		}
		else
			throw new SemSaldoException("" + saldo);
	}
	public void depositar (double val) {
		saldo += val;
	}
}