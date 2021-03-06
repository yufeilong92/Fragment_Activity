package com.xuechuan.mystudy.ZS;

import android.content.Context;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.ZS
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 14:57
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public abstract class SartIntentTerm implements StartIntent {
    protected StartIntent startIntent;

    public SartIntentTerm(StartIntent startIntent) {
        this.startIntent = startIntent;
    }

    @Override
    public void newIntene(Context context) {
        startIntent.newIntene(context);
    }
}
