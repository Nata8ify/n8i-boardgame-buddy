package xyz.n8ify.boardgamebuddy.salem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/salem")
public class RedirectController {

    @GetMapping("/nightmod")
    public String redirectToNightmod() {
        return "salem/nightmod";
    }

}
