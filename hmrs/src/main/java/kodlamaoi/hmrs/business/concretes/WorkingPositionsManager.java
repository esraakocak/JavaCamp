package kodlamaoi.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import kodlamaoi.hmrs.business.abstracts.WorkingPositionService;
import kodlamaoi.hmrs.core.utilities.results.DataResult;
import kodlamaoi.hmrs.core.utilities.results.SuccesDataResult;
import kodlamaoi.hmrs.dataAccess.abstracts.WorkingPositionsDao;
import kodlamaoi.hmrs.entities.concretes.WorkingPositions;

public class WorkingPositionsManager implements WorkingPositionService {

	  private WorkingPositionsDao workingPositionsDao;
	  
	  @Autowired
	  public WorkingPositionsManager(WorkingPositionsDao workingPositionsDao) {
		  this.workingPositionsDao=workingPositionsDao;
	
	
	  }
	
	
	
	@Override
	public DataResult<List<WorkingPositions>> getAll() {
	return	new SuccesDataResult<List<WorkingPositions>>(this.workingPositionsDao.findAll(),"data listed");
          
	}

}
