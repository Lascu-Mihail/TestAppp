package TestApp.example.TestApp.Controller;

import TestApp.example.TestApp.Entity.User;
import TestApp.example.TestApp.Service.ConfirmationService;
import TestApp.example.TestApp.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class RegistrationController {

    private ConfirmationService confirmationService;
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) { // !!!!!!!!!
        model.addAttribute("user", new User());
        return "registration";
    }
    @PostMapping("signUpUser")
    public String signUpUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registration";
        }
        userService.signUpUser(user);
        return "redirect:/";
    }

    @GetMapping(path = "/registration/confirm")
    public String confirm(@RequestParam("token") String token){
        return confirmationService.confirmToken(token);
    }

}
