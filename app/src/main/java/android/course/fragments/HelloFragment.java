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


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_hello, container, false);


        layout = (FrameLayout) v.findViewById(R.id.layout);


        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);

        return v;
    }



    @Override
    public void onClick(View v) {
        int rgb = Color.argb(255,128,0,128);
        layout.setBackgroundColor(rgb);


    }
}
