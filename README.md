# UAS_PEMROGRAMAN_MOBILE1


Nama    : Alfaza putra adjie ariefiansyah

NIM     : 312210512

Kelas   : TI.22.A5

Mata Kuliah : Pemrograman Mobile 1

Dosen Pengampu   : Donny Maulana, S.Kom., M.M.S.I.






## TUTORIAL PDF
Berikut merupakan tutorial untuk menjalankan program aplikasi pada Android Studio

[Tutorial Final Project UAS PMobile1.pdf](https://github.com/alfaza-putra/PROJECT-UASPM1/files/13947395/Tutorial.Final.Project.UAS.PMobile1.pdf)


> **Pada tugas akhir ini. saya akan menambahkan video trailer di setiap film dari tugas tugas sebelumnya..**


## Penjelasan & Hasil Program Tugas Akhir 

> Pada tugas Akhir ini saya melakukan perubahan pada nama aplikasi, lalu gambar icon aplikasi dan juga pada splashscreen, untuk cara dan isi code nya sama seperti pada tugas tugas sebelumnya lalu di sesuaikan saja dengan yang baru.

**Fill in All The Code in This Project :**
> 1. ***Gradle Script*** => `build.gradle.kts (Module :app)`
```
plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.project244"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.project244"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
```
- Setelah itu klik `Sync now`

> 2. ***AndroidManifest.xml***
- Lengkapi code ini pada `AndroidManifest.xml` yang sudah berisikan dengan code-code di project sebelumnya.
```
<activity android:name=".VideoPlayerActivity" />
```

> 3. ***Java***

=> Pada `MainActivity.java` saya melakukan penambahan code, yaitu isi code keseluruhannya adalah :
- `MainAcitivity.java`
```
package com.example.project244;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.cdMenu5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setAlarm();
            }
        });

        findViewById(R.id.cdMenu1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolSatu ditekan, pindah ke HelloActivity
                Intent helloworld = new Intent(MainActivity.this, HelloActivity.class);
                startActivity(helloworld);
            }
        });

        findViewById(R.id.cdMenu2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent toast = new Intent(MainActivity.this, CountActivity.class);
                startActivity(toast);
            }
        });

        findViewById(R.id.cdMenu3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent sianida = new Intent(MainActivity.this, com.example.project244.SianidaActivity.class);
                startActivity(sianida);
            }
        });

        findViewById(R.id.cdMenu4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent twoactivity = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(twoactivity);
            }
        });

        findViewById(R.id.cdMenu7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent fragmentactivity = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(fragmentactivity);
            }
        });

        findViewById(R.id.cdMenu6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example location: Jakarta, Indonesia
                Uri geoLocation = Uri.parse("geo:-6.2088,106.8456");
                openMaps(geoLocation);
            }
        });
    }

    private void setAlarm() {
        Intent alarmIntent = new Intent(android.provider.AlarmClock.ACTION_SET_ALARM);
        // Add extra details for the alarm, e.g., alarm time, label, etc.
        // alarmIntent.putExtra(...
        startActivity(alarmIntent);
    }
    private void openMaps(Uri geoLocation) {
        Intent maps = new Intent(Intent.ACTION_VIEW);
        maps.setData(geoLocation);
        if (maps.resolveActivity(getPackageManager()) != null) {
            startActivity(maps);
        }
    }

}
```
> Note : Isi code pada keseluruhan tugas akhir ini tetap sama seperti pada isi code tugas sebelumnya yaitu seperti *Java class* dan untuk *res/layout* hanya sedikit merubah design, pada tugas akhir ini saya hanya mencantumkan dan menjelaskan code-code yang ditambahkan untuk `Fragment` saja.


- Untuk package name bisa di sesuaikan dengan package name project kita masing-masing, disini saya melanjutkan dari package name project sebelumnya.

=> `FragmentActivity.java`
```
package com.example.project244;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class FragmentActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    ViewAdapter adapter;

    @SuppressLint({"NewApi", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getColor(R.color.coklat)));

        tabLayout = findViewById(R.id.tab);
        viewPager2 = findViewById(R.id.view);
        adapter = new ViewAdapter(this);
        viewPager2.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        class Halaman extends FragmentStatePagerAdapter {
            Context context;
            int jumlah_tab;

            Halaman(Context context, FragmentManager fm, int jml_tab)
            {
                super(fm);
                this.context=context;
                this.jumlah_tab=jml_tab;
            }

            @NonNull
            @Override
            public Fragment getItem(int posisition){
                switch (posisition){
                    case 0:return new ActionFragment();
                    case 1:return new HororFragment();
                    case 2:return new RomanceFragment();
                }
                return null;
            }

            @Override
            public int getCount(){
                return jumlah_tab;
            }
        }

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });

    }
}

```
=> Membuat file fragment dengan cara klik kanan pada `MainActivity.java` lalu pilih dan klik fragment, setelah itu kita pilih dan klik fragment (Blank), setelah itu kita beri nama `ActionFragment`, `ComedyFragment`, `RomanceFragment`. Untuk file fragment sudah sekaligus dengan file layout xml nya (code berada pada bagian res `layout`)

- `ActionFragment.java` :
```
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


public class ActionFragment extends Fragment {

    private static final String TAG = "ActionFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_action, container, false);

        // Find the button by its ID
        Button equalizerButton = view.findViewById(R.id.equalizer);
        Button equalizer2Button = view.findViewById(R.id.equalizer2);
        Button equalizer3Button = view.findViewById(R.id.equalizer3);

        // Set click listener for each button
        equalizerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviestheequalizer button clicked");
                playVideo(R.raw.moviestheequalizer);
            }
        });

        equalizer2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviestheequalizer2 button clicked");
                playVideo(R.raw.moviestheequalizer2);
            }
        });

        equalizer3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviestheequalizer3 button clicked");
                playVideo(R.raw.moviestheequalizer3);
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
        if (item.getItemId() == R.id.tab_action) {
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
```

- `RomanceFragment.java` :
```
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
```

- `HororFragment.java` :
```
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


public class HororFragment extends Fragment {

    private static final String TAG = "HororFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_horor, container, false);

        // Find the button by its ID
        Button insidiousButton = view.findViewById(R.id.insidious);
        Button insidious2Button = view.findViewById(R.id.insidious2);
        Button insidious3Button = view.findViewById(R.id.insidious3);

        // Set click listener for each button
        insidiousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviesinsidious button clicked");
                playVideo(R.raw.moviesinsidious);
            }
        });

        insidious2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviesinsidious2 button clicked");
                playVideo(R.raw.moviesinsidiousthelastkey);
            }
        });

        insidious3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "moviesinsidious3 button clicked");
                playVideo(R.raw.moviesinsidiousthereddoor);
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
        if (item.getItemId() == R.id.tab_horor) {
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

```

=> Lalu buat java class dengan nama `ViewAdapter.java`, yang berisi code :
```
package com.example.project244;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewAdapter extends FragmentStateAdapter {
    public ViewAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ActionFragment();
            case 1:
                return new HororFragment();
            case 2:
                return new RomanceFragment();
            default:
                return new ActionFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
```

=> Setelah itu membuat java class untuk memutar video dengan nama `VideoPlayerActivity.java`, yang berisi code :
```
package com.example.project244;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class VideoPlayerActivity extends AppCompatActivity {

    private VideoView videoView; // Deklarasi VideoView sebagai variabel global
    private int originalOrientation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        // Get the video URI from the intent
        String videoPath = getIntent().getStringExtra("VIDEO_PATH");
        Uri uri = Uri.parse(videoPath);

        // Set up VideoView
        videoView = findViewById(R.id.videoView); // Inisialisasi variabel videoView
        videoView.setVideoURI(uri);

        // Set up MediaController
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Start playing the video
        videoView.start();

        // Get the original orientation
        originalOrientation = getResources().getConfiguration().orientation;

        // Adjust video layout based on the original orientation
        adjustVideoLayout(originalOrientation);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Detect orientation changes and adjust VideoView layout
        int currentOrientation = getResources().getConfiguration().orientation;
        if (currentOrientation != originalOrientation) {
            adjustVideoLayout(currentOrientation);
            originalOrientation = currentOrientation;
        }
    }

    private void adjustVideoLayout(int orientation) {
        if (orientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE ||
                orientation == ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE) {
            // Landscape mode
            setFullscreen(true);
        } else {
            // Portrait or other orientations
            setFullscreen(false);
        }
    }

    private void setFullscreen(boolean fullscreen) {
        if (fullscreen) {
            // Hide action bar
            if (getSupportActionBar() != null) {
                getSupportActionBar().hide();
            }

            // Set VideoView layout parameters for fullscreen
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            );
            params.addRule(RelativeLayout.CENTER_IN_PARENT);
            videoView.setLayoutParams(params);

            // Hide navigation bar and status bar
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        } else {
            // Show action bar
            if (getSupportActionBar() != null) {
                getSupportActionBar().show();
            }

            // Set VideoView layout parameters for normal mode
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            params.addRule(RelativeLayout.CENTER_IN_PARENT);
            videoView.setLayoutParams(params);

            // Show navigation bar and status bar
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_VISIBLE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_video_player, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_back) {
            // Tambahkan logika untuk kembali ke halaman sebelumnya atau finish activity
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
```


> 4. ***res***

=> Pada bagian `Drawable` saya menambahkan *Drawable Resource File* dengan nama `bg_cardview.xml`, yang berisikan code :
```
<!-- cardview_pressed_effect.xml -->
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_pressed="true">
        <shape android:shape="rectangle">
            <!-- Ganti warna latar belakang yang diinginkan saat CardView ditekan -->
            <solid android:color="#F6F7F9" />
            <corners android:radius="20dp"/>
        </shape>
    </item>
    <item>
        <!-- Warna latar belakang default saat tidak ditekan -->
        <shape android:shape="rectangle">
            <solid android:color="#008BD7EE" />\

        </shape>
    </item>
</selector>
```

=> `values`

- `colors.xml` :
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
    <color name="blue">#3700B3</color>
    <color name="pink">#FFC0CB</color>
    <color name="colorPrimary">#3F5185</color>
    <color name="colorPrimaryDark">#303F9F</color>
    <color name="colorAccent">#FF4081</color>
    <color name="salem">#F8C6E6</color>
    <color name ="purple">#E3A2ED</color>
    <color name="biru">#8FC2EA</color>
    <color name="hijaumuda">#C2E69C</color>
    <color name="coklat">#65362c</color>
    <color name="abu">#B0B0B2</color>
    <color name="tosca">#70AE98</color>
    <color name="soft">#AED9EA</color>
    <color name="pastel">#5E96AE</color>
</resources>
```

=> `strings.xml` (tambahkan code strings.xml dibawah ini dengan code strings.xml pada project sebelumnya yaitu tugas 2) :
```
<resources>
<string name="app_name">Project244</string>
    <!-- TODO: Remove or change this placeholder text -->
<string name="hello_blank_fragment">Hello blank fragment</string>
</resources>
```
=> `themes`

- `themes.xml` dan `themes.xml(night)` (sama isi code nya) :
```
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="SplashScreen" parent="Theme.MaterialComponents.DayNight.NoActionBar">
        <item name="android:windowBackground">@drawable/bgop</item>
        <item name="android:statusBarColor">@color/soft</item>
    </style>

     <!-- Base application theme. -->
    <style name="Base.Theme.Project244." parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryVariant">@color/purple</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/purple</item>
        <item name="colorSecondaryVariant">@color/hijaumuda</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor">@color/purple</item>
        <item name="android:navigationBarColor">@color/purple</item>
        <!-- Customize your light theme here. -->
    </style>

    <style name="Theme.TabExperiment" parent="Base.Theme.Project244." />
</resources>
```

=> Untuk menambahkan video pada Android Studio disini saya memakai `res/raw/video_kita.mp4`, yaitu caranya yang pertama kita klik kanan terlebih dahulu di bagian `res` lalu kita pilih dan klik `new` lalu pilih dan klik bagian `Android Resource Directory`, setelah itu ada bagian    `Resource type` kita pilih `raw` lalu kita klik OK. Lalu setelah itu langsung saja kita copy paste video yang kita ingin masukkan ke dalam project kita ke dalam `raw`.

=> `layout`

=> Pada `activity_main.xml` saya melakukan penambahan dan perubahan code untuk design nya, yaitu isi code keseluruhannya adalah :
- `activity_main.xml` :
```
<?xml version="1.0" encoding="utf-8"?>
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/bg1"
    tools:context="com.example.project244.MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:id="@+id/title_view"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:text="Menu Program"
            android:fontFamily="serif"
            android:textColor="@color/black"
            android:textStyle="bold"
            android:textSize="35sp"
            android:layout_marginTop="35dp"/>

        <GridLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_below="@+id/title_view"
            android:layout_marginStart="35dp"
            android:layout_marginTop="45dp"
            android:layout_marginEnd="40dp"
            android:layout_marginBottom="35dp"
            android:columnCount="10"
            android:rowCount="10">

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu1"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="50dp"
                        android:layout_height="50dp"
                        android:src="@drawable/hello" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="sans-serif"
                        android:text="HELLO WORLD"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu2"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="1"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="50dp"
                        android:layout_height="50dp"
                        android:src="@drawable/fibo" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="serif"
                        android:text="FIBONACCI"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu3"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="1"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="60dp"
                        android:layout_height="50dp"
                        android:src="@drawable/scroll" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="serif"
                        android:text="ICE COLD"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu4"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="1"
                android:layout_rowWeight="1"
                android:layout_column="1"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="50dp"
                        android:layout_height="50dp"
                        android:src="@drawable/twoact" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="serif"
                        android:text="TWO ACTIVITY"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu5"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="2"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="90dp"
                        android:layout_height="50dp"
                        android:src="@drawable/alarm" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="serif"
                        android:text="ALARM"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu6"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="2"
                android:layout_rowWeight="1"
                android:layout_column="1"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="50dp"
                        android:layout_height="50dp"
                        android:src="@drawable/maps" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="serif"
                        android:text="MAPS"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu7"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="3"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="50dp"
                        android:layout_height="50dp"
                        android:src="@drawable/movies" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="serif"
                        android:text="MOVIES"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu8"
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:layout_row="3"
                android:layout_rowWeight="1"
                android:layout_column="1"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_margin="8dp"
                app:cardCornerRadius="8dp"
                app:cardElevation="8dp">

                <LinearLayout
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_vertical|center_horizontal"
                    android:gravity="center"
                    android:orientation="vertical">

                    <ImageView
                        android:layout_width="50dp"
                        android:layout_height="50dp"
                        android:src="@drawable/empty" />

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginTop="10dp"
                        android:fontFamily="serif"
                        android:text="EMPTY"
                        android:textAlignment="center"
                        android:textColor="@color/black"
                        android:textStyle="bold" />
                </LinearLayout>
            </androidx.cardview.widget.CardView>

        </GridLayout>

        <TextView
            android:id="@+id/bottom_text"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginBottom="35dp"
            android:layout_alignParentBottom="true"
            android:layout_centerHorizontal="true"
            android:fontFamily="monospace"
            android:text="© 244 Alfaza"
            android:textColor="@color/black"
            android:textSize="23sp"
            android:textStyle="bold" />

    </RelativeLayout>

</ScrollView>
```

- `activity_movie.xml` :
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    tools:context="com.example.project244.FragmentActivity">


    <com.google.android.material.tabs.TabLayout
        android:id="@+id/tab"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/pastel"
        app:tabSelectedTextColor="@color/white"
        app:tabIndicatorColor="@color/white"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="3dp"
        tools:ignore="MissingConstraints">

        <com.google.android.material.tabs.TabItem
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Action"
            tools:layout_editor_absoluteX="0dp"
            tools:layout_editor_absoluteY="3dp" />

        <com.google.android.material.tabs.TabItem
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Horor" />

        <com.google.android.material.tabs.TabItem
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Romance" />
    </com.google.android.material.tabs.TabLayout>

    <androidx.viewpager2.widget.ViewPager2
        android:id="@+id/view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginTop="50dp"
        android:background="@color/white"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="52dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

- `activity_video_player.xml` :
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <VideoView
        android:id="@+id/videoView"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"/>
</RelativeLayout>
```

- `fragment_action.xml` :
```
<?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            xmlns:tools="http://schemas.android.com/tools"
            android:padding="12dp"
            tools:context="com.example.project244.ActionFragment">

            <ScrollView
                android:layout_width="500dp"
                android:layout_height="wrap_content"
                android:background="@drawable/bglightabu">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <androidx.cardview.widget.CardView
                        android:id="@+id/cdMenu1"
                        android:layout_width="320dp"
                        android:layout_height="220dp"
                        android:layout_row="0"
                        android:layout_rowWeight="1"
                        android:layout_column="0"
                        android:layout_columnWeight="1"
                        android:layout_gravity="fill"
                        android:layout_marginStart="8dp"
                        android:layout_marginTop="8dp"
                        android:layout_marginEnd="8dp"
                        android:layout_marginBottom="8dp">


                        <ImageView
                            android:id="@+id/imgMovie"
                            android:layout_width="143dp"
                            android:layout_height="207dp"
                            android:layout_gravity="left"
                            android:layout_marginTop="6dp"
                            android:src="@drawable/filmaction1" />

                        <TextView
                            android:id="@+id/tvTitle"
                            android:layout_width="168dp"
                            android:layout_height="108dp"
                            android:layout_gravity="right"
                            android:layout_marginStart="16dp"
                            android:layout_marginLeft="50dp"
                            android:layout_marginTop="8dp"
                            android:layout_toRightOf="@id/imgMovie"
                            android:text="THE EQUALIZER"
                            android:textColor="@color/black"
                            android:textSize="16sp" />

                        <TextView
                            android:id="@+id/Deskription"
                            android:layout_width="172dp"
                            android:layout_height="131dp"
                            android:layout_below="@id/tvTitle"
                            android:layout_gravity="right"
                            android:layout_marginStart="15dp"
                            android:layout_marginTop="35dp"
                            android:layout_toRightOf="@id/imgMovie"
                            android:maxLines="11"
                            android:text="McCall, menyerah pada kehidupan kekerasan, Ia ingin menjalani hidup tenang dan tidak terganggu. Namun, peristiwa brutal memaksa dia untuk sekali lagi berjuang demi keadilan."
                            android:textColor="@color/black" />

                        <Button
                            android:id="@+id/equalizer"
                            android:layout_width="176dp"
                            android:layout_height="wrap_content"
                            android:layout_below="@id/Deskription"
                            android:layout_gravity="bottom|right"
                            android:layout_marginStart="9dp"
                            android:layout_marginTop="2dp"
                            android:layout_toRightOf="@id/imgMovie"
                            android:onClick="playTheEqualizerTrailer"
                            android:text="Watch Trailer Now" />
                    </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
            android:id="@+id/cdMenu2"
            android:layout_width="320dp"
            android:layout_height="220dp"
            android:layout_row="0"
            android:layout_rowWeight="1"
            android:layout_column="0"
            android:layout_columnWeight="1"
            android:layout_gravity="fill"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="8dp"
            android:layout_marginBottom="8dp">

            <TextView
                android:id="@+id/tvTitle2"
                android:layout_width="172dp"
                android:layout_height="wrap_content"
                android:layout_gravity="right"
                android:layout_marginStart="16dp"
                android:layout_marginLeft="12dp"
                android:layout_marginTop="8dp"
                android:layout_toRightOf="@id/imgMovie2"
                android:text="THE EQUALIZER 2"
                android:textColor="@color/black"
                android:textSize="16sp" />

            <TextView
                android:id="@+id/Deskription2"
                android:layout_width="173dp"
                android:layout_height="177dp"
                android:layout_below="@id/tvTitle"
                android:layout_gravity="right"
                android:layout_marginStart="16dp"
                android:layout_marginLeft="13dp"
                android:layout_marginTop="35dp"
                android:layout_toRightOf="@id/imgMovie2"
                android:maxLines="11"
                android:text="McCall Kini ia mencari tahu siapa yang telah membunuh temannya itu untuk membalaskan dendam."
                android:textColor="@color/black" />

            <ImageView
                android:id="@+id/imgMovie2"
                android:layout_width="142dp"
                android:layout_height="205dp"
                android:layout_gravity="left"
                android:layout_marginTop="4dp"
                android:src="@drawable/filmaction2" />

    <Button
        android:id="@+id/equalizer2"
        android:layout_width="175dp"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom|right"
        android:layout_marginStart="9dp"
        android:layout_marginTop="2dp"
        android:layout_toRightOf="@id/imgMovie2"
        android:layout_below="@id/Deskription2"
        android:text="Watch Trailer Now"
        android:onClick="playTheEqualizer2Trailer"/>

        </androidx.cardview.widget.CardView>
        <androidx.cardview.widget.CardView
            android:id="@+id/cdMenu3"
            android:layout_width="320dp"
            android:layout_height="220dp"
            android:layout_row="0"
            android:layout_rowWeight="1"
            android:layout_column="0"
            android:layout_columnWeight="1"
            android:layout_gravity="fill"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="8dp"
            android:layout_marginBottom="8dp">


            <ImageView
                android:id="@+id/imgMovie3"
                android:layout_width="138dp"
                android:layout_height="209dp"
                android:layout_gravity="left"
                android:layout_marginTop="6dp"
                android:src="@drawable/filmaction3" />

            <TextView
                android:id="@+id/tvTitle3"
                android:layout_width="172dp"
                android:layout_height="wrap_content"
                android:layout_gravity="right"
                android:layout_marginStart="16dp"
                android:layout_marginLeft="12dp"
                android:layout_marginTop="8dp"
                android:layout_toRightOf="@id/imgMovie3"
                android:text="THE EQUALIZER 3"
                android:textColor="@color/black"
                android:textSize="16sp" />

            <TextView
                android:id="@+id/Deskription3"
                android:layout_width="177dp"
                android:layout_height="178dp"
                android:layout_below="@id/tvTitle"
                android:layout_gravity="right"
                android:layout_marginStart="16dp"
                android:layout_marginLeft="13dp"
                android:layout_marginTop="35dp"
                android:layout_toRightOf="@id/imgMovie3"
                android:maxLines="11"
                android:text="Robert McCall (Denzel Washington) kembali beraksi, kali ini ia akan menghadapi mafia sadis yang mengganggu teman-temannya di Italia."
                android:textColor="@color/black" />

    <Button
        android:id="@+id/equalizer3"
        android:layout_width="182dp"
        android:layout_height="wrap_content"
        android:layout_gravity="right|bottom"
        android:layout_below="@id/Deskription3"
        android:layout_marginStart="9dp"
        android:layout_marginTop="2dp"
        android:layout_toRightOf="@id/imgMovie3"
        android:onClick="playTheEqualizer3Trailer"
        android:text="Watch Trailer Now" />

        </androidx.cardview.widget.CardView>

    </LinearLayout>
    </ScrollView>
</RelativeLayout>
```

- `fragment_horor.xml`
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    xmlns:tools="http://schemas.android.com/tools"
    android:padding="12dp"
    tools:context="com.example.project244.HororFragment">

    <ScrollView
        android:layout_width="500dp"
        android:layout_height="wrap_content"
        android:background="@drawable/bglightabu">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu1"
                android:layout_width="320dp"
                android:layout_height="220dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_marginStart="8dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="8dp"
                android:layout_marginBottom="8dp">


                <ImageView
                    android:id="@+id/imgMovie"
                    android:layout_width="143dp"
                    android:layout_height="207dp"
                    android:layout_gravity="left"
                    android:layout_marginTop="6dp"
                    android:src="@drawable/filmhorror1"/>

                <TextView
                    android:id="@+id/tvTitle"
                    android:layout_width="168dp"
                    android:layout_height="108dp"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="50dp"
                    android:layout_marginTop="8dp"
                    android:layout_toRightOf="@id/imgMovie"
                    android:text="INSIDIOUS "
                    android:textColor="@color/black"
                    android:textSize="16sp" />

                <TextView
                    android:id="@+id/Deskription"
                    android:layout_width="172dp"
                    android:layout_height="131dp"
                    android:layout_below="@id/tvTitle"
                    android:layout_gravity="right"
                    android:layout_marginStart="15dp"
                    android:layout_marginTop="35dp"
                    android:layout_toRightOf="@id/imgMovie"
                    android:maxLines="11"
                    android:text="Josh dan dan Renai Lambert pindah ke sebuah mansion baru bersama ke-tiga anak mereka di mana dia bertemu dengan entitas misterius. Keesokan harinya, dia mengalami koma."
                    android:textColor="@color/black" />

                <Button
                    android:id="@+id/insidious"
                    android:layout_width="176dp"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/Deskription"
                    android:layout_gravity="bottom|right"
                    android:layout_marginStart="9dp"
                    android:layout_marginTop="2dp"
                    android:layout_toRightOf="@id/imgMovie"
                    android:onClick="playInsidiousTrailer"
                    android:text="Watch Trailer Now" />
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu2"
                android:layout_width="320dp"
                android:layout_height="220dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_marginStart="8dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="8dp"
                android:layout_marginBottom="8dp">

                <TextView
                    android:id="@+id/tvTitle2"
                    android:layout_width="171dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="12dp"
                    android:layout_marginTop="8dp"
                    android:layout_toRightOf="@id/imgMovie2"
                    android:text="THE LAST KEY"
                    android:textColor="@color/black"
                    android:textSize="16sp" />

                <TextView
                    android:id="@+id/Deskription2"
                    android:layout_width="173dp"
                    android:layout_height="177dp"
                    android:layout_below="@id/tvTitle"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="13dp"
                    android:layout_marginTop="35dp"
                    android:layout_toRightOf="@id/imgMovie2"
                    android:maxLines="11"
                    android:text="Chapter 3 kini berurusan kembali dengan kegelapan dan iblis jahat.  pulang ke kampung halamannya untuk menyelidiki gangguan supranatural dirumah yang ditempati Elise saat muda dulu."
                    android:textColor="@color/black" />

                <ImageView
                    android:id="@+id/imgMovie2"
                    android:layout_width="142dp"
                    android:layout_height="205dp"
                    android:layout_gravity="left"
                    android:layout_marginTop="4dp"
                    android:src="@drawable/filmhorror2" />

                <Button
                    android:id="@+id/insidious2"
                    android:layout_width="175dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|right"
                    android:layout_marginStart="9dp"
                    android:layout_marginTop="2dp"
                    android:layout_toRightOf="@id/imgMovie2"
                    android:layout_below="@id/Deskription2"
                    android:text="Watch Trailer Now"
                    android:onClick="playInsidious2Trailer"/>

            </androidx.cardview.widget.CardView>
            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu3"
                android:layout_width="320dp"
                android:layout_height="220dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_marginStart="8dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="8dp"
                android:layout_marginBottom="8dp">

                <ImageView
                    android:id="@+id/imgMovie3"
                    android:layout_width="138dp"
                    android:layout_height="209dp"
                    android:layout_gravity="left"
                    android:layout_marginTop="6dp"
                    android:src="@drawable/filmhorror3" />

                <TextView
                    android:id="@+id/tvTitle3"
                    android:layout_width="169dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="12dp"
                    android:layout_marginTop="8dp"
                    android:layout_toRightOf="@id/imgMovie3"
                    android:text="THE RED DOOR"
                    android:textColor="@color/black"
                    android:textSize="16sp" />

                <TextView
                    android:id="@+id/Deskription3"
                    android:layout_width="177dp"
                    android:layout_height="178dp"
                    android:layout_below="@id/tvTitle"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="13dp"
                    android:layout_marginTop="35dp"
                    android:layout_toRightOf="@id/imgMovie3"
                    android:maxLines="11"
                    android:text="Josh (Patrick Wilson), Renai (Rose Byrne) dan anaknya yang sudah dewasa, Dalton (Ty Simpkins) mencari tahu kenapa keluarga mereka kembali dianggu oleh sosok arwah."
                    android:textColor="@color/black" />

                <Button
                    android:id="@+id/insidious3"
                    android:layout_width="182dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="right|bottom"
                    android:layout_below="@id/Deskription3"
                    android:layout_marginStart="9dp"
                    android:layout_marginTop="2dp"
                    android:layout_toRightOf="@id/imgMovie3"
                    android:onClick="playInsidious3Trailer"
                    android:text="Watch Trailer Now" />

            </androidx.cardview.widget.CardView>

        </LinearLayout>
    </ScrollView>
</RelativeLayout>
```

- `fragment_romance.xml`
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    xmlns:tools="http://schemas.android.com/tools"
    android:padding="12dp"
    tools:context="com.example.project244.RomanceFragment">

    <ScrollView
        android:layout_width="500dp"
        android:layout_height="wrap_content"
        android:background="@drawable/bglightabu">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu1"
                android:layout_width="320dp"
                android:layout_height="220dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_marginStart="8dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="8dp"
                android:layout_marginBottom="8dp">


                <ImageView
                    android:id="@+id/imgMovie"
                    android:layout_width="143dp"
                    android:layout_height="207dp"
                    android:layout_gravity="left"
                    android:layout_marginTop="6dp"
                    android:src="@drawable/filmromance1" />

                <TextView
                    android:id="@+id/tvTitle"
                    android:layout_width="168dp"
                    android:layout_height="108dp"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="50dp"
                    android:layout_marginTop="8dp"
                    android:layout_toRightOf="@id/imgMovie"
                    android:text="CATATAN SI BOY"
                    android:textColor="@color/black"
                    android:textSize="16sp" />

                <TextView
                    android:id="@+id/Deskription"
                    android:layout_width="172dp"
                    android:layout_height="131dp"
                    android:layout_below="@id/tvTitle"
                    android:layout_gravity="right"
                    android:layout_marginStart="15dp"
                    android:layout_marginTop="35dp"
                    android:layout_toRightOf="@id/imgMovie"
                    android:maxLines="11"
                    android:text="BOY, seorang mahasiswa sempurna: tampan, kaya, menyenangkan, dan lembut hatinya. Tak heran jika banyak mahasiswi yang ingin Boy menjadi pacarnya."
                    android:textColor="@color/black" />

                <Button
                    android:id="@+id/catatansiboy"
                    android:layout_width="176dp"
                    android:layout_height="wrap_content"
                    android:layout_below="@id/Deskription"
                    android:layout_gravity="bottom|right"
                    android:layout_marginStart="9dp"
                    android:layout_marginTop="2dp"
                    android:layout_toRightOf="@id/imgMovie"
                    android:onClick="playCatatanSiBoyTrailer"
                    android:text="Watch Trailer Now" />
            </androidx.cardview.widget.CardView>

            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu2"
                android:layout_width="320dp"
                android:layout_height="220dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_marginStart="8dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="8dp"
                android:layout_marginBottom="8dp">

                <TextView
                    android:id="@+id/tvTitle2"
                    android:layout_width="172dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="12dp"
                    android:layout_marginTop="8dp"
                    android:layout_toRightOf="@id/imgMovie2"
                    android:text="INSYA ALLAH SAH 2"
                    android:textColor="@color/black"
                    android:textSize="16sp" />

                <TextView
                    android:id="@+id/Deskription2"
                    android:layout_width="173dp"
                    android:layout_height="177dp"
                    android:layout_below="@id/tvTitle"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="13dp"
                    android:layout_marginTop="35dp"
                    android:layout_toRightOf="@id/imgMovie2"
                    android:maxLines="11"
                    android:text="Gani meminta bantuan Raka untuk bisa lolos dari baku tembak. Rakapun setuju akan membantu dengan mengajukan syarat Gani harus bernazar akan bertaubat."
                    android:textColor="@color/black" />

                <ImageView
                    android:id="@+id/imgMovie2"
                    android:layout_width="142dp"
                    android:layout_height="205dp"
                    android:layout_gravity="left"
                    android:layout_marginTop="4dp"
                    android:src="@drawable/filmromance2" />

                <Button
                    android:id="@+id/insyaallahsah2"
                    android:layout_width="175dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="bottom|right"
                    android:layout_marginStart="9dp"
                    android:layout_marginTop="2dp"
                    android:layout_toRightOf="@id/imgMovie2"
                    android:layout_below="@id/Deskription2"
                    android:text="Watch Trailer Now"
                    android:onClick="playInsyaAllahSah2Trailer"/>

            </androidx.cardview.widget.CardView>
            <androidx.cardview.widget.CardView
                android:id="@+id/cdMenu3"
                android:layout_width="320dp"
                android:layout_height="220dp"
                android:layout_row="0"
                android:layout_rowWeight="1"
                android:layout_column="0"
                android:layout_columnWeight="1"
                android:layout_gravity="fill"
                android:layout_marginStart="8dp"
                android:layout_marginTop="8dp"
                android:layout_marginEnd="8dp"
                android:layout_marginBottom="8dp">


                <ImageView
                    android:id="@+id/imgMovie3"
                    android:layout_width="138dp"
                    android:layout_height="209dp"
                    android:layout_gravity="left"
                    android:layout_marginTop="6dp"
                    android:src="@drawable/filmromance3" />

                <TextView
                    android:id="@+id/tvTitle3"
                    android:layout_width="172dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="12dp"
                    android:layout_marginTop="8dp"
                    android:layout_toRightOf="@id/imgMovie3"
                    android:text="HABIBIE AINUN 3"
                    android:textColor="@color/black"
                    android:textSize="16sp" />

                <TextView
                    android:id="@+id/Deskription3"
                    android:layout_width="177dp"
                    android:layout_height="178dp"
                    android:layout_below="@id/tvTitle"
                    android:layout_gravity="right"
                    android:layout_marginStart="16dp"
                    android:layout_marginLeft="13dp"
                    android:layout_marginTop="35dp"
                    android:layout_toRightOf="@id/imgMovie3"
                    android:maxLines="11"
                    android:text="Habibie lewat Thareq menginginkan suasana bahagia ketika makan malam. Habibie atas keinginan cucu-cucunya menceritakan Eyang Putri, panggilan Hasri Ainun Besari."
                    android:textColor="@color/black" />

                <Button
                    android:id="@+id/ainun3"
                    android:layout_width="182dp"
                    android:layout_height="wrap_content"
                    android:layout_gravity="right|bottom"
                    android:layout_below="@id/Deskription3"
                    android:layout_marginStart="9dp"
                    android:layout_marginTop="2dp"
                    android:layout_toRightOf="@id/imgMovie3"
                    android:onClick="playHabibieAinun3Trailer"
                    android:text="Watch Trailer Now" />

            </androidx.cardview.widget.CardView>

        </LinearLayout>
    </ScrollView>
</RelativeLayout>
```
=> Pada directory `drawable` kita bisa tambahkan gambar seperti poster film yang ingin kita tampilkan, dan jangan lupa untuk menambahkan icon `baseline_more_vert_24.xml` dengan cara klik kanan pada `drawable` lalu klik New, setelah itu kita pilih dan klik Vector Asset. Setelah itu kita klik clip art lalu kita pilih icon nya, jika sudah ketemu kita klik OK lalu kita klik next. Sama halnya ketika kita ingin menambahkan menu kembali pada halaman `VideoPlayerActivity` yaitu dengan langkah-langkah yang sama seperti sebelumnya dan jangan lupa untuk menambahkan icon `baseline_arrorw_circle_left_24.xml` lalu klik OK dan kita klik next.

=> Selanjutnya kita klik kanan pada `res` lalu pilih dan klik `Android Resource Directory` setelah itu kita beri nama "menu" lalu klik OK. Setelah itu kita buat Menu Resource File dengan nama `menu_tab.xml` lalu isi dengan code :
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ic_launcher.webp&#xA;ic_launcher.webp&#xA;ic_launcher.webp&#xA;ic_launcher.webp&#xA;ic_launcher.xml&#xA;ic_launcher.webp" />
    <item
        android:id="@+id/tab_action"
        android:icon="@drawable/logo244"
        android:title="Action"/>
    <item
        android:id="@+id/tab_horor"
        android:icon="@drawable/logo244"
        android:title="Horor"/>
    <item
        android:id="@+id/tab_romance"
        android:icon="@drawable/logo244"
        android:title="Romance"/>
</menu>
```

=> Sama halnya ketika ingin menambahkan code menu untuk kembali, dengan cara kita klik kanan pada directory `menu` dan buat Menu Resource File dengan nama `menu_video_player.xml` lalu isi dengan code :
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/action_back"
        android:icon="@drawable/logo244"
        android:title="Back"
        app:showAsAction="always" />
</menu>
```

> **Hasil Tampilan Menu Program Tugas Akhir :**

![SS Tampilan Menu Program](https://github.com/alfaza-putra/PROJECT-UASPM1/assets/129705943/9e5a6daa-0896-42f6-a15e-11d08a58240a)



##  Hasil Run

https://github.com/alfaza-putra/PROJECT-UASPM1/assets/129705943/531aa2f9-a700-4252-b8ed-4aa814d2b557

## Semoga Bermanfaat, Terima Kasih 
