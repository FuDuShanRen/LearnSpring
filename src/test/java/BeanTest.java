import com.tiance.constructor.Xiaoming;
import com.tiance.setter.Chinese;
import com.tiance.springQs.Person;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Date;
import java.util.Locale;

public class BeanTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        //Person p=ctx.getBean("person",Person.class);
        //p.useAxe();
        //Chinese chin=ctx.getBean("chinese",Chinese.class);
        //chin.useAxe();
        //Xiaoming xm=ctx.getBean("xiaoming",Xiaoming.class);
        //xm.useAxe();
        //Resource isr=new ClassPathResource("beans.xml");
        //DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
        //new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(isr);
        String hello = ctx.getMessage("hello", new String[]{"孙悟空"}, Locale.getDefault(Locale.Category.FORMAT));
        String now = ctx.getMessage("now",new Object[]{new Date()},Locale.getDefault(Locale.Category.FORMAT));
        System.out.println(hello);
        System.out.println(now);
    }

}