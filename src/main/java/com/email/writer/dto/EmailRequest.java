package com.email.writer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
    private String emailContent;
    private String tone;
}
