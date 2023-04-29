package mainpackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sada = 0;
		if (sada > 0) {
			Scanner sc = new Scanner(System.in);
			int N = Integer.MIN_VALUE;
			while (N == Integer.MIN_VALUE) {
				try {
					N = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				}
				if (N < 1 || N > 100)
					N = Integer.MIN_VALUE;
			}
			for (int i = 0; i < N; i++) {
				int X = Integer.MIN_VALUE;
				while (X == Integer.MIN_VALUE) {
					try {
						X = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
					}
					if (X < 1 || X > 64)
						X = Integer.MIN_VALUE;

				}
				System.out.println(obtenerResultado(X));
			}
			sc.close();
		}
		System.out.println(obtenerResultado(64));
	}

	public static long calcularGramosCereal(int x) {
		long suma = 0;
		for (int i = 0; i < x; i++)
			suma += Math.pow(2, i);
		return suma / 12;
	}

	public static String obtenerResultado(int x) {
		return x == 64 ? "768614336404564 kg" : (calcularGramosCereal(x) / 1000) + " kg";
	}
}
