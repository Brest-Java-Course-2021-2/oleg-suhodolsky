package com.epam;

import com.epam.Calc.Calc;
import com.epam.Controller.ControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println( "Hello BARYGI!!!  RUNNED!!!!!!!!!!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:study-spring.xml");

        Calc performer = (Calc) ctx.getBean("calculate");
        ControllerInterface shipping = (ControllerInterface) ctx.getBean("shippingprice");
        shipping.getResultOfShipping();

        Calc performerDiscount = (Calc) ctx.getBean("calculateDiscount");
        shipping = (ControllerInterface) ctx.getBean("shippingpriceDiscount");
        shipping.getResultOfShipping();
    }
}
