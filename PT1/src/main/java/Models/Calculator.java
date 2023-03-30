package Models;


import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public class Calculator {
    public Polynomial oppAdder(Polynomial pol1, Polynomial pol2) {
        Polynomial result = new Polynomial();
        for (Map.Entry<Integer, Monomial> pol : pol1.getPolynomial().entrySet()) {
            boolean verif = false;
            for (Map.Entry<Integer, Monomial> poll : pol2.getPolynomial().entrySet()) {
                if (pol.getKey() == poll.getKey()) {
                    float coeff = poll.getValue().getCoefficient() + pol.getValue().getCoefficient();
                    Monomial monomial = new Monomial(coeff, poll.getKey());
                    result.implementing(monomial);
                    verif = true;
                }
            }
            if (verif == false) {
                Monomial monomial = new Monomial(pol.getValue().getCoefficient(), pol.getKey());
                result.implementing(monomial);
            }

        }
        for (Map.Entry<Integer, Monomial> poll : pol2.getPolynomial().entrySet()) {
            boolean verif = false;
            for (Map.Entry<Integer, Monomial> pol : pol1.getPolynomial().entrySet()) {
                if (pol.getKey() == poll.getKey()) {
                    verif = true;
                }
            }
            if (verif == false) {
                Monomial monomial = new Monomial(poll.getValue().getCoefficient(), poll.getKey());
                result.implementing(monomial);
            }
        }
        return result;
    }

    public Polynomial oppSubtraction(Polynomial pol1, Polynomial pol2) {
        Polynomial result = new Polynomial();
        for (Map.Entry<Integer, Monomial> pol : pol1.getPolynomial().entrySet()) {
            boolean verif = false;
            for (Map.Entry<Integer, Monomial> poll : pol2.getPolynomial().entrySet()) {
                if (pol.getKey() == poll.getKey()) {
                    float coeff = pol.getValue().getCoefficient() - poll.getValue().getCoefficient();
                    Monomial monomial = new Monomial(coeff, poll.getKey());
                    result.implementing(monomial);
                    verif = true;
                }
            }
            if (verif == false) {
                Monomial monomial = new Monomial(pol.getValue().getCoefficient(), pol.getKey());
                result.implementing(monomial);
            }
        }
        for (Map.Entry<Integer, Monomial> poll : pol2.getPolynomial().entrySet()) {
            boolean verif = false;
            for (Map.Entry<Integer, Monomial> pol : pol1.getPolynomial().entrySet()) {
                if (pol.getKey() == poll.getKey()) {
                    verif = true;
                }
            }
            if (verif == false) {
                Monomial monomial = new Monomial(-poll.getValue().getCoefficient(), poll.getKey());
                result.implementing(monomial);
            }
        }
        return result;
    }

    public Polynomial oppDerivation(Polynomial pol1) {
        Polynomial result = new Polynomial();
        for (Map.Entry<Integer, Monomial> pol : pol1.getPolynomial().entrySet()) {
            Monomial monomial = new Monomial(pol.getValue().getCoefficient() * pol.getValue().getPower(), pol.getKey() - 1);
            result.implementing(monomial);
        }
        return result;
    }

    public Polynomial oppIntegration(Polynomial pol1) {
        Polynomial result = new Polynomial();
        for (Map.Entry<Integer, Monomial> pol : pol1.getPolynomial().entrySet()) {
            Monomial monomial = new Monomial(pol.getValue().getCoefficient() / (pol.getValue().getPower() + 1), pol.getKey() + 1);
            result.implementing(monomial);
        }
        return result;
    }

    public Polynomial oppMultiplication(Polynomial pol1, Polynomial pol2) {
        Polynomial result = new Polynomial();
        for (Map.Entry<Integer, Monomial> pol : pol1.getPolynomial().entrySet()) {
            for (Map.Entry<Integer, Monomial> poll : pol2.getPolynomial().entrySet()) {
                float coeff = poll.getValue().getCoefficient() * pol.getValue().getCoefficient();
                int power = poll.getValue().getPower() + pol.getValue().getPower();
                if (result.getPolynomial().get(power) != null) {
                    coeff = result.getPolynomial().get(power).getCoefficient() + coeff;
                }
                Monomial monomial = new Monomial(coeff, power);
                result.implementing(monomial);
            }
        }
        return result;
    }

    public String oppDivision(Polynomial pol1, Polynomial pol2) {
        Polynomial cat = new Polynomial();
        Polynomial rest = new Polynomial();
        int gradD = maxPower(pol1);
        int gradI = maxPower(pol2);
        float coefC = 0;
        int gradC = 0;
        while (gradD >= gradI) {
            float coefD = maxCoeff(pol1);
            float coefI = maxCoeff(pol2);
            coefC = coefD / coefI;
            gradC = gradD - gradI;
            Monomial monom = new Monomial(coefC, gradC);
            cat.implementing(monom);
            Polynomial aux = new Polynomial();
            aux.implementing(monom);
            rest = oppMultiplication(pol2, aux);
            pol1 = oppSubtraction(pol1, rest);
            gradD = maxPower(pol1);
            gradI = maxPower(pol2);
        }
        String result = cat.toString() + " ,R: " + pol1.toString();
        return result;
    }

    public int maxPower(Polynomial pol) {
        int gradd = 0;
        for (Map.Entry<Integer, Monomial> poll : pol.getPolynomial().entrySet()) {
            if (gradd == 0 || (poll.getKey() > gradd)) {
                gradd = poll.getValue().getPower();
            }
        }
        return gradd;
    }

    public float maxCoeff(Polynomial pol) {
        int gradd = 0;
        float coeff = 0;
        for (Map.Entry<Integer, Monomial> poll : pol.getPolynomial().entrySet()) {
            if (gradd == 0 || (poll.getKey() > gradd)) {
                gradd = poll.getValue().getPower();
                coeff = poll.getValue().getCoefficient();
            }
        }
        return coeff;
    }
}