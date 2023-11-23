package com.example.beautybird;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MagazineActivity extends Activity {

	private ImageView arrow;
	private TextView community;
	private Button review_btn;
	private Button question_btn;
	private Button magazine_btn;
	private Button following_btn;
	private ImageView magazine_img;
	private ImageView line;
	private ImageView tab_bar;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_magazine);

		arrow = (ImageView) findViewById(R.id.arrow);
		community = (TextView) findViewById(R.id.community);
		review_btn = (Button) findViewById(R.id.review_btn);
		question_btn = (Button) findViewById(R.id.question_btn);
		magazine_btn = (Button) findViewById(R.id.magazine_btn);
		following_btn = (Button) findViewById(R.id.following_btn);
		magazine_img = (ImageView) findViewById(R.id.magazine_img);
		line = (ImageView) findViewById(R.id.line);
		tab_bar = (ImageView) findViewById(R.id.tab_bar);


		// Click REVIEW button
		Button reviewBtn = findViewById(R.id.review_btn);
		reviewBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(), ReviewActivity.class);
				startActivity(intent);
			}
		});
	}
}
	
	