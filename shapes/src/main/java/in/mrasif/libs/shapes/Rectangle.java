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

public class Rectangle extends View {

    private int WIDTH, HEIGHT;
    private int color;
    private float x1,y1,x2,y2,x3,y3,x4,y4;

    public Rectangle(Context context) {
        super(context);
        init(context,null);
    }

    public Rectangle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public Rectangle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @SuppressLint("NewApi")
    public Rectangle(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (null!=attrs){
            setAttrs(context,attrs);
        }
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Rectangle, 0, 0);
        String[] points=typedArray.getString(R.styleable.Rectangle_points).split(",");
        x1=Float.parseFloat(points[0]);
        y1=Float.parseFloat(points[1]);
        x2=Float.parseFloat(points[2]);
        y2=Float.parseFloat(points[3]);
        x3=Float.parseFloat(points[4]);
        y3=Float.parseFloat(points[5]);
        x4=Float.parseFloat(points[6]);
        y4=Float.parseFloat(points[7]);
        color=typedArray.getColor(R.styleable.Rectangle_color, Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.WIDTH=getWidth();
        this.HEIGHT=getHeight();

        Paint paint=new Paint();
        paint.setColor(color);
        drawRectangle(canvas,x1,y1,x2,y2,x3,y3,x4,y4,paint);

    }

    private void drawRectangle(Canvas canvas, float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4, Paint paint) {
        Path path=new Path();
        path.moveTo(x1*this.WIDTH,y1*this.HEIGHT);
        path.lineTo(x2*this.WIDTH,y2*this.HEIGHT);
        path.lineTo(x3*this.WIDTH,y3*this.HEIGHT);
        path.lineTo(x4*this.WIDTH,y4*this.HEIGHT);
        path.lineTo(x1*this.WIDTH,y1*this.HEIGHT);
        path.close();
        canvas.drawPath(path,paint);
    }
}
