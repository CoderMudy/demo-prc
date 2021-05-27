package com.demo.rpc.impl;

import com.demo.rpc.Log;

public class Logback implements Log {
    @Override 
    public void log(String info) { 
        System.out.println("Logback:" + info); 
    }

}
