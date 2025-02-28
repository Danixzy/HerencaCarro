package org.example;

class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double consumoBase = 6; // Consumo base de 6 km/L
        double reducaoConsumo = Math.min(capacidadeCarga * 0.01, 0.25); // Redução máxima de 25%
        double consumoFinal = consumoBase * (1 - reducaoConsumo);
        return 300 * consumoFinal; // Tanque de 300 litros
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
}