public class AudioPlayer implements MediaPlayer {

    @Override
    public void reproduzir(TipoMedia tipoMedia,String nomeDoArquivo) {
        if(tipoMedia == TipoMedia.MP3) {
            System.out.println("Reproduzindo MP3: " + nomeDoArquivo);
        } else {
            MediaAdapter mediaAdapter = new MediaAdapter();
            mediaAdapter.reproduzir(tipoMedia, nomeDoArquivo);
        }
    }
}
