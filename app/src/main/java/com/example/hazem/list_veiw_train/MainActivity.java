package com.example.hazem.list_veiw_train;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     ListView listView;
     ArrayList<String>s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=new ArrayList<>();
       for (int i=1;i<=5;i++){
           s.add("TRalair  "+String.valueOf(i));
       }
       Train_Adapter train_adapter=new Train_Adapter(this,0,s);
        listView=(ListView)findViewById(R.id.LV_train1);
        listView.setAdapter(train_adapter);
    }
}
