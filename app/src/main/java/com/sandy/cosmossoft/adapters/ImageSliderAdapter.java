package com.sandy.cosmossoft.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.sandy.cosmossoft.C0330R;
import com.sandy.cosmossoft.data.model.SliderItem;
import com.sandy.cosmossoft.databinding.ItemContainerSliderImageBinding;
import java.util.List;

public class ImageSliderAdapter extends RecyclerView.Adapter<ImageSliderViewHolder> {
    private LayoutInflater layoutInflater;
    private List<SliderItem> sliderList;

    public ImageSliderAdapter(List<SliderItem> sliderList2) {
        this.sliderList = sliderList2;
    }

    public ImageSliderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (this.layoutInflater == null) {
            this.layoutInflater = LayoutInflater.from(parent.getContext());
        }
        return new ImageSliderViewHolder((ItemContainerSliderImageBinding) DataBindingUtil.inflate(this.layoutInflater, C0330R.layout.item_container_slider_image, parent, false));
    }

    public void onBindViewHolder(ImageSliderViewHolder holder, int position) {
        holder.binding.setSliderItem(this.sliderList.get(position));
    }

    public int getItemCount() {
        List<SliderItem> list = this.sliderList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class ImageSliderViewHolder extends RecyclerView.ViewHolder {
        /* access modifiers changed from: private */
        public ItemContainerSliderImageBinding binding;

        public ImageSliderViewHolder(ItemContainerSliderImageBinding binding2) {
            super(binding2.getRoot());
            this.binding = binding2;
        }
    }
}
