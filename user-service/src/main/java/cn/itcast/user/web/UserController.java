package cn.itcast.user.web;

import cn.itcast.user.config.PatternProperties;
import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
@RequestMapping("/user")
//@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PatternProperties patternProperties;

//    @Value("${pattern.envDevValue}")
//    private String envDevValue;
//
//    @Value("${pattern.envSharedValue}")
//    private String envSharedValue;

    @GetMapping("/data")
    public String now(){
        return "特有："+patternProperties.getEnvSharedValue()+" 共有："+patternProperties.getEnvDevValue();
    }

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }

    @GetMapping("/getHeader")
    public String getHeader(@RequestHeader(value = "user",required = false) String user){
        return user;
    }
}
