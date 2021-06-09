package kodlama.io.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "system_personnel")
@PrimaryKeyJoinColumn(name = "user_id")

public class SystemPersonnel extends User {
	@Column(name="id")
	private int id;
	
	private int user_id;
	
	@Column(name="department_id")
	private int department_id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="confirmation")
	private boolean confirmation;
	
	
	
	
	public SystemPersonnel(int id, int user_id, int department_id, String first_name, String last_name,
			boolean confirmation) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.department_id = department_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.confirmation = confirmation;
	}
	  
}
