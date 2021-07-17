package com.dwiaryantodiowicaksono_3145161971_mobcom.ytapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class KyourugiKickDetail extends AppCompatActivity {

    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMGPOSTER = "extra_imgposter";
    private TextView tvNama, tvDetail;
    ImageView imgPoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyourugi_kick_detail);

        tvNama = findViewById(R.id.tv_name);
        tvDetail = findViewById(R.id.tv_detail);
        imgPoster = findViewById(R.id.img_poster);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int imgPosterFile = getIntent().getIntExtra(EXTRA_IMGPOSTER, 0);

        tvNama.setText(nama);
        tvDetail.setText(detail);
        Glide.with(KyourugiKickDetail.this)
                .load(imgPosterFile)
                .apply(new RequestOptions().placeholder(R.color.design_default_color_on_primary))
                .into(imgPoster);
    }
}