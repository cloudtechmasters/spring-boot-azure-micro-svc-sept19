package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AzureServicesController {

    //create a endpoint which returns all azure services

    @GetMapping("/getAllAzureServices")
    public List<String> getAllAzureServices(){
        return Arrays.asList("azure vm","azure app service","azure storage account");
    }
}
