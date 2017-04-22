package com.example.miguelforero.recursosdediseno;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class OvaloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LienzoOvalo lienzo = new LienzoOvalo(this);
        setContentView(lienzo);
        setTitle(R.string.ovalo_titulo);
        Toast.makeText(this, R.string.toast_ovalo, Toast.LENGTH_SHORT).show();
    }
}

class LienzoOvalo extends View {

    float x = 5000;
    float y = 5000;
    Path path = new Path();

    Paint paint = new Paint();


    public LienzoOvalo(Context context) {
        super(context);
        paint.setColor(Color.rgb(40, 133, 255));

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);

        paint.setAntiAlias(true);
        canvas.drawPath(path, paint);
        path.addOval((x - 60), (y - 30), (x + 60), (y + 30), Path.Direction.CW);
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

