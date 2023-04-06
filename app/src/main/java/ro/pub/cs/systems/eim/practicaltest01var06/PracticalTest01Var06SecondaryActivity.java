package ro.pub.cs.systems.eim.practicaltest01var06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PracticalTest01Var06SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var06_secondary);
        int left_number = getIntent().getIntExtra("leftEditText", 0);
        int middle_number = getIntent().getIntExtra("middleEditText", 0);
        int right_number = getIntent().getIntExtra("rightEditText", 0);
        int checkboxes = getIntent().getIntExtra("checkboxes", 0);
    }
}