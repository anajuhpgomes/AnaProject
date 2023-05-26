package teste;

import comissao.ZonaDeVenda;

public class ZonaDeVendaTeste {
    public static void main (String[] args) throws Exception{
        ZonaDeVenda zonaDeVenda = new ZonaDeVenda("src/ZonaDeVenda.txt", 0, "São Paulo");
        System.out.println(zonaDeVenda);
    }
}
