package com.example.miguelforero.recursosdediseno;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import android.widget.Toast;
public class RecatanguloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LienzoRectangulo lienzo= new LienzoRectangulo(this);
        setContentView(lienzo);
        setTitle(R.string.rectangulo_titulo);
        Toast.makeText(this, R.string.toast_rectangulo, Toast.LENGTH_SHORT).show();
    }
}
class LienzoRectangulo extends View {

    float x=5000;
    float y =5000;
    Path path= new Path();

    Paint paint= new Paint();


    public LienzoRectangulo(Context context){
        super(context);
        paint.setColor(Color.rgb(40,133,255));

    }

    public void onDraw(Canvas canvas){
        canvas.drawColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);

        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        path.addRect((x-60), (y-60), (x+100), (y+60), Path.Direction.CW);
    }

    public boolean onTouchEvent(MotionEvent event){


        if(event.getAction()== MotionEvent.ACTION_DOWN) {
            x=event.getX();
            y=event.getY();
        }

        invalidate();

        return true;
    }






}

