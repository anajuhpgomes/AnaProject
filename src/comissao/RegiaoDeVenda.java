package comissao;

import java.util.ArrayList;

import leitor.Leitor;

public class RegiaoDeVenda {
	String nomeRegiao;
	long idRegiao;

	public String getNomeRegiao() {
		return nomeRegiao;
	}

	public long getIdRegiao(){
		return idRegiao;
	}

	public RegiaoDeVenda(String regiao) throws Exception {
		Leitor leitor = new Leitor("src/RegioesDeVenda.txt", 0, regiao);

		ArrayList<String> regioesDeVenda = leitor.conteudo();
		String regiaoDeVenda = regioesDeVenda.get(0);

		String[] campos = regiaoDeVenda.split(";");

		this.nomeRegiao = campos[0];
		this.idRegiao = Long.parseLong(campos[1]);
	}

	@Override
	 public String toString() {
	        return "Região: [" + nomeRegiao + ", ID: " + idRegiao + "]";
	    }
}