package com.kogosoft.easymathprototip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class PieceCat extends AppCompatActivity {

    private int submittedLevel;
    private ConstraintLayout constraintLayout4;
    private ImageView iv1_4,iv2_4,iv3_4,iv4_4,iv5_4,iv6_4,iv7_4,iv8_4,iv9_4,iv10_4,iv11_4,iv12_4,iv13_4,iv14_4,
            iv15_4,iv16_4,iv17_4,iv18_4,iv19_4,iv20_4;
    private Button buttonOk;
    private EditText editTextText;
    int soru=0,sayi,girilenSayi;
    ArrayList<Integer> sayilar=new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piece_cat);

        constraintLayout4=findViewById(R.id.constraintLayout4);

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

        buttonOk=findViewById(R.id.buttonOk);
        editTextText=findViewById(R.id.editTextText);

        if(soru==20)
        {
            startActivity(new Intent(PieceCat.this,EkLevelPage.class));
        }
        Log.e("soru",String.valueOf(soru));

        submittedLevel = getIntent().getIntExtra("chosenLevel",0);      // Gelen leveli aldık

        if(soru==20)
        {
            startActivity(new Intent(PieceCat.this,EkLevelPage.class));
        }
        Log.e("soru",String.valueOf(soru));

        getQuestion();
        soru++;
        Log.e("soru",String.valueOf(soru));

        buttonOk.setOnClickListener(view ->
        {
            girilenSayi=Integer.parseInt(editTextText.getText().toString());

            Log.e("girilen sayı",String.valueOf(girilenSayi));
            Log.e("sayi",String.valueOf(sayi));
            if (girilenSayi==sayi)
            {
                editTextText.setText("");
                getQuestion();
                soru++;
                Log.e("soru",String.valueOf(soru));

            }
        });

    }

    public void getQuestion()
    {
        if (soru==20)
        {
            startActivity(new Intent(PieceCat.this,EkLevelPage.class));
        }

        if (submittedLevel==1)
        {


            Random r = new Random();

            sayi = ((r.nextInt(5)) + 1);

            if (sayi == 1) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.INVISIBLE);
                iv3_4.setVisibility(View.INVISIBLE);
                iv4_4.setVisibility(View.INVISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);

            } else if (sayi == 2) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.INVISIBLE);
                iv4_4.setVisibility(View.INVISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
            } else if (sayi == 3) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.INVISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
            } else if (sayi == 4) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
            } else if (sayi == 5) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
            }
        }

        else if(submittedLevel==2)
        {

            Random r = new Random();

            sayi = ((r.nextInt(10)) + 1);

            if (sayi == 1) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.INVISIBLE);
                iv3_4.setVisibility(View.INVISIBLE);
                iv4_4.setVisibility(View.INVISIBLE);
                iv5_4.setVisibility(View.INVISIBLE);
                iv6_4.setVisibility(View.INVISIBLE);
                iv7_4.setVisibility(View.INVISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);

            } else if (sayi == 2) {
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
            } else if (sayi == 3) {
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
            } else if (sayi == 4) {
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
            } else if (sayi == 5) {
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
            }
            else if (sayi == 6) {
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
            }
            else if (sayi == 7) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 8) {
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
            }
            else if (sayi == 9) {
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
            }
            else if (sayi == 10) {
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
            }
        }

        else if(submittedLevel==3)
        {

            Random r = new Random();

            sayi = ((r.nextInt(15)) + 1);

            if (sayi == 1) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.INVISIBLE);
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

            } else if (sayi == 2) {
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
            } else if (sayi == 3) {
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
            } else if (sayi == 4) {
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
            } else if (sayi == 5) {
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
            }
            else if (sayi == 6) {
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
            }
            else if (sayi == 7) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
                iv8_4.setVisibility(View.INVISIBLE);
                iv9_4.setVisibility(View.INVISIBLE);
                iv10_4.setVisibility(View.INVISIBLE);
                iv11_4.setVisibility(View.INVISIBLE);
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 8) {
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
            }
            else if (sayi == 9) {
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
            }
            else if (sayi == 10) {
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
            }
            else if (sayi == 11) {
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
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 12) {
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
            }
            else if (sayi == 13) {
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
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 14) {
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
            }
            else if (sayi == 15) {
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
            }
        }

        else if(submittedLevel==4)
        {

            Random r = new Random();

            sayi = ((r.nextInt(20)) + 1);

            if (sayi == 1) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.INVISIBLE);
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

            } else if (sayi == 2) {
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
            } else if (sayi == 3) {
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
            } else if (sayi == 4) {
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
            } else if (sayi == 5) {
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
            }
            else if (sayi == 6) {
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
            }
            else if (sayi == 7) {
                iv1_4.setVisibility(View.VISIBLE);
                iv2_4.setVisibility(View.VISIBLE);
                iv3_4.setVisibility(View.VISIBLE);
                iv4_4.setVisibility(View.VISIBLE);
                iv5_4.setVisibility(View.VISIBLE);
                iv6_4.setVisibility(View.VISIBLE);
                iv7_4.setVisibility(View.VISIBLE);
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
            }
            else if (sayi == 8) {
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
            }
            else if (sayi == 9) {
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
            }
            else if (sayi == 10) {
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
            }
            else if (sayi == 11) {
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
                iv12_4.setVisibility(View.INVISIBLE);
                iv13_4.setVisibility(View.INVISIBLE);
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 12) {
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
            }
            else if (sayi == 13) {
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
                iv14_4.setVisibility(View.INVISIBLE);
                iv15_4.setVisibility(View.INVISIBLE);
                iv16_4.setVisibility(View.INVISIBLE);
                iv17_4.setVisibility(View.INVISIBLE);
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 14) {
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
            }
            else if (sayi == 15) {
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
            }
            else if (sayi == 16) {
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
            }
            else if (sayi == 17) {
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
                iv18_4.setVisibility(View.INVISIBLE);
                iv19_4.setVisibility(View.INVISIBLE);
                iv20_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 18) {
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
            }
            else if (sayi == 19) {
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
                iv20_4.setVisibility(View.INVISIBLE);
            }
            else if (sayi == 20) {
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
            }
        }


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(PieceCat.this,CategoryPage.class));
        finish();
    }
}