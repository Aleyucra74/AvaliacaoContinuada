package br.com.bandtec.AvaliacaoContinuada;

public class Nadador extends Atleta{

    private String TreinadorNadar;
    private Integer VoltasPiscina;

    public String getTreinadorNadar() {
        return TreinadorNadar;
    }

    public void setTreinadorNadar(String treinadorNadar) {
        TreinadorNadar = treinadorNadar;
    }

    public Integer getVoltasPiscina() {
        return VoltasPiscina;
    }

    public void setVoltasPiscina(Integer voltasPiscina) {
        VoltasPiscina = voltasPiscina;
    }

    public Nadador(String nomeAtleta,
                   Integer treinoPorDia,
                   String tipoDieta,
                   String treinadorNadar,
                   Integer voltasPiscina) {
        super(nomeAtleta, treinoPorDia, tipoDieta);
        TreinadorNadar = treinadorNadar;
        VoltasPiscina = voltasPiscina;
    }

    @Override
    public Integer getSomaPontos() {
        return this.VoltasPiscina*25;
    }

}
