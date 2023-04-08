package com.github.matthewdesouza.factory;

import com.github.matthewdesouza.garment.base.Pants;
import com.github.matthewdesouza.garment.base.Shoes;
import com.github.matthewdesouza.garment.base.Top;
import com.github.matthewdesouza.garment.casual.CasualPants;
import com.github.matthewdesouza.garment.casual.CasualShoes;
import com.github.matthewdesouza.garment.casual.CasualTop;

public class CasualGarmentFactory implements GarmentFactory {

    /**
     * Creates and returns a {@link CasualTop} object.
     *
     * @return Top
     */
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    /**
     * Creates and returns a {@link CasualPants} object.
     *
     * @return Pants
     */
    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    /**
     * Creates and returns a {@link CasualShoes} object.
     *
     * @return Shoes
     */
    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
