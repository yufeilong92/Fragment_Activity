package com.xuechuan.inter;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: demo
 * @Package com.xuechuan.inter
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/9/6 15:24
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public abstract class FunctionWithParamOnly<Param> extends Function {
    public FunctionWithParamOnly(String functionName) {
        super(functionName);
    }

    public abstract void function(Param param);
}
