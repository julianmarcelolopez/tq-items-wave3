package com.javainuse.springbootsecurity;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class BasicAuthExample {

	public static void main(String[] args) throws Exception {
		// URL del endpoint
		URL url = new URL("http://localhost:8080/hellouser");

		// Crear la conexión
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");

		// Usuario y contraseña
		String user = "user";
		String password = "user";

		// Codificar las credenciales en Base64
		String auth = user + ":" + password;
		String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());

		// Agregar el encabezado Authorization
		connection.setRequestProperty("Authorization", "Basic " + encodedAuth);

		// Hacer la solicitud
		int responseCode = connection.getResponseCode();
		System.out.println("Response Code: " + responseCode);

		// Puedes leer la respuesta si lo necesitas
	}
}
