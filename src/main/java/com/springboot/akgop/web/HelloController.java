package com.springboot.akgop.web;

import com.springboot.akgop.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        // @RequestParam 은 외부에서 API 로 넘긴 파라미터를 가져오는 어노테이션
        // 외부에서 name 이란 이름으로 넘긴 파라미터를 String name 에 저장하게 된다.
        return new HelloResponseDto(name, amount);
    }
}
