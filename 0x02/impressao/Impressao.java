public class Impressao {
    private TamanhoImpressao tamanhoImpressao;
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal() {
        double total = 0;

        if(tamanhoImpressao == TamanhoImpressao.A2) {
            this.valorPretoBrancoFrenteApenas = 0.22;
            this.valorColoridasFrenteApenas = 0.32;
            this.valorPretoBrancoFrenteVerso = 0.18;
            this.valorColoridasFrenteVerso = 0.28;

            if(ehFrenteVerso) {
                total += (paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso;
                total += paginasColoridas * valorColoridasFrenteVerso;
                return total;
            } else {
                total += (paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
                return total;
            }

        } else if (tamanhoImpressao == TamanhoImpressao.A3) {
            this.valorPretoBrancoFrenteApenas = 0.20;
            this.valorColoridasFrenteApenas = 0.30;
            this.valorPretoBrancoFrenteVerso = 0.15;
            this.valorColoridasFrenteVerso = 0.25;

            if(ehFrenteVerso) {
                total += ((paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso) ;
                total += paginasColoridas * valorColoridasFrenteVerso;
                return total;
            } else {
                total += (paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
                return total;
            }
        } else {
            this.valorPretoBrancoFrenteApenas = 0.15;
            this.valorColoridasFrenteApenas = 0.25;
            this.valorPretoBrancoFrenteVerso = 0.10;
            this.valorColoridasFrenteVerso = 0.20;

            if(ehFrenteVerso) {
                total += (paginasTotais - paginasColoridas) * valorPretoBrancoFrenteVerso;
                total += paginasColoridas * valorColoridasFrenteVerso;
                return total;
            } else  {
                total += (paginasTotais - paginasColoridas) * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
                return total;
            }
        }
    }

    @Override
    public String toString() {
        return "total de paginas: " +  paginasTotais +  ", total coloridas: " + paginasColoridas + ", total preto e branco: " + (paginasTotais - paginasColoridas) + ", " +
        ehFrenteVerso + ", total: R$ " + calcularTotal();
    }
}
