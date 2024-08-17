package projetoyoutube;

public class Video implements AcoesVideo {
    private String tirulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String tirulo) {
        this.tirulo = tirulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTirulo() {
        return tirulo;
    }

    public void setTirulo(String tirulo) {
        this.tirulo = tirulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void like() {
    }

    @Override
    public String toString() {
        return "Video{" + "tirulo=" + tirulo + ", avaliacao=" + 
                avaliacao + ", views=" + views + ", curtidas=" + 
                curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
}
