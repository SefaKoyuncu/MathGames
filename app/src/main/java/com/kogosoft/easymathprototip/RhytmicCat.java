package com.kogosoft.easymathprototip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class RhytmicCat extends AppCompatActivity {

    int numberQ=0,submittedLevel;
    private Button button;
    private ImageView iv1_4,iv2_4,iv3_4,iv4_4,iv5_4,iv6_4,iv7_4,iv8_4,iv9_4,iv10_4,iv11_4,iv12_4,iv13_4,iv14_4,
            iv15_4,iv16_4,iv17_4,iv18_4,iv19_4,iv20_4,iv21_4;
    private TextView textViewNum,textViewTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhytmic_cat);

        button=findViewById(R.id.button);

        iv1_4=findViewById(R.id.iv1_4);
        iv2_4=findViewById(R.id.iv2_4);
        iv3_4=findViewById(R.id.iv3_4);
        iv4_4=findViewById(R.id.iv4_4);
        iv5_4=findViewById(R.id.iv5_4);
        iv6_4=findViewById(R.id.iv6_4);
        iv7_4=findViewById(R.id.iv7_4);
        iv8_4=findViewById(R.id.iv8_4);
        iv9_4=findViewById(R.id.iv9_4);
        iv10_4=findViewById(R.id.iv10_4);
        iv11_4=findViewById(R.id.iv11_4);
        iv12_4=findViewById(R.id.iv12_4);
        iv13_4=findViewById(R.id.iv13_4);
        iv14_4=findViewById(R.id.iv14_4);
        iv15_4=findViewById(R.id.iv15_4);
        iv16_4=findViewById(R.id.iv16_4);
        iv17_4=findViewById(R.id.iv17_4);
        iv18_4=findViewById(R.id.iv18_4);
        iv19_4=findViewById(R.id.iv19_4);
        iv20_4=findViewById(R.id.iv20_4);
        iv21_4=findViewById(R.id.iv21_4);

        textViewNum=findViewById(R.id.textViewNum);
        textViewTitle=findViewById(R.id.textViewTitle);

        submittedLevel = getIntent().getIntExtra("chosenLevel",0);      // Gelen leveli aldık

        getImages();
    }

    private void getImages()
    {
        if (submittedLevel==1) //2şer sayma.
        {
            this.numberQ +=2;
            textViewTitle.setText("Let's count \nthe animals by 2");
            textViewNum.setText(String.valueOf(2));

            if (numberQ == 2) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.INVISIBLE);
                iv4_4.setVisibility(View.INVISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
                iv6_4.setVisibility(View.INVISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);
            }

            if (numberQ == 4) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
                iv6_4.setVisibility(View.INVISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 6) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 8) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 10) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 12) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 14) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 16) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 18) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.VISIBLE);
                iv18_4.setVisibility(View.VISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 20) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.VISIBLE);
                iv18_4.setVisibility(View.VISIBLE);
                iv19_4.setVisibility(View.VISIBLE);
                iv20_4.setVisibility(View.VISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getImages();
                    textViewNum.setText(String.valueOf(numberQ));

                    if(numberQ==20)
                    {
                        button.setEnabled(false);
                        Snackbar.make(button,"Completed",Snackbar.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (submittedLevel==2) //3er sayma.
        {
            this.numberQ +=3;
            textViewTitle.setText("Let's count \nthe animals by 3");
            textViewNum.setText(String.valueOf(3));

            if (numberQ == 3) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.INVISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
                iv6_4.setVisibility(View.INVISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);
            }

            if (numberQ == 6) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 9) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 12) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 15) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 18) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.VISIBLE);
                iv18_4.setVisibility(View.VISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 21) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.VISIBLE);
                iv18_4.setVisibility(View.VISIBLE);
                iv19_4.setVisibility(View.VISIBLE);
                iv20_4.setVisibility(View.VISIBLE);
                iv21_4.setVisibility(View.VISIBLE);

            }

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getImages();
                    textViewNum.setText(String.valueOf(numberQ));

                    if(numberQ==21)
                    {
                        button.setEnabled(false);
                        Snackbar.make(button,"Completed",Snackbar.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (submittedLevel==3) //4er sayma.
        {
            this.numberQ +=4;
            textViewTitle.setText("Let's count \nthe animals by 4");
            textViewNum.setText(String.valueOf(4));

            if (numberQ == 4) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
                iv6_4.setVisibility(View.INVISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);
            }

            if (numberQ == 8) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 12) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 16) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 20) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.VISIBLE);
                iv18_4.setVisibility(View.VISIBLE);
                iv19_4.setVisibility(View.VISIBLE);
                iv20_4.setVisibility(View.VISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getImages();
                    textViewNum.setText(String.valueOf(numberQ));

                    if(numberQ==20)
                    {
                        button.setEnabled(false);
                        Snackbar.make(button,"Completed",Snackbar.LENGTH_SHORT).show();
                    }
                }
            });
        }

        if (submittedLevel==4) //5er sayma.
        {
            this.numberQ +=5;
            textViewTitle.setText("Let's count \nthe animals by 5");
            textViewNum.setText(String.valueOf(5));

            if (numberQ == 5) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.INVISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);
            }

            if (numberQ == 10) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 15) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            if (numberQ == 20) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.VISIBLE);
                iv9_4.setVisibility(View.VISIBLE);
                iv10_4.setVisibility(View.VISIBLE);
                iv11_4.setVisibility(View.VISIBLE);
                iv12_4.setVisibility(View.VISIBLE);
                iv13_4.setVisibility(View.VISIBLE);
                iv14_4.setVisibility(View.VISIBLE);
                iv15_4.setVisibility(View.VISIBLE);
                iv16_4.setVisibility(View.VISIBLE);
                iv17_4.setVisibility(View.VISIBLE);
                iv18_4.setVisibility(View.VISIBLE);
                iv19_4.setVisibility(View.VISIBLE);
                iv20_4.setVisibility(View.VISIBLE);
                iv21_4.setVisibility(View.INVISIBLE);

            }

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getImages();
                    textViewNum.setText(String.valueOf(numberQ));

                    if(numberQ==20)
                    {
                        button.setEnabled(false);
                        Snackbar.make(button,"Completed",Snackbar.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(RhytmicCat.this,CategoryPage.class));
        finish();
    }
}