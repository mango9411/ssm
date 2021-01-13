import com.mango.edu.pojo.AccountPojo;
import com.mango.edu.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/13 16:03
 * @description:
 */
@ContextConfiguration(locations = "classpath*:application*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MybatisSpringTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testMybatisSpring() {
        List<AccountPojo> accountPojoList = accountService.queryList();
        for (AccountPojo pojo : accountPojoList) {
            System.out.println(pojo);
        }
    }
}
