package cadena;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int resultado = 0;
		
		for(int i = 0;
				i < cadena.length();
				i++) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' ||cadena.charAt(i) == 'i' ||cadena.charAt(i) == 'o' ||cadena.charAt(i) == 'u') {
				resultado++;
			}
		}
	
		return resultado;
	}
	
	public String invertir(String cadena) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(cadena);
	
		return sb.reverse().toString();
	}
	
	public int contarLetra(String cadena, char caracter) {
		int resultado = 0;
		
		for(int i = 0;
				i < cadena.length();
				i++) {
			if(cadena.charAt(i) == caracter) {
				resultado++;
			}
		}
		
		
		return resultado;
	}
	
}
