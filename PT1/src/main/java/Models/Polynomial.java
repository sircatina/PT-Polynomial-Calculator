package Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Polynomial {
    private Map<Integer, Monomial> polynomial;

    public Polynomial() {
        this.polynomial = new HashMap<>();
    }

    public Map<Integer, Monomial> getPolynomial() {
        return polynomial;
    }

    public void setPolynomial(Map<Integer, Monomial> polynomial) {
        this.polynomial = polynomial;
    }

    public void implementing(Monomial monomial) {
        if (monomial.getCoefficient() != 0)
            polynomial.put(monomial.getPower(), monomial);
    }
    @Override
    public String toString() {
        String result = null;
        for (Map.Entry<Integer, Monomial> pol : polynomial.entrySet()) {
            if (pol.getValue().getCoefficient() != 0)
                if (result != null)
                    result = pol.getValue().getCoefficient() + "*x^" + pol.getValue().getPower() + "+" + result;
                else result = pol.getValue().getCoefficient() + "*x^" + pol.getValue().getPower();
        }
        return result;
    }
}
