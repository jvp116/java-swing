package util;

/**
 * Classe responsável por armazenar os métodos de validação do sistema
 * 
 * @author João Victor
 * @since 03/03/2021
 * @version 1.0
 */
public class Valida {

	// método para retornar se o valor string está preenchido
	public static boolean isEmptyOrNull(String args) {
		return (args.trim().equals("") || args == null);
	}

}
