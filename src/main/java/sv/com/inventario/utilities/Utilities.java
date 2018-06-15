package sv.com.inventario.utilities;

import org.springframework.http.HttpStatus;

import sv.com.inventario.modelo.response.Response;

public class Utilities {

	public static void manageResponseWhenOk(Response response) {
		response.setStatus(HttpStatus.OK.toString());
		response.setMsg(Response.SUCCESS);
	}
	
	public static void manageResponseWhenException(Response response, Exception e) {
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		response.setMsg(Response.FAIL + ": " + e.getMessage());
	}
	
}
