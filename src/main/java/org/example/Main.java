package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Créer un scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux nombres
        System.out.print("Entrez le premier nb : ");
        double premierNombre = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double deuxiemeNombre = scanner.nextDouble();

        // Fermer le scanner après avoir obtenu les entrées de l'utilisateur
        scanner.close();

        // Calculer la somme des deux nombres
        double somme = premierNombre + deuxiemeNombre;

        // Tester si la somme est un nombre entier
        if (estNombreEntier(somme)) {
            System.out.println("La somme est un nombre entier : " + (int) somme);
        } else {
            System.out.println("La somme n'est pas un nombre entier : " + somme);
        }
    }

    // Fonction pour tester si un nombre est entier
    private static boolean estNombreEntier(double nombre) {
        return nombre % 1 == 0;
    }
}
