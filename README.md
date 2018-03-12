# Minsx-Center-Server
#### 是Minsx-Cloud家庭成员的一部分,也是最核心的中心服务端,主要用于提供对基础的用户,应用,权限等模块的支持

### 项目说明
+ 软件名称：Minsx-Center-Server
+ 版本号：1.0.0
+ 开发者：www.minsx.com
+ 语言：Java
+ 功能：为米斯云平台提供用户中心及核心业务的计算服务
+ 优点：高灵活/高可配置/微服务/模块化/快速二次开发
+ 缺点：仅适用于通用行业(不适用于商城,医疗等特殊行业)
+ 开源协议：Apache License Version 2.0 http://www.apache.org/licenses/
				
### 技术选型
+ Spring Boot 基础框架
+ Spring Data JPA ORM框架
+ Spring Aop 切面编程框架
+ Spring Cloud 云应用框架
+ Druid 数据源框架
+ Dubbo 分布式框架
+ Radis 缓存框架
+ Minsx CCS 自家通用云存储框架 [点此查看](https://github.com/MinsxCloud/minsx-ccs)

### 部署方面
+ 采用Nginx 主要用于解决代理问题及部分简单负载均衡问题
+ 采用Docker 主要用于解决环境隔离,单服务器多应用问题

### 架构及开发方面
+ 项目采用前后端分离/模块化设计
+ 提供单点登录服务端(请参照：minsx-authorization-server [点此查看](https://github.com/MinsxCloud/minsx-authorization-server))
+ 提供默认通用用户前端(请参照：minsx-user-ui)
+ 提供默认通用管理前端(请参照：minsx-management-ui)
+ 采用Restful-URL进行开发
+ 代码规范遵循最新阿里巴巴JAVA代码规范
