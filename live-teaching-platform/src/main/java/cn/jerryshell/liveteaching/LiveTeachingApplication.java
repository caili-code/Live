package cn.jerryshell.liveteaching;

import cn.jerryshell.liveteaching.config.HomeworkConfig;
import cn.jerryshell.liveteaching.config.LiveConfig;
import cn.jerryshell.liveteaching.config.SecurityConfig;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties({
        LiveConfig.class,
        SecurityConfig.class,
        HomeworkConfig.class
})
@SpringBootApplication
public class LiveTeachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveTeachingApplication.class, args);
        System.out.println("启动成功--------------------------------------------------------------------------------------------------------------------------------");
    }
// /**
//    * 文件上传临时路径
//    */
//    @Bean
//    MultipartConfigElement multipartConfigElement() {
//       MultipartConfigFactory factory = new MultipartConfigFactory();
//       factory.setLocation("E:");
//       return factory.createMultipartConfig();
//    }
}
