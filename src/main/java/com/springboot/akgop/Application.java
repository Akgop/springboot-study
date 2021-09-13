package com.springboot.akgop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 항상 프로젝트의 최상단에 위치해야 함, SpringBootApplication 이 있는 위치부터 설정을 읽어나가기 때문.
@SpringBootApplication  // 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // run 을 통해 내장 WAS 를 실행한다.
    }
}
