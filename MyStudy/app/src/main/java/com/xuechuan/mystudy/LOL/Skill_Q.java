package com.xuechuan.mystudy.LOL;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.LOL
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 15:23
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Skill_Q extends Skills {
    public static final String TAG = Skill_Q.class.getSimpleName();
    private String skillname;

    public Skill_Q(Hero hero, String skillname) {
        super(hero);
        this.skillname = skillname;
    }

    @Override
    public void learSkills() {
        Log.d(TAG, "学习了 " + skillname);
        super.learSkills();
    }
}
