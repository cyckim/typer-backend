package typerbackend.user.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import typerbackend.user.domain.UserFacade;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static typerbackend.user.UserTestData.USER_DTO_1;

@WebMvcTest(UserController.class)
public class UserControllerTest {
    @MockBean
    private UserFacade userFacade;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void createUser() throws Exception {
        Mockito.doNothing().when(userFacade);

        mockMvc.perform(MockMvcRequestBuilders.post("/createUser")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(USER_DTO_1)))
                .andExpect(status().isCreated());
    }
}
