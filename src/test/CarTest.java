import com.qf.pojo.Car;
import com.qf.pojo.User;
import com.qf.service.CarService;
import com.qf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class CarTest {
    @Autowired
    private CarService carService;
    @Test
    public void testUser(){

        List<Car> all = carService.findAll();
        System.out.println(all);
    }
}
