package com.example.beautybird;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ReviewActivity extends Activity {


	private ImageView arrow;
	private TextView community;
	private Button review_btn;
	private Button question_btn;
	private Button magazine_btn;
	private Button following_btn;
	private RelativeLayout weeks_review_container;
	private TextView this_week_s_review;
	private ImageView ettude_img;
	private TextView ettude_name;
	private TextView ettude_review;
	private ImageView hera_img;
	private TextView hera_name;
	private TextView hera_review;
	private TextView popularity_review;
	private RelativeLayout pop1;
	private ImageView loccitane_img;
	private ImageView loccitane_box;
	private TextView loccitane_name;
	private TextView minseo_dan;
	private RelativeLayout pop2;
	private ImageView cusion_box;
	private TextView cusion_name;
	private TextView hajin_choi;
	private ImageView cusion_img;
	private ImageView tab_bar;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_review);

		arrow = (ImageView) findViewById(R.id.arrow);
		community = (TextView) findViewById(R.id.community);
		review_btn = (Button) findViewById(R.id.review_btn);
		question_btn = (Button) findViewById(R.id.question_btn);
		magazine_btn = (Button) findViewById(R.id.magazine_btn);
		following_btn = (Button) findViewById(R.id.following_btn);
		weeks_review_container = (RelativeLayout) findViewById(R.id.weeks_review_container);
		this_week_s_review = (TextView) findViewById(R.id.this_weeks_review);
		ettude_img = (ImageView) findViewById(R.id.ettude_img);
		ettude_name = (TextView) findViewById(R.id.ettude_name);
		ettude_review = (TextView) findViewById(R.id.ettude_review);
		hera_img = (ImageView) findViewById(R.id.hera_img);
		hera_name = (TextView) findViewById(R.id.hera_name);
		hera_review = (TextView) findViewById(R.id.hera_review);
		popularity_review = (TextView) findViewById(R.id.popularity_review);
		pop1 = (RelativeLayout) findViewById(R.id.pop1);
		loccitane_img = (ImageView) findViewById(R.id.loccitane_img);
		loccitane_box = (ImageView) findViewById(R.id.loccitane_box);
		loccitane_name = (TextView) findViewById(R.id.loccitane_name);
		minseo_dan = (TextView) findViewById(R.id.minseo_dan);
		pop2 = (RelativeLayout) findViewById(R.id.pop2);
		cusion_box = (ImageView) findViewById(R.id.cusion_box);
		cusion_name = (TextView) findViewById(R.id.cusion_name);
		hajin_choi = (TextView) findViewById(R.id.hajin_choi);
		cusion_img = (ImageView) findViewById(R.id.cusion_img);
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
	
	