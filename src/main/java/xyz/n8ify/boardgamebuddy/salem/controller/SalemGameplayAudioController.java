package xyz.n8ify.boardgamebuddy.salem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.n8ify.boardgamebuddy.salem.service.SalemResourceLoaderService;

import java.io.IOException;

@RestController
@RequestMapping("/salem/audio")
public class SalemGameplayAudioController {

    @Autowired
    private SalemResourceLoaderService salemResourceLoaderService;

    @GetMapping("/nightModulatorTemplateFirstNight")
    public ResponseEntity<Resource> loadNightModulatorTemplateFirstNight() throws IOException {
        return salemResourceLoaderService.loadNightModulatorTemplateFirstNight();
    }

    @GetMapping("/nightModulatorTemplateFull")
    public ResponseEntity<Resource> loadNightModulatorTemplateFull() throws IOException {
        return salemResourceLoaderService.loadNightModulatorTemplateFull();
    }

    @GetMapping("/nightModulatorTemplateNoConstable")
    public ResponseEntity<Resource> loadNightModulatorTemplateNoConstable() throws IOException {
        return salemResourceLoaderService.loadNightModulatorTemplateNoConstable();
    }

}
