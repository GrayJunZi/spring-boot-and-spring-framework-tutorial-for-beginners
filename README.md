# Venation

Master Spring Boot 3 & Spring Framework 6 with Java
---
成为Java Spring Boot全栈云开发人员。学习React，Docker，Spring Data JPA和Spring Security。

## 一、介绍

### 入门 (Getting Started)

当今Java世界中最顶级的两个框架为：

- Spring Boot
- Spring Framework

学习难点为：

- 大量技术点: 依赖注入、控制反转、自动布线(Auto wiring)、自动配置、 启动项目...
- 多种应用：Web应用、REST API、全站
- 将框架与各种其他框架工具集成：Maven、Gradle、Spring Data、JPA、Hibernate、Docker

将构建超过10个Maven与Gradle项目。

## 二、了解 Spring Framework 的必要性

应用程序体系结构在不断发展，从最基本的Web应用程序到 RESTFul API 风格的Web服务，再到全栈，如今我们正在将应用程序以微服务的方式部署在云端。

我们将使用许多框架来构建我们的应用程序

- Spring
- Spring Boot
- Hibernate
- Spring Security
- Spring Data
- Spring Cloud

### Spring

Spring框架提供了构建易于维护的应用程序所需的最重要特性: 依赖注入和自动布线(Auto wiring)。

- 紧耦合(Tight Coupling)
- 松耦合(Loose Coupling)
- 依赖注入(Dependency Injection)
- IOC容器(IOC Container)
- 应用程序上下文(Application Context)
- Spring Beans
- 自动布线(Auto wiring)
- 组件扫描(Component Scan)

### 01. Spring框架入门-方法

设计Game Runner运行游戏 (Mario,SuperContra,Pacman等)的迭代方法:

- 选代1:紧耦合Java代码
    - GameRunner类
        - 游戏类:马里奥，SuperContra，吃豆人等
- 选代2:松耦合-接口
    - GameRunner类
    - 游戏控制台接口
        - 游戏类:马里奥、超级魂斗罗、吃豆人
- 选代3:松耦合 - Spring Level 1
    - Spring Beans
    - Spring框架将管理对象和管理布线
- 选代4:松耦合 - Spring Level 2
    - Spring Annotations
    - Spring框架将创建、管理和自动连接对象

### 02. 创建 Spring Framework 项目

我们可以使用引导程序 [start.spring.io](https://start.spring.io) 创建一个新的项目。

> - `Project` : Maven
> - `Language` : Java
> - `Spring Boot` : 3.1.0
> - `Project Metadata`
>   - `Group` : com.grayjunzi
>   - `Artifact` : learn-spring-framework
>   - `Name` : learn-spring-framework
>   - `Description` : Demo project for Spring Boot
>   - `Package name` : com.grayjunzi.learn-spring-framework
>   - `Packaging` : Jar
>   - `Java` : 17

### 03. Java游戏应用程序入门

设计 GameRunner 游戏 (Mario, SuperContra, Pacman 等)

紧耦合代码:

- GamRunner 类
- Game 类: Mario, SuperContra, Pacman 等。

### 04. 理解紧耦合与松耦合

#### 为什么耦合很重要?

在构建伟大的软件时，耦合甚至更为重要。

- 科技中唯一不变的就是变化
    - 业务需求变化
    - 框架变化
    - 代码更改
- 我们希望尽可能的松耦合。
- 我们希望用尽可能少的代码更改来进行功能更改。

我们可以使用接口(interface)和spring框架帮助解决松耦合。

### 05. 引入Java接口使应用程序实现松耦合

松耦合代码：

- GameRunner 类
- GamingConsole 接口
    - Game 实现类: Mario, SuperContra, Pacman 等。

### 06. 引入Spring框架使Java应用程序实现松拥合

目前的阶段是对象的创建完全由我们自己管理，这些对象是在Java虚拟机中创建的，创建这些对象并将它们连接在一起的代码是由我们编写的。

下一步我们将使用 Spring Frmaework 管理所有的类，为我们创建对象并将它们连接在一起。

### 07. 创建Java Bean和启动Spring配置

### 08. 创建更多Java Bean

#### record

`record` 是一个新功能，它是在JDK 16中引入的，通常我们创建Java类是时需要创建许多 getter、setter、构造函数、equals、hashcode 等，
然而，当使用`record`时可消除创建Java Bean的冗长，它们是自动创建的。

### 09. 使用 Spring Framework 实现自动装配

### 10. 关于 Spring Framework 的一些问题

- 问题1: 什么是 Spring Container、Spring Context、IOC Container、Application Context？
- 问题2: Java Bean 与 Spring Bean 有什么区别？
- 问题3: 如何列出Spring Framework管理的所有Beans？
- 问题4: 如果有多个匹配的Bean可用怎么办？
- 问题5: Spring管理对象与自动装配，如何让Spring为我们创建对象？

#### 什么是 Spring Container？

- `Spring Container` - Spring容器是管理Spring Bean及其生命周期(lifecycle)的容器。
- `Bean Factory` - 是最基本的Spring容器。
- `Application Context` - 是高级 Spring容器 企业特有的功能。
    - web应用程序更易于使用。
    - 易于国际化。
    - 易于Spring AOP集成。

#### Java Bean 与 Spring Bean 有什么区别？

- Java Bean: 类遵循3个约束
    1. 具有公共默认 (无参数)造函数
    2. 允许使用getter和setter方法访问它们的属性
    3. 实现java.io.Serializable

- POJO: 普通的旧Java对象
    1. 没有限制
    2. 任何Java对象都是一个POJO

- Spring Bean: 任何被Spring管理的Java对象都是 SpringBean。
    1. Spring使用IOC容器(Bean Factory or Application Context)来管理这些对象。

#### 如何列出Spring框架管理的所有Bean

调用方法 `context.getBeanDefinitionNames()` 获取IOC容器中所有的对象名称。

```java
Arrays.stream(context.getBeanDefinitionNames())
        .forEach(System.out::println);
```

#### 如果有多个匹配的Bean可用如何处理？

可以在类上加入注解 `@Primary`，或者使用 `@Qualifier

### 11. 使用 Spring Framework 管理Java游戏应用程序Beans

## 三、使用 Spring Framework 来创建和管理Java对象

### 01. Primary和Qualifier 应该使用哪一种注解

- `@Primary` - 当多个候选人(candidates)都符合条件时，其中一个有@Primary则应该优先考虑该bean。
- `@Qualifier` - 一个特定的bean应该是自动注入(auto-wired)的 (这个bean的名字可以用作限定符)。

> `@Qualifier` 的优先级高于 `@Primary`。

### 02. 不同类型的依赖注入

- 基于构造函数: 依赖关系是通过使用构造函数创建Bean来设置的
- 基于Setter: 依赖关系是通过在bean上调用setter方法来设置的。
- 字段: 依赖关系是使用反射注入的。

> Spring团队建议基于构造器的注入，因为创建对象时会自动设置依赖项!

### 03. 理解重要术语(Terminology)

- `@Component(...)` - 类的实例将由Spring框架管理。
- `Dependency` - 指定实现类。
- `Component Scan` - 扫描组件类。
- `Dependency Injection` - 识别beans，它们的依赖关系，并将它们连接在一起(提供I0C-控制反转)
    - `Spring Beans` - Spring Framework 管理的对象。
    - `IoC container` - 管理beans的生命周期和依赖关系。
    - `Autowiring` - 连接SpringBean依赖项的过程。

### 04. 比较 `@Component` 和 `@Bean`

| 标题        | @Component                   | @Bean                               |
|-----------|------------------------------|-------------------------------------|
| 在哪里使用     | 可以在任何Java类上使用                | 通常用于Spring Configuration类中的方法       |
| 易用性       | 很简单，添加注解就可以了。                | 要编写所有的代码。                           |
| 自动注入      | 字段、Setter或构造函数注入             | 方法调用或方法参数                           |
| 谁创建的Beans | Spring Framework             | 编写bean创建代码                          |
| 推荐        | 您自己的应用程序实例化Bean `@Component` | 1:自定义业务逻辑 <br/>2:为第三方库实例化Bean:@Bean |

### 05. 练习Spring Frmaework示例

## 四、探索Spring Framework

1. 惰性初始化(Lazy Initialization)
2. Bean作用域
3. PostConstruct 与 PreDestroy
4. Jakarta EE
5. Spring Big Picture
6. Alternatives - @Component
7. XML配置
8. 上下文与依赖注入
9. Spring模块与项目

### 01. 探索Spring Beans的惰性初始化

- Spring Beans的默认初始化: Eager
- 推荐使用Eager初始化
    - 在应用启动时可以立刻发现配置错误。
- 可以将Beans配置为惰性初始化但不推荐而且也不常用。

### 02. 比较懒加载与实时加载

| 标题                         | Lazy Initialization        | Eager Initialization          |
|----------------------------|----------------------------|-------------------------------|
| 初始化时间                      | Bean在应用程序中首次使用时初始化         | Bean在应用程序启动时初始化               |
| 默认                         | 非默认                        | 默认                            |
| 代码片段                       | @Lazy 或者 @Lazy(value=true) | @Lazy(value=false) 或者 没有@Lazy |
| 初始化错误时会发生什么                | 错误将导致运行时异常                 | 错误将阻止应用程序启动                   |
| 使用                         | 很少使用                       | 使用频率很高                        |
| 内存消耗                       | 更少                         | 所有Bean都在启动时初始化                |
| 建议方案(recommended Scenario) | 如果Beans很少在应用中使用推荐使用        | 应用中有许多bean推荐使用                |

### 03. Spring Framework 中 Bean作用域

Spring Beans可以在特定作用域中使用：

- Singleton - 在Spring IOC容器中只有一个实例。
- Prototype - 在Spring IOC容器中可能有多个实例。

作用域仅适用于Spring ApplicationContext：

- Request - 每个HTTP请求一个对象实例。
- Session - 每个用户HTTP Session一个对象实例。
- Application - 每个Web应用程序运行时一个对象实例。
- WebSocket - 每个WebSocket实例一个对象实例。

Java单例(GOF) vs Spring单例

- Spring Singleton:每个Spring IOC容器一个对象实例。
- Java Singleton(GOF):每个Java虚拟机有一个对象实例。

### 04. 对比 Prototype与Singleton 作用域

| 标题                         | Prototype                                               | Singleton                                                       |
|----------------------------|---------------------------------------------------------|-----------------------------------------------------------------|
| 实例                         | 在Spring IOC容器中可能有多个实例                                   | 在Spring IOC容器中只有一个实例                                            |
| Beans                      | 每次引用bean时都创建一个新的实例                                      | 重用同一个Bean                                                       |
| 默认                         | 非默认                                                     | 默认                                                              |
| 代码片段                       | @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) | @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)<br/>或默认 |
| 使用                         | 很少使用                                                    | 使用频率很高                                                          |
| 建议方案(recommended Scenario) | 有状态Bean                                                 | 无状态Bean                                                         |

### 05. Jakarta Contexts 和 依赖注入

- Spring Framework v1 是在 2004 年发布的。
- CDI规范于2009年12月引入Java EE6平台。
- 现在称为Jakarta Contexts and Dependency Injection (CDI)
- 重要的注入API特性
    - Inject (Spring自动注入)
    - Named (Spring组件
    - Qualifier
    - Scope
    - Singleton

### 06. Spring XML 配置

| 标题                      | Annotations | XML Configuration |
|-------------------------|-------------|-------------------|
| 易于使用                    | 很容易         | 麻烦(Cumbersome)    |
| 短小精悍(short and concise) | 是           | 否                 |
| 干净的 POJOs               | 否           | 是                 |
| 易于维护                    | 是           | 否                 |
| 使用频率                    | 几乎所有项目      | 很少                |
| 调试困难                    | 困难          | 中等                |

### 07. Stereotype 注解

- @Component - 适用于任何类的通用注解
    - 所有原型注解的基础
    - @Component 特殊化
        - @Service - 表示带注释的类具有业务逻辑。
        - @Controller - 表示带注释的类是一个“Controller”，(例如Web控制器)用于在Web应用程序和RESTAPI中定义。
        - @Repository - 表示使用带注释的类来检索和/或操作数据库中的数据。

### 08. Spring 大概览 - Framework, Module 和 Projects

- Spring核心：IOC容器、依赖注入、自动注入
    - 这些是下列各项的基本组成部分
        - 建立网络应用程序
        - 创建RESTAPI
        - 实现身份验证和授权
        - 与数据库交互
        - 与其他系统集成
        - 编写出色的单元测试

- Spring Framework 包含多个Spring模块
    - 基本特性：核心(IOC容器、依赖注入、自动注入)
    - Web：Spring MVC
    - Web Reactive：Spring WebFlux
    - 数据访问：JDBC、JPA等
    - 集成：JMS等
    - 测试：Mock Objects、Spring MVC Test等
- Spring Modules
- Spring Projects

- Spring Projects的不断演进
    - 第一个项目：Spring Framework
    - Spring Security：保护您的Web应用程序或RESTAPI或微服务
    - Spring Data：以同样的方式集成不同类型的数据库:关系型数据库与非关系型数据库。
    - Spring Integration：通过与其他应用程序集成解决挑战
    - Spring Boot：构建微服务的流行框架。
    - Spring Cloud：构建云原生程序。

- 为什么Spring生态系统这么流行？
    - 松散耦合：Spring管理bean和依赖项的创建和连接
        - 使构建松散合的应用程序变得容易
        - 让编写单元测试变得简单!(Spring Unit Testing)
    - 简化样板代码:专注于业务
        - 例子:在每个方法中不需要异常处理!
        - 将所有检查异常转换为运行时异常或未检查异常
    - 架构灵活性:Spring模块和项目
        - 你可以选择使用哪一个(你不需要使用所有的!)
    - 与时俱进:微服务和云
        - Spring Boot、Spring Cloud等!

## 五、Spring Boot 入门

- 为什么使用 Spring Boot？
- Spring Boot 的目标是什么？
- Spring Boot 是如何工作的？
- 对比 Spring Boot、Spring MVC、Spring

Spring 路径：

- 创建Spring Boot 项目
- 使用Spring Boot 构建简单的REST API
- 理解Spring Boot 的MAGIC
    - Spring Initializer
    - Starter Projects
    - Auto Configuration
    - Developer Tools
    - Actuator

### 01. 使用 Spring Initalizr 创建 Spring Boot 项目

打开 [spring initializr](https://start.spring.io) 网站 创建 Spring Boot 项目。

> - `Project` : Maven
> - `Language` : Java
> - `Spring Boot` : 3.1.0
> - `Project Metadata`
> - `Group` : com.grayjunzi
>   - `Artifact` : learn-spring-boot
>   - `Name` : learn-spring-boot
>   - `Description` : Demo project for Spring Boot
>   - `Package name` : com.grayjunzi.learn-spring-boot
>   - `Packaging` : Jar
>   - `Java` : 17
> - `Dependencies` : `Spring Web`

- 1: 创建 Spring Boot 项目
- 2: 使用 Spring Boot 构建简单的REST API

### 02. 创建 Hello World API

- `@RestController` - 标记为控制器
- `@RequestMapping` - 标记为接口

### 03. Spring Boot 的重要目标是什么

- 帮助您快速构建生产就绪型应用程序。
    - 构建快速
        - Spring Initializr
        - Spring Boot Starter Projects
        - Spring Boot Auto Configuration
        - Spring Boot DevTools
    - 易于制作
        - 日志(Logging)
        - 配置文件、配置属性的不同环境下的不同配置。
        - 监控(Monitoring) Spring Boot Actuator

### 04. Spring Boot Starter 项目

- 如何将它们分组，使构建应用程序变得容易?
    - 启动器:用于diff的方便的依赖描述符。特征

- Spring Boot 提供多种入门程序
    - Web应用和REST API: Spring Boot Starter Web(spring-webmvc, spring-web, spring-boot-starter-tomcat,
      spring-boot-starter-json)
    - 单元测试: Spring Boot Starter Test
    - 使用JPA与数据库交互: Spring Boot Starter Data JPA
    - 使用JDBC与数据库交互: Spring Boot Starter JDBC
    - 确保Web应用或REST API安全: Spring Boot Starter Security

### 05. Spring Boot 自动配置

- 自动配置: Spring Boot Starter Web
    - Dispatcher Servlet(DispatcherServletAutoConfiguration)
    - 内嵌Servlet容器 - Tomcat 是默认的(EmbeddedWebServerFactoryCustomizerAutoConfiguration)
    - 默认错误页面(ErrorMvcAutoConfiguration)
    - Json(JacksonHttpMessageConvertersConfiguration)

### 06. 使用Spring Boot DevTools加快构建速度

- 支持热部署无需手动重启服务，增加生产效率。

### 07. 构建生产就绪应用程序 1 Profiles

使用配置文件管理应用程序配置。

- 应用程序有不同的环境: Dev, QA, Stage, Prod 等
- 不同的环境需要不同的配置。
    - 不同的数据库。
    - 不同的Web服务。
- Profiles: 提供特定与环境的配置。

多种日志级别:

- trace
- debug
- info
- warning
- error
- off

### 08. 构建生产就绪应用程序 2 ConfigurationProperties

### 09. 使用Spring Boot嵌入式服务器(Embedded Servers)简化部署

传统部署应用程序流程为:

- 步骤1: 安装Java
- 步骤2: 安装Web应用服务器（Tomcat/WebSphere/WebLogic等）
- 步骤3: 部署WAR(Web ARchive)应用程序

嵌入式服务器是一种更为简单的选择:

- 步骤1: 安装Java
- 步骤2: 运行JAR文件。

嵌入式服务器其他实例:
- spring-boot-starter-tomcat
- spring-boot-starter-jetty
- spring-boot-starter-undertow

在 `IDEA` 中打开 `Execute Maven Goal` 窗口输入命令:
```
maven clean install
```

运行JAR文件
```java
java -jar learn-spring-boot-0.0.1-SNAPSHOT.jar
```

### 10. 使用Spring Boot监控应用程序

- 监控和管理生产中的应用程序。
- 提供大量的端点(endpoint):
  - beans - 应用程序中Spring bean的完整列表
  - health - 应用程序运行状况信息
  - metrics - 应用程序指标
  - mappings - 请求映射的详细信息

### 11. Spring Boot、Spring MVC、Spring 对比

- Spring Framework: 依赖注入
  - @Component, @Autowired, @ComponentScan
- Spring MVC: 简化Web应用和REST API的构建
  - @Controller, @RestController, @RequestMapping
- Spring Boot: 快速构建生产级应用
  - Starter Projects - 轻松构建各种应用程序
  - 自动配置
  - 启用非功能性需求(NFRs):
    - Actuator: 启用应用程序的高级监控
    - Embedded Server: 不需要单独的应用服务器
    - 日志和错误处理
    - 配置文件

## 六、JAP与Hibernate

使用现代Spring引导方法构建一个简单的JPA应用程序。

- 01: 使用H2创建一个Spring Boot项目
- 02: 创建 Course 表
- 03: 使用Spring JDBC处理 Course 表
- 04: 使用JPA和Hibernate去处理 Course 表
- 05: 使用Spring Data JPA 去处理 Course 表

### 01. 创建 JPA和Hibernate项目

打开 [spring initializr](https://start.spring.io) 网站 创建 Spring Boot 项目。

> - `Project` : Maven
> - `Language` : Java
> - `Spring Boot` : 3.1.1
> - `Project Metadata`
>   - `Group` : com.grayjunzi
>   - `Artifact` : learn-jpa-and-hibernate
>   - `Name` : learn-jpa-and-hibernate
>   - `Description` : Demo project for Spring Boot
>   - `Package name` : com.grayjunzi.learn-jpa-and-hibernate
>   - `Packaging` : Jar
>   - `Java` : 17
> - `Dependencies` 
>   - `Spring Web`
>   - `Spring Data JDBC`
>   - `Spring Data JPA`
>   - `H2 Database`

### 02. 启用H2控制台并创建表

在 `application.properties` 添加配置
```properties
# 启用H2控制台
spring.h2.console.enabled=true
# 固定数据源url
spring.datasource.url=jdbc:h2:mem:testdb
```

在 `resources` 文件夹下添加sql文件，将会在程序启动时自动执行。

打开 `http://localhost:8080/h2-console` h2控制台，并使用数据源url连接。

### 03. Spring JDBC 入门

#### SQL 基本命令

插入数据
```sql
insert into course (id, name, author)
values (1, 'Learn AWS', 'grayjunzi')
```

查看数据
```sql
select * from course
```

删除数据
```sql
delete from course where id = 1
```

#### JDBC 到 Spring JDBC 再到 Spring Data JPA 

- JDBC
  - 编写大量SQL查询以及Java代码
- Spring JDBC
  - 编写大量SQL查询以及少量Java代码
- JPA
  - 不用担心查询
  - 只需要将实体映射到表
- Spring Data JPA
  - 不需要担心任何东西

### 04. 使用Spring JDBC插入数据

使用 `JdbcTemplate` 执行SQL语句，继承 `CommandLineRunner` 并重写`run`方法，程序运行时将自动运行`run`方法 ，可在`run`方法中执行添加操作。

### 05. 使用Spring JDBC插入和删除数据

### 06. 使用Spring JDBC查询数据

### 07. JPA与EntityManager

### 08. Spring Data JPA

## 七、使用Spring Boot构建Web应用

- Web应用概念(浏览器、HTML、CSS、请求、响应、表单、会话、认证)
- Spring MVC(Dispatcher Servlet、View Resolvers、Model、View、Controller、Validations)
- Spring Boot(Starters, Auto Configuration)
- 框架/工具 (JSP、JSTL、JPA、Bootstrap、Spring Security、MySQL、H2)

### 01. 创建Web应用程序

打开 [spring initializr](https://start.spring.io) 网站 创建 Spring Boot 项目。

> - `Project` : Maven
> - `Language` : Java
> - `Spring Boot` : 3.1.1
> - `Project Metadata`
>  - `Group` : com.grayjunzi
>  - `Artifact` : my-first-web-app
>  - `Name` : my-first-web-app
>  - `Description` : Demo project for Spring Boot
>  - `Package name` : com.grayjunzi.my-first-web-app
>  - `Packaging` : Jar
>  - `Java` : 20
> - `Dependencies`
>   - `Spring Web`
>   - `Spring Boot DevTools`

### 02. Spring MVC 控制器提供HTML响应

### 03. 重定向到JSP

- 在 `src/main/resources/` 文件下创建 `META-INF/resources/WEB-INF/jsp` 文件夹。
- 在 `jsp` 文件夹下创建 `sayHello.jsp` 文件。

### 04. 登录控制器

- `@Controller` - 标记为控制器
- `@RequestMapping('login')` - 指定映射路由
- `@ResponseBody` - 指定响应消息体，若未写此注解则查找jsp页面。

Web是如何工作的？

- 浏览器发送一个请求 HTTP Request。
- 服务器处理这个请求。
- 服务器返回一个响应 HTTP Response。

### 05. 使用 RequestParam 捕获 QueryParams

控制器方法接收注解参数 `@RequestParam` 

```java
@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(@RequestParam String name) {
        return "login";
    }
}
```

使用 `ModelMap` 设置参数，传入jsp中。

```java
@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(@RequestParam String name, ModelMap model) {
        model.put("name",name);
        System.out.println("Request Param is "  + name);
        return "login";
    }
}
```

```html
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        Welcome to the Login Page!
    
        ${name}
    </body>
</html>
```

### 06. 日志的重要性

日志记录是最重要的事情之一，无论何时调试生产中的问题，大多数唯一拥有的就是日志。

在 `application.properties` 中 设置日志级别。
```properties
logging.level.org.springframework=debug
```

也可以指定某个包下的日志级别。
```properties
logging.level.com.grayjunzi.myfirstwebapp=debug
```

Spring Boot 让日志更为简单，它提供了一个名为 `spring-boot-starter-logging` 的启动程序，默认使用 `slf4j` 记录日志。

使用日志记录信息。
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

private Logger logger = LoggerFactory.getLogger(getClass());

logger.debug("Log {}", "Test debug");
logger.debug("Log {}", "Test info");
logger.debug("Log {}", "Test warn");
logger.error("Log {}", "Test error");
```

### 07. 了解 DispatcherServlet、Model 1、Model 2 和 FrontController

- Model 1: 所有代码都在JSP页面中。
- Model 2: 关注点分离(MVC) Servlet + JSP。
- FrontController: 所有请求先经过FrontController再转发给正确的控制器或服务。
- Dispatcher Servlet: 接收HTTP请求、处理HTTP请求、返回HTTP响应。

### 08. 创建登录表单

### 09. 添加登录验证

### 10. 创建ToDo

### 11. 创建Todo列表页面

### 12. Session、Model和Request对比

- 所有来自浏览器的请求都由我们部署在服务器上的Web应用程序处理。
- Request作用域：仅对单个请求有效，一旦返回响应，请求属性将从内存中删除。
- Session作用域：跨多个请求存储的详细信息，由于所有详细信息都存储在服务器上，因此需要额外的内存。

### 13. 添加JSTL并显示Todo列表

### 14. 使用webjar添加Bootstrap

### 15. 添加Todo

### 16. 使用Spring Boot Starter Validation添加验证

### 17. 使用Command Bean添加认证

### 18. 实现删除Todo功能

### 19. 实现修改Todo功能