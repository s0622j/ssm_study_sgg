import com.atguigu.ioc03.HappyComponent;
import com.atguigu.ioc04.JavaBean2;
import com.atguigu.ioc05.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring01_ioc03 {

    public void createIoc(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-bean-03.xml");

        ClassPathXmlApplicationContext classPathXmlApplicationContext1 = new ClassPathXmlApplicationContext();
        classPathXmlApplicationContext1.setConfigLocations("spring-bean-03.xml");
        classPathXmlApplicationContext1.refresh();
    }

    @Test
    public void getBen(){
        ClassPathXmlApplicationContext ApplicationContext = new ClassPathXmlApplicationContext();
        ApplicationContext.setConfigLocations("spring-bean-03.xml");
        ApplicationContext.refresh();


        HappyComponent happyComponent = (HappyComponent)ApplicationContext.getBean("happyComponent");
        HappyComponent happyComponent1 = ApplicationContext.getBean("happyComponent", HappyComponent.class);
        HappyComponent happyComponent2 = ApplicationContext.getBean(HappyComponent.class);

        happyComponent2.doWork();
        System.out.println(happyComponent == happyComponent1);
        System.out.println(happyComponent == happyComponent2);
    }


    /**
     * 测试ioc配置和销毁方法的触发!
     */
    @Test
    public void test_04(){

        //1.创建ioc容器  就会进行组件对象的实例化  -> init
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-bean-04.xml");

        //ioc -> 容器去调用 destroy
        //ioc会立即释放,死了!

        JavaBean2 bean = applicationContext.getBean(JavaBean2.class);
        JavaBean2 bean1 = applicationContext.getBean(JavaBean2.class);
        System.out.println(bean == bean1);



        //2.正常结束ioc容器
        applicationContext.close();
    }


    /**
     * 读取使用factoryBean工厂配置的组件对象
     */
    @Test
    public void test_05(){

        //1.创建ioc容器  就会进行组件对象的实例化  -> init
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-bean-05.xml");


        //2.读取组件
        JavaBean javaBean = applicationContext.getBean("javaBean", JavaBean.class);

        System.out.println("javaBean = " + javaBean);

        //TODO: FactoryBean工厂也会加入到ioc容器! 名字  &id
        Object bean = applicationContext.getBean("&javaBean");
        System.out.println("bean = " + bean);


        //3.正常结束ioc容器
        applicationContext.close();
    }
}
