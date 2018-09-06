package com.xuechuan.mystudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.xuechuan.mystudy.LOL.BlindMonk;
import com.xuechuan.mystudy.LOL.Hero;
import com.xuechuan.mystudy.LOL.Skill_Q;
import com.xuechuan.mystudy.LOL.Skill_R;
import com.xuechuan.mystudy.LOL.Skill_W;
import com.xuechuan.mystudy.LOL.Skills;
import com.xuechuan.mystudy.Study.AHero;
import com.xuechuan.mystudy.Study.FootRun;
import com.xuechuan.mystudy.Study.JiaoSe;
import com.xuechuan.mystudy.Study.Run;
import com.xuechuan.mystudy.Study.SanGuo;
import com.xuechuan.mystudy.Study.StudyBook;
import com.xuechuan.mystudy.ZS.ActiviityA;
import com.xuechuan.mystudy.ZS.SartIntentMain2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mButton = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButton5 = (Button) findViewById(R.id.button5);
        mButton6 = (Button) findViewById(R.id.button6);

        mButton.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startIntent();
                break;
            case R.id.button2:
                lol();
                break;
            case R.id.button3:
                Study();
                break;
            case R.id.button4:
                Run();
                break;
            case R.id.button5:

                break;
            case R.id.button6:

                break;
        }
    }

    private void Run() {
        JiaoSe se = new JiaoSe("小明");
        Run run = new Run(se);
        FootRun footRun = new FootRun(run, "小河");
        footRun.Run();
    }

    private void Study() {
        AHero x = new JiaoSe("小米");
        StudyBook book = new StudyBook(x);
        StudyBook sanGuo = new SanGuo(book, "三国");
        sanGuo.Study();
    }

    private void lol() {
        Hero monk = new BlindMonk("as");
        Skills skills = new Skills(monk);
        Skills q = new Skill_Q(skills, "飞龙在天");
        Skills w = new Skill_W(q, "见龙在田");
        Skills r = new Skill_R(w, "亢龙有悔");
        r.learSkills();
    }

    private void startIntent() {
        ActiviityA a = new ActiviityA();
        SartIntentMain2 main2 = new SartIntentMain2(new ActiviityA());
        main2.newIntene(this);

    }
}
