package Dominio;

public class CajeroAutomatico {

	int numCuenta;
	String cliente;
	float saldo;

	public CajeroAutomatico() {
	}

	public CajeroAutomatico(int numCuenta, String cliente,  float saldo) {
		this.numCuenta = numCuenta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	

	@Override
	public String toString() {
		return "CajeroAutomatico [numCuenta=" + numCuenta + ", cliente=" + cliente + ", saldo="
				+ saldo + "]\n";
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

	
}
