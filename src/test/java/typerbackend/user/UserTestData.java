package typerbackend.user;

import typerbackend.user.adapters.entity.UserEntity;
import typerbackend.user.api.dto.UserDto;

public class UserTestData {
    public static final UserDto USER_DTO_1 = UserDto.builder()
            .name("Cycki")
            .mail("cycki@cycki.com")
            .build();

    public static final UserEntity USER_ENTITY_1 =  UserEntity.builder()
            .name(USER_DTO_1.getName())
            .mail(USER_DTO_1.getMail())
            .build();
}
