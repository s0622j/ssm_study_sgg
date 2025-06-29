import com.atguigu.ioc_04.components.A;
import com.atguigu.ioc_04.components.B;
import com.atguigu.ioc_04.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


    /**
     * projectName: com.atguigu.test
     *
     * @author: 赵伟风
     * description:
     */

//@SpringJUnitConfig(locations = //指定配置文件xml , value =  指定配置类)
    @SpringJUnitConfig(value = JavaConfig.class)
    public class SpringIoCTest2 {

        @Autowired
        private A a;


        @Autowired
        private B b;

        @Test
        public void test(){

            //使用组件
            System.out.println(a);

        }
    }
