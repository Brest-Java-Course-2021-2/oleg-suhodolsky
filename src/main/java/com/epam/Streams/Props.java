package com.epam.Streams;

import com.epam.DataModules.PriceShipping;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

public class Props implements PropsInterface {

    FileInputStream fileInputStream;
    Properties prop;
    PriceShipping priceShipping;

    public Props(PriceShipping priceShipping) {
                this.priceShipping = priceShipping;
    }

    public PriceShipping getProperties() {
        prop = new Properties();
        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
            priceShipping.setTiny(new BigDecimal(prop.getProperty("tiny")));
            priceShipping.setMiddle(new BigDecimal(prop.getProperty("middle")));
            priceShipping.setBig( new BigDecimal(prop.getProperty("big")));
            priceShipping.setPriceTiny(new BigDecimal(prop.getProperty("priceTiny")));
            priceShipping.setPriceMiddle(new BigDecimal(prop.getProperty("priceMiddle")));
            priceShipping.setPriceBig(new BigDecimal(prop.getProperty("priceBig")));
            priceShipping.setPriceHuge(new BigDecimal(prop.getProperty("priceHuge")));
            priceShipping.setSmall(new BigDecimal(prop.getProperty("small")));
            priceShipping.setLarge(new BigDecimal(prop.getProperty("large")));
            priceShipping.setPriceSmall(new BigDecimal(prop.getProperty("priceSmall")));
            priceShipping.setPriceLarge(new BigDecimal(prop.getProperty("priceLarge")));
            priceShipping.setPriceLargeMore(new BigDecimal(prop.getProperty("priceLargeMore")));
        } catch (IOException e) {
            System.out.println("Error of reading file : file " + PATH_TO_PROPERTIES + " not found");
            e.printStackTrace();
        }

        return priceShipping;
    }
}
