import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {
    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        super.obterIngredientes().add("acucar");
        return super.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
