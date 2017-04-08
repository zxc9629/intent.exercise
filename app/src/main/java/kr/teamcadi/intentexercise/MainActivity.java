package kr.teamcadi.intentexercise;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Handler hand = new Handler();
                hand.postDelayed(new Runnable() {
                    @Override
                    public void run()
                    {
                        Toast.makeText(MainActivity.this,"경북대학교", Toast.LENGTH_SHORT).show();
                    }
                },1000);
            }
        });
    }
}
