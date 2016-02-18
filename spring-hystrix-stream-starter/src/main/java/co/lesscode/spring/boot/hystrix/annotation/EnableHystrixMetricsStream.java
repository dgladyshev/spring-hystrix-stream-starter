package co.lesscode.spring.boot.hystrix.annotation;

import co.lesscode.spring.boot.hystrix.HystrixMetricsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Component
@Import(HystrixMetricsConfiguration.class)
public @interface EnableHystrixMetricsStream {
	//TODO use this to possibly alter stream path
	String path() default "/hystrix.stream";
}

