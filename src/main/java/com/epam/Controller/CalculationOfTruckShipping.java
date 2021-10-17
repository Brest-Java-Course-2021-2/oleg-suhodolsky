package com.epam.Controller;

import com.epam.Calc.Calc;
import com.epam.Streams.Scan;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculationOfTruckShipping implements ControllerInterface {
    Calc calc;

    public CalculationOfTruckShipping(Calc calc) {
        this.calc = calc;
    }

    @Override
    public void getResultOfShipping() {
      final Scanner scanner = new Scanner(System.in);
    BigDecimal weight, length;
    boolean bool = true;
    String str;

        do {
            System.out.println("Q or q - for break operation.");
            weight = Scan.getValueFromCon(scanner, "Enter weight:");
            length = Scan.getValueFromCon(scanner, "Enter length:");
            System.out.println("Result:" + calc.handle(weight, length));
            scanner.nextLine();
            str = Scan.getStringFromCon(scanner);
            if ("y".equals(str.toLowerCase())) {
            } else {
                bool = false;
                scanner.nextLine();
            }
        } while (bool);


}
}
