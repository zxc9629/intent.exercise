package kr.teamcadi.intentexercise;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.id;

public class intent_exercise extends Activity
{
    Button btn_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_exercise);

        btn_intent = (Button) findViewById(R.id.btn_intent);

        btn_intent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent goMain=new Intent(intent_exercise.this, MainActivity.class);
                startActivity(goMain);
                finish();

            }
        });
    }
}
