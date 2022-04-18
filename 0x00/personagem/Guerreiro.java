public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);

        if(forca <= inteligencia || forca <= destreza) {
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    double getDanoAtaque() {
        return (super.getForca() * 0.8) + (super.getVigor() * 0.05) + (super.getDestreza() * 0.1) + (super.getInteligencia() * 0.05);
    }
}
