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




        Cliente cliente1 = new Cliente(2, true, "Americana", "Coppia giovane");
        Cliente cliente2 = new Cliente(1, false, "Italiana", "Studente");
        Cliente cliente3 = new Cliente(6, false, "Italiana", "Famiglia");
        Cliente cliente4 = new Cliente(3, true, "Francese", "Amici turisti");


        cliente1.prenota();
        cliente2.prenota();
        cliente3.prenota();
        cliente4.prenota();

        System.out.println("---------------------------------");


        ArrayList<Pizza> pizza = new ArrayList<>();

        Ristorante aPizz = new Ristorante("aPizz", pizza);
        System.out.println("Il ristorante" + " " + aPizz.nomeRistorante + " propone come menu:");

        System.out.println("---------------------------------");

        Pizza margherita = new Pizza("margherita", 3.50,true);
        Pizza patatine = new Pizza("con patatine", 4.10,true);
        Pizza prosciuttoCotto = new Pizza("con prosciutto cotto", 4.00,true);
        Pizza salsicciaFunghi = new Pizza("con salsiccia e funghi", 4.50,true);
        Pizza wurstelPatatine = new Pizza("con wurstel e patatine fritte", 5.00,true);
        Pizza ananas = new Pizza("con ananas", 4.70,false);


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

        System.out.println("---------------------------------");

       cliente2.ordina();
        System.out.println("pizza " + patatine.nomePizza);

        System.out.println("---------------------------------");

        cliente3.ordina();
        System.out.println("Pizza " + wurstelPatatine.nomePizza);
        System.out.println("Pizza " + margherita.nomePizza);
        System.out.println("Pizza " + prosciuttoCotto.nomePizza);
        System.out.println("Pizza " + salsicciaFunghi.nomePizza);


        System.out.println("---------------------------------");

        cliente1.ordina();
        System.out.println("Pizza " + ananas.nomePizza );
        cliente1.percheMangiQuellaRoba();



        System.out.println("---------------------------------");

        cliente4.ordina();
        System.out.println("Pizza " + ananas.nomePizza );
        cliente4.percheMangiQuellaRoba();


        System.out.println("---------------------------------");

        System.out.println("Qualche cliente pignolo si mette a controllare uno per uno gli ingredienti delle pizze: ");

        System.out.println("La Pizza Margherita" + " " + "e' una vera pizza?: " + margherita.controlloIngredienti());
        System.out.println("La pizza con le patatine" + " " + "e' una vera pizza?: " + patatine.controlloIngredienti());


        System.out.println("ha visto che serviamo la pizza con l'ananas ed e' andato via: ");
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

    public static class Cliente {
        int numClienti;
        boolean mangianoPizzaConAnanas;
        String nazionalita;
        String tipoClienti;


        public Cliente(int numClienti, boolean mangianoPizzaConAnanas, String nazionalita, String tipoClienti) {
            this.numClienti = numClienti;
            this.mangianoPizzaConAnanas = mangianoPizzaConAnanas;
            this.nazionalita = nazionalita;
            this.tipoClienti = tipoClienti;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "numero clienti=" + numClienti +
                    ", mangiano pizza con ananas? = " + mangianoPizzaConAnanas +
                    ", nazionalita = " + nazionalita +
                    ", tipo di clienti = " + tipoClienti +
                    ' ';
        }

        public void prenota() {
            System.out.println(numClienti + " " + "clienti chiedono di riservare " + numClienti + " " + "posti");
            if (numClienti < 2)
                System.out.println(numClienti + " " + " cliente chiede di riservare " + numClienti + " " + "posto");

        }

        public void ordina() {
            if (numClienti == 1)
                System.out.println("Lo" + " " + tipoClienti + " " + "vorrebbe ordinare: ");
            if (tipoClienti == "Coppia giovane")
                System.out.println("La" + " " + tipoClienti + " " + "vorrebbe ordinare: ");
            if (tipoClienti == "Amici turisti")
                System.out.println("Gli" + " " + tipoClienti + " " + "vorrebbero ordinare: ");
            if (tipoClienti == "Famiglia")
                System.out.println("La numerosa" + " " + tipoClienti + " " + "vorrebbe ordinare: ");
        }

        public boolean percheMangiQuellaRoba() {
            this.mangianoPizzaConAnanas = mangianoPizzaConAnanas;
            if (mangianoPizzaConAnanas)
                System.out.println("Anche se la pizza con l'ananas non e' una vera pizza, e' buonissima!");
            return mangianoPizzaConAnanas;
        }

    }

}









