package com.hz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {

    public String readLine() {

        String msg;

        try{
            msg = new BufferedReader(
                    new InputStreamReader(System.in))
                    .readLine();
        }
        catch(Exception ex) {
            msg = "Could not read input..";
        }

        return msg;
    }
}
