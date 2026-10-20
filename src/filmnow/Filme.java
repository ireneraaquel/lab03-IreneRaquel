package filmnow;
import java.util.*;

public class Filme {
    private String nome;
    private String anoNasc;
    private String local;
    private boolean hot;

    public Filme(String nome, String anoNasc, String local){
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.local = local;
    }

    public String detalheFilme(){
        if (hot){
            return "\uD83D\uDD25" + toString();
        } else {
            return toString();
        }
    }

    public void setHot(boolean hotNovo){
        this.hot = hotNovo;
    }
    public String getNome(){
        return this.nome;
    }
    public String getAnoNasc(){
        return this.anoNasc;
    }
    public boolean getHot(){
        return this.hot;
    }
    public String getLocal(){
        return this.local;
    }
    @Override
    public String toString(){
        return this.nome + ", " + this.anoNasc + "\n" + this.local;
    }
    @Override
    public boolean equals(Object o){
        if (o == null) return false;

        if(!(o instanceof Filme)) return false;

        Filme oFilme = (Filme)o;

        return(this.nome.equals(oFilme.getNome()) && this.anoNasc.equals(oFilme.getAnoNasc()));
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.nome, this.anoNasc);
    }


}
