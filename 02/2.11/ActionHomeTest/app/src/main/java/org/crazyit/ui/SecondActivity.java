package org.crazyit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		Button button = new Button(this);
		button.setText("启动第三个");
		setContentView(button);

		button.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(SecondActivity.this
				, MainActivity.class);
				startActivity(intent);
			}
		});
	}
}