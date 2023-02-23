package com.example.mybali;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class DiaryEditActivity extends AppCompatActivity {

    Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_edit);

        //Demo用，儲存後先跳轉回日記主頁
        btn_save = findViewById(R.id.save_button);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(DiaryEditActivity.this,DiaryActivity.class);
                startActivity(intent);
            }
        });
    }



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioBtn_1:
                if (checked) {
                    String value = "1";
                }
                    break;
            case R.id.radioBtn_2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radioBtn_3:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radioBtn_4:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radioBtn_5:
                if (checked)
                    // Pirates are the best
                    break;
        }
    }
}
