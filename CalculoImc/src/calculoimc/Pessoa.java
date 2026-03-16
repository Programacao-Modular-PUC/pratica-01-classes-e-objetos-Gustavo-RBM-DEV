import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Pessoa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculoimc[] pessoas = new Calculoimc[10];

        String nomeAnterior = "";
        String sobrenomeAnterior = "";

        int contador = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("\nCadastro " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Sobrenome: ");
            String sobrenome = sc.next();

      
            if (i > 0 && nome.equalsIgnoreCase(nomeAnterior) &&
                    sobrenome.equalsIgnoreCase(sobrenomeAnterior)) {
                break;
            }

            System.out.print("Dia de nascimento: ");
            int dia = sc.nextInt();

            System.out.print("Mes de nascimento: ");
            int mes = sc.nextInt();

            System.out.print("Ano de nascimento: ");
            int ano = sc.nextInt();

            Calendar cal = Calendar.getInstance();
            cal.set(ano, mes - 1, dia);
            Date dataNascimento = cal.getTime();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            Calculoimc p = new Calculoimc(nome, sobrenome, dataNascimento, altura, peso);

            p.calculaIMC();

            pessoas[i] = p;

            nomeAnterior = nome;
            sobrenomeAnterior = sobrenome;

            contador++;
        }

        System.out.println("DADOS CADASTRADOS");

        for (int i = 0; i < contador; i++) {

            Calculoimc p = pessoas[i];

            System.out.println("\nCadastro " + (i + 1) + ":");

            System.out.println("Nome completo: " + p.getNome() + " " + p.getSobrenome());

            System.out.println("Nome de referencia: "
                    + p.getSobrenome() + ", "
                    + p.getNome().toUpperCase());

            System.out.println("Idade: " + p.getIdade());

            System.out.println("Peso: " + p.getPeso());

            System.out.println("Altura: " + p.getAltura());

            System.out.println("IMC: " + p.getImc());

            System.out.println("Classificacao: " + p.informaObesidade());
        }

        sc.close();
    }
}