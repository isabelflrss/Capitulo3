/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C3Ej3;

/**
 *
 * @author Hector
 */
public class ArithmeticMethods {
      private Integer v1;
    private Integer v2;
    
    public ArithmeticMethods(){
        this.v1=3;
        this.v2=5;
    }


    public String displayNumberPlus10(){
        return String.format("%d %d",this.getV1()+10,this.getV2()+10);
    }
    public String displayNumberPlus100(){
        return String.format("%d %d",this.getV1()+100,this.getV2()+100);
    }
    public String displayNumberPlus1000(){
        return String.format("%d %d",this.getV1()+1000,this.getV2()+1000);
    }

    public Integer getV1() {
        return v1;
    }

    public void setV1(Integer v1) {
        this.v1 = v1;
    }

    public Integer getV2() {
        return v2;
    }


    /**
     * @param v2 the v2 to set
     */
    public void setV2(Integer v2) {
        this.v2 = v2;
    }
    

}
