/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C3Ej4;

/**
 *
 * @author Hector
 */
public class Percentages {
   private Double a;
    private Double b;
    public Percentages(Double a, Double b){
        this.a=a;
        this.b=b;
    }
    public Double getA() {
        return a;
    }
    public void setA(Double a) {
        this.a = a;
    }
    public Double getB() {
        return b;
    }
    public void setB(Double b) {
        this.b = b;
    }
    public Double computePercent(){
        return (this.getA()*100)/this.getB();
    }
    @Override
    public String toString(){
        return String.format("%.2f es %.2f porciento de %.2f",this.getA(),this.computePercent(),this.getB());
    }
 
}
