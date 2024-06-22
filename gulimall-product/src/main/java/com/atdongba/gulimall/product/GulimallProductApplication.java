package com.atdongba.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 1、整合MyBatis-Plus
*   1）共类中导入依赖 gulimall-common
*       <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.2.0</version>
        </dependency>
*   2）配置  ①配置数据源    导入数据库驱动、在application.yml配置数据源相关信息
*           ②配置MyBatis-Plus    使用@MapperScan、告诉MyBatis-Plus，sql映射文件位置
* */
@SpringBootApplication
//@MapperScan("com.atdongba.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
