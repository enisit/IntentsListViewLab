package ibu.edu.ba.intentslistviewlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_IMAGE = "EXTRA_IMAGE";
    public static final String EXTRA_TITLE = "EXTRA_TITLE";
    public static final String EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION";
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view_container);
        NewsListViewAdapter newsListViewAdapter = new NewsListViewAdapter(getNews(),this);
        listView.setAdapter(newsListViewAdapter);
        listView.setOnItemClickListener(onItemClickListener);
    }

    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            News news = (News) parent.getItemAtPosition(position);
            Intent intent = new Intent(MainActivity.this,NewsDetails.class);
            intent.putExtra(EXTRA_IMAGE,news.getImageResId());
            intent.putExtra(EXTRA_TITLE, news.getTitle());
            intent.putExtra(EXTRA_DESCRIPTION, news.getDescription());
            startActivity(intent);
        }
    };

    private List<News> getNews(){
        List<News> newsList = new ArrayList<>();
        newsList.add(new News(R.drawable.fox_news,"Fox news tittle","Fox news description"));
        newsList.add(new News(R.drawable.sky_news,"Sky news tittle","Sky news description"));
        newsList.add(new News(R.drawable.news_sample1,"Sample news tittle","Sample news description"));
        newsList.add(new News(R.drawable.fox_news,"Fox news tittle","Fox news description"));
        newsList.add(new News(R.drawable.sky_news,"Sky news tittle","Sky news description"));
        return newsList;
    }
}
