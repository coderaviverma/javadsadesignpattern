package com.coderaviverma.springtestDummy;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
@Slf4j
public class SpringDummyTest {

    @Value("${spring.camunda.camundaHistoryFields}")
    private String camundaHistoryFields;

    protected static final Set<String> camundaFieldSet = new HashSet<>();

    public SpringDummyTest(){

    }
    @PostConstruct
    public void postConstruct(){
        if (camundaHistoryFields != null) {
            log.info("CustomVariableHistoryLevel camundaHistoryFields added in camundaHistoryFields {}", camundaHistoryFields);
            List<String> strings = Arrays.stream(camundaHistoryFields.split(",")).toList();
            camundaFieldSet.addAll(strings);
            log.info("CustomVariableHistoryLevel camundaHistoryFields added in camundaFieldSet size {}", camundaFieldSet.size());
        } else {
            throw new RuntimeException("camundaHistoryFields not found");
        }
    }

}
