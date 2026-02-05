import java.util.Scanner;

public class ValidadorAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String usuarioCorreto = "admin";
        String senhaCorreta = "java123";

        int tentativas = 0;
        int limiteMaximo = 3;
        boolean acessoConcedido = false;

        System.out.println("=== SISTEMA DE SEGURANÇA JAVA ===");
        System.out.println("Limite de 3 tentativas de acesso.");

       
        while (!acessoConcedido && tentativas < limiteMaximo) {
            System.out.print("\nUsuário: ");
            String usuarioInfo = sc.next();

            System.out.print("Senha: ");
            String senhaInfo = sc.next();

            
            if (usuarioInfo.equals(usuarioCorreto) && senhaInfo.equals(senhaCorreta)) {
                acessoConcedido = true;
            } else {
                tentativas++;
                int restantes = limiteMaximo - tentativas;
                
                if (restantes > 0) {
                    System.out.println("Usuário ou senha incorretos!");
                    System.out.println("Você ainda tem " + restantes + " tentativa(s).");
                }
            }
        }

       
        System.out.println("\n------------------------------------");
        if (acessoConcedido) {
            System.out.println("ACESSO LIBERADO! Bem-vindo ao sistema.");
        } else {
            System.out.println("CONTA BLOQUEADA! Procure o administrador.");
        }
        System.out.println("------------------------------------");

        sc.close();
    }
}