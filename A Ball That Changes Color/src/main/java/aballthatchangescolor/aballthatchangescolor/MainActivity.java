package aballthatchangescolor.aballthatchangescolor;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int color = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("A Ball That Changes Color");

        if (savedInstanceState != null) {
            color = savedInstanceState.getInt("colorString");
        }

        setContentView(R.layout.activity_main);
    }

    //Changes color when user presses button
    public void changeColor(View view) {

        Button btn = (Button) findViewById(R.id.button);
        ColorPicker c = new ColorPicker(color);
        color = c.getColor();

        if (color == 1)
            btn.setBackgroundResource(R.drawable.circle);

        else if (color == 2)
            btn.setBackgroundResource(R.drawable.circle2);

        else if (color == 3)
            btn.setBackgroundResource(R.drawable.circle3);

        else if (color == 4)
            btn.setBackgroundResource(R.drawable.circle4);

        else if (color == 5)
            btn.setBackgroundResource(R.drawable.circle5);

        else if (color == 6)
            btn.setBackgroundResource(R.drawable.circle6);

        else if (color == 7)
            btn.setBackgroundResource(R.drawable.circle7);

        else if (color == 8)
            btn.setBackgroundResource(R.drawable.circle8);

        else if (color == 9)
            btn.setBackgroundResource(R.drawable.circle9);

        else
            btn.setBackgroundResource(R.drawable.circle10);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        outState.putInt("colorString", color);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        Button btn = (Button) findViewById(R.id.button);
        if (color == 1)
            btn.setBackgroundResource(R.drawable.circle);

        else if (color == 2)
            btn.setBackgroundResource(R.drawable.circle2);

        else if (color == 3)
            btn.setBackgroundResource(R.drawable.circle3);

        else if (color == 4)
            btn.setBackgroundResource(R.drawable.circle4);

        else if (color == 5)
            btn.setBackgroundResource(R.drawable.circle5);

        else if (color == 6)
            btn.setBackgroundResource(R.drawable.circle6);

        else if (color == 7)
            btn.setBackgroundResource(R.drawable.circle7);

        else if (color == 8)
            btn.setBackgroundResource(R.drawable.circle8);

        else if (color == 9)
            btn.setBackgroundResource(R.drawable.circle9);

        else
            btn.setBackgroundResource(R.drawable.circle10);

    }

}
