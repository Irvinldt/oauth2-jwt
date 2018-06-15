package sv.com.inventario.modelo.response;

public class ElementResponse<T> extends Response {

	private T data;

	public ElementResponse() {
	}

	public ElementResponse(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ElementResponse [data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

}
