public class MediaAdapter implements MediaPlayer {
    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeDoArquivo) {
        System.out.printf("Reproduzindo " + tipoMedia.name() + ": "  + nomeDoArquivo);
    }
}
