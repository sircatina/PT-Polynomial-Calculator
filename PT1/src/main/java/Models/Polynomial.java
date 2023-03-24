package Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Polynomial {
    Map<Integer, Monomial> polynomial;
    public Polynomial(){
        this.polynomial= new HashMap<>();
    }
    public Map<Integer, Monomial> getPolynomial() {return polynomial;}
    public void setPolynomial(Map<Integer, Monomial> polynomial) {this.polynomial = polynomial;}
    public void implementing(Monomial monomial){
        polynomial.put(monomial.getPower(),monomial);}
    @Override
    public String toString() {
        String result = null;
        for(Map.Entry<Integer, Monomial> pol: polynomial.entrySet())
        { result= pol.getValue().getCoefficient()+"*x^"+pol.getValue().getPower() +"+"+result;
    }return result;
}}
