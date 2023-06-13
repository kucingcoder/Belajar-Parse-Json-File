package View;

import Controller.DataParser;
import Model.Clubs;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Clubs> klub_bola = new ArrayList<Clubs>(DataParser.Jukutna("src\\brazil_club.json"));

        for (Clubs klub : klub_bola) {
            System.out.println("Nama\t: " + klub.getName());
            System.out.println("Negara\t: " + klub.getCountry());
            System.out.println("Kode\t: " + klub.getCode());
            System.out.println("==============================");
        }
    }
}