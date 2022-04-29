public class MediaAdapter implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeDoArquivo) {
        System.out.println("Reproduzindo " + tipoMedia.name() + ": "  + nomeDoArquivo);
    }
}
