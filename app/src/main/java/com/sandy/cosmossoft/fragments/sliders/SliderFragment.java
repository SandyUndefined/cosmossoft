package com.sandy.cosmossoft.fragments.sliders;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.adapters.ImageSliderAdapter;
import com.sandy.cosmossoft.data.model.SliderItem;
import com.sandy.cosmossoft.data.network.APIServices;
import com.sandy.cosmossoft.data.p000db.AppDatabase;
import com.sandy.cosmossoft.data.p000db.entities.User;
import com.sandy.cosmossoft.databinding.FragmentSliderBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p006io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import p006io.reactivex.rxjava3.core.Observer;
import p006io.reactivex.rxjava3.disposables.Disposable;
import p006io.reactivex.rxjava3.schedulers.Schedulers;

public class SliderFragment extends Hilt_SliderFragment {
    @Inject
    APIServices apiServices;
    /* access modifiers changed from: private */
    public FragmentSliderBinding binding;
    /* access modifiers changed from: private */
    public List<SliderItem> list = new ArrayList();
    /* access modifiers changed from: private */
    public final Handler sliderHandler = new Handler();
    /* access modifiers changed from: private */
    public final Runnable sliderRunnable = new Runnable() {
        public void run() {
            if (SliderFragment.this.binding.sliderViewPager.getCurrentItem() == SliderFragment.this.list.size() - 1) {
                SliderFragment.this.binding.sliderViewPager.setCurrentItem(0);
            } else {
                SliderFragment.this.binding.sliderViewPager.setCurrentItem(SliderFragment.this.binding.sliderViewPager.getCurrentItem() + 1);
            }
        }
    };

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentSliderBinding fragmentSliderBinding = (FragmentSliderBinding) DataBindingUtil.inflate(inflater, C0330R.layout.fragment_slider, container, false);
        this.binding = fragmentSliderBinding;
        return fragmentSliderBinding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setBanners();
        }
    }

    /* access modifiers changed from: private */
    public void setSliders(List<SliderItem> list2) {
        this.binding.sliderViewPager.setAdapter(new ImageSliderAdapter(list2));
        sliderIndicators(list2.size());
        this.binding.sliderViewPager.setClipToPadding(false);
        this.binding.sliderViewPager.setClipChildren(false);
        this.binding.sliderViewPager.setOffscreenPageLimit(3);
        this.binding.sliderViewPager.getChildAt(0).setOverScrollMode(2);
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(10));
        this.binding.sliderViewPager.setPageTransformer(compositePageTransformer);
        this.binding.sliderViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                SliderFragment.this.setCurrentSliderIndicators(position);
                SliderFragment.this.sliderHandler.removeCallbacks(SliderFragment.this.sliderRunnable);
                SliderFragment.this.sliderHandler.postDelayed(SliderFragment.this.sliderRunnable, 3000);
            }
        });
    }

    private void sliderIndicators(int count) {
        ImageView[] indicators = new ImageView[count];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(8, 0, 0, 0);
        for (int i = 0; i < indicators.length; i++) {
            indicators[i] = new ImageView(requireContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(requireContext(), C0330R.C0332drawable.backgound_slider_layout_indicator_active));
            indicators[i].setLayoutParams(layoutParams);
            this.binding.LayoutSliderIndicators.addView(indicators[i]);
        }
        setCurrentSliderIndicators(0);
    }

    /* access modifiers changed from: private */
    public void setCurrentSliderIndicators(int position) {
        int childCount = this.binding.LayoutSliderIndicators.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ImageView imageView = (ImageView) this.binding.LayoutSliderIndicators.getChildAt(i);
            if (i == position) {
                imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), C0330R.C0332drawable.backgound_slider_layout_indicator_active));
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), C0330R.C0332drawable.backgound_slider_layout_indicator_inactive));
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.sliderHandler.postDelayed(this.sliderRunnable, 3000);
    }

    public void onPause() {
        super.onPause();
        this.sliderHandler.removeCallbacks(this.sliderRunnable);
    }

    private void setBanners() {
        User user = AppDatabase.getAppDatabase(requireActivity()).getUserDao().getRegularUser();
        if (user != null) {
            this.apiServices.getMeBanners(user.getUserstatus()).subscribeOn(Schedulers.m547io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<SliderItem>>() {
                public void onSubscribe(Disposable d) {
                }

                public void onNext(List<SliderItem> list) {
                    List unused = SliderFragment.this.list = list;
                    SliderFragment sliderFragment = SliderFragment.this;
                    sliderFragment.setSliders(sliderFragment.list);
                }

                public void onError(Throwable e) {
                }

                public void onComplete() {
                }
            });
        }
    }
}
