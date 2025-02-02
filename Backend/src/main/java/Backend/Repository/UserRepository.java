package Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
