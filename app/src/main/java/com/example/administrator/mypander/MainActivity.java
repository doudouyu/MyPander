package com.example.administrator.mypander;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);
        Pander pander = (Pander) findViewById(R.id.pander);
//        ObjectAnimator.ofFloat(pander, "scaleX", 0, 1, 2, 5, 2, 1).setDuration(5000).start();
//        ObjectAnimator.ofFloat(pander, "scaleY", 0, 1, 2, 5, 2, 1).setDuration(5000).start();
        RotateAnimation animation = new RotateAnimation(0, 360, RotateAnimation.RELATIVE_TO_PARENT, 0.5f,RotateAnimation.RELATIVE_TO_PARENT,0.5f);
        animation.setDuration(5000);
        ScaleAnimation animation1 = new ScaleAnimation(0f, 2f, 0f, 2f, RotateAnimation.RELATIVE_TO_PARENT,0.5f, RotateAnimation.RELATIVE_TO_PARENT,0.5f);
        animation1.setDuration(5000);
        ScaleAnimation animation2 = new ScaleAnimation(2f, 1f, 2f, 1f, RotateAnimation.RELATIVE_TO_PARENT,0.5f, RotateAnimation.RELATIVE_TO_PARENT,0.5f);
        animation2.setDuration(5000);
        tv.setAnimation(animation1);
        tv.setAnimation(animation);
        tv.setAnimation(animation2);
        pander.startAnimation(animation);
        pander.startAnimation(animation1);
//        pander.startAnimation(animation2);
    }


}
