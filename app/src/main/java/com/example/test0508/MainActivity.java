package com.example.test0508;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvMyData);

        List<StuData> stuDataList = new ArrayList<>();
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "John", "180"));
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "Tom", "175"));
        stuDataList.add(new StuData("https://www.cjcu.edu.tw/images/logo_story/logo-xl.jpg", "Jerry", "170"));
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "Mike", "165"));
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "Jack", "160"));
        stuDataList.add(new StuData("https://www.cjcu.edu.tw/images/logo_story/logo-s2.jpg", "Rose", "155"));
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "Lily", "150"));
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "Lucy", "145"));
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "Linda", "140"));
        stuDataList.add(new StuData("https://cdn-icons-png.flaticon.com/128/2769/2769833.png", "Marry", "135"));
        recyclerView.setAdapter(new StuDataAdapter(stuDataList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}