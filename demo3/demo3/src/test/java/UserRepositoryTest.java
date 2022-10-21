import com.chandru.demo3.model.UsersInfo;
import com.chandru.demo3.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {

    @Autowired
    private  UserRepository userRepository;

    @Test
    public void addnewUser()
    {
        UsersInfo user = new UsersInfo();
        user.setUserName("gmail.com");
        user.setFirstName("ravi");
        user.setLastName("kumar");
        user.setPassword("ravikumarpass");
        user.setDateOfBirth("19-09-2000");

        UsersInfo saveduser =userRepository.save(user);

       // Assertions.assertTrue(saveduser!=null);

    }
}
