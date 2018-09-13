package in.mrasif.libs.shapes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class Triangle extends View {

    private int WIDTH, HEIGHT;
    private float x1,y1,x2,y2,x3,y3;
    private int color;

    public Triangle(Context context) {
        super(context);
        init(context,null);
    }

    public Triangle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public Triangle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @SuppressLint("NewApi")
    public Triangle(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (null!=attrs){
            setAttrs(context,attrs);
        }
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Triangle, 0, 0);

        String[] points=typedArray.getString(R.styleable.Triangle_points).split(",");
        x1=Float.parseFloat(points[0]);
        y1=Float.parseFloat(points[1]);
        x2=Float.parseFloat(points[2]);
        y2=Float.parseFloat(points[3]);
        x3=Float.parseFloat(points[4]);
        y3=Float.parseFloat(points[5]);
        color=typedArray.getColor(R.styleable.Triangle_color,Color.BLACK);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.WIDTH=getWidth();
        this.HEIGHT=getHeight();
        Paint paint=new Paint();
        paint.setColor(color);
        drawTriangle(canvas,x1,y1,x2,y2,x3,y3,paint);
    }

    private void drawTriangle(Canvas canvas, float x1, float y1, float x2, float y2, float x3, float y3, Paint paint) {
        Path path=new Path();
        path.moveTo(x1*this.WIDTH,y1*this.HEIGHT);
        path.lineTo(x2*this.WIDTH,y2*this.HEIGHT);
        path.lineTo(x3*this.WIDTH,y3*this.HEIGHT);
        path.lineTo(x1*this.WIDTH,y1*this.HEIGHT);
        path.close();
        canvas.drawPath(path,paint);
    }
}
