package ru.itcube.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainDraw extends View {

    public static class Round extends View {
        public Round(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setSubpixelText(true);

            canvas.drawCircle(100, 100, 100, paint);
        }
    }

    public MainDraw(Context context) {
        super(context);
        round = new Round(context);
        round.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                v.animate().setDuration(3000).translationX(600);
            }
        });
    }

    Round round;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setSubpixelText(true);

        // drawARGB()/drawRGB()/drawColor()	Заполняет холст сплошным цветом
        // drawArc()	Рисует дугу между двумя углами внутри заданной прямоугольной области
        // drawBitmap()	Рисует растровое изображение на холсте
        // drawCircle()	Рисует окружность с определенным радиусом вокруг заданной точки
        // drawLine(s)()	Рисует линию (или последовательность линий) между двумя точками
        // drawOval()	Рисует овал на основе прямоугольной области
        // drawPaint()	Закрашивает весь холст с помощью заданного объекта Paint
        // drawPath()	Рисует указанный контур, используется для хранения набора графических примитивов в виде единого объекта
        // drawPicture()	Рисует объект Picture внутри заданного прямоугольника
        // drawPoint()	Рисует точку в заданном месте
        // drawRect()	Рисует прямоугольник
        // drawText()	Рисует текстовую строку на холсте
        // rotate() и restore()	Вращение холста
        // scale() и translate()	Изменение и перемещение координатной системы

//        canvas.drawColor(Color.WHITE);
        round.draw(canvas);
//        canvas.drawArc(20, 20, getWidth(), getHeight(), 0, 30, true, paint);
//
//        Bitmap image = BitmapFactory.decodeResource(getResources(), R.drawable.simpsons);

////
//        paint.setTextSize(90);
//        canvas.drawText("Some Text", 50, 200, paint);
////
//        canvas.rotate(45, 20, 20);
//        canvas.drawBitmap(image, 20, 20, paint);
////
//        canvas.drawBitmap(image, 100, 300, paint);
////
//        paint.setColor(Color.BLUE);
//        canvas.drawText("Hello Rotated", 100, 300, paint);
////
//        canvas.rotate(-45, 200, 200);
////
//        canvas.drawText("Hello Normal", 100, 300, paint);
//
//        paint.setTextSize(120);
//        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawText("STROKE", 600, 300, paint);
    }
}
