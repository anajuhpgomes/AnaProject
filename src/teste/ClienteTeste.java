package teste;

import comissao.Cliente;

public class ClienteTeste {
	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente ("./src/Cliente.txt", 0, "123");

		System.out.println("--->" + cliente);
	}
}