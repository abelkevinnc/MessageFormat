package com.prueba;

public class Prueba {

	public static void main(String[] args) {
		MensajeValidacionUtil.mensajeNulo("nombre cliente");
		MensajeValidacionUtil.mensajeCantidadCaracter("cantidad producto", 5);
		
		String mensaje = "el campo {0} no puede ser nulo, el campo {1} no puede ser negativo y el campo {2} tiene que ser mayor a 10";
		MensajeValidacionUtil.multiplesMensajes(mensaje, "descuento", "precio", "cantidad");

	}

}
