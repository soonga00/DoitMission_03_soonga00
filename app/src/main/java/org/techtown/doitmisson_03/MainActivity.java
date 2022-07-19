package org.techtown.doitmisson_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onButtonUpClicked();}
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onButtonDownClicked();}
        });
        onButtonUpClicked();
    }

    public void onButtonUpClicked() {
        imageView.setImageResource(R.drawable.dog);
        imageView2.setImageResource(0);

        imageView.invalidate();
        imageView2.invalidate();
    }
    public void onButtonDownClicked() {
        imageView.setImageResource(0);
        imageView2.setImageResource(R.drawable.dog);

        imageView.invalidate();
        imageView2.invalidate();
    }

}