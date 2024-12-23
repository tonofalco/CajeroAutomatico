package Interface;


import Dominio.CajeroAutomatico;



public interface Metodos {
	
	public void guardar(CajeroAutomatico cajero);
	
	public CajeroAutomatico buscarXNumCuenta(int numeroCuenta);
	
	public void editarXNumCuenta(int numeroCuenta, CajeroAutomatico cajero);
	

}
