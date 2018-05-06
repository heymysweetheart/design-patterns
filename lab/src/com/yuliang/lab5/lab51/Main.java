package com.yuliang.lab5.lab51;

public class Main {
    public static void main(String[] args) {
        TraceFactory traceFactory = new ConcreteTraceFactory();
        Trace logTrace = traceFactory.getTrace("trace.log");
        Trace terminalTrace = traceFactory.getTrace("terminal");
    }
}
