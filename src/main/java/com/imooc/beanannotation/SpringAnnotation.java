package com.imooc.beanannotation;


/**
 * Created by Administrator on 2018/1/18.
 */

public class SpringAnnotation {
    /**
     * @Component:是一个通用注解，可用于任何bean，此注解及其子注解可被spring自动检测类并将bean注册到ApplicationContext中
     * @Repository:通常用于注解DAO类，即持久层，继承@Component
     * @Service:通常用于注解Service类,即服务层，继承@Component
     * @Controller:通常用于Controller类，即控制层，继承@Component
     * @Scope:作用域，默认是单例模式，即scope="singleton"。另外scope还有prototype、request、session、globalsession作用域。scope="prototype"多例
     *         代理方式，proxyMode=ScopedProxyMode.INTERFACES创建一个JDK代理模式
     *                   proxyMode=ScopedProxyMode.TARGET_CLASS基于类的代理模式
     *                   proxyMode=ScopedProxyMode.NO（默认）不进行代理
     * @RunWith():传一个类参数，指强行运行此类
     * @Required:适用于bean属性的setter方法，表示bean的属性在配置时就需要被赋值
     * @Autowired:表示自动地去装配，可用于构造器或成员变量，类似于自动执行的set方法
     * @Order标记定义了组件的加载顺序,只针对数组，list。@Order(1)：第一个加载，@Order(2)：第二个加载
     * @Qualifier("beanImplTwo")，在右多个bean中，明确表名加载id为beanImplTwo的bean
     * @Bean:标识一个用于配置和初始化一个由IOC容器管理的新对象的方法，类似于xml配置文件<bean/>
     * @Configuration:配置类，与@Bean联合使用可类似于配置文件
     * @@ImportResource("classpath:config.xml"):加载资源文件
     * @Value("${url}")获取资源文件的值，为属性赋值
     * JSR-250 标准
     * @Resource（这个注解属于J2EE的），默认安照名称进行装配，名称可以通过name属性进行指定  == @Autowired + @Qualifier("beanImplTwo")，可用于成员变量及set方法中
     * @PostConstruct：初始化 类似于配置文件中init-method
     * @PreDestroy：销毁 类似于配置文件中destroy-method
     * @Inject：自动装配，类似于@Autowired，可用于类、属性、方法、构造器
     * @Named：使用特定名称进行依赖注入，和@Component等效
     */
}
