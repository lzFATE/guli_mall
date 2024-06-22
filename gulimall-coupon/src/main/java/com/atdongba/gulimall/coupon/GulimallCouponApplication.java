package com.atdongba.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 1、如何使用Nacos作为配置中心统一管理配置
*   1)、引入依赖
*   <!--nacos作为配置中心，进行配置管理-->
    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
    </dependency>
*   2)、创建一个bootstrap.properties文件
*   spring.application.name=gulimall-coupon

    spring.cloud.nacos.config.server-addr=127.0.0.1:8848
*
*   3)、需要给配置中心默认添加一个叫 数据集（Data Id）gulimall-coupon.properties 规则：应用名.properties
*   4)、给应用名.properties添加任何配置
*   5)、动态获取配置
*       ① @RefreshScope：动态获取并刷新配置
*       ② @Value("${配置项名称}")
*       配置中心 优先于 当前应用的配置文件
*       ③ <dependency>
               <groupId>org.springframework.cloud</groupId>
               <artifactId>spring-cloud-starter-bootstrap</artifactId>
               <version>3.1.5</version>
           </dependency>
*
* 2、细节
*   1)、命名空间：配置隔离；
*       默认：public(保留空间)；默认新增的所有配置都在public空间
*       1、开发、测试、生产：利用命名空间来做环境隔离
*          注意：在bootstrap.properties配置上，需要使用哪个命名空间下的配置
*          spring.cloud.nacos.config.namespace=5736cb04-cfa1-4e0b-ad4a-7d0e6c0422f8
*       2、每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
*   2)、配置集：所有的配置的集合
*   3)、配置集Id：Data ID  类似于文件名
*   4)、配置分组：
*       默认所有的配置集都属于：DEFAULT_GROUP；
*       11.11、618、12.12
*
* 每个微服务创建自己的命名空间，使用配置分组来区分环境，dev、test、prop
*
* 3、同时加载多个配置集
*   1)、微服务任何配置信息，任何配置文件都可以放在配置中心中
*   2)、只需要在bootstrap.properties说明加载配置中心的哪些文件即可
*   3)、@Value，@ConfigurationProperties ...
* 以前SpringBoot任何方法从配置文件中获取值，都能使用
* 配置中心有的优先使用配置中心的
* */

@SpringBootApplication
//@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
