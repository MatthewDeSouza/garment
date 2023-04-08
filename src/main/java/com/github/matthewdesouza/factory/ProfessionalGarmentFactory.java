package com.github.matthewdesouza.factory;

import com.github.matthewdesouza.garment.base.Pants;
import com.github.matthewdesouza.garment.base.Shoes;
import com.github.matthewdesouza.garment.base.Top;
import com.github.matthewdesouza.garment.professional.ProfessionalPants;
import com.github.matthewdesouza.garment.professional.ProfessionalShoes;
import com.github.matthewdesouza.garment.professional.ProfessionalTop;

public class ProfessionalGarmentFactory implements GarmentFactory {
    /**
     * Creates and returns a {@link ProfessionalTop} object.
     *
     * @return Top
     */
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    /**
     * Creates and returns a {@link ProfessionalPants} object.
     *
     * @return Pants
     */
    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    /**
     * Creates and returns a {@link ProfessionalShoes} object.
     *
     * @return Shoes
     */
    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
