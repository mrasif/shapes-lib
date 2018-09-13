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

public class Square extends View {

    private int WIDTH, HEIGHT;
    private int color, border_color, border;

    public Square(Context context) {
        super(context);
        init(context,null);
    }

    public Square(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public Square(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @SuppressLint("NewApi")
    public Square(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (null!=attrs){
            setAttrs(context,attrs);
        }
    }

    private void setAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Square, 0, 0);
        color=typedArray.getColor(R.styleable.Square_color, Color.BLACK);
        border=typedArray.getInteger(R.styleable.Square_border,0);
        border_color=typedArray.getColor(R.styleable.Square_border_color,color);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.WIDTH=getWidth();
        this.HEIGHT=getHeight();

        Paint paint=new Paint();
        paint.setColor(color);
        drawRectangle(canvas,0,this.WIDTH,0,this.HEIGHT,paint);
        
        if (border>0){
            paint.setColor(border_color);
            drawRectangle(canvas,0,this.WIDTH,0,border, paint);
            drawRectangle(canvas,this.WIDTH-border,this.WIDTH,0,this.HEIGHT, paint);
            drawRectangle(canvas,0,this.WIDTH,this.HEIGHT-border,this.HEIGHT, paint);
            drawRectangle(canvas,0,border,0,this.HEIGHT, paint);
        }

    }

    private void drawRectangle(Canvas canvas, int x1, int x2, int y1, int y2, Paint paint) {
        Path path=new Path();
        path.moveTo(x1,y1);
        path.lineTo(x2,y1);
        path.lineTo(x2,y2);
        path.lineTo(x1,y2);
        path.lineTo(x1,y1);
        path.close();
        canvas.drawPath(path,paint);
    }
}
