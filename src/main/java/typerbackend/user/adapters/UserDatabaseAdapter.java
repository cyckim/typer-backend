package typerbackend.user.adapters;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import typerbackend.user.adapters.entity.UserEntity;

@Repository
public interface UserDatabaseAdapter extends CrudRepository<UserEntity, Long> {
}
