package kodlama.io.hmrs.core.utilities.results;

public class Result {

	private boolean success;
	private String Message;
	
	public Result(boolean success) {
		 this.success=success;
	}
	
	public Result(boolean success, String message) {
	
		this(success);
		this.Message =message;
	}

	public String getMessage() {
		return this.Message;
	}

	

	public boolean isSuccess() {
		return this.success;
	}

}
