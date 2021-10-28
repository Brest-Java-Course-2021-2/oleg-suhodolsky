package com.epam;

import static org.junit.Assert.assertTrue;

import com.epam.Calc.Calc;
import com.epam.Calc.CalcDiscountImpl;
import com.epam.Calc.CalcImpl;
import com.epam.DataModules.PriceShipping;
import com.epam.Streams.Props;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        CalcImpl calc = new CalcImpl(new Props(new PriceShipping()));
        assertTrue(calc.handle(BigDecimal.valueOf(2), BigDecimal.valueOf(2)).equals(BigDecimal.valueOf(14)) );
        CalcDiscountImpl calcDiscount = new CalcDiscountImpl(new Props(new PriceShipping()));
        assertTrue(calcDiscount.handle(BigDecimal.valueOf(2), BigDecimal.valueOf(2)).equals(BigDecimal.valueOf(12.6)) );

    }
}
