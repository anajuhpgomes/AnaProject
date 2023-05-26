package comissao;

import leitor.Leitor;
import java.util.ArrayList;
public class ZonaDeVenda {
    String estado;
    long idZonaDeVenda;
    String nomeVendedor;

    public ZonaDeVenda(String caminho, int chave, String valorChave) throws Exception {
        Leitor leitor = new Leitor(caminho, chave, valorChave);

        ArrayList<String> zonasDeVenda = leitor.conteudo();

        String zonaDeVenda = zonasDeVenda.get(0);
        String[] campos = zonaDeVenda.split(";");

        this.estado = campos[0];
        this.nomeVendedor = campos [1];
        this.idZonaDeVenda = Long.parseLong(campos[2]);
    }

    @Override
    public String toString() {
        return "Zona: " + estado + ", Vendedor da Zona: " + nomeVendedor + ", ID da Zona: " + idZonaDeVenda;
    }
}