package com.xuechuan.mystudy.ZS;

import android.content.Context;
import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.ZS
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 14:59
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class SartIntentMain2 extends SartIntentTerm {
    public SartIntentMain2(StartIntent startIntent) {
        super(startIntent);
    }

    @Override
    public void newIntene(Context context) {
        super.newIntene(context);
        startInstent(context, startIntent);
    }

    private void startInstent(Context context, StartIntent startIntent) {
    }
}
