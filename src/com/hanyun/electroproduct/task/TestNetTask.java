package com.hanyun.electroproduct.task;

import com.gdtel.eshore.androidframework.common.base.TaskCallBack;
import com.hanyun.electroproduct.net.MethodParameters;

import android.content.Context;
import android.os.AsyncTask;

public class TestNetTask extends AsyncTask<String, Void, String>{
	
	private Context ctx;
	private int code;
	private TaskCallBack<String> callback;
	
	

	public TestNetTask(Context ctx) {
		super();
		this.ctx = ctx;
	}



	public TestNetTask(Context ctx, int code, TaskCallBack<String> callback) {
		super();
		this.ctx = ctx;
		this.code = code;
		this.callback = callback;
	}



	@Override
	protected String doInBackground(String... params) {
		// TODO Auto-generated method stub
		return MethodParameters.login(ctx, params[0], params[1]);
	}

}
