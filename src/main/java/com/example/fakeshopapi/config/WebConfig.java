package com.example.fakeshopapi.config;


import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Spring MVC에 대한 설정 파일. 웹
public class WebConfig implements WebMvcConfigurer {

    //CORS에 대한 설정. -> Cross Origin Resource Sharing의 약자
    //프론트 엔드, 백엔드 개발
    //프론트 엔드는 3000번 포트(리엑트), 백 엔드는 8080 포트
    // http://localhost:3000 ---> 8080api를 호출할 수 있도록 설정.


    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PATCH", "PUT", "OPTIONS", "DELETE")
                .allowCredentials(true);

    }
}
