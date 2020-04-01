package ibu.edu.ba.intentslistviewlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDetails extends AppCompatActivity {
    private ImageView imageView;
    private TextView title;
    private TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        imageView = findViewById(R.id.news_image);
        title = findViewById(R.id.news_title);
        description = findViewById(R.id.news_description);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            setTitle(extras.getString(MainActivity.EXTRA_TITLE));
            imageView.setImageResource(extras.getInt(MainActivity.EXTRA_IMAGE));
            title.setText(extras.getString(MainActivity.EXTRA_TITLE));
            description.setText(extras.getString(MainActivity.EXTRA_DESCRIPTION));
        }
    }
}
