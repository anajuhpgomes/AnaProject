package comissao;

import java.util.ArrayList;

import leitor.Leitor;

public class Produto {
	String nomeProduto;
	double valor;
	CategoriaDoProduto categoria;

	public String getNomeProduto() {
		return nomeProduto;
	}
	public double getValor() {
		return valor;
	}

	public Produto(String caminho, int chave, String valorChave) throws Exception {
		Leitor leitor = new Leitor (caminho, chave, valorChave);
		ArrayList<String> produtos = leitor.conteudo();
		
		String produto = produtos.get(0);
		String[] campos = produto.split(";");
		
		this.nomeProduto = campos[0];
		this.valor = Double.parseDouble(campos[1]);
		this.categoria = new CategoriaDoProduto(valorChave);

		
	}

	public Produto (String nomeProduto) throws Exception{
		Leitor leitor = new Leitor ("src/Produtos.txt", 0, nomeProduto);

		ArrayList<String> produtos = leitor.conteudo();
		String produto = produtos.get(0);

		String[] campos = produto.split(";");

		this.nomeProduto = campos[0];
		this.valor = Double.parseDouble(campos[1]);
		this.categoria = new CategoriaDoProduto (nomeProduto);

	}

	@Override
	public String toString() {
		return " Produto [Nome: " + nomeProduto + ", Valor = " + valor + " " + categoria;
	}
}