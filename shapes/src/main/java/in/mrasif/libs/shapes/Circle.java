package in.mrasif.libs.shapes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Circle extends View {
    private int WIDTH, HEIGHT;
    float pivotX, pivotY, radius;
    int color,border_color,border;

    public Circle(Context context) {
        super(context);
        init(context,null);
    }

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public Circle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @SuppressLint("NewApi")
    public Circle(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (null!=attrs){
            setAttrs(context,attrs);
        }
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Circle, 0, 0);
        pivotX=typedArray.getFloat(R.styleable.Circle_pivotX,0);
        pivotY=typedArray.getFloat(R.styleable.Circle_pivotY,0);
        radius=typedArray.getFloat(R.styleable.Circle_radius,0);
        color=typedArray.getColor(R.styleable.Circle_color,Color.BLACK);
        border=typedArray.getInteger(R.styleable.Circle_border,0);
        border_color=typedArray.getColor(R.styleable.Circle_border_color,color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.WIDTH=getWidth();
        this.HEIGHT=getHeight();
        Paint paint=new Paint();
        paint.setColor(color);
        Paint paintBorder=new Paint();
        paintBorder.setColor(border_color);
        if (HEIGHT>WIDTH){
            if (border>0) {
                canvas.drawCircle(pivotX * WIDTH, pivotY * WIDTH, radius * WIDTH, paintBorder);
                canvas.drawCircle(pivotX*WIDTH,pivotY*WIDTH,radius*WIDTH-border,paint);
            }
            else {
                canvas.drawCircle(pivotX * WIDTH, pivotY * WIDTH, radius * WIDTH, paint);
            }
        }
        else {
            if (border>0) {
                canvas.drawCircle(pivotX * HEIGHT, pivotY * HEIGHT, radius * HEIGHT, paintBorder);
                canvas.drawCircle(pivotX*HEIGHT,pivotY*HEIGHT,radius*HEIGHT-border,paint);
            }
            else {
                canvas.drawCircle(pivotX * HEIGHT, pivotY * HEIGHT, radius * HEIGHT, paint);
            }
        }
    }
}
