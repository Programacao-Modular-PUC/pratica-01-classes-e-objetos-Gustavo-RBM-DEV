import java.util.Scanner;

public class Pessoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.next();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        Calculoimc p = new Calculoimc(nome, sobrenome, idade, altura, peso);

        double imc = p.calculaIMC();

        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + p.informaObesidade());

        sc.close();
    }
}