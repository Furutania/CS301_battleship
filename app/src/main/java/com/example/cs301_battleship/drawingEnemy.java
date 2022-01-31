package com.example.cs301_battleship;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
public class drawingEnemy extends SurfaceView{

    private Paint blackPaint = new Paint();

    public drawingEnemy(Context context) {//default constructor,
        super(context);
        initPaints();
        setWillNotDraw(false);//sets visible
    }

    public drawingEnemy(Context context, AttributeSet attirs){
        super(context, attirs);
        initPaints();
        setWillNotDraw(false);//sets visible
    }

    public drawingEnemy(Context context, AttributeSet attirs, int defStyle){
        super(context, attirs, defStyle);
        initPaints();
        setWillNotDraw(false);//sets visible
    }

    private void initPaints(){
        this.blackPaint.setColor(0xFF00FF00);
        this.blackPaint.setStyle(Paint.Style.FILL);
    }


    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //FLOAT - like a double but half the number of bits
        //drawOval(x,y x2, y2, paint);
        canvas.drawRect(0.0f, 0.0f, 50.0f, 50.f, blackPaint);
        Bitmap grid = BitmapFactory.decodeResource(getResources(), R.drawable.updatedgrid);
        grid =  Bitmap.createScaledBitmap(grid, 1200, 1000, false);

        Bitmap redMarker = BitmapFactory.decodeResource(getResources(), R.drawable.hitmarker);
        redMarker =  Bitmap.createScaledBitmap(redMarker, 200, 150, false);

        Bitmap whiteMarker = BitmapFactory.decodeResource(getResources(), R.drawable.missmarker);
        whiteMarker =  Bitmap.createScaledBitmap(whiteMarker, 200, 150, false);

        Bitmap userSelection = BitmapFactory.decodeResource(getResources(), R.drawable.tagetselector);
        userSelection =  Bitmap.createScaledBitmap(userSelection, 200, 150, false);

        canvas.drawBitmap(grid, 0.0f, 0.0f, new Paint());
        canvas.drawBitmap(whiteMarker, 140.0f, 200.0f, new Paint());
        canvas.drawBitmap(redMarker, 410.0f, 200.0f, new Paint());
        canvas.drawBitmap(userSelection, 410.0f, 275.0f, new Paint());
    }

}
