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
     * @Scope:作用域，默认是单例模式，即scope="singleton"。另外scope还有prototype、request、session、global session作用域。scope="prototype"多例
     * @RunWith():传一个类参数，指强行运行此类
     * @Required:适用于bean属性的setter方法，表示bean的属性在配置时就需要被赋值
     * @Autowired:表示自动地去装配，可用于构造器或成员变量，类似于自动执行的set方法
     *
     *
     *
     *
     *
     *
     *
     */
}
