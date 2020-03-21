package com.examplevinhphutvp.random25022020;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdtSomin,mEdtSomax;
    Button mBtnRandom;
    TextView mTvketqua;
    String mTxtmin,mTxtmax;
    int mSmin,mSmax;
    String mTextmin,mTextmax;
    int mSmin2,mSmax2,mValue;
    Random mRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtSomax = findViewById(R.id.edtSomax);
        mEdtSomin = findViewById(R.id.edtSomax);
        mBtnRandom = findViewById(R.id.BtnRandom);
        mTvketqua = findViewById(R.id.tvKetqua);

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextmin = mEdtSomin.getText().toString();
                mTxtmax = mEdtSomax.getText().toString();
                mTextmax = mEdtSomax.getText().toString();

                if (!mTextmin.equals("") || !mTxtmax.equals("")) {
                    if (mTextmin.equals("") || mTextmax.equals("")) {
                        Toast.makeText(MainActivity.this, "Bạn nhập thiếu thông tin", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    mSmin = Integer.parseInt(mTextmin);
                    mSmax = Integer.parseInt(mTxtmax);
                    mSmax = Integer.parseInt(mTextmax);

                    // Viet dieu kien theo if else
//                if (smin > smax){
//                    smax = smin + 1;
//                }
                    // Viet dieu kien theo toan tu 3 ngoi

                    mSmax = mSmin > mSmax ? mSmin + 1 : mSmax;

                    mEdtSomax.setText(String.valueOf(mSmax));

                    mRandom = new Random();

                    mValue = mRandom.nextInt(mSmax - mSmin + 1) + mSmin;

                    mTvketqua.setText(String.valueOf(mValue));

                }
            }
        });


    }

}

