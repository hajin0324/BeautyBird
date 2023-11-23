package com.example.beautybird;

/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		________following
	 *	@date 		Wednesday 22nd of November 2023 06:06:42 AM
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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

public class FollowingActivity extends Activity {


	private ImageView arrow;
	private TextView community;
	private Button review_btn;
	private Button question_btn;
	private Button magazine_btn;
	private Button following_btn;
	private ImageView line;
	private TextView following_head1;
	private RelativeLayout influencer1;
	private View ellipse1;
	private ImageView influencer_img1;
	private TextView xoxo;
	private TextView following_button1;
	private RelativeLayout influencer2;
	private View ellipse2;
	private ImageView influencer_img2;
	private TextView ming;
	private TextView following_button2;
	private TextView following_head2;
	private ImageView following_post;
	private ImageView tab_bar;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_following);

		arrow = (ImageView) findViewById(R.id.arrow);
		community = (TextView) findViewById(R.id.community);
		review_btn = (Button) findViewById(R.id.review_btn);
		question_btn = (Button) findViewById(R.id.question_btn);
		magazine_btn = (Button) findViewById(R.id.magazine_btn);
		following_btn = (Button) findViewById(R.id.following_btn);
		line = (ImageView) findViewById(R.id.line);
		following_head1 = (TextView) findViewById(R.id.following_head1);
		influencer1 = (RelativeLayout) findViewById(R.id.influencer1);
		ellipse1 = (View) findViewById(R.id.ellipse1);
		influencer_img1 = (ImageView) findViewById(R.id.influencer_img1);
		xoxo = (TextView) findViewById(R.id.xoxo);
		following_button1 = (TextView) findViewById(R.id.follow_button1);
		influencer2 = (RelativeLayout) findViewById(R.id.influencer2);
		ellipse2 = (View) findViewById(R.id.ellipse2);
		influencer_img2 = (ImageView) findViewById(R.id.influencer_img2);
		ming = (TextView) findViewById(R.id.ming);
		following_button2 = (TextView) findViewById(R.id.follow_button2);
		following_head2 = (TextView) findViewById(R.id.following_head2);
		following_post = (ImageView) findViewById(R.id.following_post);
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
	
	