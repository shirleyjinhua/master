#项目说明

>  技术栈

|  名称 | 作用  |
| :----: | :----:  |
| dubbo  | 接口服务 |
| nacos  | 注册中心 |
| apollo | 配置中心 |
| jetcache  | 缓存：支持2级缓存和失效刷新 |
| mapstruct  | 对象转换：DO、BO、VO、DTO等互转 |
| jasypt  | 配置加密 |

> 模块说明

|  名称 | 作用  | 依赖  |
| :----: | :----:  | :----:  |
| service-api  | 对外暴露服务接口 | common |
| service-common  | 对外接口和内部实现共同依赖的DTO、工具类等 | 无 |
| service-application | 业务逻辑实现以及对外接口实现 | api,common,persistence |
| service-persistence  | 持久化模块，数据库相关操作 | common |
| service-messaging  | 消息模块，redis、kafka消息接收发送 | ... |
| service-start  | 启动模块，工具启动从此模块启动 | application |
