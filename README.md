# spring-cloud-server
1、项目结构
	两个Eureka服务器：spring-cloud-eureka
	两个服务提供者：spring-cloud-provider
	一个调用者：spring-cloud-invoker
	HttpClient客户端：spring-cloud-rest-client

2、如果要构建集群，需要修改c://window/system32/etc/hosts文件，为其添加主机名的映射，添加：127.0.0.1  name1 name2
3、运行顺序
	启动两个服务器端，控制台分别输入“name1”，“name2“
	启动两个服务提供者，控制台分别输入8081,8082
	启动服务调用者
	
启动整个集群之后，运行TestHttpClient，可以看到控制台输出效果，达到了负载均衡


