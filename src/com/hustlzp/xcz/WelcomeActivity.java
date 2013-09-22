package com.hustlzp.xcz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class WelcomeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_welcome);

		// 3s ºó½øÈëmain activity
		Handler handle = new Handler();
		handle.postDelayed(new welcomehandler(), 3000);
	}

	class welcomehandler implements Runnable {
		public void run() {
			startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
			WelcomeActivity.this.finish();
		}
	}
}