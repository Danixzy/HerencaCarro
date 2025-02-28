package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2021, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes", "O500", 2020, 50, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Elétrico", "Sedan", 100);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2022, 2, "Diesel", 15, -20);

        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");

        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");

        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");

        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");

        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km\n");
    }
}