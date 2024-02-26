package Models;

import Controllers.Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void oppAdder() {
        Calculator calculator = new Calculator();
        String pol1 = "3*x^2+2*x^1";
        String pol2 = "2*x^2+1*x^0";
        Polynomial polyn1 = Controller.transform(pol1);
        Polynomial polyn2 = Controller.transform(pol2);
        Polynomial result = calculator.oppAdder(polyn1, polyn2);
        assertEquals(result.toString(), "5.0*x^2+2.0*x^1+1.0*x^0");
    }

    @Test
    void oppSubtraction() {
        Calculator calculator = new Calculator();
        String pol1 = "3*x^2+2*x^1";
        String pol2 = "2*x^2+1*x^0";
        Polynomial polyn1 = Controller.transform(pol1);
        Polynomial polyn2 = Controller.transform(pol2);
        Polynomial result = calculator.oppSubtraction(polyn1, polyn2);
        assertEquals(result.toString(), "1.0*x^2+2.0*x^1+-1.0*x^0");
    }

    @Test
    void oppDerivation() {
        Calculator calculator = new Calculator();
        String pol1 = "3*x^2+2*x^1";
        String pol2 = "2*x^2+1*x^0";
        Polynomial polyn1 = Controller.transform(pol1);
        Polynomial polyn2 = Controller.transform(pol2);
        Polynomial result = calculator.oppDerivation(polyn1);
        assertEquals(result.toString(), "6.0*x^1+2.0*x^0");
    }

    @Test
    void oppIntegration() {
        Calculator calculator = new Calculator();
        String pol1 = "3*x^2+4*x^1";
        String pol2 = "2*x^2+1*x^0";
        Polynomial polyn1 = Controller.transform(pol1);
        Polynomial polyn2 = Controller.transform(pol2);
        Polynomial result = calculator.oppIntegration(polyn1);
        assertEquals(result.toString(), "1.0*x^3+2.0*x^2");
    }

    @Test
    void oppMultiplication() {
        Calculator calculator = new Calculator();
        String pol1 = "3*x^2+4*x^1";
        String pol2 = "2*x^2+1*x^0";
        Polynomial polyn1 = Controller.transform(pol1);
        Polynomial polyn2 = Controller.transform(pol2);
        Polynomial result = calculator.oppMultiplication(polyn1,polyn2);
        assertEquals(result.toString(), "6.0*x^4+8.0*x^3+3.0*x^2+4.0*x^1");
    }

    @Test
    void oppDivision() {
        Calculator calculator = new Calculator();
        String pol1 = "4*x^2+4*x^1";
        String pol2 = "2*x^2+1*x^0";
        Polynomial polyn1 = Controller.transform(pol1);
        Polynomial polyn2 = Controller.transform(pol2);
        Polynomial result[] = calculator.oppDivision(polyn1,polyn2);
        String rez=result[0].toString()+" ,R: "+result[1].toString();
        assertEquals(rez, "2.0*x^0 ,R: 4.0*x^1+-2.0*x^0");
    }
}