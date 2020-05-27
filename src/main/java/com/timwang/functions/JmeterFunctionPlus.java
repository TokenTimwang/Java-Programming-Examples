package com.timwang.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ Author  : Tim Wang
 * @ FileName: JmeterFunctionPlus.java
 * @ Time    : 2020/4/17 23:15
 */
public class JmeterFunctionPlus extends AbstractFunction {


    private Object[] objects;

    public JmeterFunctionPlus(Object[] objects) {
        this.objects = objects;
    }

    /**
     * 执行方法 包名一定要function
     * @param previousResult
     * @param currentSampler
     * @return
     * @throws InvalidVariableException
     */
    @Override
    public String execute(SampleResult previousResult, Sampler currentSampler) throws InvalidVariableException {
        System.out.println("Jmeter execute run!!!");

        CompoundVariable first = (CompoundVariable) objects[0];
        System.out.println("第一个参数:" + first);
        //存储第一个参数和第二个参数
        CompoundVariable second = (CompoundVariable) objects[1];
        System.out.println("第二个参数:" + second);

        int count = new Integer(first.execute().trim()) + new Integer((second.execute().trim()));
        System.out.println("两数相加之和:" + count);
        return String.valueOf(count);
    }

    /**
     * 设置参数，接收用户传递的参数
     *
     * @ param parameters
     * @ throws InvalidVariableException
     */
    @Override
    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        checkMinParameterCount(parameters, 2);
        objects = parameters.toArray();
    }

    /**
     * 功能名称
     *
     * @ return __MyDemo
     */
    @Override
    public String getReferenceKey() {

        System.out.println("Jmeter getReferenceKey run!!!");
        return "__MyPlus";
    }

    /**
     * 功能描述，参数描述
     *
     * @ return desc
     */
    @Override
    public List<String> getArgumentDesc() {
        System.out.println("Jmeter getArgumentDesc run!!!");
        List<String> list = new ArrayList<>();
        list.add("第一个数字");
        list.add("第二个数字");
        return list;
    }
}
