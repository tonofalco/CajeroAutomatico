package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.CajeroAutomatico;

import Interface.Metodos;

public class LogicaMetodos implements Metodos {
	
	private List<CajeroAutomatico> lista = new ArrayList<CajeroAutomatico>();

	@Override
	public void guardar(CajeroAutomatico cajero) {
		// TODO Auto-generated method stub
		boolean bandera = false;

		for (CajeroAutomatico c : lista) {
			if (c.getNumCuenta() == cajero.getNumCuenta()) {
				System.out.println("ya existe ese numero de cuenta");
				bandera = true;
				break;
			}
		}

		if (bandera == false) {
			lista.add(cajero);
			System.out.println("Se guardo el registro con exito");
		}

	}

	@Override
	public CajeroAutomatico buscarXNumCuenta(int numeroCuenta) {
		// TODO Auto-generated method stub
		for (CajeroAutomatico c : lista) {
			if (c.getNumCuenta() == numeroCuenta) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void editarXNumCuenta(int numeroCuenta, CajeroAutomatico cajero) {
		// TODO Auto-generated method stub

		for (CajeroAutomatico c : lista) {
			if (c.getNumCuenta() == numeroCuenta) {
				lista.set(c.getNumCuenta(), cajero);
				break;
			}
			
		}
		
	}



}
