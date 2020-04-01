package ibu.edu.ba.intentslistviewlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NewsListViewAdapter extends BaseAdapter {
    private List<News> newsList;
    private Context context;

    public NewsListViewAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return newsList.indexOf(newsList.get(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.custom_list_view_item,parent,false);
        News news = newsList.get(position);

        ImageView imageView = convertView.findViewById(R.id.item_image);
        TextView titleTextView = convertView.findViewById(R.id.item_title);
        TextView descriptionTextView = convertView.findViewById(R.id.item_descripition);

        imageView.setImageResource(news.getImageResId());
        titleTextView.setText(news.getTitle());
        descriptionTextView.setText(news.getDescription());

        return convertView;
    }
}
