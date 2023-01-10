package com.kogosoft.easymathprototip;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.Random;


public class ResultPage extends AppCompatActivity {
    LottieAnimationView lottieAnimationViewDogru, lottieAnimationViewYanlis;
    TextView textViewBaslik,textViewResult;
    Button buttonMenu, buttonNextLevelorTryAgain;
    int submittedLevel, sendLevel, adsCounter=1;
    String submittedCategory, sendCategory, question;
    boolean isFinishedLevel=false;

    private boolean isAdsWatchedOrNot=false;
    private RewardedAd mRewardedAd;
    private final String TAG = "ResultPage";
    int randomAds;
    String menuOrTry;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        {
            lottieAnimationViewDogru = findViewById(R.id.lottieAnimationViewDogru);
            lottieAnimationViewYanlis = findViewById(R.id.lottieAnimationViewYanlis);
            textViewBaslik = findViewById(R.id.textViewBaslik);
            textViewResult = findViewById(R.id.textViewResult);
            buttonMenu = findViewById(R.id.buttonMenu);
            buttonNextLevelorTryAgain = findViewById(R.id.buttonNextLevelorTryAgain);




        }   // view bağlamaları

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                loadRewardedAd();
            }
        });

        loadRewardedAd();

        submittedLevel = getIntent().getIntExtra("chosenLevel",0);      // gamePageden gelen leveli aldık
        submittedCategory = getIntent().getStringExtra("submittedCategory");        // gamePageden gelen kategoriyi aldık
        question = getIntent().getStringExtra("question");


        String chosenAnswer = getIntent().getStringExtra("chosenAnswer");
        String rightAnswer = getIntent().getStringExtra("rightAnswer");
        String lastQ = getIntent().getStringExtra("lastQuestion");


        Log.e("submittedLevel", String.valueOf(submittedLevel));
        Log.e("submittedCategory", submittedCategory);

        // eğer leveli full doğru yaparak tamamlamışsa
        if (lastQ.equals("finished")){
            textViewBaslik.setText("PERFECT");
            lottieAnimationViewYanlis.setVisibility(View.INVISIBLE);
            lottieAnimationViewDogru.setVisibility(View.VISIBLE);
            isFinishedLevel=true;

            if (submittedLevel==5){
                buttonNextLevelorTryAgain.setVisibility(View.INVISIBLE);
                textViewResult.setText("CONGRATULATIONS\nFINISHED THE CATEGORY");
            }
            else{
                buttonNextLevelorTryAgain.setText("Next Level");
            }

        }
        else{   // eğer leveli bitirememiş ve yanmışsa
            if (submittedCategory.equals("Cat3")){
                textViewResult.setText("Your Answer: " + chosenAnswer + "\n\nRight Answer: " +   rightAnswer);
                lottieAnimationViewYanlis.setVisibility(View.VISIBLE);
                lottieAnimationViewDogru.setVisibility(View.INVISIBLE);
                textViewBaslik.setText("OH! NO");
                isFinishedLevel=false;
                buttonNextLevelorTryAgain.setText("Try Agaın");
            }else{
                textViewResult.setText(question + "\n\nYour Answer: " + chosenAnswer + "\n\nRight Answer: " +   rightAnswer);
                lottieAnimationViewYanlis.setVisibility(View.VISIBLE);
                lottieAnimationViewDogru.setVisibility(View.INVISIBLE);
                textViewBaslik.setText("OH! NO");
                isFinishedLevel=false;
                buttonNextLevelorTryAgain.setText("Try Agaın");
            }

        }

        buttonNextLevelorTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                menuOrTry = "try";

                if(isFinishedLevel==true){  // eğer leveli bitirmiş ise leveli bir artır ve next levele gönder
                    submittedLevel+=1;
                    gotoGamePage();
                }
                else{           // eğer leveli bitirememiş ve yanmışsa leveli artırma, try again yap
                    Log.e("else,"," tryagain");
                    Random random = new Random();
                    randomAds = random.nextInt(2);// 0 not show ads, 1 show ads
                    if (randomAds==0){
                        Log.e("randomAds:0 ", String.valueOf(randomAds));
                        gotoGamePage();
                    }
                    else {
                        Log.e("randomAds:1 ", String.valueOf(randomAds));
                        showRewardedAd();
                    }
                }
            }
        });

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuOrTry = "menu";
                Random random = new Random();
                randomAds = random.nextInt(3);// 0 not show ads, 1 show ads, 2 show ads
                if (randomAds==0){
                    Log.e("randomAds:0 ", String.valueOf(randomAds));
                    startActivity(new Intent(ResultPage.this, CategoryPage.class));
                    finish();
                }else {
                    Log.e("randomAds:1 ", String.valueOf(randomAds));
                    menuOrTry = "menu";
                    showRewardedAd();
                }

            }
        });
    }

    public void gotoGamePage(){
        Intent intent = new Intent(ResultPage.this, GamePage.class);
        intent.putExtra("submittedCategory", submittedCategory);
        intent.putExtra("chosenLevel",submittedLevel);
        Log.e("level", String.valueOf(submittedLevel));
        startActivity(intent);
        finish();
    }

    // Reklamı yükleme fonksiyonu
    public void loadRewardedAd(){
        AdRequest adRequest = new AdRequest.Builder().build();

        RewardedAd.load(this, "ca-app-pub-4601944440701403/3865690211",
                adRequest, new RewardedAdLoadCallback() {

                    // internete bağlı değilken bura çalışıyor
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        Log.e(TAG, "onAdFailedToLoad");
                        mRewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.e(TAG, "Ad was loaded.");

                        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            // reklam gösterilmeye başlayınca buraya girer
                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.e(TAG, "Ad was shown.");
                                adsCounter+=1;      // reklam gösterildikce adsCounter artıyor 2 yi geçince reklam izleyerek geçme hakkı bitiyor 2 den fazla reklam olmuyor bir level içerisinde
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.e(TAG, "Ad failed to show.");
                            }

                            // Reklamı kapatırsa buraya girer ve result pageye gider.
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Set the ad reference to null so you don't show the ad a second time.
                                Log.e(TAG, "Ad was dismissed.");
                                mRewardedAd = null;
                                if (menuOrTry.equals("menu")){
                                    startActivity(new Intent(ResultPage.this, CategoryPage.class));
                                    finish();
                                }else {
                                    gotoGamePage();
                                }

                            }
                        });
                    }
                });
    }

    // Reklamı Gösterme fonksiyonu
    public void showRewardedAd(){
        if (mRewardedAd != null) {
            Activity activityContext = ResultPage.this;
            mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                // eğer reklamın tamamını izlerse kapatmazsa erkenden buraya girer
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // Handle the reward.
                    Log.e(TAG, "The user earned the reward.");
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();

                }
            });
        } else {
            gotoGamePage();
            Log.e(TAG, "The rewarded ad wasn't ready yet.");
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ResultPage.this, CategoryPage.class));
        finish();
    }
}