package liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login1(String userName, String password, HttpSession session) {
        if (userName.equals("123") && password.equals("123")) {
            session.setAttribute("loginUser", "1");
        }
        return "index";
    }
}
