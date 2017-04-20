package android.course.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment implements View.OnClickListener {
    Button btnLeft;
    Button btnRight;
    FrameLayout layout;
    ImageView ivGallery;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_hello, container, false);

        btnLeft = (Button)v.findViewById(R.id.btnLeft);
        btnRight = (Button)v.findViewById(R.id.btnRight);
        layout = (FrameLayout) v.findViewById(R.id.layout);
        ivGallery = (ImageView)v.findViewById(R.id.ivGallery);

        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);

        return v;
    }

    int counter = 0;
    int[] images = {R.mipmap.ic_launcher, R.mipmap.ic_launcher};

    @Override
    public void onClick(View v) {
        int rgb = Color.argb(255,128,0,128);
        layout.setBackgroundColor(rgb);

        ivGallery.setImageResource(R.mipmap.ic_launcher);
    }
}
