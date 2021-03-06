package jp.tanix83.android_sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import jp.tanix83.android_sample.event.OnMainItemClickListener;

/**
 * This is main .
 * this activity display menu-list .
 */
public class MainActivity extends Activity {

    private static List<String> items = new ArrayList<String>();
    private static ArrayAdapter<String> adapter = null;

    private ListView listView1 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listView1 = (ListView)findViewById(R.id.listView);

        this.items.add("Item 1");
        this.items.add("Item 2");
        this.items.add("Item 3");

        this.adapter = new ArrayAdapter<String>(
                        this,
                        R.layout.list_row,
                        R.id.list_row,
                        this.items);

        this.listView1.setAdapter(this.adapter);
        this.listView1.setOnItemClickListener(new OnMainItemClickListener(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
