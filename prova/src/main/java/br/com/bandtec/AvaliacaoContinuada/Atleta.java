package br.com.bandtec.AvaliacaoContinuada;

public abstract class Atleta implements Pontavel {

    private String NomeAtleta;
    private Integer TreinoPorDia;
    private String TipoDieta;

    public String getNomeAtleta() {
        return NomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        NomeAtleta = nomeAtleta;
    }

    public Integer getTreinoPorDia() {
        return TreinoPorDia;
    }

    public void setTreinoPorDia(Integer treinoPorDia) {
        TreinoPorDia = treinoPorDia;
    }

    public String getTipoDieta() {
        return TipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        TipoDieta = tipoDieta;
    }

    public Atleta(String nomeAtleta, Integer treinoPorDia, String tipoDieta) {
        NomeAtleta = nomeAtleta;
        TreinoPorDia = treinoPorDia;
        TipoDieta = tipoDieta;
    }

}
