package Controllers;

import Models.Calculator;
import Models.Polynomial;
import Views.View1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View1 view;
    private Polynomial polynomial;
    private Calculator calculator;
   public Controller(View1 view,Polynomial polynomial, Calculator calculator){
       this.view=view;
       this.polynomial=polynomial;
       this.calculator=calculator;
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

            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class SubstractionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class MultiplicationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class DivisionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class IntegrationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }
    class DerivativeButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {

            } catch (Exception exception) {
                view.showErorrMessage("Bad input :(");
            }
        }
    }

}
