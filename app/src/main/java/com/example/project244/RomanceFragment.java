package com.example.project244;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class RomanceFragment extends Fragment {

    private static final String TAG = "RomanceFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_romance, container, false);

        // Find the button by its ID
        Button catatansiboyButton = view.findViewById(R.id.catatansiboy);
        Button insyaallahsah2Button = view.findViewById(R.id.insyaallahsah2);
        Button ainun3Button = view.findViewById(R.id.ainun3);

        // Set click listener for each button
        catatansiboyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviescatatansiboy button clicked");
                playVideo(R.raw.moviescatatansiboy);
            }
        });

        insyaallahsah2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviesinsyaallahsah2 button clicked");
                playVideo(R.raw.moviesinsyaallahsah2);
            }
        });

        ainun3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "movieshabibieainun3 button clicked");
                playVideo(R.raw.movieshabibieainun3);
            }
        });

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_tab, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.tab_romance) {
            Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT)
                    .show();
        }
        return true;
    }

    private void playVideo(int videoResource) {
        String videoPath = "android.resource://" + getActivity().getPackageName() + "/" + videoResource;
        Intent intent = new Intent(getActivity(), VideoPlayerActivity.class);
        intent.putExtra("VIDEO_PATH", videoPath);
        startActivity(intent);
    }
}