package br.com.bandtec.AvaliacaoContinuada;

public class Corredor extends Atleta {

    private String TreinadorCorrida;
    private Integer PercorridoKm;

    public String getTreinadorCorrida() {
        return TreinadorCorrida;
    }

    public void setTreinadorCorrida(String treinadorCorrida) {
        TreinadorCorrida = treinadorCorrida;
    }

    public Integer getPercorridoKm() {
        return PercorridoKm;
    }

    public void setPercorridoKm(Integer percorridoKm) {
        PercorridoKm = percorridoKm;
    }

    public Corredor(String nomeAtleta,
                    Integer treinoPorDia,
                    String tipoDieta,
                    String treinadorCorrida,
                    Integer percorridoKm) {
        super(nomeAtleta, treinoPorDia, tipoDieta);
        TreinadorCorrida = treinadorCorrida;
        PercorridoKm = percorridoKm;
    }

    @Override
    public Integer getSomaPontos() {
        return this.PercorridoKm*25;
    }

}
