package org.yh.cameraviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.logg.Logg;
import com.logg.config.LoggConfiguration;

public class Main2Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LoggConfiguration configuration = new LoggConfiguration.Buidler()
                .setDebug(true)
//                .setTag("test")// 自定义全局Tag
                .build();
        Logg.init(configuration);


        Logg.v(3.1415926);
        String[] str = {"aaaaaaaa","bbbbb"};
        Logg.v(str);
        Logg.v("test", 3.1415926);
        // 数组
        Logg.d(DataHelper.getArray());
        // Map
        Logg.i(DataHelper.getMap());
        // List
        Logg.w(DataHelper.getList());
        // Intent
        Logg.e(DataHelper.getIntent());
    }
}
