//package com.example.calmable;
//
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.calmable.sample.JsonPlaceHolder;
//import com.example.calmable.sample.Post;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.internal.LinkedTreeMap;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class UserProfile1 extends AppCompatActivity {
//
//    JsonPlaceHolder jsonPlaceHolder;
//    List<Post> postList;
//    //PostAdapter postAdapter;
////    List<Concentration> concentrationList;
////    List<Relaxation> relaxationList;
////    List<EEG_Values> eeg_valuesList;
////    List<Brain_Waves> brain_wavesList;
////    List<Memory> memoryList;
//    LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
//    List brainWaveConList;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_user_profile1);
//        Gson gson = new GsonBuilder().setLenient().create();
//        postList = new ArrayList<>();
////        concentrationList = new ArrayList<>();
////        relaxationList = new ArrayList<>();
////        eeg_valuesList = new ArrayList<>();
////        brain_wavesList = new ArrayList<>();
////        memoryList = new ArrayList<>();
//
//        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.8.137:5000/")
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .build();
//        jsonPlaceHolder = retrofit.create(JsonPlaceHolder.class);
//
//
//        //Post Memory Data
//
////        Call<Void> call6 = jsonPlaceHolder.PostMemoryData(56, 35, 54, 14, 64);
////        call6.enqueue(new Callback<Void>() {
////            @Override
////            public void onResponse(Call<Void> call, Response<Void> response) {
////                Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
////                Log.d("Memory Data", String.valueOf(response.code()));
////            }
////
////            @Override
////            public void onFailure(Call<Void> call, Throwable t) {
////                Toast.makeText(UserProfile1.this, "Failed Post", Toast.LENGTH_SHORT).show();
////                Log.d("ErrorVal", String.valueOf(t));
////
////            }
////        });
//
//
//        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.calmable", 0);
//        int sHR = sharedPreferences.getInt("heartRate", 0);
//
//        ArrayList<Integer> list = new ArrayList();
//        list.add(sHR);
//
//        Log.d("TAG", "-----------onCreate: " + sHR);
//        Log.d("TAG", "-----------onCreate: " + list);
//
//        Call<List> call5 = jsonPlaceHolder.PostBrainWaveData(list);
//        call5.enqueue(new Callback<List>() {
//            @Override
//            public void onResponse(Call<List> call, Response<List> response) {
//                Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
//                Log.d("Response Code BW", String.valueOf(response.code()));
////                Log.d("Brain Wave Response Message", response.message());
////                Log.d("Brain Wave Response Body", String.valueOf(response.body()));
////                Log.d("Brain Wave Response Type", String.valueOf(response.body().getClass().getSimpleName()));
////                ArrayList<Concentration.weatherinfo> list = response.body().getWeather();
//
//
//                Log.d("List", String.valueOf(list));
////
////                Gson gson = new GsonBuilder().create();
////                JsonArray myCustomArray = gson.toJsonTree(brainWaveConList).getAsJsonArray();
////                Log.d("Json Array", String.valueOf(myCustomArray));
////                ArrayList<JsonElement> listdata = new ArrayList<>();
//
//                //Checking whether the JSON array has some value or not
////                if (jsonArray1 != null) {
//
//                //Iterating JSON array
//                for (int i = 0; i < response.body().size(); i++) {
//                    //Object list1=  response.body().get(i);
//                    Log.d("List Concen", String.valueOf(list));
//                    Log.d("GET", response.body().get(i).getClass().getSimpleName());
//
//                    linkedTreeMap = (LinkedTreeMap) response.body().get(i);
//                    linkedTreeMap.get("delta");
//                    Log.d("Delta", String.valueOf(linkedTreeMap.get("delta")));
//                    Log.d("Type I", String.valueOf(linkedTreeMap));
//                    //Call<Object> call2 = jsonPlaceHolder.PostConcentrationData(response.body().get(i));
//                    //Log.d("CALL2", String.valueOf(call2));
//                    call2.enqueue(new Callback<Object>() {
//                        @Override
//                        public void onResponse(Call<Object> call, Response<Object> response) {
//                            Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
////                            Log.d("Concentration Response Code", String.valueOf(response.code()));
////
////                            Log.d("Concentration Response Message", String.valueOf(response.message()));
////                            Log.d("Concentration Response Body", String.valueOf(response.body().toString()));
////                        Log.d("Concentration Response Type", response.body().getClass().getSimpleName());
//                        }
//
//                        //
//                        @Override
//                        public void onFailure(Call<Object> call, Throwable t) {
//                            Toast.makeText(UserProfile1.this, "Failed Post Concentration", Toast.LENGTH_SHORT).show();
//                            Log.d("ErrorVal:Concentration", String.valueOf(t));
//
//                        }
//                    });
//
//                    Call<Object> call3 = jsonPlaceHolder.PostRelaxationData(response.body().get(i));
//                    Log.d("CALL2", String.valueOf(call2));
//                    call3.enqueue(new Callback<Object>() {
//                        @Override
//                        public void onResponse(Call<Object> call, Response<Object> response) {
//                            Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
////                            Log.d("Relaxation Response Response Code", String.valueOf(response.code()));
////
////                            Log.d("Relaxation Response Message", String.valueOf(response.message()));
////                            Log.d("Relaxation Response Body", String.valueOf(response.body().toString()));
////                        Log.d("Concentration Response Type", response.body().getClass().getSimpleName());
//                        }
//
//                        //
//                        @Override
//                        public void onFailure(Call<Object> call, Throwable t) {
//                            Toast.makeText(UserProfile1.this, "Failed Post Relaxation", Toast.LENGTH_SHORT).show();
//                            Log.d("ErrorVal:Relaxation", String.valueOf(t));
//
//                        }
//                    });
//
//                    Call<Object> call4 = jsonPlaceHolder.PostMemoryData(response.body().get(i));
//                    Log.d("CALL2", String.valueOf(call2));
//                    call4.enqueue(new Callback<Object>() {
//                        @Override
//                        public void onResponse(Call<Object> call, Response<Object> response) {
////                            Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
////                            Log.d("Memory Response Response Code", String.valueOf(response.code()));
////
////                            Log.d("Memory Response Message", String.valueOf(response.message()));
////                            Log.d("Memory Response Body", String.valueOf(response.body().toString()));
////                        Log.d("Concentration Response Type", response.body().getClass().getSimpleName());
//                        }
//
//                        //
//                        @Override
//                        public void onFailure(Call<Object> call, Throwable t) {
//                            Toast.makeText(UserProfile1.this, "Failed Memory Post", Toast.LENGTH_SHORT).show();
//                            Log.d("ErrorVal:Memory", String.valueOf(t));
//
//                        }
//                    });
//
//
////
//                }
//                Log.d("Outside Delta", String.valueOf(linkedTreeMap.get("delta")));
//
//
////
//
//
////
//
//            }
//
//            //
//            @Override
//            public void onFailure(Call<List> call, Throwable t) {
//                Toast.makeText(UserProfile1.this, "Failed Post", Toast.LENGTH_SHORT).show();
//                Log.d("ErrorVal", String.valueOf(t));
//
//
//            }
//        });
//
//        //Post Calibration Data
//        ArrayList<Integer> listCal = new ArrayList(Arrays.asList(43, 24, 33, 53, 53, 13, 12, 24, 30));
//        Call<List> callCal = jsonPlaceHolder.PostCalibrationData(listCal);
//        callCal.enqueue(new Callback<List>() {
//            @Override
//            public void onResponse(Call<List> call, Response<List> response) {
//                Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
//                Log.d("Response Code Calib", String.valueOf(response.code()));
////                Log.d("Calibration Response Message", response.message());
////                Log.d("Calibration Response Body", String.valueOf(response.body()));
////                Log.d("Calibration Response Type", String.valueOf(response.body().getClass().getSimpleName()));
//
//
//            }
//
//            //
//            @Override
//            public void onFailure(Call<List> call, Throwable t) {
//                Toast.makeText(UserProfile1.this, "Failed Post", Toast.LENGTH_SHORT).show();
//                Log.d("ErrorVal", String.valueOf(t));
//
//            }
//        });
//
////
//
//
////
//
////
//
//
//        // Post Relaxation Data
//
////        Call<Void> call3 = jsonPlaceHolder.PostRelaxationData(23, 46, 64, 74, 26);
////        call3.enqueue(new Callback<Void>() {
////            @Override
////            public void onResponse(Call<Void> call, Response<Void> response) {
////                Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
////                Log.d("Response Code Rel", String.valueOf(response.code()));
////            }
////
////            @Override
////            public void onFailure(Call<Void> call, Throwable t) {
////                Toast.makeText(UserProfile1.this, "Failed Post", Toast.LENGTH_SHORT).show();
////                Log.d("ErrorVal", String.valueOf(t));
////
////            }
////        });
//
//
//        createPost();
//
//    }
//
//    private void createPost() {
//
//        Post post = new Post(45);
//        Gson gson = new Gson();
//
////        Call<Void> call = jsonPlaceHolder.createPostVal("Sanduni", "24", "Devi Balika Vidhyalaya");
////        call.enqueue(new Callback<Void>() {
////            @Override
////            public void onResponse(Call<Void> call, Response<Void> response) {
////                Log.d("Response Code", String.valueOf(response.code()));
////                Toast.makeText(UserProfile1.this, "Post Successful", Toast.LENGTH_SHORT).show();
////            }
////
////            @Override
////            public void onFailure(Call<Void> call, Throwable t) {
////                Toast.makeText(UserProfile1.this, "Failed Post", Toast.LENGTH_SHORT).show();
////                Log.d("ErrorVal", String.valueOf(t));
////
////            }
////        });
//
////
//    }
//}