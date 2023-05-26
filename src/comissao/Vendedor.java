package comissao;

import java.util.ArrayList;
import leitor.Leitor;

public class Vendedor {
    String nomeVendedor;
    String zonaDeVenda;
    long idVendedor;
    RepresentanteDeVenda representanteDeVenda;

    public String getNomeVendedor(){
        return nomeVendedor;
    }

    public String getZonaDeVenda(){
        return zonaDeVenda;
    }

    public long getIdVendedor(){
        return idVendedor;
    }

    public Vendedor(String caminho, int index, String nomeVendedor) throws Exception {
        Leitor leitor = new Leitor(caminho, index, nomeVendedor);
        ArrayList<String> vendedores = leitor.conteudo();

        String vendedor = vendedores.get(0);
        String[] campos = vendedor.split(";");

        this.nomeVendedor = campos[0];
        this.zonaDeVenda = campos[1];
        this.idVendedor = Long.parseLong(campos[2]);
    }

    public Vendedor(String estado) throws Exception {
        Leitor leitor = new Leitor("src/Vendedores.txt", 1, estado);
        ArrayList<String> vendedores = leitor.conteudo();

        String vendedor = vendedores.get(0);
        String[] campos = vendedor.split(";");

        this.nomeVendedor = campos[0];
        this.zonaDeVenda = campos[1];
        this.idVendedor = Long.parseLong(campos[2]);
    }

    @Override
    public String toString() {
        return "\n--->Vendedor [Nome do Vendedor: " + nomeVendedor + ", Zona de Venda: " + zonaDeVenda + ", ID: " + idVendedor + "]";
    }
}
