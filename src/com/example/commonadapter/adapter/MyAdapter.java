package com.example.commonadapter.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.commonadapter.R;
import com.example.commonadapter.bo.Person;
import com.example.commonadapter.viewholder.ViewHolder;
import com.tools.imagecache.ImageFetcher;

public class MyAdapter extends CommonAdapter<Person> {
	private Context context;
	private ImageFetcher imageFetcher;

	public MyAdapter(Context context, List<Person> mDatas, int layoutID,ImageFetcher imageFetcher) {
		super(context, mDatas, layoutID);
		this.context=context;
		this.imageFetcher=imageFetcher;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void convert(ViewHolder holder, final Person person) {
		// TODO Auto-generated method stub
		((TextView) holder.getView(R.id.name)).setText(person.getName());
		((TextView) holder.getView(R.id.sex)).setText(person.getSex());
		((TextView) holder.getView(R.id.phone)).setText(person.getPhone());
		((TextView) holder.getView(R.id.add)).setText(person.getAdd());
		ImageView imageView=(ImageView)holder.getView(R.id.img);
		//¶¹¸¯   Ë¿¹Ï  ¼¦µ°   ½ªËâ
		imageFetcher.loadImage(person.getImgURL(), imageView);
		CheckBox cb=(CheckBox)holder.getView(R.id.cb);
		cb.setChecked(person.isClick());
		cb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				person.setClick(!person.isClick());
			}
		});
	}

	

}
