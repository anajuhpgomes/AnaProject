package teste;

import comissao.Vendedor;

public class VendedorTeste {
    public static void main(String[] args) throws Exception {
        Vendedor vendedor = new Vendedor("src/Vendedores.txt", 0, "Ana Julia");

        System.out.println(vendedor);
    }
}

