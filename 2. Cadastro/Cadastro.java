import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa> ();

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

        System.out.println("\nNomes das pessoas cadastradas: \n");
        int item = 0;
        for (Pessoa pessoa: pessoas){
            item++;
            System.out.println(String.format("Pessoa Nº %d: %s",item, pessoa.nome));
        }

        Pessoa pessoaMaisVelha = pessoas.get(0);

        for(Pessoa pessoa: pessoas){
            if(pessoa.idade > pessoaMaisVelha.idade){
                pessoaMaisVelha = pessoa;
            }
        }

        System.out.println("A pessoa mais velha é: "+pessoaMaisVelha.nome+", com "+pessoaMaisVelha.idade+" anos de idade.");
    }
}

class Pessoa{
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa (String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
}