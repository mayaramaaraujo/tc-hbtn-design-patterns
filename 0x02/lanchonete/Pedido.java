import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    @Override
    public String toString() {

        return "\tFora da Caixa:\n" +
                itensForaCaixa.toString().replace("[","")
                        .replace("]", "")
                        .replace(",", "\n") + "\n" +
                "\tDentro da Caixa:\n" +
                itensDentroCaixa.toString().replace("[","")
                        .replace("]", "")
                        .replace(",", "\n") + "\n";
    }
}
