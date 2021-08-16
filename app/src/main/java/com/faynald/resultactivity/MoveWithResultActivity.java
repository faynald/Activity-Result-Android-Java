package com.faynald.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MoveWithResultActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static final int RESULT_CODE = 1;
    Button btnPilih;
    RadioGroup rgNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_result);

        btnPilih = findViewById(R.id.btn_pilih);
        rgNumber = findViewById(R.id.rg_number);

        btnPilih.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_pilih) {
            int id = rgNumber.getCheckedRadioButtonId();
            int value = 0;
            if (id != 0) {
                if (id == R.id.rb_1) {
                    value = 1;
                } else if (id == R.id.rb_2) {
                    value = 2;
                } else if (id == R.id.rb_3) {
                    value = 3;
                } else if (id == R.id.rb_4) {
                    value = 4;
                }
                Intent resultIntent = new Intent();
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value);
                setResult(RESULT_CODE, resultIntent);
                finish();
            }
        }
    }
}