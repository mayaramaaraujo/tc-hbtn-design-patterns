public class PedidoBuilder extends PedidoAbstractBuilder{
    private Pedido pedido = new Pedido();

    @Override
    void setLanche(TipoLanche tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.LANCHE);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.BATATA);
        itemPedido.setNome(tamanho.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.BRINDE);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBebida(TipoBebida tipo) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.BEBIDA);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemForaCaixa(itemPedido);
    }

    public Pedido build() {
        return pedido;
    }
}
