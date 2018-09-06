package com.xuechuan.mystudy.ZS;

import android.content.Context;
import android.content.Intent;

import com.xuechuan.mystudy.Main3Activity;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.ZS
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 14:56
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class ActivityB implements StartIntent {
    @Override
    public void newIntene(Context context) {
        Intent intent = new Intent(context, Main3Activity.class);
        context.startActivity(intent);
    }
}
