import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Peoples> peoples = new ArrayList<Peoples> ();

        for (int i=0;i<5;i++){
            System.out.println(String.format("Pessoa %d",i));

            System.out.println(String.format("Digite o nome: "));
            String nome = scanner.nextLine();

            System.out.println("Digite a idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite o peso: ");
            double peso = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a altura: ");
            double altura = Double.parseDouble(scanner.nextLine());

            Pessoa pessoa = new Pessoa(nome, idade, peso, altura);
            pessoas.add(pessoa);
        }

    }
}
