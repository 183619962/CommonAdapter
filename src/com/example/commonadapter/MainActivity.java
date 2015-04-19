package com.example.commonadapter;

import java.util.ArrayList;
import java.util.List;

import com.example.commonadapter.adapter.MyAdapter;
import com.example.commonadapter.bo.Person;
import com.tools.imagecache.ImageFetcher;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView listView;
	private MyAdapter adapter;
	private List<Person> persons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();

		initData();
	}

	private void initData() {
		// TODO Auto-generated method stub
		persons = new ArrayList<Person>();

		Person person = new Person("张三", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037235_3453.jpg",true);
		Person person1 = new Person("张三1", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037235_7476.jpg",false);
		Person person2 = new Person("张三2", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037235_9280.jpg",true);
		Person person3 = new Person("张三3", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037234_3539.jpg",false);
		Person person4 = new Person("张三4", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037234_6318.jpg",true);
		Person person5 = new Person("张三5", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037194_2965.jpg",false);
		Person person6 = new Person("张三6", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037193_1687.jpg",false);
		Person person7 = new Person("张三7", "20", "男", "XX市XXX县XXXX区XX路XX号",
				"13888888888","http://img.my.csdn.net/uploads/201309/01/1378037193_1286.jpg",false);

		persons.add(person);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		persons.add(person7);
		//ImageFetcher imageFetcher=ImageFetcher.getInstance(MainActivity.this, 400, "MyImagecache", 0.25f);
		ImageFetcher imageFetcher1=ImageFetcher.getInstance(MainActivity.this, 100, 100, "MyImagecache", 0.25f);
		adapter = new MyAdapter(MainActivity.this, persons,
				R.layout.listview_item_layout,imageFetcher1);
		listView.setAdapter(adapter);
	}

	private void initView() {
		// TODO Auto-generated method stub
		listView = (ListView) findViewById(R.id.mylistview);
	}

}
