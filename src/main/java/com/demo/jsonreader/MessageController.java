package com.demo.jsonreader;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @PostMapping("/messages")
    public ResponseEntity<String> createMessage(@RequestBody Message message, @RequestHeader("authentication") String authenticationHeader) {
        if ("devmind-api-key".equals(authenticationHeader)) {
            // Authentication successful, return 201 status code
            return ResponseEntity.status(HttpStatus.CREATED).body("Message created successfully");
        } else {
            // Authentication failed, return 401 status code
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }

}
