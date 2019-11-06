package com.codewithvikas.exploring.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListView2Activity extends AppCompatActivity {
    private ViewStub stubList;
    private ListView listview;
    private ListViewArrayAdapter listViewArrayAdapter;
    private ArrayList<Artikel> artikelList;

    private ArrayList<Artikel> getArtikelList() {
        artikelList= new ArrayList<>();
        artikelList.add(new Artikel(R.drawable.ic_remove_black,"Title 1","1 hours ago","Descriptions of text 1", 2.0f));
        artikelList.add(new Artikel(R.drawable.ic_remove_black,"Title 2","1 hours ago","Descriptions of text 2", 3.0f));
        artikelList.add(new Artikel(R.drawable.ic_remove_black,"Title 3","1 hours ago","Descriptions of text 3", 4.0f));
        artikelList.add(new Artikel(R.drawable.ic_remove_black,"Title 4","1 hours ago","Descriptions of text 4", 2.0f));
        artikelList.add(new Artikel(R.drawable.ic_remove_black,"Title 5","1 hours ago","Descriptions of text 5", 2.0f));
        return artikelList;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listview2);
        //stubList=(ViewStub) findViewById(R.id.stublist);
        //stubList.inflate();
        listview=(ListView) findViewById(R.id.list_view);
        //stubList.setVisibility(View.VISIBLE);

        getArtikelList();
        listViewArrayAdapter=new ListViewArrayAdapter(this,artikelList);
        listview.setAdapter(listViewArrayAdapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getApplicationContext(),
                //     artikelList.get(position).getTitle(), Toast.LENGTH_SHORT).show();

                Bundle bundle = new Bundle();
                bundle.putString("dataTitle", artikelList.get(position).getTitle().toString());
                bundle.putInt("dataImg", artikelList.get(position).getImageId());
                bundle.putString("dataDesc", artikelList.get(position).getDescriptions().toString());

                /*Intent intent = new Intent(MainActivity.this, DetailBerita.class);
                intent.putExtras(bundle);
                startActivity(intent);*/

            }
        });

        /*Button mBtn_login = (Button)findViewById(R.id.button1);
        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuApkAndroid.class);
                startActivity(intent);
            }
        });*/

    }

}

