package comissao;

import java.util.ArrayList;
import java.util.Arrays;

import data.Data;
import leitor.Leitor;

public class Cliente {
	private String cpf;
	private String nome;
	private String estado;
	private Pedido[] pedidos;

	public String getNomeCliente(){
		return nome;
	}

	public String getUFCliente(){
		return estado;
	}


	public Cliente(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> clientes = leitor.conteudo();
		String cliente = clientes.get(0);
		String[] campos = cliente.split(";");
		this.cpf = campos[0];
		this.nome = campos[1];
		this.estado = campos[2];

		String caminhoPedido = "./src/Pedido.txt";
        int chavePedido = 1;
        String valorChavePedido = this.cpf;
		leitor = new Leitor(caminhoPedido, chavePedido, valorChavePedido);
		ArrayList<String> pedidos = leitor.conteudo();
		int qtPedidos = pedidos.size();
		this.pedidos = new Pedido[qtPedidos]; 
		int indicePedido = 0;
		for (String pedidoAux : pedidos) {
			 campos = pedidoAux.split(";");
			 int idPedido = Integer.parseInt(campos[0]);
		     String cpf = campos[1];
		     String[] campoData = campos[2].split("/");
		     int dia = Integer.parseInt(campoData[0]);
		     int mes = Integer.parseInt(campoData[1]);
		     int ano = Integer.parseInt(campoData[2]);
		     Data dataPedido = new Data(dia,mes,ano);
		     double valor = Double.parseDouble(campos[3]);
		     Pedido pedido = new Pedido(idPedido,cpf,dataPedido,valor);
		     this.pedidos[indicePedido] = pedido;
		     indicePedido =+ 1;
		}

	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", UF: " + estado + ", pedidos=" + Arrays.toString(pedidos) + "]";
	}
}