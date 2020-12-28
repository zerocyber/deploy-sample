package com.zerocyber.deploysample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class DeploySampleApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DeploySampleApplication.class, args); // 초기 설정
    	
    	// PID 파일을 생성하기 위한 설정(프로젝트 shutdown시 없어진다)
    	SpringApplication springApplication = new SpringApplication(DeploySampleApplication.class);
    	springApplication.addListeners(new ApplicationPidFileWriter());
    	springApplication.run(args);
    }

}
