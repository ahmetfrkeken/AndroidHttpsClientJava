package com.AndroidHttpsClientJava.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.AndroidHttpsClientJava.R;
import com.AndroidHttpsClientJava.model.CreateNewSite;
import com.AndroidHttpsClientJava.request.CreateNewSiteRequest;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String baseUrl = "https://api.apartsoft.com";

    Map<String, String> headers = new HashMap<>();
    Button getResult;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = this.getSharedPreferences("com.example.httpsrequestwithretroift_test", MODE_PRIVATE);

        headers.put("Authorization", "Bearer exIJGsNY4oJWJNPR8fYADD4JKIRUkEIBUKk3ioQK3DxxOPELdA6WbJ-2NkHUSbp6gCHERQBSwThqVIj96gD0GhWTtJrGoQnTW3lcpQ_nOaNG-LwMpv9YJm4A8p18bWMVWHZqapwIbGIm-J_1YX0C1n18zBefj109NONr-QOJEbVwLS5_gLnLAd_JQh5jibCbm5Xmqi6kJrugLmcttHJavi_8a_L3_oqdrZBd2rO_kdEorlZHkSh5wAy2BHYrHQ19vbDf-q3iZGUxy_iXguvukaP06YVr_LlILFzvRMC8zkY");
        getResult = findViewById(R.id.buttonGetResults);

        baseUrl += "/api/DebtPayment";
        /*
        DebtPaymentRequest debtPaymentRequest = new DebtPaymentRequest();
        CreditCardResultRequest request = new CreditCardResultRequest();

        request.setTransactionId("82619de8-33c5-4066-b6ea-1dc6492af5b1");

        String uniqueTransactionID = UUID.randomUUID().toString();
        sharedPreferences.edit().putString("TransactionId", uniqueTransactionID).apply();

        debtPaymentRequest.setTransactionId(uniqueTransactionID);
        debtPaymentRequest.setSiteId(4);
        debtPaymentRequest.setCardNumber("5282080064052616");
        debtPaymentRequest.setCvv("772");
        debtPaymentRequest.setMonth("11");
        debtPaymentRequest.setYear("22");
        debtPaymentRequest.setNameSurname("Ahmet Faruk EKEN");
        debtPaymentRequest.setPrice(1);
        debtPaymentRequest.setTotalPrice(1);

       Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                ThreedsInitialize threedsInitialize = ThreedsInitialize.create(debtPaymentRequest, headers);
                threedsInitialize.
                        System.out.println(result);
            }
        });*/

        //thread.start();
/*
        getResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Handler handler = new Handler(Looper.getMainLooper());
                DialogMessage dialogMessage = DialogMessage.create(MainActivity.this);


                executor.execute(new Runnable() {
                    boolean isPaymentSuccess = false;

                    @Override
                    public void run() {
                        final ThreedsResult threedsResult = ThreedsResult.create(headers, request);
                        int timeOut = 60;
                        System.out.println("deneme");
                        while (timeOut > 0) {

                            try {
                                Thread.sleep(20000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            System.out.println("deme" +
                                    "");
                            if (threedsResult.getStatus()) {
                                if (!threedsResult.getData().isSuccess() && threedsResult.getData().getErrorCode().equals("NR")) {
                                    handler.post(new Runnable() {
                                        @Override
                                        public void run() {
                                            Toast.makeText(MainActivity.this, "NR", Toast.LENGTH_LONG).show();
                                            Log.d("NR","NR");
                                        }
                                    });
                                } else {
                                    if (threedsResult.getData().isSuccess()) {
                                        handler.post(new Runnable() {
                                            @Override
                                            public void run() {
                                                Toast.makeText(MainActivity.this, "İşleminiz tamamlanmıştır", Toast.LENGTH_LONG).show();
                                            }
                                        });
                                        isPaymentSuccess = true;
                                    } else {
                                        handler.post(new Runnable() {
                                            @Override
                                            public void run() {
                                                Toast.makeText(MainActivity.this, threedsResult.getData().getErrorMessage(), Toast.LENGTH_LONG).show();

                                            }
                                        });
                                    }
                                    break;
                                }
                            } else {
                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        Toast.makeText(MainActivity.this, "BAĞLANTI HATASI", Toast.LENGTH_LONG).show();
                                    }
                                });
                                System.out.println("getMessage " + threedsResult.getMessage());
                                System.out.println("getStatus " + threedsResult.getStatus());
                                System.out.println("getData " + threedsResult.getData());
                            }
                            System.out.println("Ahmet faruk " + Calendar.getInstance().getTime());
                            System.out.println(timeOut);
                            timeOut -= 20;
                            System.out.println(timeOut);
                        }
                        System.out.println(isPaymentSuccess);
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                if (isPaymentSuccess) {
                                    System.out.println("başarılı");
                                    dialogMessage.startLoadingDialog(isPaymentSuccess, "İşleminiz Başarılı Bir Şekilde Tamamlanmıştır.");
                                } else {
                                    System.out.println("başarısız");
                                    dialogMessage.startLoadingDialog(isPaymentSuccess, "Hay Aksi bir problem oluştu.");
                                }
                            }
                        });
                    }
                });
            }
        });*/
        CreateNewSiteRequest request = new CreateNewSiteRequest();
        request.setAddress("1");
        request.setCountryId(1);
        request.setCityId(16);
        request.setDistrictId(204);
        request.setCurrency("tl");
        request.setConstructionCompany("asd");
        request.setPhone("1");
        request.setPostalCode(1690);
        request.setSiteName("ahmet");
        getResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage(request);
            }
        });
    }

    private void sendMessage(CreateNewSiteRequest request) {
        Handler handler = new Handler(Looper.getMainLooper());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                CreateNewSite createNewSite = CreateNewSite.create(request, headers);
                Log.d("createNewSite", "" + createNewSite.getMessage());
                Log.d("createNewSite", "" + request.toString());
                Log.d("createNewSite", "" + createNewSite.getData());
            }
        });
        thread.start();
    }
}