package com.example.project1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyFragmentStateAdapter extends FragmentStateAdapter {

    public MyFragmentStateAdapter(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public Fragment createFragment(int position) {
        // 각 포지션에 맞는 Fragment를 반환합니다.
        switch (position) {
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();
            case 3:
                return new Fragment4();
            default:
                throw new IllegalStateException("유효하지 않은 페이지입니다.");
        }
    }

    @Override
    public int getItemCount() {
        return 4; // 총 슬라이드 수
    }
}
