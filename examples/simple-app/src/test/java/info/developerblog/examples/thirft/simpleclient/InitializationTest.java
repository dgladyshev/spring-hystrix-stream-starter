package info.developerblog.examples.thirft.simpleclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")
public class InitializationTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Value("${local.server.port}")
	int port;

	@Test
	public void testBeanInitialized() throws Exception {
		//will throw NoSuchBeanDefinitionException in case of any trouble
		applicationContext.getBean("hystrixStreamServlet");
	}
}
