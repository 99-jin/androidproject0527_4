package kr.ac.yeonsung.androidproject0527_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnprev = findViewById(R.id.btn_priv);
        Button btnnext = findViewById(R.id.btn_next);
        btnprev.setOnClickListener(btnL);
        btnnext.setOnClickListener(btnL);
        viewFlipper = findViewById(R.id.flipper);
    }
    View.OnClickListener btnL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_priv:
                    viewFlipper.showPrevious();
                    break;
                case R.id.btn_next:
                    viewFlipper.showNext();
                    break;
            }
        }
    };
}