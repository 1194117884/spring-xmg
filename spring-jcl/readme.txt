jcl
    独立模块

Log
    日志操作接口，抽象出Logging操作所有的API
    由LogFactory创建时，此接口的实现类，需要提供一个含单独String参数name（类的名称）的构造函数。
    Log使用到以下6种日志级别
    --------不严重
        trace
        debug
        info
        warn
        error
        fatal
    --------严重
    性能，往往是日志系统最关注的
    由于不同的日志实现系统各自能力不同，Log定义了一些特定的接口预先判断是否能提供某些级别（如：fatal）的记录能力，来减少不必要的性能浪费（字符串的拼接的格式化）
        例如：
        if (log.isDebugEnabled()) {
             ... 开销的的操作 ...
             log.debug(theResult);
        }

    isFatalEnabled
    isErrorEnabled
    isWarnEnabled
    isInfoEnabled
    isDebugEnabled
    isTraceEnabled

    同是也定义了具体的调用入口，以便使用者记录日志
    fatal
    error
    warn
    info
    debug
    trace
LogFactory
    Log实现工厂的抽象类，规定了自创建Log的工厂的规范，日志服务使用方，按照此规范使用日志服务，日志服务提供方，按照此规范开发日志服务。提供便捷插拔能力。
    提供获取Log实现类的两个方法
       Log getLog(Class<?> clazz)
       Log getLog(String name)

LogAdapter
    spring-jcl内部提供的，默认的（LogFactory和LogFactiryService） Log实现方式的适配器
    目前支持检测并使用Log4j 2.x / SLF4J，未找到则降级到Java.util.logging


----//以下是jcl给定的样例实现相关

NoOpLog implements Log
    一个简单的Log实现类，提供了两个构造方法，其中一个含有类名name的构造，以便LogFactory创建Log实例。
    实现了Log的所有接口，不支持任何级别的记录，记录方法也没有实现逻辑。
    所以NoOpLog实现例子，对日志记录不支持，丢弃了所有日志。

SimpleLog extends NoOpLog
    NoOpLog的子类，原本是提供能日志实现者的通用默认类，现已弃用

LogFactoryService extends LogFactory
    实现工厂方法，Log的创建方式，直接调用jcl提供的默认的适配器LogAdapter，


----//尝试一下实现
    MyLog
    MyLogFactory
    MyLogAdaptor

问题
    如何才能接入到Spring-jcl的LogAdapter呢？