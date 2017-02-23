package org.jonathancaryl.imeutils.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.jonathancaryl.imeutils.ImeUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonShow = (Button)findViewById(R.id.button_show);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImeUtils.from(view).showIme();
            }
        });
        final Button buttonHide = (Button)findViewById(R.id.button_hide);
        buttonHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImeUtils.from(view).hideIme();
            }
        });
    }
}
