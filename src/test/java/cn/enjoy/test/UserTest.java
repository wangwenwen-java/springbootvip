package cn.enjoy.test;

import cn.enjoy.App;
import cn.enjoy.dao.UsersMapper;
import cn.enjoy.model.Users;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class UserTest {

    @Resource
    private UsersMapper usersMapper;

    @Test
    public void testApp(){
        Users users =new Users();
        //users.setId();
        users.setUsername("张三");
        users.setPasswd("123");
        usersMapper.insertSelective(users);
    }

    @Test
    public void testFindUser() {
        Users users = usersMapper.findByUsernameAndPasswd("张三","123");
        System.out.println(users);
    }

}
