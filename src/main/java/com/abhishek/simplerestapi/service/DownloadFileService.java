package com.abhishek.simplerestapi.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DownloadFileService {
    public void downloadFileFromAPI() throws IOException {
        RestTemplate restTemplate=new RestTemplate();
        JsonNode outputOfAPI=restTemplate.getForObject("https://fakestoreapi.com/products", JsonNode.class);
        System.out.println("outputOfAPI = " + outputOfAPI);
        Path path = Paths.get("outputs");
        System.out.println("path = " + path);
        // Create the file
        FileWriter writer = new FileWriter(path.toFile());

        // Write the content to the file
        writer.write(outputOfAPI.toPrettyString());

        // Close the writer to flush and release resources
        writer.close();

        System.out.println("File Successfully downloaded.........");

    }
}
