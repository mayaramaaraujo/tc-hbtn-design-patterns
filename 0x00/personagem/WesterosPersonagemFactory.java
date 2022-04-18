public class WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        if(tipoPersonagem == TipoPersonagem.MAGO) {
            return new Mago(nome, 8, 3, 3, 3,4);
        } else  if ( tipoPersonagem == TipoPersonagem.LADRAO) {
            return new Ladrao(nome, 1, 8, 7, 7, 10);
        } else if (tipoPersonagem == TipoPersonagem.GUERREIRO) {
            return new Guerreiro(nome, 0, 9, 7, 10, 7);
        }
        return null;
    }
}
