package kodlama.io.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hmrs.business.abstracts.WorkingPositionService;
import kodlama.io.hmrs.core.utilities.results.DataResult;
import kodlama.io.hmrs.entities.concretes.WorkingPositions;

@RestController
@RequestMapping("/api/workingpositions")
public class WorkingpositionsController {
	
  private final WorkingPositionService workingPositionService;
	  
	  
	  @Autowired
	  public WorkingpositionsController(WorkingPositionService jOPositionService, WorkingPositionService workingPositionService) {
			this.workingPositionService = workingPositionService;
		}
	  
	  @GetMapping("/getall")
		public DataResult<List<WorkingPositions>> getall(){
			return this.workingPositionService.getAll();
		}

}
