package com.xuechuan.mystudy.Study;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.Study
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 15:54
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class SanGuo extends StudyBook {
    private String bookName;


    public SanGuo(AHero hero, String bookName) {
        super(hero);
        this.bookName = bookName;
    }

    @Override
    public void Study() {
        super.Study();
        Log.e("===", "Study: " + bookName);
    }
}
