package com.example.project1;

import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment4 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 프래그먼트 초기화 코드를 여기에 작성
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // 프래그먼트의 레이아웃을 인플레이트하고 반환
        return inflater.inflate(R.layout.fragment_4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // 여기서 뷰의 요소에 대한 참조를 얻거나 뷰와 관련된 추가 작업을 수행
    }

    // 필요한 다른 생명주기 메서드들을 여기에 오버라이드하여 추가할 수 있습니다.
}



