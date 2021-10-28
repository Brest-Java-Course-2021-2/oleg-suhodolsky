package com.epam.Streams;

import com.epam.DataModules.PriceShipping;

public interface PropsInterface {
    public static final String PATH_TO_PROPERTIES = "src/main/resources/pricecoef.properties";
    public PriceShipping getProperties();
}
