package com.douglasva.petshop.application;

import com.douglasva.petshop.entities.Pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many pets will be registered? ");
        int n = sc.nextInt();

        List<Pet> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.printf("\nPet #%d", i + 1);
            System.out.print("\nID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if(hasId(list, id)) {
                System.out.println("This ID already exists!");
                i--;
                continue;
            }

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Species: ");
            String species = sc.nextLine();
            System.out.print("Number of vaccines already taken: ");
            int vaccine = sc.nextInt();

            Pet pet = new Pet(id, name, species, vaccine);
            list.add(pet);

        }

        Pet pet;

        do {
            System.out.printf("\nEnter the pet ID to apply a vaccine: ");
            int id = sc.nextInt();
            pet = findPetById(list, id);
            if (pet == null) {
                System.out.println("This ID doesn't exists!");
            }
        } while (pet == null);

        System.out.printf("\nHow many vaccines to add? ");
        int vaccinesToAdd = sc.nextInt();
        pet.addVaccine(vaccinesToAdd);

        System.out.printf("\nList of pets:\n");
        for(Pet p : list) {
            System.out.println(p);
        }

        sc.close();

    }

    public static boolean hasId(List<Pet> list, int id) {
        for(Pet p : list) {
            if(p.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static Pet findPetById(List<Pet> list, int id) {
        for(Pet p : list) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

}