/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestBootController
 * Author:   Administrator
 * Date:     2019/2/27 0:04
 * Description: Test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.vuclip.read.controller;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Test〉
 *
 * @author Administrator
 * @create 2019/2/27
 * @since 1.0.0
 */
import cn.vuclip.read.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        return user;
    }
}
