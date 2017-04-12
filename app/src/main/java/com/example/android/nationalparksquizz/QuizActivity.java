package com.example.android.nationalparksquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View.OnClickListener;

import static android.R.attr.checked;
import static android.os.Build.VERSION_CODES.M;

public class QuizActivity extends AppCompatActivity {

    int points = 0;
    int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

  //      addListenerOnButton();
    }

   /* private void addListenerOnButton() {
        RadioGroup radio1 = (RadioGroup) findViewById(R.id.radio1)
        Button button = (Button) findViewById(R.id.endButton);

        button.setOnClickListener(new OnClickListener() {


            public void onClickResult(View v) {

                // get selected radio button from radioGroup
                int selectedId = radio1.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                RadioButton rb1 = (RadioButton) findViewById(selectedId);

                Toast.makeText(QuizActivity.this,
                        radioSexButton.getText(), Toast.LENGTH_SHORT).show();

            }});

    }*/

    public int q1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.odg3:
                if (checked) {
                    points += 1;
                    return points;
                }
        }
        wrong += 1;
        return wrong;
    }

    public int q2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.odg8:
                if (checked){
                    points += 1;
                    return points;
                }
        }
        wrong += 1;
        return wrong;
    }

    public int q3(View View) {
        EditText odg = (EditText) findViewById(R.id.editText1);
        String odgTekst = odg.getText().toString().toUpperCase();
        if (odgTekst.equals("MLJET")) {
            points += 1;
        }
        return points;
    }

    public int q4(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.odg9:
                if (checked)
                    points += 1;
                break;
            default:
                break;
        }
        return points;
    }

    public int q5(View View) {
        CheckBox cb1 = (CheckBox) findViewById(R.id.cb2);
        boolean cbv1 = cb1.isChecked();
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb3);
        boolean cbv2 = cb2.isChecked();
        CheckBox cb3 = (CheckBox) findViewById(R.id.cb6);
        boolean cbv3 = cb3.isChecked();
        if (cbv1 && cbv2 && cbv3) {
            points = +1;
            return points;
        }
        wrong += 1;
        return wrong;
    }

    public int q6(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.odg9:
                if (checked) {
                    points += 1;
                    return points;
                }
        }
        wrong += 1;
        return wrong;
    }
    public int q7(View View) {
        EditText odg = (EditText) findViewById(R.id.editText2);
        String odgTekst = odg.getText().toString().toUpperCase();
        if (odgTekst.equals("SJEVERNI VELEBIT")) {
            points += 1;
        }
        return points;
    }

    public void onClickResult(View v) {
        q3(v);
        q5(v);
        q7(v);
        String resultMsg = "Odgovorili ste točno na " + points + "/7 ";
        Toast.makeText(QuizActivity.this, resultMsg, Toast.LENGTH_LONG).show();
    }

}
