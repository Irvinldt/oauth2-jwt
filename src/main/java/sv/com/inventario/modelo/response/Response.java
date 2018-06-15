package sv.com.inventario.modelo.response;

public class Response {

	public static final String SUCCESS = "SUCCESS";
	public static final String FAIL = "FAIL";

	private String msg;
	private String status;

	public Response() {
	}

	public Response(String msg, String status) {
		super();
		this.msg = msg;
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Response [msg=");
		builder.append(msg);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}

}
