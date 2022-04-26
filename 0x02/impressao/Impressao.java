public class Impressao {
    private TamanhoImpressao tamanhoImpressao;
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private int paginasPretoEBranco;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.paginasPretoEBranco = (paginasTotais - paginasColoridas);
    }

    public double calcularTotal() {
        double total = 0;

        if(ehFrenteVerso) {

            if(tamanhoImpressao.equals(TamanhoImpressao.A2)) {
                valorPretoBrancoFrenteVerso = 0.28;
                valorColoridasFrenteVerso = 0.18;

                total += paginasPretoEBranco * valorPretoBrancoFrenteVerso;
                total += paginasColoridas * valorColoridasFrenteVerso;
            }

            if(tamanhoImpressao.equals(TamanhoImpressao.A3)) {
                valorPretoBrancoFrenteVerso = 0.25;
                valorColoridasFrenteVerso = 0.15;

                total += paginasPretoEBranco * valorPretoBrancoFrenteVerso;
                total += paginasColoridas * valorColoridasFrenteVerso;
            }

            if(tamanhoImpressao.equals(TamanhoImpressao.A4)) {
                valorPretoBrancoFrenteVerso = 0.20;
                valorColoridasFrenteVerso = 0.10;

                total += paginasPretoEBranco * valorPretoBrancoFrenteVerso;
                total += paginasColoridas * valorColoridasFrenteVerso;
            }

        } else {
            if(tamanhoImpressao.equals(TamanhoImpressao.A2)) {
                valorPretoBrancoFrenteApenas = 0.32;
                valorColoridasFrenteApenas = 0.22;

                total += paginasPretoEBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }

            if(tamanhoImpressao.equals(TamanhoImpressao.A3)) {
                valorPretoBrancoFrenteApenas = 0.30;
                valorColoridasFrenteApenas = 0.20;

                total += paginasPretoEBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }

            if(tamanhoImpressao.equals(TamanhoImpressao.A4)) {
                valorPretoBrancoFrenteApenas = 0.25;
                valorColoridasFrenteApenas = 0.15;

                total += paginasPretoEBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }
        }

        return total;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas, paginasPretoEBranco, ehFrenteVerso ? "frente e verso" : "frente apenas", calcularTotal());
    }
}
