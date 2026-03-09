package teoremapitagoras;

import java.util.Scanner;

public class TeoremaPitagoras {

    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);

        TrianguloRetangulo t = new TrianguloRetangulo();

        System.out.print("Digite o primeiro cateto: ");
        t.setC1(sc.nextDouble());

        System.out.print("Digite o segundo cateto: ");
        t.setC2(sc.nextDouble());

        double hipotenusa = t.calculaHipotenusa();
        double area = t.calculaArea();

        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Area do triangulo: " + area);

        sc.close();
    }
}


