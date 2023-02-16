package application;

import entities.Carro;
import entities.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Carro> carros = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();

        carros.add(new Carro("Ferrari", 0, 1600, 1500));
        carros.add(new Carro("Gol", 0, 1000, 600));
        carros.add(new Carro("Celta", 0, 890, 500));
        carros.add(new Carro("Golf", 0, 1300, 900));

        motos.add(new Moto("NINJA H2R", 0, 216, 998));
        motos.add(new Moto("Fan 160", 0, 116, 162));
        motos.add(new Moto("Pop 100", 0, 88, 97));
        motos.add(new Moto("CB 300", 0, 135, 291));

        for (Carro var : carros) {
            var.imprimirCarro();
        }
        System.out.println();

        for (Moto var : motos) {
            var.imprimirMoto();
        }

        sc.close();
    }
}
