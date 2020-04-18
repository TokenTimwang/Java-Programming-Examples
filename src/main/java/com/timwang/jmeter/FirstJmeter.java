package com.timwang.jmeter;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * @ Author  : Tim Wang
 * @ FileName: FirstJmeter.java
 * @ Time    : 2020/4/18 23:39
 */
public class FirstJmeter extends AbstractJavaSamplerClient {
    @Override
    public SampleResult runTest(JavaSamplerContext context) {
        System.out.println("Jmeter First");
        return null;
    }
}
