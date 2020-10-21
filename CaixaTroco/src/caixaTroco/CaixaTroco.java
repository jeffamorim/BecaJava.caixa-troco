package caixaTroco;
import java.util.Scanner;


public class CaixaTroco {

	public static void main(String[] args) {
		
		double troco;
		
		Scanner valor1 = new Scanner(System.in);
		Scanner valor2 = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto que deseja comprar: ");
		double valor_compra = valor1.nextDouble();
		
		System.out.println("Digite o valor para pagamento: ");
		double valor_pago = valor2.nextDouble();
		
		
		
		if(valor_pago > valor_compra) {
			troco = valor_pago - valor_compra;
			System.out.println("O troco é de: " +troco);
			
		} else if(valor_pago < valor_compra){
			System.out.println("Valor insuficiente");
		} else {
			System.out.println("Valor exato, não existe troco");
		}
	}
}
