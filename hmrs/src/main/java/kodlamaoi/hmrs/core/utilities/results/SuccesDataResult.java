package kodlamaoi.hmrs.core.utilities.results;

public class SuccesDataResult<T> extends DataResult<T> {
  
	public SuccesDataResult(T data,String message) {
		super(data ,true,message);
	}
	


	

}
