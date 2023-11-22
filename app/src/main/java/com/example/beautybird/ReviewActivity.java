package com.example.beautybird;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		________review
	 *	@date 		Wednesday 22nd of November 2023 12:20:56 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ReviewActivity extends Activity {

	
	private View _bg___________review;
	private View rectangle_1;
	private ImageView rectangle_2;
	private ImageView rectangle_4;
	private ImageView rectangle_5;
	private TextView this_week_s_review;
	private TextView popularity_review;
	private ImageView rectangle_3;
	private TextView ettude;
	private TextView hera;
	private View _____1;
	private TextView magazine;
	private TextView community;
	private TextView reviewBtn;
	private TextView question;
	private TextView following;
	private TextView color_is_really_beautiful_and_i_can_use_it_anywhere_on_my_body;
	private TextView this_is_tint_number_1003_i_really_recommend_to_teenagers_like_me;
	private ImageView image_3;
	private ImageView image_3_ek1;
	private ImageView rectangle_6;
	private ImageView rectangle_7;
	private TextView top_1__loccitane;
	private TextView top_2__hera_spring;
	private TextView hajin_choi;
	private TextView minseo_dan;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_review);

		
		_bg___________review = (View) findViewById(R.id._bg___________review);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		rectangle_2 = (ImageView) findViewById(R.id.rectangle_2);
		rectangle_4 = (ImageView) findViewById(R.id.rectangle_4);
		rectangle_5 = (ImageView) findViewById(R.id.rectangle_5);
		this_week_s_review = (TextView) findViewById(R.id.this_week_s_review);
		popularity_review = (TextView) findViewById(R.id.popularity_review);
		rectangle_3 = (ImageView) findViewById(R.id.rectangle_3);
		ettude = (TextView) findViewById(R.id.ettude);
		hera = (TextView) findViewById(R.id.hera);
		_____1 = (View) findViewById(R.id._____1);
		magazine = (TextView) findViewById(R.id.magazine);
		community = (TextView) findViewById(R.id.community);
		reviewBtn = (TextView) findViewById(R.id.reviewBtn);
		question = (TextView) findViewById(R.id.question);
		following = (TextView) findViewById(R.id.following);
		color_is_really_beautiful_and_i_can_use_it_anywhere_on_my_body = (TextView) findViewById(R.id.color_is_really_beautiful_and_i_can_use_it_anywhere_on_my_body);
		this_is_tint_number_1003_i_really_recommend_to_teenagers_like_me = (TextView) findViewById(R.id.this_is_tint_number_1003_i_really_recommend_to_teenagers_like_me);
		image_3 = (ImageView) findViewById(R.id.image_3);
		image_3_ek1 = (ImageView) findViewById(R.id.image_3_ek1);
		rectangle_6 = (ImageView) findViewById(R.id.rectangle_6);
		rectangle_7 = (ImageView) findViewById(R.id.rectangle_7);
		top_1__loccitane = (TextView) findViewById(R.id.top_1__loccitane);
		top_2__hera_spring = (TextView) findViewById(R.id.top_2__hera_spring);
		hajin_choi = (TextView) findViewById(R.id.hajin_choi);
		minseo_dan = (TextView) findViewById(R.id.minseo_dan);
	
		
		// Click REVIEW button
		Button moveButton = findViewById(R.id.reviewBtn);
		moveButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(), Move.class);
				startActivity(intent);
			}
		});

	}
}
	
	