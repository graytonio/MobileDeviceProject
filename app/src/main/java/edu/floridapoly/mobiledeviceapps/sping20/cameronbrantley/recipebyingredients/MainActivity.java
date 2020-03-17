package edu.floridapoly.mobiledeviceapps.sping20.cameronbrantley.recipebyingredients;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.content_container);
        AppPageAdapter pa = new AppPageAdapter(getSupportFragmentManager());

        pa.addView(new SearchFragment(), getString(R.string.search_button));
        pa.addView(new SavedFragment(), getString(R.string.saved_button));
        pa.addView(new IngredientsFragment(), getString(R.string.ingredients_button));

        vp.setAdapter(pa);

        TabLayout tl = (TabLayout) findViewById(R.id.main_nav);
        tl.setupWithViewPager(vp);

    }

    private class AppPageAdapter extends FragmentStatePagerAdapter {

        ArrayList<Fragment> views = new ArrayList<Fragment>();
        ArrayList<String> titleList = new ArrayList<String>();

        public AppPageAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addView(Fragment f, String title) {
            views.add(f);
            titleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titleList.get(position);
        }

        @Override
        public Fragment getItem(int position) {
            return views.get(position);
        }

        @Override
        public int getCount() {
            return views.size();
        }
    }
}


