package br.com.bandtec.AvaliacaoContinuada;

public class Futebol extends Atleta{

    private String TreinadorFutebol;
    private Integer Gols;

    public String getTreinadorFutebol() {
        return TreinadorFutebol;
    }

    public void setTreinadorFutebol(String treinadorFutebol) {
        TreinadorFutebol = treinadorFutebol;
    }

    public Integer getGols() {
        return Gols;
    }

    public void setGols(Integer gols) {
        Gols = gols;
    }

    public Futebol(String nomeAtleta,
                   Integer treinoPorDia,
                   String tipoDieta,
                   String treinadorFutebol,
                   Integer gols) {
        super(nomeAtleta, treinoPorDia, tipoDieta);
        TreinadorFutebol = treinadorFutebol;
        Gols = gols;
    }

    @Override
    public Integer getSomaPontos() {
        return this.Gols * 13;
    }

}
