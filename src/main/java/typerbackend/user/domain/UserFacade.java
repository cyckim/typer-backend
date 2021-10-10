package typerbackend.user.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import typerbackend.user.adapters.UserDatabaseAdapter;
import typerbackend.user.adapters.entity.UserEntity;
import typerbackend.user.api.dto.UserDto;

@Component
@AllArgsConstructor
public class UserFacade {
    private UserDatabaseAdapter userDatabaseAdapter;

    public void createUser(UserDto userDto) {
        userDatabaseAdapter.save(UserEntity.builder()
                .name(userDto.getName())
                .mail(userDto.getMail())
                .build());
    }
}
