package com.xuechuan.mystudy.Study;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.Study
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 15:52
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class StudyBook implements AHero {
    private AHero hero;

    public StudyBook(AHero hero) {
        this.hero = hero;
    }

    @Override
    public void Study() {
        if (hero != null)
            hero.Study();
    }

    @Override
    public void Run() {
        if (hero != null)
            hero.Study();
    }
}
