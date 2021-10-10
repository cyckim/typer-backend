package typerbackend.user.api;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import typerbackend.user.api.dto.UserDto;
import typerbackend.user.domain.UserFacade;

@RestController
@AllArgsConstructor
public class UserController {
    private UserFacade userFacade;

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        userFacade.createUser(userDto);
        return new ResponseEntity<>(
                userDto,
                HttpStatus.CREATED);
    }
}
