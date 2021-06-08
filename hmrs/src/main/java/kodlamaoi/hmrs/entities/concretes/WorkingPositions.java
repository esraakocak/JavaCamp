package kodlamaoi.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="working_positions")
@NoArgsConstructor

public class WorkingPositions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="positions_id")
	private int positions_id;
	
	@Column(name="positions_name")
	private String positions_name;

	public WorkingPositions(int positions_id, String positions_name) {
		super();
		this.positions_id = positions_id;
		this.positions_name = positions_name;
	}

	   
}
