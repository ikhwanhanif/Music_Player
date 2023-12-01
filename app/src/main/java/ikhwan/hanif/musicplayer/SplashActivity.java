package ikhwan.hanif.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    ImageView iconImage;
    TextView tittleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iconImage = findViewById(R.id.imageIcon);
        tittleText = findViewById(R.id.textTittle);

        Animation animationZoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_anim);
        iconImage.startAnimation(animationZoom);

        Animation animationSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up_anim);
        tittleText.startAnimation(animationSlideUp);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();

            }
        },2000);

    }
}