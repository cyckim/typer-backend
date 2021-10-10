package typerbackend.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import typerbackend.user.api.dto.UserDto;

@Data
@AllArgsConstructor
@Builder
class User {
    private String name;
    private String mail;

    static User buildFrom(UserDto userDto) {
        return User.builder()
                .name(userDto.getName())
                .mail(userDto.getMail())
                .build();
    }
}
