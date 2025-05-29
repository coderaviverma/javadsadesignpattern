package com.coderaviverma.springtestDummy.interview.done;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class Service2 {



    @PostConstruct
    public void setSerive1(Service1 serive1){

    }
}
