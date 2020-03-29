package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableAutoConfiguration   引入第三方组件
@MapperScan("cn.enjoy.dao")  //扫描dao层 Mapping上就不用再写@Mapping
@EnableTransactionManagement   //写不写都可以
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
