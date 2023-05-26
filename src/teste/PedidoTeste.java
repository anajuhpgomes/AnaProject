package teste;

import comissao.Pedido;

public class PedidoTeste {
	public static void main(String[] args) throws Exception {
		Pedido pedido = new Pedido("./src/Pedido.txt", 0, "1");

		System.out.println("--->" + pedido);
	}
}
