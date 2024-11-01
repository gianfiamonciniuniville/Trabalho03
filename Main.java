import estrategias.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de senha: ");
        System.out.println("1: Apenas números");
        System.out.println("2: Apenas letras minúsculas");
        System.out.println("3: Letras minúsculas e números");
        System.out.println("4: Letras Maiúsculas, minúsculas e números");
        System.out.println("5: Letras Maiúsculas, minúsculas, números e símbolos");
        int choice = scanner.nextInt();

        System.out.print("Informe o tamanho da senha: ");
        int length = scanner.nextInt();
        scanner.close();

        EstrategiaSenha strategy;

        switch (choice) {
            case 1:
                strategy = new SomenteNumeros();
                break;
            case 2:
                strategy = new SomenteMinusculas();
                break;
            case 3:
                strategy = new MinusculasNumeros();
                break;
            case 4:
                strategy = new MaiusculasMinusculasNumeros();
                break;
            case 5:
                strategy = new MaiusculasMinusculasNumerosSimbolos();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        String password = strategy.gerar(length);
        System.out.println("Senha gerada: " + password);
    }
}