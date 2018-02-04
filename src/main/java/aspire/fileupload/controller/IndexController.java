package aspire.fileupload.controller;

import aspire.fileupload.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired IUserService userService;

    @RequestMapping("/")
    public String index() {
        return "Welcome to Aspire File Upload Service!";
    }

    @RequestMapping("/fileUpload")
    public String fileUpload() {
        return userService.authenticated() + "File uploaded!";
    }
}
