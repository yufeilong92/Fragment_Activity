package com.xuechuan.mystudy.LOL;

import android.util.Log;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.LOL
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 15:26
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Skill_W extends Skills {
    private String skillName;

    public Skill_W(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    public static final String TAG = Skill_W.class.getSimpleName();

    @Override
    public void learSkills() {
        Log.d(TAG, "学习了" + skillName);
        super.learSkills();
    }
}
