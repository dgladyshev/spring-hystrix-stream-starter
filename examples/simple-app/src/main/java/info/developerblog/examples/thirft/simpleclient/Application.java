package info.developerblog.examples.thirft.simpleclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import co.lesscode.spring.boot.hystrix.annotation.EnableHystrixMetricsStream;

@SpringBootApplication
@EnableAutoConfiguration
@EnableHystrixMetricsStream
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
