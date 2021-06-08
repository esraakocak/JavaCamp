package kodlamaoi.hmrs.business.abstracts;




import java.util.List;

import kodlamaoi.hmrs.core.utilities.results.DataResult;
import kodlamaoi.hmrs.entities.concretes.WorkingPositions;

public interface WorkingPositionService {
	
	 DataResult<List<WorkingPositions>> getAll();
	
}
