package com.backendbookstore.dto;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private T data;
    private String message;
    private int status;
}
