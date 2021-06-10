package kodlama.io.hmrs.business.abstracts;

import java.util.List;

import kodlama.io.hmrs.core.utilities.results.DataResult;
import kodlama.io.hmrs.entities.concretes.WorkingPositions;
public interface WorkingPositionService {
	
  DataResult<List<WorkingPositions>> getAll();

}
