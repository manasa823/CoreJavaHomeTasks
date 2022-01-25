package predicates;

public class ResponseCls {
	
	private String responseBody;
	private int statusCode;
	private String responseType;
	
	public ResponseCls(String responseBody, int statusCode, String responseType) {
		this.responseBody = responseBody;
		this.statusCode = statusCode;
		this.responseType = responseType;
	}
	
	public String getResponseBody() {
		return responseBody;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getResponseType() {
		return responseType;
	}
}
