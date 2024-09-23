package com.mustafasalem.documentkeeper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentKeeperRestController {

    @GetMapping
    public String showSomeHardcodedData() {
        return "some hardcoded data";
    }

}
