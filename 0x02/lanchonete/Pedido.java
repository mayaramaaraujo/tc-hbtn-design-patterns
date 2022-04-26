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


    @Override
    public String toString() {

        //return itensForaCaixa.stream().map(itemPedido -> itemPedido).collect(Collectors.toList()).toString().replace("[","").replace("]", "");

        return "Fora da caixa: \n" + new ArrayList<>(itensForaCaixa).toString().replace("[","").replace("]", "").replace(",", "\n") + "\n" +
                "Dentro da caixa: \n" + new ArrayList<>(itensDentroCaixa).toString().replace("[","").replace("]", "").replace(",", "\n");
    }
}
