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
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")

public class Employers extends User{

	@Column(name="id")
	private int id;
	
	private int user_id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_adress")
	private String web_adress;
	
	@Column(name="phone")
	private String phone;
	
	
	public Employers(int id, int user_id, String company_name, String web_adress, String phone) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.company_name = company_name;
		this.web_adress = web_adress;
		this.phone = phone;
	}
}
