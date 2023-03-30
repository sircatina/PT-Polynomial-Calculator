import Controllers.Controller;
import Models.Calculator;
import Models.Monomial;
import Models.Polynomial;
import Views.View1;

import javax.swing.text.BoxView;
import javax.swing.text.View;

public class main {
    public static void main(String[] args) {
        Polynomial polynomial=new Polynomial();
        Calculator calculator=new Calculator();
        View1 view= new View1();
        Controller Controllers= new Controller(view,polynomial,calculator);
    }
}
