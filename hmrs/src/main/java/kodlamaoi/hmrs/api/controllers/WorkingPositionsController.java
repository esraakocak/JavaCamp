package kodlamaoi.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaoi.hmrs.business.abstracts.WorkingPositionService;
import kodlamaoi.hmrs.core.utilities.results.DataResult;
import kodlamaoi.hmrs.entities.concretes.WorkingPositions;


@RestController
@RequestMapping("/api/workingpositions")
public class WorkingPositionsController {

	  private final WorkingPositionService workingPositionService;
	  
	  
	  @Autowired
		public WorkingPositionsController(WorkingPositionService jobPositionService, WorkingPositionService workingPositionService) {
			this.workingPositionService = workingPositionService;
		}
	  
	  @GetMapping("/getall")
		public DataResult<List<WorkingPositions>> getall(){
			return this.workingPositionService.getAll();
		}
}
