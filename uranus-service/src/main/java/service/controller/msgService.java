package service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anfeel
 * @version service.controller, v 0.1 2020/1/10 21:11 anfeel Exp $$
 */
@RestController
public class msgService {

    @RequestMapping("getMsg")
    public String getMsg() {
        return "123";
    }
}


