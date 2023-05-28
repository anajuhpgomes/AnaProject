package comissao;

import java.util.ArrayList;

import leitor.Leitor;

public class CategoriaDoProduto {
	String nomeCategoria;
	double comissaoVendedor;
	double comissaoRepresentante;
	
	public CategoriaDoProduto(String nomeProduto) throws Exception {
		Leitor leitor = new Leitor ("src/CategoriasDeProduto.txt", 0, nomeProduto);
		ArrayList<String> categorias = leitor.conteudo();
		
		String categoria = categorias.get(0);
		String[] campos = categoria.split(";");
		
		
		this.nomeCategoria = campos [1];
		this.comissaoVendedor = Double.parseDouble(campos[2]);
		this.comissaoRepresentante = Double.parseDouble(campos[3]);
		
	}

	@Override
	public String toString() {
		return "Categoria do Produto: " + nomeCategoria;
	}
}

