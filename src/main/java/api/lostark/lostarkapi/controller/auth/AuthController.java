package api.lostark.lostarkapi.controller.auth;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
@Log4j2
@RequiredArgsConstructor
public class AuthController {

    @GetMapping("/login")
    public void loginGET(String error, String logout){
        log.info("loginGET**************************************");
        log.info("logout : " + logout);

        if(logout != null){
            log.info("user logout......");
        }
    }
}