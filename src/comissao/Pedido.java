package comissao;

import java.util.ArrayList;

import data.Data;
import leitor.Leitor;

public class Pedido {
	private int idPedido;
	private String cpf;
	private Data dataPedido;
	private double valorPedido;


	public Pedido(int idPedido, String cpf, Data dataPedido, double valor) {
		this.idPedido = idPedido;
		this.cpf = cpf;
		this.dataPedido = dataPedido;
		this.valorPedido = valor;
	}

	public int getIdPedido(){
		return idPedido;
	}

	public String getCpf(){
		return cpf;
	}

	public Data getDataPedido(){
		return dataPedido;
	}

	public double getValorPedido(){
		return  valorPedido;
	}

	public Pedido(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor(caminho, chave, valorChave);
		ArrayList<String> pedidos = leitor.conteudo();
		String pedido = pedidos.get(0);
		String[] campos = pedido.split(";");
        this.idPedido = Integer.parseInt(campos[0]);
        this.cpf = campos[1];
        String[] campoData = campos[2].split("/");
        int dia = Integer.parseInt(campoData[0]);
        int mes = Integer.parseInt(campoData[1]);
        int ano = Integer.parseInt(campoData[2]);
        this.dataPedido = new Data(dia,mes,ano);
        this.valorPedido = Double.parseDouble(campos[3]);
	}

	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cpf=" + cpf + ", dataPedido=" + dataPedido + ", valor="
				+ valorPedido + "]";
	}


}