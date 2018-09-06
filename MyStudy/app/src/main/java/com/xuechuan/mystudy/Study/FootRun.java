package com.xuechuan.mystudy.Study;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.Study
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 16:19
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class FootRun extends Run {
    private String hera;

    public FootRun(AHero aHero, String hera) {
        super(aHero);
        this.hera = hera;
    }

    @Override
    public void Run() {
        super.Run();
        seetBook();
    }

    private void seetBook() {
        Log.e("===", "Run: " + hera);
    }
}
