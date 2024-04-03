package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.myViewPager);
        TabLayout tabDots = findViewById(R.id.tabDots);


        // 어댑터를 설정
        MyFragmentStateAdapter adapter = new MyFragmentStateAdapter(this);
        viewPager2.setAdapter(adapter);

        // TabLayout과 ViewPager2를 연결
        new TabLayoutMediator(tabDots, viewPager2, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(TabLayout.Tab tab, int position) {
                // 여기서 탭을 구성할 수 있지만, 지금은 비어 있어도 괜찮습니다.
                // 이 예제에서는 페이지 인디케이터만 필요합니다.
            }
        }).attach();

        FrameLayout firstNewLayout = findViewById(R.id.firstNewLayout);
        firstNewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sleep_advice.class);
                startActivity(intent);

            }
        });

        FrameLayout secondNewLayout = findViewById(R.id.secondNewLayout);
        secondNewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Health_advice.class);
                startActivity(intent);

            }
        });


        Button button = findViewById(R.id.buttonViewResults);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckActivity.class);
                startActivity(intent);

            }
        });

        Button recheckbutton = findViewById(R.id.buttonRecalculate);
        recheckbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReCheckActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);

            }
        });

        ImageView imageViewSettings = findViewById(R.id.imageViewSettings);
        imageViewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Option.class);
                startActivity(intent);
            }
        });
    }
}
