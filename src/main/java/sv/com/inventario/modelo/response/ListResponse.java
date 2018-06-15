package sv.com.inventario.modelo.response;

import java.util.List;

public class ListResponse<T> extends Response {

	private List<T> data;

	public ListResponse() {
	}

	public ListResponse(List<T> data) {
		this.data = data;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListResponse [data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

}
