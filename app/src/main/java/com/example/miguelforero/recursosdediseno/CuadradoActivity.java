package com.example.miguelforero.recursosdediseno;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class CuadradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LienzoCuadrado lienzo = new LienzoCuadrado(this);
        setContentView(lienzo);
        setTitle(R.string.cuadrado_titulo);
        Toast.makeText(this, R.string.toast_cuadrado, Toast.LENGTH_SHORT).show();
    }
}

class LienzoCuadrado extends View {

    float x = 5000;
    float y = 5000;
    Path path = new Path();

    Paint paint = new Paint();


    public LienzoCuadrado(Context context) {
        super(context);
        paint.setColor(Color.rgb(139, 195, 74));

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);

        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        path.addRect(x, x, x, x, Path.Direction.CW);
        path.addRect((x - 60), (y - 60), (x + 60), (y + 60), Path.Direction.CW);
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

