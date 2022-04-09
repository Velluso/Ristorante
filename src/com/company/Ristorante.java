package com.company;

import java.util.ArrayList;



public class Ristorante {

    String nomeRistorante;
    ArrayList<Pizza> pizza;

    public Ristorante(String nomeRistorante, ArrayList<Pizza> pizza) {
        this.nomeRistorante = nomeRistorante;
        this.pizza = pizza;
    }


    @Override
    public String toString() {
        return "Ristorante{" +
                "nomeRistorante='" + nomeRistorante + '\'' +
                ", pizza=" + pizza +
                '}';
    }


    public static void main(String[] args) throws IllegalAccessException {


        ArrayList<Pizza> pizza = new ArrayList<>();

        Ristorante aPizz = new Ristorante("aPizz", pizza);
        System.out.println("Il ristorante" + " " + aPizz.nomeRistorante + " propone come menu:");


        Pizza margherita = new Pizza("Margherita", 3.50,true);
        Pizza patatine = new Pizza("Con patatine", 4.10,true);
        Pizza prosciuttoCotto = new Pizza("Con prosciutto cotto", 4.00,true);
        Pizza salsicciaFunghi = new Pizza("Con salsiccia e funghi", 4.50,true);
        Pizza wurstelPatatine = new Pizza("Con wurstel e patatine fritte", 5.00,true);
        Pizza ananas = new Pizza("Con ananas", 4.70,false);


        pizza.add(margherita);
        pizza.add(patatine);
        pizza.add(prosciuttoCotto);
        pizza.add(salsicciaFunghi);
        pizza.add(wurstelPatatine);
        pizza.add(ananas);


        Condimenti mozzarella = new Condimenti("Mozzarella");
        Condimenti pomodoro = new Condimenti("Pomodoro");
        Condimenti patatineFritte = new Condimenti("Patatine fritte");
        Condimenti prosciutto = new Condimenti("Prosciutto cotto");
        Condimenti salsiccia = new Condimenti("Salsiccia");
        Condimenti funghi = new Condimenti("Funghi");
        Condimenti wurstel = new Condimenti("Wurstel");
        Condimenti conAnanas = new Condimenti("Ananas");


        System.out.print("La " + margherita);
        System.out.print("e' fatta con" + mozzarella);
        System.out.println("e" + pomodoro);
        System.out.println("La " + patatine + " " + "e fatta con" + pomodoro + " " + mozzarella + "e " + patatineFritte);
        System.out.println("La " + prosciuttoCotto + " " + "e' fatta con" + pomodoro + " " + mozzarella + "e " + prosciutto);
        System.out.println("La " + salsicciaFunghi + " " + "e' fatta con" + pomodoro + " " + mozzarella + " " + salsiccia + "e " + funghi);
        System.out.println("La " + wurstelPatatine + " " + "e' fatta con" + pomodoro + " " + mozzarella + " " + wurstel + "e " + patatineFritte);
        System.out.println("La " + ananas + " " + "e' fatta con" + pomodoro + " " + mozzarella + "e " + conAnanas);


        System.out.println("Controllo gli ingredienti delle pizze per vedere se mangero' bene in questo locale:");

        System.out.println("La Pizza Margherita" + " " + "e' una vera pizza?: " + margherita.controlloIngredienti());
        System.out.println("La pizza con le patatine" + " " + "e' una vera pizza?: " + patatine.controlloIngredienti());
        System.out.println("La pizza con l'ananas" + " " + "e' una vera pizza?:" + ananas.controlloIngredienti());


    }


    public static class Pizza {
        String nomePizza;
        double prezzo;
        boolean condimentoTF;

        public Pizza(String nomePizza, double prezzo, boolean condimentoTF) {
            this.nomePizza = nomePizza;
            this.prezzo = prezzo;
            this.condimentoTF = condimentoTF;


        }
        public boolean controlloIngredienti() throws IllegalAccessException {

            this.condimentoTF = condimentoTF;
            if (condimentoTF)
                System.out.println();
             else {
                System.out.println(nomePizza + " " + "questa non e' una vera pizza");
                throw new IllegalAccessException("me ne vado in un altro locale dove fanno solo pizze vere");

            }
            return condimentoTF;
        }

        @Override
        public String toString() {
            return "Pizza " +
                    " " + nomePizza + '\'' +
                    ", prezzo = " + prezzo +
                    ", e' una pizza vera = " + condimentoTF +
                    ' ';
        }
    }

    public static class Condimenti {
        String nomeCondimento;


        public Condimenti(String nomeCondimento) {
            this.nomeCondimento = nomeCondimento;



        }
        @Override
        public String toString() {
            return " " +
                    " " + nomeCondimento + '\'' +
                    ' ';
        }

    }

}






