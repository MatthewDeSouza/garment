package com.github.matthewdesouza.factory;

import com.github.matthewdesouza.garment.base.Pants;
import com.github.matthewdesouza.garment.base.Shoes;
import com.github.matthewdesouza.garment.base.Top;

public interface GarmentFactory {
    /**
     * Creates and returns {@link Top} specified by the implemented class.
     * @return Top
     */
    Top createTop();

    /**
     * Creates and returns {@link Pants} specified by the implemented class.
     * @return Pants
     */
    Pants createPants();

    /**
     * Creates and returns {@link Shoes} specified by the implemented class.
     * @return Shoes
     */
    Shoes createShoes();
}
