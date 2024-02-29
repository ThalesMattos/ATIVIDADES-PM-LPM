package Atividade.IMC;

public class Consumidor {
    private float consumidorNumeroTelefone;
    private String tipoDeConsumidor;
    private double consumoKWhPorMes;
    public Consumidor(float consumidorNumeroTelefone, String tipoDeConsumidor, double consumoKWhPorMes){
        this.consumidorNumeroTelefone = consumidorNumeroTelefone;
        this.consumoKWhPorMes = consumoKWhPorMes;
        this.tipoDeConsumidor = tipoDeConsumidor;
    }
}
