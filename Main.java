import java.util.Scanner;

public class Main {
	
	public static void operarFuncion(float x, float inicio, float end, float intervalo){
		
		for(float i = inicio; i < end; i+=intervalo ){
			System.out.println(Math.pow(i, 2) + 1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese x : ");
		float x = leer.nextFloat();
		System.out.println("Ingrese inicio : ");
		float inicio = leer.nextFloat();
		System.out.println("Ingrese final : ");
		float end = leer.nextFloat();
		System.out.println("Ingrese el intervalo: ");
		float intervalo = leer.nextFloat();
		operarFuncion(x,inicio,end,intervalo);

	}

}
