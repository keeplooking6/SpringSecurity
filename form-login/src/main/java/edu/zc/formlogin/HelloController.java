package edu.zc.formlogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: keeplooking
 * @since: 2021/08/24 - 19:52
 */

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello,这里是spring security的学习过程";
    }
}
