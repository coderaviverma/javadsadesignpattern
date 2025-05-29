package com.coderaviverma.springtestDummy.java;

import java.io.*;

public class ExceptionTest {

    public static void main(String[] args) {



        try(BufferedReader bf=new BufferedReader(new FileReader(""))){



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
