package xyz.n8ify.boardgamebuddy.salem.service.impl;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import xyz.n8ify.boardgamebuddy.salem.service.SalemResourceLoaderService;

import java.io.IOException;
import java.io.InputStream;

@Service
public class SalemResourceLoaderServiceImpl implements SalemResourceLoaderService {

    private final String DEFAULT_NIGHT_MODULATOR_TEMPLATE_0 = "static/salem/salem-nightmod-template-firstnight-default.mp3";
    private final String DEFAULT_NIGHT_MODULATOR_TEMPLATE_1 = "static/salem/salem-nightmod-template-full-default.mp3";

    private final String DEFAULT_NIGHT_MODULATOR_TEMPLATE_2_NO_CONSTABLE = "static/salem/salem-nightmod-template-no-constable-default.mp3";

    @Override
    public ResponseEntity<Resource> loadNightModulatorTemplateFirstNight() throws IOException {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(getClasspathResourceInputStream(DEFAULT_NIGHT_MODULATOR_TEMPLATE_0)));
    }

    @Override
    public ResponseEntity<Resource> loadNightModulatorTemplateFull() throws IOException {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(getClasspathResourceInputStream(DEFAULT_NIGHT_MODULATOR_TEMPLATE_1)));
    }

    @Override
    public ResponseEntity<Resource> loadNightModulatorTemplateNoConstable() throws IOException {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new InputStreamResource(getClasspathResourceInputStream(DEFAULT_NIGHT_MODULATOR_TEMPLATE_2_NO_CONSTABLE)));
    }

    private InputStream getClasspathResourceInputStream(String resource) throws IOException {
        return new ClassPathResource(resource).getInputStream();
    }

}
