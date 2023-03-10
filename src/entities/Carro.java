package entities;

public class Carro implements Veiculos {

    public String nome;
    public double velocidade;
    public double peso;
    public double cilindrada;

    public Carro() {

    }

    public Carro(String nome, double velocidade, double peso, double cilindrada) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.peso = peso;
        this.cilindrada = cilindrada;
    }

    @Override
    public double acelerarVeiculo() {
        double velocidadeKMH = 0;

        for (int i = 1; i < 20; i++) {
            if (i == 6) {
                velocidade -= velocidade * 0.25;
            }
            if (i == 11) {
                velocidade -= velocidade * 0.25;
            }
            if (i == 15) {
                velocidade -= velocidade * 0.25;
            }
            velocidade = velocidade + 5;
            velocidadeKMH += velocidade * (cilindrada * 0.15) - (Math.floor(peso / 300));
        }
        return velocidadeKMH;
    }

    public void imprimirCarro() {
        System.out.println("Nome: " + nome + " Velocidade Final: " + String.format("%.2f", acelerarVeiculo()));
    }

}
