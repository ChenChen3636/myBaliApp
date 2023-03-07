package com.example.mybali;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mybali.RoomDataBase.Diary;
import com.example.mybali.RoomDataBase.DiaryDatabase;
import com.facebook.stetho.Stetho;

public class DiaryEditActivity extends AppCompatActivity {

    private Button btn_save;
    private EditText titleInput,descriptionInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_edit);
        titleInput = findViewById(R.id.titleInput);
        descriptionInput = findViewById(R.id.descriptionInput);
        btn_save = findViewById(R.id.save_button);

        //========================================================================================//

        btn_save.setOnClickListener((v -> {
            new Thread(() -> {
                String title = titleInput.getText().toString();
                String description = descriptionInput.getText().toString();
                long createdTime = System.currentTimeMillis();

                if (title.length() == 0 || description.length() == 0) return;
                Diary diary = new Diary(title,description,createdTime);
                DiaryDatabase.getInstance(this).getDiaryDao().insertData(diary);
                runOnUiThread(() -> {
                    titleInput.setText("");
                    descriptionInput.setText("");
                });
                //================================================================================//
                Intent intent = new Intent();
                intent.setClass(DiaryEditActivity.this,DiaryActivity.class);
                startActivity(intent);
            }).start();
        }));
    }

//==================================================================================================

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
