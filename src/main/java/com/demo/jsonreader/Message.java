package com.demo.jsonreader;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
public class Message {
    private String sender;
    private String receiver;
    private String text;
    private boolean seen;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private ZonedDateTime sentDate;
}
