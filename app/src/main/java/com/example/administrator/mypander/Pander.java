package com.example.administrator.mypander;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;

/**
 * Created by Administrator on 2016/12/9.
 */
public class Pander extends View {

    private Paint paint;

    public Pander(Context context) {
        super(context);
        initPaint();
    }

    public Pander(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Pander(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);//抗锯齿
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        //画背景矩形
        RectF rectF = new RectF(50, 50, 640, 640);
        canvas.drawRect(rectF, paint);
        canvas.save();
        //画黑色大圆圈
        paint.setColor(Color.BLACK);
        canvas.drawCircle(350, 350, 240, paint);
        canvas.save();
        paint.setColor(Color.WHITE);
        canvas.drawCircle(350, 350, 238, paint);
        canvas.save();
        //画左边的耳朵
        paint.setColor(Color.BLACK);
        canvas.drawCircle(220, 220, 50, paint);
        canvas.save();
        paint.setColor(Color.WHITE);
        canvas.drawCircle(220, 220, 30, paint);
        canvas.save();
        //画右边的耳朵
        paint.setColor(Color.BLACK);
        canvas.drawCircle(480, 220, 50, paint);
        canvas.save();
        paint.setColor(Color.WHITE);
        canvas.drawCircle(480, 220, 30, paint);
        canvas.save();
        //画熊脸
        paint.setColor(Color.BLACK);
        rectF.set(200, 200, 500, 480);
        canvas.drawOval(rectF, paint);
        canvas.save();
        //画左眼
        paint.setColor(Color.WHITE);
        canvas.drawCircle(300, 300, 40, paint);
        canvas.save();
        //画右眼
        canvas.drawCircle(400, 300, 40, paint);
        canvas.save();

        //左眼珠
        paint.setColor(Color.BLACK);
        rectF.set(295, 285, 310, 315);
        canvas.drawOval(rectF, paint);
        canvas.save();
        //右眼珠
        rectF.set(395, 285, 410, 315);
        canvas.drawOval(rectF, paint);
        canvas.save();
        //左腮红
        paint.setColor(Color.RED);
        canvas.drawCircle(230, 380, 40, paint);
        canvas.save();
        //右腮红
        paint.setColor(Color.RED);
        canvas.drawCircle(470, 380, 40, paint);
        canvas.save();
        paint.setColor(Color.BLACK);
        Path path = new Path();
        path.moveTo(260, 450);
        path.lineTo(440, 450);
        path.lineTo(500, 540);
        path.lineTo(200, 540);
        path.close();
        canvas.drawPath(path, paint);
        canvas.save();
        rectF.set(204, 468, 494, 588);
        canvas.drawArc(rectF, 0, 180, true, paint);
        canvas.save();
        //画鼻子
        paint.setColor(Color.WHITE);
        rectF.set(290, 360, 420, 460);
        canvas.drawOval(rectF, paint);
        canvas.save();
        paint.setColor(Color.BLACK);
        rectF.set(320, 370, 390, 400);
        canvas.drawOval(rectF, paint);
        canvas.save();
        rectF.set(310, 400, 400, 440);
        canvas.drawArc(rectF, 0, 180, false, paint);//小弧形
        canvas.save();
        //左眉毛
        paint.setColor(Color.WHITE);
        rectF.set(270, 220, 330, 260);
        canvas.drawArc(rectF, 180, 180, false, paint);//小弧形
        canvas.save();
        paint.setColor(Color.BLACK);
        rectF.set(270, 230, 330, 280);
        canvas.drawArc(rectF, 180, 180, false, paint);//小弧形
        canvas.save();
        //右眉毛
        paint.setColor(Color.WHITE);
        rectF.set(370, 220, 430, 260);
        canvas.drawArc(rectF, 180, 180, false, paint);//小弧形
        canvas.save();
        paint.setColor(Color.BLACK);
        rectF.set(370, 230, 430, 280);
        canvas.drawArc(rectF, 180, 180, false, paint);//小弧形
        canvas.save();
//        Path path1 = new Path();
//        paint.reset();
//        paint.setColor(Color.YELLOW);
//        paint.setStrokeWidth(10);
//        paint.setStyle(Paint.Style.STROKE);
//        path1.moveTo(260,240);
//        path1.quadTo(150, 310, 170, 400);
//        canvas.drawPath(path1,paint);
    }
}
