package com.przystanek20;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Pawel Mielniczuk on 2017-06-09.
 */
public class MoviesAdapter extends BaseAdapter{

    private Context context;
    private LayoutInflater inflater = null;


    MoviesAdapter(Context con, String[] list) {

        this.context = con;
        DataModel.titles = list;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return DataModel.titles.length;
    }

    @Override
    public Object getItem(int i) {
        return DataModel.titles.length;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        ViewHolder holder;
        if(convertview == null) {

            convertview =inflater.inflate(R.layout.card_item_template,null);
            holder = new ViewHolder();

            holder._cover = (ImageView) convertview.findViewById(R.id.img_cover_d);
            holder._background = (ImageView) convertview.findViewById(R.id.img_background);
            holder._movies = (TextView) convertview.findViewById(R.id.text_details);
            holder._plot = (TextView) convertview.findViewById(R.id.txt_plot_d);
            holder._releaseDate = (TextView) convertview.findViewById(R.id.txt_release_d);

            convertview.setTag(holder);

        } else {
            holder = (ViewHolder) convertview.getTag();
        }


        holder._movies.setText(DataModel.titles[i]);
        holder._plot.setText(DataModel.shortDesc[i]);
        holder._releaseDate.setText(DataModel.releaseDate[i]);
        //holder._cover.setImageResource(cover[i]);
        Picasso.with(context).load(DataModel.cover[i]).into(holder._cover);
        // holder._background.setImageResource(background[i]);
        Picasso.with(context).load(DataModel.background[i]).into(holder._background);


        return convertview;
    }

    public class ViewHolder {

        ImageView _cover;
        ImageView _background;
        TextView _movies;
        TextView _plot;
        TextView _releaseDate;
        View _vw_blayer;


    }
}