package Models;

public class Monomial {
    private int power;
    private float coefficient;

    public Monomial( float coefficient,int power) {
        this.power = power;
        this.coefficient = coefficient;
    }
    public int getPower() {return power;}
    public void setPower(int power) {this.power = power;}
    public float getCoefficient() {return coefficient;}
    public void setCoefficient(float coefficient) {this.coefficient = coefficient;}
}
