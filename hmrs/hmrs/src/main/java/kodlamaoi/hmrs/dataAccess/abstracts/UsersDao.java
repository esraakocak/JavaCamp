package kodlamaoi.hmrs.dataAccess.abstracts;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<User, Integer>{

}
