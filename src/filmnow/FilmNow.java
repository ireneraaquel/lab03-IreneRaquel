package filmnow;

public class FilmNow {

    private static final int TAMANHO = 100;
    private static final int TAMANHO_HOT = 10;
    private Filme[] filmes;
    private Filme[] hotFilmes;

    /**
     * Cria o FilmNow.
     */
    public FilmNow() {
        this.filmes = new Filme[TAMANHO];
        this.hotFilmes = new Filme[TAMANHO_HOT];
    }

    public Filme[] getFilmes() {
        return this.filmes.clone();
    }

    public Filme[] getFilmesHot() {
        return this.hotFilmes.clone();
    }

    public Filme getFilme(int posicao) {
        return filmes[posicao];
    }

    public boolean cadastraFilme(int posicao, String nome, String anoNasc, String local) {
        if (posicao > TAMANHO) return false;
        this.filmes[posicao] = new Filme(nome, anoNasc, local);
        return true;
    }

    public String detalharFilme(int posicaoFilme){
        return filmes[posicaoFilme].detalheFilme();
    }

    public String mostrarTodosFilmes(){
        String result = "";
        for(int i = 0; i < filmes.length; i++){
            if(filmes[i] != null) {
                    result += i + " - " + filmes[i].getNome() + "\n";
                }
            }
        return result;
    }

    public String adicionarHot(int posicaoFilme, int posicaoHot){
        hotFilmes[posicaoHot] = filmes[posicaoFilme];
        hotFilmes[posicaoHot].setHot(true);
        return "ADICIONADO À HOTLIST NA POSIÇÃO " + posicaoHot;
    }

    public void removerHot(int posicaoHot){
        hotFilmes[posicaoHot].setHot(false);
        hotFilmes[posicaoHot] = null;
    }
    public String exibirHotList(){
        String resultHot = "";
        for(int i = 0; i < hotFilmes.length; i++){
            if (hotFilmes[i] != null){
                resultHot += i + " - " + hotFilmes[i].getNome() + ", " + hotFilmes[i].getAnoNasc() + "\n";
            }
        }
        return resultHot;
    }

}