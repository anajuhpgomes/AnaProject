package comissao;

public class Comissao extends CategoriaDoProduto {
    double comissaoVendedor;
    double comissaoRepresentante;

    Vendedor vendedor;
    String nomeVendedor;
    String zonaDeVenda;
    long idVendedor;

    RepresentanteDeVenda representanteDeVenda;
    String nomeRepresentante;
    long idRepresentante;
    String nomeRegiao;

    RegiaoDeVenda regiaoDeVenda;
    Produto produto;
    double valorProduto;
    String nomeProduto;

    String nomeCategoria;

    public Comissao (String nomeProduto) throws Exception {

        super(nomeProduto);

        this.vendedor = new Vendedor("São Paulo");

        this.nomeVendedor = vendedor.getNomeVendedor();
        this.zonaDeVenda = vendedor.getZonaDeVenda();
        this.idVendedor = vendedor.getIdVendedor();

        this.representanteDeVenda = new RepresentanteDeVenda("São Paulo");

        this.nomeRepresentante = representanteDeVenda.getNomeRepresentante();
        this.idRepresentante = representanteDeVenda.getIdRepresentante();

        this.regiaoDeVenda = new RegiaoDeVenda("sudeste");

        this.nomeRegiao = regiaoDeVenda.getNomeRegiao();

        this.produto = new Produto("notebook");

        this.nomeProduto = produto.getNomeProduto();
        this.valorProduto = produto.getValor();

        this.nomeCategoria = super.nomeCategoria;
        this.comissaoVendedor = super.comissaoVendedor;
        this.comissaoRepresentante = super.comissaoRepresentante;


    }

}
