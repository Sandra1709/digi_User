package entity;
//import .authentication_service.dao.entity.UserCredentialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserCredentialRepo extends JpaRepository<UserCredentialEntity,Integer> {
    Optional<UserCredentialEntity> findByName(String username);

}
