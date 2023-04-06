package ro.pub.cs.systems.eim.practicaltest01var06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText leftEditText;
    private EditText middleEditText;
    private EditText rightEditText;
    private CheckBox hold_1, hold_2, hold_3;
    private Button playButton;
    private int rand;
    public int checkboxes = 0;
    public int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftEditText = (EditText)findViewById(R.id.left_number);
        middleEditText = (EditText)findViewById(R.id.middle_number);
        rightEditText = (EditText)findViewById(R.id.right_number);

        leftEditText.setText("0");
        middleEditText.setText("0");
        rightEditText.setText("0");

        hold_1 = (CheckBox)findViewById(R.id.button);
        hold_2 = (CheckBox)findViewById(R.id.button2);
        hold_3 = (CheckBox)findViewById(R.id.button3);

        playButton = (Button)findViewById(R.id.button_play);
        playButton.setOnClickListener(buttonClickListener);
    }

    private ButtonClickListener buttonClickListener = new ButtonClickListener();


    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button_play:
                    if(!hold_1.isChecked()) {
                        rand = new Random().nextInt(4);
                        leftEditText.setText(String.valueOf(rand));
                    }
                    else {
                        checkboxes += 1;
                    }
                    if(!hold_2.isChecked()) {
                        rand = new Random().nextInt(4);
                        middleEditText.setText(String.valueOf(rand));
                    }
                    else {
                        checkboxes += 1;
                    }
                    if(!hold_3.isChecked()) {
                        rand = new Random().nextInt(4);
                        rightEditText.setText(String.valueOf(rand));
                    }
                    else {
                        checkboxes += 1;
                    }
                    break;
            }

            if(leftEditText.getText().equals(middleEditText.getText()) && leftEditText.getText().equals(rightEditText.getText())) {
                if(checkboxes == 0) {
                    score += 100;
                }

                if(checkboxes == 1) {
                    score += 50;
                }

                if(checkboxes == 2) {
                    score += 10;
                }
            }
            Log.d("Gained", String.valueOf(score));
            checkboxes = 0;
        }
    }


}