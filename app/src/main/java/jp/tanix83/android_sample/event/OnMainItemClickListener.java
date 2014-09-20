package jp.tanix83.android_sample.event;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import jp.tanix83.android_sample.HelloActivity;
import jp.tanix83.android_sample.R;

/**
 * Created by hide on 2014/09/20.
 */
public class OnMainItemClickListener implements OnItemClickListener {

    private static Activity activity = null;

    /**
     *
     * @param activity
     */
    public OnMainItemClickListener(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.d("OnMainItemClickListener", "view:" + view.toString());
        Log.d("OnMainItemClickListener", "i:" + i);

        LinearLayout layout = (LinearLayout)view;

        TextView textView = (TextView)layout.findViewById(R.id.list_row);

        Log.d("OnMainItemClickListener", "clicked:" + textView.getText());

        Intent intent = new Intent(this.activity, HelloActivity.class);
        intent.putExtra("label", textView.getText());
        this.activity.startActivity(intent);
    }
}
