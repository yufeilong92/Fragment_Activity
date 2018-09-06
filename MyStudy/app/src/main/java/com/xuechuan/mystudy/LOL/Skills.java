package com.xuechuan.mystudy.LOL;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.LOL
 * @Description: 实现类
 * @author: L-BackPacker
 * @date: 2018/8/13 15:22
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public  class Skills implements Hero {
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learSkills() {
        if (hero != null)
            hero.learSkills();
    }
}
