package Controllers;

import Models.Calculator;
import Models.Monomial;
import Models.Polynomial;
import Views.View1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private View1 view;
    private Polynomial polynomial;
    private Calculator calculator;
    public Controller(View1 view, Polynomial polynomial, Calculator calculator) {
        this.view = view;
        this.polynomial = polynomial;
        this.calculator = calculator;
        this.view.addAdditionButtonListener(new AdditionButtonListener());
        this.view.addSubstractionButtonListener(new SubstractionButtonListener());
        this.view.addMultiplicationButtonListener(new MultiplicationButtonListener());
        this.view.addDivisionButtonListener(new DivisionButtonListener());
        this.view.addDerivativeButtonListener(new DerivativeButtonListener());
        this.view.addIntegrationButtonListener(new IntegrationButtonListener());
    }
    class AdditionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String polyn1 = view.getFirstField();
                String polyn2 = view.getSecondField();
                Polynomial pol1 = new Polynomial();
                Polynomial pol2 = new Polynomial();
                pol1 = transform(polyn1);
                pol2 = transform(polyn2);
                Polynomial result = calculator.oppAdder(pol1, pol2);
                view.setResulttextArea(result.toString());
            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class SubstractionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String polyn1 = view.getFirstField();
                String polyn2 = view.getSecondField();
                Polynomial pol1 = new Polynomial();
                Polynomial pol2 = new Polynomial();
                pol1 = transform(polyn1);
                pol2 = transform(polyn2);
                Polynomial result = calculator.oppSubtraction(pol1, pol2);
                view.setResulttextArea(result.toString());
            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class MultiplicationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String polyn1 = view.getFirstField();
                String polyn2 = view.getSecondField();
                Polynomial pol1 = transform(polyn1);
                Polynomial pol2 = transform(polyn2);
                Polynomial result = calculator.oppMultiplication(pol1, pol2);
                view.setResulttextArea(result.toString());
            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class DivisionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String polyn1 = view.getFirstField();
                String polyn2 = view.getSecondField();
                Polynomial pol1 = transform(polyn1);
                Polynomial pol2 = transform(polyn2);
                Polynomial result[]  = calculator.oppDivision(pol1, pol2);
                String rez= result[0].toString()+ " ,R: " + result[1].toString();
                view.setResulttextArea(rez);
            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class IntegrationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String polyn1 = view.getFirstField();
                String polyn2 = view.getSecondField();
                Polynomial pol1 = transform(polyn1);
                Polynomial result = calculator.oppIntegration(pol1);
                view.setResulttextArea(result.toString());
            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class DerivativeButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String polyn1 = view.getFirstField();
                String polyn2 = view.getSecondField();
                Polynomial pol1 = transform(polyn1);
                Polynomial result = calculator.oppDerivation(pol1);
                view.setResulttextArea(result.toString());
            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    public static Polynomial transform(String pol) {
        Polynomial polynomial1 = new Polynomial();
        String delimiter = "+";
        Pattern pattern = Pattern.compile("([+-]?\\d)*\\*x\\^(\\d)+");
        Matcher matcher = pattern.matcher(pol);
        while (matcher.find()) {
            String c = matcher.group(1);
            String p = matcher.group(2);
            float coeff = Float.parseFloat(c);
            int power = Integer.parseInt(p);
            Monomial monomial = new Monomial(coeff, power);
            polynomial1.implementing(monomial);
        }
        return polynomial1;
    }
}
