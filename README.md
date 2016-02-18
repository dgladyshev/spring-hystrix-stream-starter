## Hystrix Metrics Stream Starter for Spring Boot

### What is it

Simple annotation @EnableHystrixMetricsStream which enables /hystrix.stream for you service.

### What is Hystrix Metrics Event Stream

https://github.com/Netflix/Hystrix/tree/master/hystrix-contrib/hystrix-metrics-event-stream

### Why do I need annotation to enable it

Because another approach is to fill web.xml with some lines and you don't want to do that.

### How to use it

Simple mark your Application with @EnableHystrixMetricsStream annotation and you done.