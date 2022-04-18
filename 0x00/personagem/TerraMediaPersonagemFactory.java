public class TerraMediaPersonagemFactory extends PersonagemFactory{

    @Override
    Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        if(tipoPersonagem == TipoPersonagem.MAGO) {
            return new Mago(nome, 10, 2, 5, 3,4);
        } else  if ( tipoPersonagem == TipoPersonagem.LADRAO) {
            return new Ladrao(nome, 2, 6, 8, 5, 10);
        } else if (tipoPersonagem == TipoPersonagem.GUERREIRO) {
            return new Guerreiro(nome, 1, 8, 5, 10, 6);
        }
        return null;
    }
}
