package world.tawa.biz.controller;

import io.itit.springboot.controller.ProxyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tawa on 2018-12-16
 */
@Controller
@EnableAutoConfiguration
public class ApiController extends ProxyController {
    //
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
    //
    @RequestMapping("/")
    public void index(HttpServletResponse resp) throws IOException {
        String url = "/index.html";
        resp.sendRedirect(url);
    }

}
