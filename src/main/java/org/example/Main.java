package org.example;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Supra MK4", 1998, 2, "Gasolina", "Esportivo");
        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");


        Caminhao caminhao = new Caminhao("Mitsubishi", "Fuso Canter", 1995, 2, "Diesel", 5);
        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");


        Onibus onibus = new Onibus("Hino", "Rainbow", 1990, 30, "Diesel", 6);
        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");


        CarroEletrico carroEletrico = new CarroEletrico("Nissan", "Prairie EV", 1999, 4, "Elétrico", "Minivan", 40);
        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");


        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Isuzu", "Elf", 1997, 2, "Diesel", 3, -10);
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km\n");
    }
}