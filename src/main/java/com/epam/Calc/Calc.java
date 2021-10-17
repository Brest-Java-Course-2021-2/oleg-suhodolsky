package com.epam.Calc;

import java.math.BigDecimal;

public interface Calc {
    default BigDecimal handle(BigDecimal weight, BigDecimal length){
        return weight.multiply(BigDecimal.valueOf(10)).add(length.multiply(BigDecimal.valueOf(10))) ;
    }
}
