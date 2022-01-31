package com.example.cs301_battleship;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class drawing extends SurfaceView {

    private Paint blackPaint = new Paint();


    public drawing(Context context) {//default constructor,
        super(context);
        initPaints();
        setWillNotDraw(false);//sets visible
    }

    public drawing(Context context, AttributeSet attirs){
        super(context, attirs);
        initPaints();
        setWillNotDraw(false);//sets visible
    }

    public drawing(Context context, AttributeSet attirs, int defStyle){
        super(context, attirs, defStyle);
        initPaints();
        setWillNotDraw(false);//sets visible
    }

    private void initPaints(){
        this.blackPaint.setColor(0xFFFF0000);
        this.blackPaint.setStyle(Paint.Style.FILL);
    }


    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //FLOAT - like a double but half the number of bits
        //drawOval(x,y x2, y2, paint);
        canvas.drawRect(0.0f, 0.0f, 50.0f, 50.f, blackPaint);
        //CREATES GRID
        Bitmap grid = BitmapFactory.decodeResource(getResources(), R.drawable.updatedgrid);
        grid =  Bitmap.createScaledBitmap(grid, 500, 500, false);



        //CREATES 5 hp BS
        Bitmap fivehp = BitmapFactory.decodeResource(getResources(), R.drawable.fivehpbs);
        fivehp =  Bitmap.createScaledBitmap(fivehp, 450, 500, false);

        //CREATES 4 hp BS #1
        Bitmap fourhp1 = BitmapFactory.decodeResource(getResources(), R.drawable.fourhpbs);
        fourhp1 =  Bitmap.createScaledBitmap(fourhp1, 350, 500, false);

        //CREATES 4 hp BS #2
        Bitmap fourhp2 = BitmapFactory.decodeResource(getResources(), R.drawable.fourhpbs);
        fourhp2 =  Bitmap.createScaledBitmap(fourhp2, 350, 500, false);


        //CREATES 3 hp BS #1
        Bitmap threehp1 = BitmapFactory.decodeResource(getResources(), R.drawable.threehpbs);
        threehp1 =  Bitmap.createScaledBitmap(threehp1, 400, 400, false);
        //CREATES 3 hp BS #2
        Bitmap threehp2 = BitmapFactory.decodeResource(getResources(), R.drawable.threehpbs);
        threehp2 =  Bitmap.createScaledBitmap(threehp2, 400, 400, false);
        //CREATES 2 hp BS
        Bitmap twohp = BitmapFactory.decodeResource(getResources(), R.drawable.twohpbs);
        twohp =  Bitmap.createScaledBitmap(twohp, 300, 300, false);





        Bitmap redMarker = BitmapFactory.decodeResource(getResources(), R.drawable.hitmarker);
        redMarker =  Bitmap.createScaledBitmap(redMarker, 100, 75, false);

        Bitmap whiteMarker = BitmapFactory.decodeResource(getResources(), R.drawable.missmarker);
        whiteMarker =  Bitmap.createScaledBitmap(whiteMarker, 100, 75, false);

        canvas.drawBitmap(grid, 0.0f, 0.0f, new Paint());
        canvas.drawBitmap(fivehp, 0.0f, 0.0f, new Paint());
        canvas.drawBitmap(fourhp1, -25.0f, -110.0f, new Paint());
        canvas.drawBitmap(fourhp2, 130.0f, 150.0f, new Paint());
        canvas.drawBitmap(threehp1, -60.0f, 200.0f, new Paint());
        canvas.drawBitmap(threehp2, -60.0f, 240.0f, new Paint());
        canvas.drawBitmap(twohp, 200.0f, -50.0f, new Paint());

        canvas.drawBitmap(whiteMarker, 90.0f, 65.0f, new Paint());
        canvas.drawBitmap(whiteMarker, 90.0f, 135.0f, new Paint());

        canvas.drawBitmap(redMarker, 90.0f, 95.0f, new Paint());

    }


}
