package android.course.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class images extends Fragment {
    ImageView ivGallery;
    Button btnLeft;
    Button btnRight;

    public images() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_images, container, false);

        ivGallery = (ImageView)v.findViewById(R.id.ivGallery);
        btnLeft = (Button)v.findViewById(R.id.btnLeft);
        btnRight = (Button)v.findViewById(R.id.btnRight);

        return v;

    }
    int counter = 0;
    int[] images = {R.mipmap.image1, R.mipmap.image2, R.mipmap.image3};



    ivGallery.setImageResource(images[counter]);

}
