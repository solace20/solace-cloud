_**注册中心：eureka:8000**_

_**服务提供者:producer:8800/hello?name=**_

**_feign消费:8901/ribbon消费 8900，两者都提供了相应的熔断操作_**

**_zuul网关：一般用来对不同api请求进行转发，路由等操作，在这一层可以做很多类似拦截AOP操作_**

_**bus+config:动态刷新配置文件，cloud-config为配置中心，config-client中暴露refresh接口提供刷新操作**_

...未完待续