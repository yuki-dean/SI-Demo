package com.caih.iexp.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GenericResp {
    private int code;
    private String message;
}
