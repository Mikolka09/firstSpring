package itstep.firstspring.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactFormController {
    @PostMapping("/contact")
    public String sendContact(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "phone") String phone,
            @RequestParam(value = "message") String message) {
        return "Incoming: \n" + name + "\n" + email + "\n" + phone + "\n" + message;
    }
}
