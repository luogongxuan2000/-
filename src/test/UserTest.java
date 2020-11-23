import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class UserTest {
    @Autowired
    private UserService userService;
    @Test
    public void testUser(){
        User user = new User();
        user.setTel("admin");
        user.setPassword("123");
        User res = userService.findByUserNameAndPassword(user);
        System.out.println(res);
    }
    @Test
    public void testInsert(){
        User user = new User();
        user.setTel("admin");
        user.setPassword("123");
        user.setEmail("181@qq.com");
        int insert = userService.insert(user);
        System.out.println(insert);
    }
    @Test
    public void testfindByTel(){
        User admin = userService.findByTel("sss");
        System.out.println(admin);
    }
}
