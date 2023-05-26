package teste;

import comissao.Produto;

public class ProdutoTeste {
    public static void main(String[] args) throws Exception{
        Produto produto = new Produto("src/Produtos.txt", 0, "notebook");
        System.out.println(produto);

        Produto produto1 = new Produto("microondas");
        System.out.println(produto1);
    }
}
