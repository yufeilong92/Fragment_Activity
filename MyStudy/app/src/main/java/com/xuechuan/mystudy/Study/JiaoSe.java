package com.xuechuan.mystudy.Study;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.Study
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 15:50
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class JiaoSe implements AHero {
    private String name;

    public JiaoSe(String name) {
        this.name = name;
    }

    @Override
    public void Study() {
        Log.e("===",name+ "Study: " );
    }

    @Override
    public void Run() {
        Log.e("===",name+ "Run: " );
    }
}
