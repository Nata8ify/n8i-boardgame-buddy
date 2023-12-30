package xyz.n8ify.boardgamebuddy.salem.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface SalemResourceLoaderService {

    ResponseEntity<Resource> loadNightModulatorTemplateFirstNight() throws IOException;
    ResponseEntity<Resource> loadNightModulatorTemplateFull() throws IOException;
    ResponseEntity<Resource> loadNightModulatorTemplateNoConstable() throws IOException;

}
