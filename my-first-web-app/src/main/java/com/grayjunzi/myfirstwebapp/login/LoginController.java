package com.grayjunzi.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginPOST(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if (!authenticationService.authenticate(name, password)) {
            model.put("errorMessage","Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }
}
