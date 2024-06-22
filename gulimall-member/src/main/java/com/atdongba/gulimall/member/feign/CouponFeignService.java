package com.atdongba.gulimall.member.feign;

import com.atdongba.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/*
* 这是一个声明式的远程调用
* */
@FeignClient(name = "gulimall-coupon",url = "http://localhost:7000/")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R menbercoupons();

}
