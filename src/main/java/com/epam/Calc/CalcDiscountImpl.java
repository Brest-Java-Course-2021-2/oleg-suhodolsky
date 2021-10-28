package com.epam.Calc;

import com.epam.DataModules.PriceShipping;
import com.epam.Streams.PropsInterface;

import java.math.BigDecimal;

public class CalcDiscountImpl implements Calc{
    PropsInterface props;

    public CalcDiscountImpl(PropsInterface props) {
        this.props = props;
    }

    @Override
    public  BigDecimal handle(BigDecimal weight, BigDecimal length ) {

        BigDecimal pricePerKg;
        BigDecimal pricePerKm;
        BigDecimal discount = BigDecimal.valueOf(0.9);

        PriceShipping priceShipping = new PriceShipping();
        priceShipping = props.getProperties();

        if (weight.compareTo(priceShipping.getSmall()) == -1){
            pricePerKg = priceShipping.getPriceSmall();
        } else{
            if (weight.compareTo(priceShipping.getLarge()) == -1){
                pricePerKg = priceShipping.getPriceLarge();
            } else{
                pricePerKg = priceShipping.getPriceLargeMore();
            }
        }
        if (length.compareTo(priceShipping.getTiny()) == -1){
            pricePerKm = priceShipping.getPriceTiny();
        } else{
            if (length.compareTo(priceShipping.getMiddle()) == -1){
                pricePerKm = priceShipping.getPriceMiddle();
            } else {
                if (length.compareTo(priceShipping.getBig()) == -1){
                    pricePerKm = priceShipping.getPriceBig();
                } else{
                    pricePerKm = priceShipping.getPriceHuge();
                }
            }
        }
        return (weight.multiply(pricePerKg).add(length.multiply(pricePerKm))).multiply(discount);
    }
}
