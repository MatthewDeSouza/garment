package com.github.matthewdesouza;

import com.github.matthewdesouza.factory.CasualGarmentFactory;
import com.github.matthewdesouza.factory.GarmentFactory;
import com.github.matthewdesouza.factory.PartyGarmentFactory;
import com.github.matthewdesouza.factory.ProfessionalGarmentFactory;
import com.github.matthewdesouza.garment.base.Pants;
import com.github.matthewdesouza.garment.base.Shoes;
import com.github.matthewdesouza.garment.base.Top;

public class GarmentSimulator {
    public static void main(String[] args) {
        // We want clothes for a party!
        printDescriptions(new PartyGarmentFactory());
        System.out.println();

        // We now want clothes for a casual environment!
        printDescriptions(new CasualGarmentFactory());
        System.out.println();

        // Now, let's dress professionally!
        printDescriptions(new ProfessionalGarmentFactory());
    }

    private static void printDescriptions(GarmentFactory factory) {
        Top casualTop = factory.createTop();
        System.out.println(casualTop.getDescription());

        Pants casualPants = factory.createPants();
        System.out.println(casualPants.getDescription());

        Shoes casualShoes = factory.createShoes();
        System.out.println(casualShoes.getDescription());
    }
}