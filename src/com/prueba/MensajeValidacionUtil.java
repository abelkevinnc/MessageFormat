package com.prueba;

import java.text.MessageFormat;

public class MensajeValidacionUtil {
	private static final String NULL_ERR_MSG = "El argumento {0} no puede ser nulo.";
	private static final String LENGTH_ERR_MSG = "El argumento {0} no puede ser nulo y debe tener una longitud de {1}.";
	
	public static void mensajeNulo(String campo) {
		System.out.println(MessageFormat.format(NULL_ERR_MSG, campo));
	}
	
	public static void mensajeCantidadCaracter(String campo, int cantidad) {
		System.out.println(MessageFormat.format(LENGTH_ERR_MSG, campo, cantidad));
	}
	
	public static void multiplesMensajes(String mensaje, Object... args) {
		System.out.println((MessageFormat.format(mensaje, args)));
	}
}
