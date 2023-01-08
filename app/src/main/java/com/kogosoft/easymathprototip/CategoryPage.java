package com.kogosoft.easymathprototip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class CategoryPage extends AppCompatActivity {

    private LottieAnimationView animationViewM1,animationViewM2,animationViewM4,animationViewM5,animationViewM3_1,animationViewM3_2;
    private ConstraintLayout constraintLayoutCat1, constraintLayoutCat5, constraintLayoutCat3, constraintLayoutCat2, constraintLayoutCat4,constraintLayoutCatEk1,constraintLayoutEk2;
    private String chosenCategory = "";
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_page);

       /* animationViewM3_1=findViewById(R.id.animationViewM3_1);
        animationViewM3_2=findViewById(R.id.animationViewM3_2);
        animationViewM1=findViewById(R.id.animationViewM1);
        animationViewM4=findViewById(R.id.animationViewM4);
        animationViewM5=findViewById(R.id.animationViewM5);
        animationViewM2=findViewById(R.id.animationViewM2);*/

        constraintLayoutCat1 =findViewById(R.id.constraintLayoutCat1);
        constraintLayoutCat2 =findViewById(R.id.constraintLayoutCat2);
        constraintLayoutCat3 =findViewById(R.id.constraintLayoutCat3);
        constraintLayoutCat4 =findViewById(R.id.constraintLayoutCat4);
        constraintLayoutCat5 =findViewById(R.id.constraintLayoutCat5);
        constraintLayoutCatEk1 =findViewById(R.id.constraintLayoutCatEk1);
        constraintLayoutEk2 =findViewById(R.id.constraintLayoutEk2);


        // Banner reklam ayarları başlangıç
        AdView adView = new AdView(this);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Reklamınızın davranışını daha da özelleştirmek için, reklamın yaşam döngüsündeki bir dizi olaya bağlanabilirsiniz: yükleme, açma, kapatma vb. Bu olayları AdListener sınıfı üzerinden dinleyebilirsiniz.
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {  // onAdLoaded() yöntemi, bir reklamın yüklenmesi tamamlandığında yürütülür. Örneğin, bir reklamın yükleneceğinden emin olana kadar etkinliğinize veya AdView eklemeyi geciktirmek istiyorsanız, bunu burada yapabilirsiniz.
                Log.e("onAdLoaded", "onAdLoaded");
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {     // onAdFailedToLoad() yöntemi, parametre içeren tek yöntemdir. LoadAdError error parametresi, hangi hatanın oluştuğunu açıklar.
                Log.e("onAdFailedToLoad", "onAdFailedToLoad");
                Log.e("onAdFailedToLoad", String.valueOf(adError));
            }

            @Override
            public void onAdOpened() {      // Bu yöntem, kullanıcı bir reklama dokunduğunda çağrılır.
                Log.e("onAdOpened", "onAdOpened");

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {      // Bir kullanıcı, bir reklamın hedef URL'sini görüntüledikten sonra uygulamaya döndüğünde, bu yöntem çağrılır.
                Log.e("onAdClosed", "onAdClosed");
            }
        });
        // Banner reklam ayarları son


        clickCategory(constraintLayoutCat1,"Cat1");
        clickCategory(constraintLayoutCat2,"Cat2");
        clickCategory(constraintLayoutCat3,"Cat3");
        clickCategory(constraintLayoutCat4,"Cat4");
        clickCategory(constraintLayoutCat5,"Cat5");
        clickCategory(constraintLayoutCatEk1,"CatEk1");
        clickCategory(constraintLayoutEk2,"CatEk2");


    }

    // Kategori seçme fonksiyonu
    public void clickCategory(ConstraintLayout constraintLayout, String category)
    {
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chosenCategory = category;

                if(category.equals("CatEk1") || category.equals("CatEk2"))
                {

                    Intent intent=new Intent(CategoryPage.this, EkLevelPage.class);
                    intent.putExtra("chosenCategory", chosenCategory);
                    startActivity(intent);
                }
                else
                {
                    Intent intent=new Intent(CategoryPage.this, LevelPage.class);
                    intent.putExtra("chosenCategory", chosenCategory);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();   // exit the game, close the game
    }
}