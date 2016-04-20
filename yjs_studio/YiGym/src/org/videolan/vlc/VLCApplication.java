package org.videolan.vlc;

import android.app.Application;
import android.content.Context;

import com.cy.yigym.utils.AppUtils;

/**
 * Created by tangjun on 14-8-24.
 */
public class VLCApplication extends Application {

	private static VLCApplication sInstance;

	@Override
	public void onCreate() {
		super.onCreate();

		sInstance = this;
	}

	public static Context getAppContext() {
		return AppUtils.getAppContext();
	}
}
