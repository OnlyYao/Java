# Java
Java基础知识的学习，包含了Java注解、集合、枚举、泛型、线程、IO流、设计模式等等。内容既有知识点的描述，同时也包含对应的小demo,可以当做Java入门的学习参考。

# Redis

### 通用命令
- keys [pattern] , 遍历所有的key
- dbsize，计算key的总数
- exists key，是否存在某个key
- del key [key...]，删除key
- expire key seconds，设置key在seconds秒后过期
- ttl key，查看key的剩余过期时间
- persist key，去掉key的过期时间
- type key，判断key的数据类型

### 字符串类型
- set key value，设置键值，不管key存不存在都会，其中value值不能大于512M
- setnx key value，key不存在，才设置
- set key value xx，key存在，才设置
- get key
- mget key [key..]，批量获取value
- mset key value [key value...]，批量设置value
- del key，删除key
- strlen，返回key的长度
- incr key，自增1，如果key不存在，自增后key=1
- decr key，自减1，如果key不存在，自减后key=-1
- incrby key k，自增k，如果key不存在，自增后key=k
- decrby key k，自减k，如果key不存在，自减后key=-k

- 使用场景
  - 缓存
  - 计数器
  - 分布式锁
  - 等等

