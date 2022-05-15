import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        float valor1, valor2, resultado=0;
        String operacao;
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Informe o primeiro valor:");
        valor1 = scanner.nextFloat();
        System.out.println("Informe a operacao:");
        operacao = scanner.next();
        System.out.println("Informe o segundo valor:");
        valor2 = scanner.nextFloat();
        
        switch (operacao) {
            case "+":
                resultado = new Adicao().calculo(valor1, valor2);
            break;
            case "-":
                resultado = new Subtracao().calculo(valor1, valor2);
            break;
            case "*":
                resultado = new Multiplicacao().calculo(valor1, valor2);
            break;
            case "/":
                resultado = new Divisao().calculo(valor1, valor2);
            break;
            default:
                System.out.println("Erro na operaçao informada!");
                System.exit(0);
        }
       System.out.println(valor1+" "+operacao+" "+valor2+" "+"="+" "+ resultado);
    }    
}
