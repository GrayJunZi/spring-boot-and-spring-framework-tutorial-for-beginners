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

> - `Project` -> Maven
> - `Language` -> Java
> - `Spring Boot` -> 3.1.0
> - `Project Metadata`
>   - `Group` -> com.grayjunzi
>   - `Artifact` -> learn-spring-framework
>   - `Name` -> learn-spring-framework
>   - `Description` -> Demo project for Spring Boot
>   - `Package name` -> com.grayjunzi.learn-spring-framework
>   - `Packaging` -> Jar
>   - `Java` -> 17

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