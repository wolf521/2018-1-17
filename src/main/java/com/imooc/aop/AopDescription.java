package com.imooc.aop;

/**
 * Created by Administrator on 2018/1/19.
 * aop描述
 */
public class AopDescription {
    /**
     什么是AOP及实现方式
        AOP(Aspect Oriented Programming)：面向切面编程，通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术
        面向切面：这种在运行时，动态地将代码切入到类的指定方法、指定位置上的编程思想就是面向切面的编程。系统中与功能垂直，横切于各个功能之上
        AOP实现方式：预编译（Aspectj）、动态代理
        预编译：Aspectj,预编译又称为预处理，是做些代码文本的替换工作。是整个编译过程的最先做的工作。
        动态代理：在运行期间动态地为某个类生成一个代理类，代替其做某些操作,JDK动态代理（SpringAop）、CGLIB动态代理(JbossAop)
        主要功能：日志记录、性能统计、安全控制、事务处理、异常处理等
        AOP相关概念：
            切面（Aspect）：和球只有一个公共点的平面叫做球的切面。一个点横切多个对象，连点成面，例如：日志记录切面
            连接点（JoinPoint）：程序执行过程中某个特定的点,切面上的某个点，与某个对象的链接，可能是一个方法
            通知（Advice）：在切面上的某个特定的连接点上执行的动作，指在连接方法执行时额外执行的切面的动作
                通知类型：
                    前置通知（Before Advice）：在某连接点之前执行的通知
                    返回后通知（After returning Advice）：在某连接点正常完成后执行的通知
                    抛出异常后通知（After throwing Advice）：在某连接点抛出异常退出时执行的通知
                    后置通知（After Advice）：在某连接点退出时执行的通知（不论是正常退出还是异常退出）
                    环绕通知（Around Advice）：包围一个连接点的通知
            切入点（Pointcut）：匹配连接点的断言，在AOP中通知和一个切入点表达式关联，代码中如何去匹配一个切面的连接点
            引入（Introduction）：在不改变类的代码的情况下，为类添加新的方法和属性
            目标对象（TargetObject）：被一个或多个切面所通知的对象
            AOP代理（AOP Proxy）：AOP框架创建的代理某个类的对象，用来代替特定对象实现切面的行为（包括通知方法执行等功能）
            织入（Weaving）：把切面连接到其他的应用程序类型或者对象上，并创建一个被通知的对象，分为：编译时织入、类加载时织入、执行时织入

     Spring所有的切面和通知器都必须放在一个<aop:config/>（可以配置多个）中，每个<aop:config/>都可以按顺序包含
     pointcut、advisor和aspect元素
     aspect：id:id,ref:bean
     pointcut:execution(public* *(..))--切入点为执行所有public方法
             execution(* set *(..))--切入点为执行所有set开始的方法时
             execution(* com.imooc.aop.schema.advice.biz.MoocAspect.*(..))---切入点为执行MoocAspect类中的所有方法时
             execution(* com.imooc.aop.schema.advice..*(..))---切入点为执行com.imooc.aop.schema.advice包下的所有方法时
             execution(* com.imooc.aop.schema.advice...*(..))---切入点为执行com.imooc.aop.schema.advice包及其子包下的所有方法时
            等等..........









     */
}
