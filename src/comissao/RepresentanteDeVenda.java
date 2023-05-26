package comissao;

import leitor.Leitor;

import java.util.ArrayList;

public class RepresentanteDeVenda {
    String nomeRepresentante;
    long ID;
    RegiaoDeVenda regiaoDeVenda;

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public long getIdRepresentante() {
        return ID;
    }


    public RepresentanteDeVenda(String estado) throws Exception {
        Leitor leitor = new Leitor("src/RepresentanteDeVenda.txt", 0, estado);
        ArrayList<String> representantes = leitor.conteudo();

        String representante = representantes.get(0);
        String[] campos = representante.split(";");

        regiaoDeVenda = new RegiaoDeVenda(campos[1]);
        this.nomeRepresentante = campos[2];
        this.ID = Long.parseLong(campos[3]);
    }

    @Override
    public String toString() {
        return "\n--->Representante de Venda [nome: " + nomeRepresentante + ", ID: " + ID + regiaoDeVenda;
    }
}