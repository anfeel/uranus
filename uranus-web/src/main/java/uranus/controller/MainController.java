package uranus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author anfeel
 * @version controller, v 0.1 2020/1/10 20:37 anfeel Exp $$
 */
@RestController
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("getServiceMsg")
    @GetMapping
    public String getMsg() {
        String url = "http://uranus-service/getMsg";
        return restTemplate.getForObject(url, String.class);
    }
}
