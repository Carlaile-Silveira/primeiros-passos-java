import java.util.Scanner;

public class CheckoutMercado{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		double preco = -1.0;

		System.out.println("=== SISTEMA DE CHECKOUT - MERCADO RAIZ ===");
        System.out.println("Digite o preço dos produtos (ou 0 para finalizar):");

        while(preco != 0){
        	System.out.println("Valor do produto");
        	preco = sc.nextDouble();

        	if (preco > 0 ){
    			total += preco;
    		}	else if (preco < 0){
    				System.out.println("Valor inválido! Digite um preço positivo.");
    			}
    	}

    	System.out.println("------------------------------------");
    	System.out.printf("Subtotal: R$ %.2f%n", total);

    	if(total > 100){
    		total *= 0.90;
    		System.out.println("Parabens! Você ganho 10% de desconto");
    	}

    	System.out.printf("TOTAL A PAGAR: R$ %.2f%n", total);
        System.out.println("====================================");




	}
	
		

}