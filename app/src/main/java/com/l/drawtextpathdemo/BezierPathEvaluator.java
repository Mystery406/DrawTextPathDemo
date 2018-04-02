package com.l.drawtextpathdemo;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/**
 * Created by L on 2018/4/2.
 * Description:
 */
public class BezierPathEvaluator implements TypeEvaluator<PointF> {
    //控制点
    private PointF pointflagF1;
    private PointF pointflagF2;

    public BezierPathEvaluator(PointF pointflagF1, PointF pointflagF2) {
        this.pointflagF1 = pointflagF1;
        this.pointflagF2 = pointflagF2;
    }

    @Override
    public PointF evaluate(float fraction, PointF startValue, PointF endValue) {
        return BezierUtils.CalculateBezierPointForCubic(fraction,startValue,pointflagF1,pointflagF2, endValue);
    }

}