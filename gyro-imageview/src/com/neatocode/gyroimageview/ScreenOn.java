package com.neatocode.gyroimageview;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/**
 * Turns the screen on. 
 * Useful if running Glass apps from the command line and the screen is off.
 *
 */
public class ScreenOn {
	
	// Full wake lock needed to use acquire causes wake up.
	@SuppressWarnings("deprecation")
	public static void run(final Context context) {
    	final PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
    	final WakeLock wakeLock = pm.newWakeLock(
    		    PowerManager.FULL_WAKE_LOCK |
    		        PowerManager.ACQUIRE_CAUSES_WAKEUP
    		            | PowerManager.ON_AFTER_RELEASE, "GyroImageView");
    	wakeLock.acquire(); 
    	wakeLock.release();		
	}
	
}
