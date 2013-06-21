package com.example.com.example.soundcloud;

import java.util.List;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.souncloud.models.Track;

public class TracksArrayAdapter extends ArrayAdapter<Track> {

	public TracksArrayAdapter(Context context, List<Track> tweets) {
		super(context, 0, tweets);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	    View view = convertView;
	    if (view == null) {
	    	LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    	view = inflater.inflate(R.layout.track_item, null);
	    }
	     
        Track track = getItem(position);
        
        
        
        TextView nameView = (TextView) view.findViewById(R.id.trackName);
        String formattedName = "<b>" + track.getTitle() + "</b>" + " <small><font color='#777777'>@" +
                track.getId() + "</font></small>";
        nameView.setText(Html.fromHtml(formattedName));

        
        
        return view;
	}
}
