package com.kogosoft.easymathprototip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class EkLevelPage extends AppCompatActivity {
    private String submittedCategory;
    private ConstraintLayout cl1,cl2,cl3,cl4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ek_level_page);

        cl1=findViewById(R.id.cl1);
        cl2=findViewById(R.id.cl2);
        cl3=findViewById(R.id.cl3);
        cl4=findViewById(R.id.cl4);

        submittedCategory = getIntent().getStringExtra("chosenCategory");

        /*clickLevel(cl1, submittedCategory,1);
        clickLevel(cl2, submittedCategory,2);
        clickLevel(cl3, submittedCategory,3);
        clickLevel(cl4, submittedCategory,4);*/

        cl1.setOnClickListener(view ->
        {
            if (submittedCategory.equals("CatEk1"))
            {
                Intent intent = new Intent(EkLevelPage.this, PieceCat.class);
                intent.putExtra("chosenLevel",1);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
            else if (submittedCategory.equals("CatEk2"))
            {
                Intent intent = new Intent(EkLevelPage.this, RhytmicCat.class);
                intent.putExtra("chosenLevel",1);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
        });

        cl2.setOnClickListener(view ->
        {
            if (submittedCategory.equals("CatEk1"))
            {
                Intent intent = new Intent(EkLevelPage.this, PieceCat.class);
                intent.putExtra("chosenLevel",2);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
            else if (submittedCategory.equals("CatEk2"))
            {
                Intent intent = new Intent(EkLevelPage.this, RhytmicCat.class);
                intent.putExtra("chosenLevel",2);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
        });

        cl3.setOnClickListener(view ->
        {
            if (submittedCategory.equals("CatEk1"))
            {
                Intent intent = new Intent(EkLevelPage.this, PieceCat.class);
                intent.putExtra("chosenLevel",3);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
            else if (submittedCategory.equals("CatEk2"))
            {
                Intent intent = new Intent(EkLevelPage.this, RhytmicCat.class);
                intent.putExtra("chosenLevel",3);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
        });

        cl4.setOnClickListener(view ->
        {
            if (submittedCategory.equals("CatEk1"))
            {
                Intent intent = new Intent(EkLevelPage.this, PieceCat.class);
                intent.putExtra("chosenLevel",4);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
            else if (submittedCategory.equals("CatEk2"))
            {
                Intent intent = new Intent(EkLevelPage.this, RhytmicCat.class);
                intent.putExtra("chosenLevel",4);                 // seçilen leveli gamePage e gönderdik
                startActivity(intent);
            }
        });



    }

    public void clickLevel(ConstraintLayout constraintLayout, String submittedCategoryy, int chosenLevell){
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                submittedCategory = submittedCategoryy;


                if (submittedCategory.equals("CatEk1"))
                {
                    Intent intent = new Intent(EkLevelPage.this, PieceCat.class);
                    intent.putExtra("chosenLevel",chosenLevell);                 // seçilen leveli gamePage e gönderdik
                    startActivity(intent);
                }
                else if (submittedCategory.equals("CatEk2"))
                {
                    Intent intent = new Intent(EkLevelPage.this, PieceCat.class);
                    intent.putExtra("chosenLevel",chosenLevell);                 // seçilen leveli gamePage e gönderdik
                    startActivity(intent);
                }



            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(EkLevelPage.this,CategoryPage.class));
        finish();
    }
}