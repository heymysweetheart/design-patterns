package com.yuliang.lab5.lab51;

public class ConcreteTraceFactory implements TraceFactory{
    @Override
    public Trace getTrace(String type) {
        if("trace.log".equals(type)) {
            return new FileTrace();
        }
        return new ConsoleTrace();
    }
}
