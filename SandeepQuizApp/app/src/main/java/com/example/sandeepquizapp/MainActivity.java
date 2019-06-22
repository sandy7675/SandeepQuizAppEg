package com.example.sandeepquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup r_g1, r_g2, r_g7, r_g8, r_g9, r_g10;
    CheckBox cb52, cb61;
    EditText ed3, ed4;
    int selectedId1, selectedId2;
    int total = 0;
    int attempt = 0, ii = 0, i2 = 0, i3 = 0, i4 = 0, i7 = 0, i8 = 0, i9 = 0, i10 = 0, i5 = 0, i6 = 0;
    TextView t1, t2;
    LinearLayout linearLayout;
    Button but, but2, but3;

    public void checkbox1(View view) {
        if (i5 == 0) {
            attempt++;
            if (cb52.isChecked() == true) {

                total++;
                t1.setText("" + attempt);

            } else
                t1.setText("" + attempt);
            i5++;
        }
    }

    public void checkbox2(View view) {
        if (i6 == 0) {
            attempt++;
            if (cb61.isChecked() == true) {

                total++;
                t1.setText("" + attempt);
            } else
                t1.setText("" + attempt);
            i6++;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r_g1 = findViewById(R.id.rg1);
        r_g2 = findViewById(R.id.rg2);
        ed3 = findViewById(R.id.ed1);
        ed4 = findViewById(R.id.ed2);
        cb52 = findViewById(R.id.ck52);
        cb61 = findViewById(R.id.ck61);
        r_g7 = findViewById(R.id.rg7);
        r_g8 = findViewById(R.id.rg8);
        r_g9 = findViewById(R.id.rg9);
        r_g10 = findViewById(R.id.rg10);
        t1 = findViewById(R.id.text3);
        but = findViewById(R.id.b1);
        but2 = findViewById(R.id.b2);
        but3 = findViewById(R.id.b3);
        r_g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (ii == 0) {
                    attempt++;
                    if (i == R.id.rd11) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    ii++;
                }
            }

        });

        r_g2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i2 == 0) {
                    attempt++;
                    if (i == R.id.rd23) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    i2++;
                }
            }

        });
        r_g7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i7 == 0) {
                    attempt++;
                    if (i == R.id.rd72) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    i7++;
                }
            }

        });


        r_g8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i8 == 0) {
                    attempt++;
                    if (i == R.id.rd84) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    i8++;
                }
            }

        });

        r_g9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i9 == 0) {
                    attempt++;
                    if (i == R.id.rd91) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    i9++;
                }
            }
        });

        r_g10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i10 == 0) {
                    attempt++;
                    if (i == R.id.rd103) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    i10++;
                }
            }
        });
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = Integer.toString(total);
                Toast.makeText(getApplicationContext(), "Your Score is " + s1 + "/10", Toast.LENGTH_LONG).show();
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss = ed3.getText().toString();
                String s1 = "New Delhi";
                if (i3 == 0) {
                    attempt++;
                    if (ss.equals(s1)) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    i3++;
                }
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss = ed4.getText().toString();
                String s1 = "Bhopal";
                if (i4 == 0) {
                    attempt++;
                    if (ss.equals(s1)) {
                        total++;
                        t1.setText("" + attempt);
                    } else {
                        t1.setText("" + attempt);
                    }
                    i4++;
                }
            }
        });
    }
}
