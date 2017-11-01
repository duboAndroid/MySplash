package GuidePage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import dub.mysplash.R;

public class GuidePage3Fragment extends Fragment {
    private View view;
    private LinearLayout layoutComeIn;
    private SharedPreferences mSettings;
    private ImageView iv_image;
    private boolean lock;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.page_3, container, false);
        }

        return view;
    }

}
