package itstep.firstspring.controllers;

import itstep.firstspring.entities.SiteContact;
import itstep.firstspring.repos.SiteContactsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactFormController {


    private final SiteContactsRepository contactsRepository;

    public ContactFormController(SiteContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    @PostMapping("/contact")
    public String sendContact(
            SiteContact siteContact){
           // @RequestParam(value = "name") String name,
           // @RequestParam(value = "email") String email,
           // @RequestParam(value = "phone") String phone,
           // @RequestParam(value = "message") String message) {
       // return "Incoming: \n" + name + "\n" + email + "\n" + phone + "\n" + message;

        contactsRepository.save(siteContact);//сохраняю сущность в репозиторий
        return "OK";
    }
}
