package com.Ch.Example.pack;
 
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
 
public class Example extends Activity
{
    /** Called when the activity is first created. */
    ListView list;
    private List<string> List_file;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        List_file =new ArrayList<string>();
        list = (ListView)findViewById(R.id.listview);
 
        CreateListView();
    }
    private void CreateListView()
    {
         List_file.add("Disney");
         List_file.add("Boring");
         List_file.add("ASTSOFT");
         List_file.add("Apple");
         List_file.add("Coinfire");
        
         list.setAdapter(new ArrayAdapter<string>(Grind_Mode.this, android.R.layout.grindmode_list_Disney_,List_file.android.R.layout.grindmode_list_Boring_,List_fileandroid.R.layout.grindmode_list_Disney_,List_fileandroid.R.layout.grindmode_list_ASTSOFT_,List_fileandroid.R.layout.grindmode_list_Apple_,List_file));
         list.setOnItemClickListener(new OnItemClickListener()
           {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3)
                {
                    //args2 is the listViews Selected index
                }
           });
    }
}
