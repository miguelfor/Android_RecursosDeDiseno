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

public class CirculoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LienzoCirculo lienzo = new LienzoCirculo(this);
        setContentView(lienzo);
        setTitle(R.string.circulo_titulo);
        Toast.makeText(this, R.string.toast_circulo, Toast.LENGTH_SHORT).show();
    }
}

class LienzoCirculo extends View {

    float x = 5000;
    float y = 5000;
    Path path = new Path();

    Paint paint = new Paint();


    public LienzoCirculo(Context context) {
        super(context);
        paint.setColor(Color.rgb(156, 39, 176));

    }

    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);

        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        path.addCircle(x, y, 50, Path.Direction.CW);
    }

    public boolean onTouchEvent(MotionEvent event) {


        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            x = event.getX();
            y = event.getY();
        }

        invalidate();

        return true;
    }



}

