package com.safaricomet.interviewdemo.httpModels;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SharedModel {

    public boolean IsSuccessResponse;
    public String ErrorMessage;
    public Exception exception;
}
