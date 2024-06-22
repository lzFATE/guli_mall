package com.atdongba.gulimall.product;

import com.atdongba.gulimall.product.entity.BrandEntity;
import com.atdongba.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("小米");
////
////        brandEntity.setName("大米");
////        brandService.save(brandEntity);
////        System.out.println("保存成功...");
//
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
