package com.xuechuan.mystudy.LOL;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.LOL
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 15:21
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class BlindMonk implements Hero {
    private String name;

    public static final String TAG = BlindMonk.class.getSimpleName();

    public BlindMonk(String name) {
        this.name = name;
    }
    @Override
    public void learSkills() {
        Log.d(TAG, name+"学习以上技能");
    }
}
