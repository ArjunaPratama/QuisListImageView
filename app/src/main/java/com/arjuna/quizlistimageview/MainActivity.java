package com.arjuna.quizlistimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView mlistView;
    int[] image = {R.drawable.facebook ,
                    R.drawable.instagram,
                    R.drawable.snapchat,
                    R.drawable.twitter,
                    R.drawable.path,};
    String[] Name = {
        "Facebook", "Instagram", "Snapchat", "Twitter", "Path"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = findViewById(R.id.mlistView);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        mlistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return Name.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int Position, View convertView, ViewGroup viewGroup) {

            View view = getLayoutInflater().inflate(R.layout.list_item, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView);
            TextView mTextView = (TextView) view.findViewById(R.id.textView);

            mImageView.setImageResource(image[Position]);
            mTextView.setText(Name[Position]);

            return view;
        }
    }
}
