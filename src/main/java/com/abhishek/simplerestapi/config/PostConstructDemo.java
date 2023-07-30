package com.abhishek.simplerestapi.config;

import com.abhishek.simplerestapi.service.DownloadFileService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class PostConstructDemo {
    @Autowired
    ApplicationArguments arguments;

    @Autowired
    DownloadFileService file;

   @PostConstruct
    public void method() throws IOException {
        file.downloadFileFromAPI();
       System.out.println("Successfully downloaded file....");
    }


}
