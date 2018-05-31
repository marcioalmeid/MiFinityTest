package ie.mam.mfinity.repository;

import java.util.List;
import ie.mam.mfinity.model.User;
import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource
@CrossOrigin(origins = "http://marcioalmeidamendes.ml:4200")
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByUserName(String userName);
}
