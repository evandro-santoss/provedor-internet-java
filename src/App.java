import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 01-Imprima a informaçao do privedor
        String provedor = "Iceberg";
        System.out.printf("Olá, bem-vindo a central de atendimento %s", provedor );

        // 02-Imprima a informaçao do assistente
        String atendente = "Bia";
        System.out.printf("\nMeu nome é %s, sou seu assistente virtual %s ", atendente, "ok");
        
        // 03- Imprima a informaçao da instruçao
        System.out.printf("\nDurante o atendimento siga minhas instruções");
        
        // 04-leia o nome da pessoa
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPrimeiramente informe seu nome ");
        String nome = scanner.nextLine();
 
        // 05-
        System.out.printf("\nObrigado %s, como posso lhe ajudar?", nome );
        String resposta = scanner.nextLine();

        // imprimindo texto concatenado
        System.out.println("sua resposta foi = " + resposta );
        scanner.close();
    }
}
