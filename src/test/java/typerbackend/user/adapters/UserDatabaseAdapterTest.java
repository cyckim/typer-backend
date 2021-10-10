package typerbackend.user.adapters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static typerbackend.user.UserTestData.USER_ENTITY_1;

@DataJpaTest
@AutoConfigureTestDatabase()
class UserDatabaseAdapterTest {
    @Autowired
    private UserDatabaseAdapter userDatabaseAdapter;

    @Test
    void saveUser() {
        userDatabaseAdapter.save(USER_ENTITY_1);

        Assertions.assertEquals(1, userDatabaseAdapter.count());
        Assertions.assertEquals(Optional.of(USER_ENTITY_1), userDatabaseAdapter.findById(1L));
    }
}
