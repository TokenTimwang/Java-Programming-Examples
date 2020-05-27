package com.timwang.jmeter;

import org.apache.jmeter.protocol.http.sampler.HTTPAbstractImpl;
import org.apache.jmeter.protocol.http.sampler.HTTPSampleResult;
import org.apache.jmeter.protocol.http.sampler.HTTPSamplerBase;

import java.net.URL;

/**
 * @ Author  : Tim Wang
 * @ FileName: HttpJmeter.java
 * @ Time    : 2020/4/24 16:45
 */
public class HttpJmeter extends HTTPAbstractImpl {
    protected HttpJmeter(HTTPSamplerBase testElement) {
        super(testElement);
    }

    @Override
    protected HTTPSampleResult sample(URL url, String method, boolean areFollowingRedirect, int frameDepth) {
        System.out.println("HttpJmeter");
        return null;
    }

    @Override
    public boolean interrupt() {
        return false;
    }
}
