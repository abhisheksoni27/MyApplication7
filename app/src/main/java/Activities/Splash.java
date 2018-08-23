package Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import dreamnyc.myapplication.R;

public class Splash extends AppCompatActivity {

    private Handler waitPost = new Handler();
    private int SPLASH_TIME = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        final Intent splashOver = new Intent(this, MainActivity.class);
        waitPost.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(splashOver);
                finish();

            }
        }, SPLASH_TIME);

    }

}