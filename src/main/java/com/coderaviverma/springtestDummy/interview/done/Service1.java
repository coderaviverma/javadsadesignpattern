package com.coderaviverma.springtestDummy.interview.done;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class Service1 {


    @Autowired
    @Lazy
    private Service2 service2;


}
