# seata_demo
分布式框架实现全局事务最终一致性, 使用seata作为框架
使用的是v1.0.0版本的seata, 教程可参考www.keppel.fun

本demo使用的是file类型存储，只需要修改一下配置文件即可， 无需任何别的操作
下载seata的服务端， 进入/bin目录，启动命令:
```
./seata-server.bat -m file -p 8888
```