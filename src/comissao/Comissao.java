package comissao;

import data.Data;

public class Comissao extends CategoriaDoProduto {
    double comissaoVendedor;
    double comissaoRepresentante;

    Vendedor vendedor;
    String nomeVendedor;
    String zonaDeVenda;
    long idVendedor;

    Pedido pedido;
    int idPedido;
    Data dataPedido;
    double valorPedido;

    RepresentanteDeVenda representanteDeVenda;
    String nomeRepresentante;
    long idRepresentante;

    Cliente cliente;
    String nomeCliente;
    String cpf;
    String UFCliente;

    RegiaoDeVenda regiaoDeVenda;
    String nomeRegiao;

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

        this.produto = new Produto(nomeProduto);

        this.nomeProduto = produto.getNomeProduto();
        this.valorProduto = produto.getValor();

        this.pedido = new Pedido("./src/Pedido.txt", 0, "1");

        this.idPedido = pedido.getIdPedido();
        this.cpf = pedido.getCpf();
        this.dataPedido = pedido.getDataPedido();
        this.valorPedido = pedido.getValorPedido();

        this.cliente = new Cliente ("./src/Cliente.txt", 0, "123");
        this.nomeCliente = cliente.getNomeCliente();
        this.UFCliente = cliente.getUFCliente();

        this.nomeCategoria = super.nomeCategoria;
        this.comissaoVendedor = super.comissaoVendedor;
        this.comissaoRepresentante = super.comissaoRepresentante;

        comissaoVendedor = (this.comissaoVendedor / 100) * valorProduto;
        comissaoRepresentante = (this.comissaoRepresentante / 100) * valorProduto;
    }
    @Override
    public String toString() {
        return "Pedido: [Id: " + idPedido + ", Data: " + dataPedido + ", Valor: R$" + valorPedido + ", Produto: " + nomeProduto + ", Categoria do produto: " + nomeCategoria + ", Valor do produto: " + valorProduto + "]" + "\nNome do cliente: "+ nomeCliente + ", CPF: " + cpf + ", UF: " + UFCliente +  "\nNome do vendedor: " + nomeVendedor + ", ID: " + idVendedor + ", Comissão do Vendedor: R$" + comissaoVendedor + ", Zona de venda: " + zonaDeVenda + "\nRegião de venda: " + nomeRegiao + ", Nome do representante da região: " + nomeRepresentante + ", ID: " + idRepresentante + ", Comissão do Representante: R$" + comissaoRepresentante;
    }

}
