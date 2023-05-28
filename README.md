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

### Spring框架入门-方法

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

## 三、创建 Spring Framework 项目

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

## 四、Java游戏应用程序入门

设计 GameRunner 游戏 (Mario, SuperContra, Pacman 等)

紧耦合代码:
- GamRunner 类
- Game 类: Mario, SuperContra, Pacman 等。

## 五、理解紧耦合与松耦合

### 为什么耦合很重要?

在构建伟大的软件时，耦合甚至更为重要。

- 科技中唯一不变的就是变化
  - 业务需求变化
  - 框架变化
  - 代码更改
- 我们希望尽可能的松耦合。
- 我们希望用尽可能少的代码更改来进行功能更改。

我们可以使用接口(interface)和spring框架帮助解决松耦合。

## 六、引入Java接口使应用程序实现松耦合

松耦合代码：
- GameRunner 类
- GamingConsole 接口
  - Game 实现类: Mario, SuperContra, Pacman 等。