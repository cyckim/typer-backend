package typerbackend.user.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import typerbackend.user.adapters.UserDatabaseAdapter;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static typerbackend.user.UserTestData.USER_DTO_1;
import static typerbackend.user.UserTestData.USER_ENTITY_1;

@ExtendWith(MockitoExtension.class)
class UserFacadeTest {
    @Mock
    private UserDatabaseAdapter userDatabaseAdapter;

    private UserFacade userFacade;

    @BeforeEach
    void init() {
        userFacade = new UserFacade(userDatabaseAdapter);
    }

    @Test
    void createUser() {
        when(userDatabaseAdapter.save(any())).thenReturn(USER_ENTITY_1);
        userFacade.createUser(USER_DTO_1);

        verify(userDatabaseAdapter, times(1)).save(any());
    }
}
