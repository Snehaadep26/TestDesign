package com.example.testdesign.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testdesign.R;
import com.example.testdesign.TestModuleApi.ApiClient;
import com.example.testdesign.TestModuleApi.GetAllTestForStudentResponse;
import com.example.testdesign.TestModuleApi.LogInService;
import com.example.testdesign.TestModuleApi.OnGoingLiveTest;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class OnGoingTestFragment extends Fragment {

    Button button;
    Retrofit retrofit;
    LogInService logInService;
    GetAllTestForStudentResponse getAllTestForStudentResponse;



    TextView title,mathsText,phyText,chemText,testQuestion,testMarks,testestimatedTime,testDate,testStartTime;
    public OnGoingTestFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_on_going_test1, container, false);
        title=view.findViewById(R.id.jeeMockTestOT);
        mathsText=view.findViewById(R.id.mathsTextOT);
       // phyText=view.findViewById(R.id.phyTextOT);
       // chemText=view.findViewById(R.id.chemTextOT);
        testMarks=view.findViewById(R.id.marksTextOT);
        testestimatedTime=view.findViewById(R.id.testTime);
        testDate=view.findViewById(R.id.dateTextUL);
        testStartTime=view.findViewById(R.id.dateTextUL);




        NavController navController = NavHostFragment.findNavController(this);

        apiInIt();
        getAllStudTest();

        button = view.findViewById(R.id.buttonStartTest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections nav = OnGoingTestFragmentDirections.actionOnGoingTestFragmentToFragmentJeeMockTest();

                navController.navigate(nav);

            }
        });

        return view;
    }
    public void apiInIt() {
        retrofit = ApiClient.getRetrofit();
        logInService = ApiClient.getLoginService();

    }
    public void getAllStudTest() {
        Call<GetAllTestForStudentResponse> call = logInService.getAllTestStudCall();
        call.enqueue(new Callback<GetAllTestForStudentResponse>() {
            @Override
            public void onResponse(Call<GetAllTestForStudentResponse> call, Response<GetAllTestForStudentResponse> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAllTestForStudentResponse = response.body();
                title.setText(String.valueOf(getAllTestForStudentResponse.onGoingLiveTest.getId()));
                mathsText.setText(String.valueOf(getAllTestForStudentResponse.onGoingLiveTest.getSubjectNames()));
                testQuestion.setText(String.valueOf(getAllTestForStudentResponse.onGoingLiveTest.getTotalQuestions()));
                testMarks.setText(String.valueOf(getAllTestForStudentResponse.onGoingLiveTest.getTotalPoints()));
                testestimatedTime.setText(String.valueOf(getAllTestForStudentResponse.onGoingLiveTest.getEndTime()));
                testDate.setText(String.valueOf(getAllTestForStudentResponse.onGoingLiveTest.getTestDate()));
                testStartTime.setText(String.valueOf(getAllTestForStudentResponse.onGoingLiveTest.getStartTime()));



                Toast.makeText(getContext(), String.valueOf(getAllTestForStudentResponse.getOnGoingLiveTest().teacherName), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetAllTestForStudentResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error get all tests", Toast.LENGTH_SHORT).show();
            }
        });
    }
}