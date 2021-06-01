package com.example.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new PlaceFragment();
        else if (position == 1)
            return new RestaurantFragment();
        else if (position == 2)
            return new FoodFragment();
        else
            return new ShoppingFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return context.getString(R.string.place_category);
        else if (position == 1)
            return context.getString(R.string.restaurant_category);
        else if (position == 2)
            return context.getString(R.string.food_category);
        else
            return context.getString(R.string.shopping_category);
    }
}
