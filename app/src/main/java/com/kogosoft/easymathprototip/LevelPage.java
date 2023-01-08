package com.kogosoft.easymathprototip;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

public class LevelPage extends AppCompatActivity {
    private int chosenLevel = 0;
    ConstraintLayout cl1,cl2,cl3,cl4,cl5;
    TextView textViewNumberlv2,textViewNumberlv3,textViewNumberlv4,textViewNumberlv5;
    ImageView imageViewlocklv2,imageViewlocklv3,imageViewlocklv4,imageViewlocklv5;
    private String submittedCategory;
    private RewardedAd mRewardedAd;
    private final String TAG = "LevelPage";
    int randomAds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page);
        cl1=findViewById(R.id.cl1);
        cl2=findViewById(R.id.cl2);
        cl3=findViewById(R.id.cl3);
        cl4=findViewById(R.id.cl4);
        cl5=findViewById(R.id.cl5);

        textViewNumberlv2=findViewById(R.id.textViewNumberlv2);
        textViewNumberlv3=findViewById(R.id.textViewNumberlv3);
        textViewNumberlv4=findViewById(R.id.textViewNumberlv4);
        textViewNumberlv5=findViewById(R.id.textViewNumberlv5);

        imageViewlocklv2=findViewById(R.id.imageViewlocklv2);
        imageViewlocklv3=findViewById(R.id.imageViewlocklv3);
        imageViewlocklv4=findViewById(R.id.imageViewlocklv4);
        imageViewlocklv5=findViewById(R.id.imageViewlocklv5);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                loadRewardedAd();
            }
        });
        loadRewardedAd();

        // Seçilen kategoriyi sharedPreferences ile aldık
        submittedCategory = getIntent().getStringExtra("chosenCategory");
        SharedPreferences sh = getSharedPreferences("MySharedPref",MODE_PRIVATE);

        // Eğer leveller daha önceden oynanmış tamamlanmış ise level kilitlerini açan kodlar
        if (submittedCategory.equals("Cat1")){
            String s1 = sh.getString("cat1Lev1Finished","DONT GET");
            String s2 = sh.getString("cat1Lev2Finished","DONT GET");
            String s3 = sh.getString("cat1Lev3Finished","DONT GET");
            String s4 = sh.getString("cat1Lev4Finished","DONT GET");

            if (s1.equals("unlockCat1Lev2")){
                cl2.setEnabled(true);
                textViewNumberlv2.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv2.setVisibility(View.INVISIBLE);
                cl2.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl2.setEnabled(false);
            }

            if (s2.equals("unlockCat1Lev3")){
                cl3.setEnabled(true);
                textViewNumberlv3.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv3.setVisibility(View.INVISIBLE);
                cl3.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl3.setEnabled(false);
            }

            if (s3.equals("unlockCat1Lev4")){
                cl4.setEnabled(true);
                textViewNumberlv4.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv4.setVisibility(View.INVISIBLE);
                cl4.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl4.setEnabled(false);
            }

            if (s4.equals("unlockCat1Lev5")){
                cl5.setEnabled(true);
                textViewNumberlv5.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv5.setVisibility(View.INVISIBLE);
                cl5.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl5.setEnabled(false);
            }
        }
        if (submittedCategory.equals("Cat2")){
            String s1 = sh.getString("cat2Lev1Finished","DONT GET");
            String s2 = sh.getString("cat2Lev2Finished","DONT GET");
            String s3 = sh.getString("cat2Lev3Finished","DONT GET");
            String s4 = sh.getString("cat2Lev4Finished","DONT GET");

            if (s1.equals("unlockCat2Lev2")){
                cl2.setEnabled(true);
                textViewNumberlv2.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv2.setVisibility(View.INVISIBLE);
                cl2.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl2.setEnabled(false);
            }

            if (s2.equals("unlockCat2Lev3")){
                cl3.setEnabled(true);
                textViewNumberlv3.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv3.setVisibility(View.INVISIBLE);
                cl3.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl3.setEnabled(false);
            }

            if (s3.equals("unlockCat2Lev4")){
                cl4.setEnabled(true);
                textViewNumberlv4.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv4.setVisibility(View.INVISIBLE);
                cl4.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl4.setEnabled(false);
            }

            if (s4.equals("unlockCat2Lev5")){
                cl5.setEnabled(true);
                textViewNumberlv5.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv5.setVisibility(View.INVISIBLE);
                cl5.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl5.setEnabled(false);
            }
        }
        if (submittedCategory.equals("Cat3")){
            String s1 = sh.getString("cat3Lev1Finished","DONT GET");
            String s2 = sh.getString("cat3Lev2Finished","DONT GET");
            String s3 = sh.getString("cat3Lev3Finished","DONT GET");
            String s4 = sh.getString("cat3Lev4Finished","DONT GET");

            if (s1.equals("unlockCat3Lev2")){
                cl2.setEnabled(true);
                textViewNumberlv2.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv2.setVisibility(View.INVISIBLE);
                cl2.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl2.setEnabled(false);
            }

            if (s2.equals("unlockCat3Lev3")){
                cl3.setEnabled(true);
                textViewNumberlv3.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv3.setVisibility(View.INVISIBLE);
                cl3.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl3.setEnabled(false);
            }

            if (s3.equals("unlockCat3Lev4")){
                cl4.setEnabled(true);
                textViewNumberlv4.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv4.setVisibility(View.INVISIBLE);
                cl4.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl4.setEnabled(false);
            }

            if (s4.equals("unlockCat3Lev5")){
                cl5.setEnabled(true);
                textViewNumberlv5.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv5.setVisibility(View.INVISIBLE);
                cl5.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl5.setEnabled(false);
            }
        }
        if (submittedCategory.equals("Cat4")){
            String s1 = sh.getString("cat4Lev1Finished","DONT GET");
            String s2 = sh.getString("cat4Lev2Finished","DONT GET");
            String s3 = sh.getString("cat4Lev3Finished","DONT GET");
            String s4 = sh.getString("cat4Lev4Finished","DONT GET");

            if (s1.equals("unlockCat4Lev2")){
                cl2.setEnabled(true);
                textViewNumberlv2.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv2.setVisibility(View.INVISIBLE);
                cl2.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl2.setEnabled(false);
            }

            if (s2.equals("unlockCat4Lev3")){
                cl3.setEnabled(true);
                textViewNumberlv3.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv3.setVisibility(View.INVISIBLE);
                cl3.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl3.setEnabled(false);
            }

            if (s3.equals("unlockCat4Lev4")){
                cl4.setEnabled(true);
                textViewNumberlv4.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv4.setVisibility(View.INVISIBLE);
                cl4.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl4.setEnabled(false);
            }

            if (s4.equals("unlockCat4Lev5")){
                cl5.setEnabled(true);
                textViewNumberlv5.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv5.setVisibility(View.INVISIBLE);
                cl5.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl5.setEnabled(false);
            }
        }
        if (submittedCategory.equals("Cat5")){
            String s1 = sh.getString("cat5Lev1Finished","DONT GET");
            String s2 = sh.getString("cat5Lev2Finished","DONT GET");
            String s3 = sh.getString("cat5Lev3Finished","DONT GET");
            String s4 = sh.getString("cat5Lev4Finished","DONT GET");

            if (s1.equals("unlockCat5Lev2")){
                cl2.setEnabled(true);
                textViewNumberlv2.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv2.setVisibility(View.INVISIBLE);
                cl2.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl2.setEnabled(false);
            }

            if (s2.equals("unlockCat5Lev3")){
                cl3.setEnabled(true);
                textViewNumberlv3.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv3.setVisibility(View.INVISIBLE);
                cl3.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl3.setEnabled(false);
            }

            if (s3.equals("unlockCat5Lev4")){
                cl4.setEnabled(true);
                textViewNumberlv4.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv4.setVisibility(View.INVISIBLE);
                cl4.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl4.setEnabled(false);
            }

            if (s4.equals("unlockCat5Lev5")){
                cl5.setEnabled(true);
                textViewNumberlv5.setTextColor(getResources().getColor(R.color.turuncu));
                imageViewlocklv5.setVisibility(View.INVISIBLE);
                cl5.setBackground(getResources().getDrawable(R.drawable.level_cerceve_turuncu));
            }else{
                cl5.setEnabled(false);
            }
        }


        clickLevel(cl1, submittedCategory,1);
        clickLevel(cl2, submittedCategory,2);
        clickLevel(cl3, submittedCategory,3);
        clickLevel(cl4, submittedCategory,4);
        clickLevel(cl5, submittedCategory,5);

    }

    // Level seçme fonksiyonu
    public void clickLevel(ConstraintLayout constraintLayout, String submittedCategoryy, int chosenLevell){
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chosenLevel = chosenLevell;     // bunları tekrar atadık çünkü randomAds 0 olursa showRewardedAd fonksiyonuna gidiyor ve orada reklam hazır değil ise intent ile gamePageye gider giderken chosenLevel ve SubmittedCategory lazım onları burada atıyoruz
                submittedCategory = submittedCategoryy;

                Random random = new Random();
                randomAds = random.nextInt(4);// 0  show ads, 1 not show ads, 2 not show ads, 3 not show ads
                Log.e("randomadsevel", String.valueOf(randomAds));
                if (randomAds==0){
                    showRewardedAd();
                }else{
                    Intent intent = new Intent(LevelPage.this, GamePage.class);
                    intent.putExtra("submittedCategory", submittedCategoryy);    // seçilen kategoriyi gamePage e gönderdik
                    intent.putExtra("chosenLevel",chosenLevell);                 // seçilen leveli gamePage e gönderdik
                    startActivity(intent);
                }
            }
        });
    }

    // Reklamı Gösterme fonksiyonu
    public void showRewardedAd(){
        if (mRewardedAd != null) {
            Activity activityContext = LevelPage.this;
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
        } else {    // reklam hazır değilse
            Intent intent = new Intent(LevelPage.this, GamePage.class);
            intent.putExtra("submittedCategory", submittedCategory);    // seçilen kategoriyi gamePage e gönderdik
            intent.putExtra("chosenLevel",chosenLevel);// seçilen leveli gamePage e gönderdik
            startActivity(intent);
            Log.e("levelshowrewarded", String.valueOf(chosenLevel));
            Log.e(TAG, "The rewarded ad wasn't ready yet.");
        }
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
                                Intent intent = new Intent(LevelPage.this, GamePage.class);
                                intent.putExtra("submittedCategory", submittedCategory);    // seçilen kategoriyi gamePage e gönderdik
                                intent.putExtra("chosenLevel",chosenLevel);// seçilen leveli gamePage e gönderdik
                                Log.e("leveldismiss", String.valueOf(chosenLevel));
                                startActivity(intent);

                            }
                        });
                    }
                });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(LevelPage.this, CategoryPage.class));
        finish();
    }
}