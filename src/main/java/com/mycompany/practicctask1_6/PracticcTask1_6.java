/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicctask1_6;

/**
 *
 * @author user
 */
import java.util.Scanner;

class Plant {
    String name;

    Plant(String name) {
        this.name = name;
    }
}

class Gardener {
    Plant plant;

    void filter() {
        String filteredName = removeVowels(plant.name) + "VGTBL";
        plant.name = filteredName;
    }

    private String removeVowels(String input) {
        return input.replaceAll("[AEIOUaeiou]", "");
    }

    String getPlantInfo() {
        return plant.name;
    }
}

public class PracticcTask1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gardener gardener = new Gardener();

        System.out.print("Enter the name of the plant: ");
        String plantName = scanner.nextLine();
        gardener.plant = new Plant(plantName);

        gardener.filter();

        System.out.println("Plant name: " + gardener.getPlantInfo());
    }
}
/**/
