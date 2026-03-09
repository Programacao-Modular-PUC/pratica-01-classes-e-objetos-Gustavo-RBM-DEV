
package teoremapitagoras;

public class TrianguloRetangulo {
   private double c1;
   private double c2;
   private double h;

   
    public double calculaHipotenusa() {
        setH(Math.sqrt(Math.pow(getC1(), 2) + Math.pow(getC2(), 2)));
        return getH();
    }

    public double calculaArea() {
        return (getC1() * getC2()) / 2;
    }

    
    public double getC1() {
        return c1;
    }

    
    public void setC1(double c1) {
        this.c1 = c1;
    }

    
    public double getC2() {
        return c2;
    }

    
    public void setC2(double c2) {
        this.c2 = c2;
    }

    
    public double getH() {
        return h;
    }

    
    public void setH(double h) {
        this.h = h;
    }
}
