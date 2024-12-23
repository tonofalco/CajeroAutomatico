package Main;

import java.util.Scanner;

import Dominio.CajeroAutomatico;
import Implementacion.LogicaMetodos;

public class Index {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner lectura = null;

		// lectura
		int numCuenta, menuPrinc, indice;
		String cliente = "";
		float monto = 0;
		float saldo = 0;

		CajeroAutomatico cajero = null;

		// Instancia de clase
		LogicaMetodos imp = new LogicaMetodos();

		do {

			System.out.println("\n***MENU BANCOMER BIENVENIDO***");
			System.out.println("1.-ALTA USUARIO");
			System.out.println("2.-CONSULTAR SALDO");
			System.out.println("3.-DEPOSITO EN EFECTIVO");
			System.out.println("4.-RETIRO EN EFECTIVO");
			System.out.println("5.-SALIR");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingresa el numero de cuenta");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					System.out.println("Ingresa el nombre del cliente");
					lectura = new Scanner(System.in);
					cliente = lectura.nextLine();

					

					cajero = new CajeroAutomatico(numCuenta, cliente, saldo);

					// Agregar a la lista
					imp.guardar(cajero);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar: " + e.getMessage());

				}

				break;
			case 2:
				try {
					System.out.println("Ingresa el numero de casa a buscar");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					cajero = imp.buscarXNumCuenta(numCuenta);

					if (cajero == null) {
						System.out.println("No existe ese numero de cuenta");
					} else {
						System.out.println("\n_________________________________");
						System.out.println("Se encontro la cuenta " + cajero.getNumCuenta() + " del usuario "
								+ cajero.getCliente() + " saldo de: " + cajero.getSaldo());
					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar: " + e.getMessage());
				}

				break;

			case 3:
				try {

					System.out.println("Ingresa el numero de cuenta a Depositar");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					// buscar
					cajero = imp.buscarXNumCuenta(numCuenta);
					if (cajero != null) {
						System.out.println("\n_________________________________");
						System.out.println("Se encontro la cuenta " + cajero.getNumCuenta() + " del usuario "
								+ cajero.getCliente() + " saldo de: " + cajero.getSaldo());

						System.out.println("ingresa el monto a Depositar");
						lectura = new Scanner(System.in);
						monto = lectura.nextFloat();

						if (monto <= 0 || monto >= 10000) {

							System.out.println("cantidad rechazada, porfavor pase a un cajero para mayor informacion");

						} else if (monto >= 0 && monto <= 10000) {

							cajero.setSaldo(cajero.getSaldo() + monto);

							System.out.println("Deposito realizado!");
							System.out.println("Saldo Actualizado del usuario " + cajero.getCliente() + " es de: "
									+ cajero.getSaldo());

							imp.editarXNumCuenta(numCuenta, cajero);
						}
					} else {
						System.out.println("No existe ese numero de cuenta");
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

				break;

			case 4:
				try {

					System.out.println("Ingresa el numero de cuenta a Depositar");
					lectura = new Scanner(System.in);
					numCuenta = lectura.nextInt();

					// buscar
					cajero = imp.buscarXNumCuenta(numCuenta);
					if (cajero != null) {
						System.out.println("\n_________________________________");
						System.out.println("Se encontro la cuenta " + cajero.getNumCuenta() + " del usuario "
								+ cajero.getCliente() + " saldo de: " + cajero.getSaldo());

						System.out.println("ingresa el monto a Depositar");
						lectura = new Scanner(System.in);
						monto = lectura.nextFloat();

						if (monto <= 0 || monto >= 10000) {

							System.out.println("cantidad rechazada, porfavor pase a un cajero para mayor informacion");

						} else if (monto >= 0 && monto <= 10000) {

							cajero.setSaldo(cajero.getSaldo() + monto);

							System.out.println("Retiro realizado!");
							System.out.println("Saldo Actualizado del usuario " + cajero.getCliente() + " es de: "
									+ cajero.getSaldo());

							imp.editarXNumCuenta(numCuenta, cajero);
						}
					} else {
						System.out.println("No existe ese numero de cuenta");
					}

				} catch (Exception e) {
					// TODO: handle exception
				}

				break;

			case 5:
				break;

			}
		} while (menuPrinc < 5);

	}
}
