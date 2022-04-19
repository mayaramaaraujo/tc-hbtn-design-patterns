import java.util.List;

public class BebidaComLeite extends BebidaDecorator {
    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        super.obterIngredientes().add("leite");
        return super.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
