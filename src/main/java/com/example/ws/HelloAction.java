package com.example.ws;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }


}
