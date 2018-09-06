package com.xuechuan.mystudy.Study;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: MyStudy
 * @Package com.xuechuan.mystudy.Study
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2018/8/13 16:14
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018
 */
public class Run implements AHero {
    @Override
    public void Study() {
       jiaoSe.Study();
    }

    @Override
    public void Run() {
        jiaoSe.Run();
    }
    private AHero jiaoSe;
    public Run(AHero jiaoSe) {
        this.jiaoSe = jiaoSe;
    }
}
