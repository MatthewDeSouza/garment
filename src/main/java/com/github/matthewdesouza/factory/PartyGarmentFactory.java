package com.github.matthewdesouza.factory;

import com.github.matthewdesouza.garment.base.Pants;
import com.github.matthewdesouza.garment.base.Shoes;
import com.github.matthewdesouza.garment.base.Top;
import com.github.matthewdesouza.garment.party.PartyPants;
import com.github.matthewdesouza.garment.party.PartyShoes;
import com.github.matthewdesouza.garment.party.PartyTop;

public class PartyGarmentFactory implements GarmentFactory {

    /**
     * Creates and returns a {@link PartyTop} object.
     *
     * @return Top
     */
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    /**
     * Creates and returns a {@link PartyPants} object.
     *
     * @return Pants
     */
    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    /**
     * Creates and returns a {@link PartyShoes} object.
     *
     * @return Shoes
     */
    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}
