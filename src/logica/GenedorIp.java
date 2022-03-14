package logica;

public class GenedorIp {

	static int contador = 0;

	// esta clase es puramente de prueba
	public static void imprimirResultados() {

		for (int x = 0; x < 10; x++) {
			System.out.println(ipAleatoria());
		}
	}

	public static String ipAleatoria() {
		// con el metodo append pertenecinente a String builder concatenamos los
		// numeros generados por el metodo numero aleaotorio
		StringBuilder sbIP = new StringBuilder();
		for (int x = 0; x < 3; x++) {
			sbIP.append(String.valueOf(numeroAleatorio())).append(".");
		}
		sbIP.append(String.valueOf(numeroAleatorio()));

		return sbIP.toString();

	}

	public static int numeroAleatorio() {
		// Método que devuelve un número aleatorio entre 0 y 255
		return (int) (Math.random() * 256);
	}

	public static String nombres() {
		contador++;
		return "PC " + contador;
	}
}
