package com.EndpointTask;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.*;


import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@RestController

public class CustomController {
    @GetMapping("/TheData")
    public String getRadarData() throws IOException {
        ClassPathResource staticDataResource = new ClassPathResource("/data.json");
        String staticDataString = IOUtils.toString(staticDataResource.getInputStream(),StandardCharsets.UTF_8);



        return String.valueOf(new ResponseEntity<>(
                new JSONObject(staticDataString).toMap(),
                HttpStatus.OK
        ));


    }
}








