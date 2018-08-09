import com.zzm.rabbitmq.provider.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName: UserTester
 * @Description: TODO
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:41
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqProviderApplication.class)
public class UserTester {
    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * web项目上下文
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

    /**
     * 所有测试方法执行之前执行该方法
     */
    @Before
    public void before() {
        //获取mockmvc对象实例
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    /**
     * 测试添加用户
     * @throws Exception
     */
    @Test
    public void testUserAdd() throws Exception
    {
        mockMvc.perform(MockMvcRequestBuilders.post("/user/save")
                .param("userName","james")
                .param("name","蔡小子")
                .param("age","26")
                .param("balance","0.245")
        )
                .andDo(MockMvcResultHandlers.log())
                .andReturn();
    }
}
