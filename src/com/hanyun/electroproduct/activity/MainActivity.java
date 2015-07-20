package com.hanyun.electroproduct.activity;


import com.gdtel.eshore.androidframework.common.base.BaseActivity;
import com.gdtel.eshore.androidframework.common.base.TaskCallBack;
import com.hanyun.electroproduct.R;
import com.hanyun.electroproduct.task.TestNetTask;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements TaskCallBack<String>,OnClickListener{
	
	private final static int TEST_CODE = 00;
	
	private TextView test_txt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	
	
	@Override
	public void initView() {
		// TODO Auto-generated method stub
		test_txt = (TextView)findViewById(R.id.test_txt);
		test_txt.setOnClickListener(this);
	}



	@Override
	public void callBackResult(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callBackResult(String t, int code) {
		// TODO Auto-generated method stub
		switch (code) {
		case TEST_CODE:
			
			break;

		default:
			break;
		}
	}

	@Override
	public void callbackError(
			com.gdtel.eshore.androidframework.common.base.TaskCallBack.CallBackError error) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.test_txt:
			new TestNetTask(MainActivity.this, TEST_CODE, this).execute("","");
			break;

		default:
			break;
		}
	}
}
