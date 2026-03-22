package com.myprojectaanuj.demo.advices;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ApiResponse<T> {
    private LocalDate timeStamp;
    private T data;
    private ApiError error;

    public ApiResponse() {
        this.timeStamp = LocalDate.now();
    }

    public ApiResponse(ApiError error) {
        this();
        this.error = error;
    }

    public ApiResponse(T data) {
        this();
        this.data = data;
    }
}
