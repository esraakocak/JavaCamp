package kodlama.io.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.hmrs.business.abstracts.WorkingPositionService;
import kodlama.io.hmrs.core.utilities.results.DataResult;
import kodlama.io.hmrs.core.utilities.results.SuccessDataResult;
import kodlama.io.hmrs.dataAccess.abstracts.WorkingPositionsDao;
import kodlama.io.hmrs.entities.concretes.WorkingPositions;

public class WorkingPositionsManager implements WorkingPositionService {
            
  private WorkingPositionsDao workingPositionsDao;
	  
	  @Autowired
	  public WorkingPositionsManager(WorkingPositionsDao workingPositionsDao) {
		  this.workingPositionsDao=workingPositionsDao;
	
	
	  }
	
	
	
	@Override
	public DataResult<List<WorkingPositions>> getAll() {
	return	new SuccessDataResult<List<WorkingPositions>>(this.workingPositionsDao.findAll(),"data listed");
          
	}
}
