package sh.calaba.instrumentationbackend.actions.media;

import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;
//import sh.calaba.instrumentationbackend.actions.webview.SuppressWarnings;
//import sh.calaba.instrumentationbackend.actions.Action;
import sh.calaba.instrumentationbackend.actions.webview.CalabashChromeClient.WebFuture;
import sh.calaba.instrumentationbackend.query.ast.UIQueryUtils;

import android.app.Service;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.media.*;
import android.media.session.MediaSessionManager;
//import android.media.session.SessionManager;
import android.content.ComponentName;
import android.media.session.MediaController;
import android.widget.VideoView;
//import android.widget.MediaController;
import android.service.notification.NotificationListenerService;


import java.util.ArrayList;
import java.util.List;
import 	java.lang.reflect.Method;


//import android.content.Context;
//import android.app.AlarmManager;
//import android.view.accessibility.AccessibilityManager;
//import android.accounts.AccountManager;
//import android.app.ActivityManager;
//import android.appwidget.AppWidgetManager;
//import android.app.AppOpsManager;
//import android.media.AudioManager;
//import android.os.BatteryManager;
//import android.bluetooth.BluetoothAdapter;
//import android.hardware.camera2.CameraManager;
//import android.view.accessibility.CaptioningManager;
//import android.content.ClipboardManager;
//import android.net.ConnectivityManager;
//import android.hardware.ConsumerIrManager;
//import android.app.admin.DevicePolicyManager;
//import android.hardware.display.DisplayManager;
//import android.app.DownloadManager;
//import android.os.DropBoxManager;
//import android.view.inputmethod.InputMethodManager;
//import android.hardware.input.InputManager;
//import android.app.job.JobScheduler;
//import android.app.KeyguardManager;
//import android.content.pm.LauncherApps;
//import android.view.LayoutInflater;
//import android.location.LocationManager;
//import android.media.projection.MediaProjectionManager;
//import android.media.MediaRouter;
//import android.media.session.MediaSessionManager;
//import android.nfc.NfcManager;
//import android.app.NotificationManager;
//import android.net.nsd.NsdManager;
//import android.os.PowerManager;
//import android.print.PrintManager;
//import android.content.RestrictionsManager;
//import android.app.SearchManager;
//import android.hardware.SensorManager;
//import android.os.storage.StorageManager;
//import android.telecom.TelecomManager;
//import android.telephony.TelephonyManager;
//import android.view.textservice.TextServicesManager;
//import android.media.tv.TvInputManager;
//import android.app.UiModeManager;
//import android.hardware.usb.UsbManager;
//import android.os.UserManager;
//import android.os.Vibrator;
//import android.service.wallpaper.WallpaperService;
//import android.net.wifi.p2p.WifiP2pManager;
//import android.net.wifi.WifiManager;
//import android.view.WindowManager;
////import kotlin.properties.ReadOnlyProperty;
//import android.app.Fragment;
//import android.support.v4.app.Fragment as SupportFragment;




/**
 * Allows clearing SharedPreferences.
 *
 * See Ruby API docs for more info:
 * https://github.com/calabash/calabash-android/blob/master/documentation/ruby_api.md
 * 
 * @author Juan Delgado (juan@ustwo.co.uk)
 */
public class AudioControlDetails implements Action {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Result execute(String... args) {
		
		// try{
			
		// 	SharedPreferences preferences = PreferencesUtils.getPreferencesFromArgs(args, InstrumentationBackend.instrumentation.getTargetContext());
		// 	preferences.edit().clear().commit();
			
		// 	return Result.successResult();
			
		// } catch(Exception e) {
		// 	return Result.fromThrowable(e);
		// }
		AudioManager myAudioManager;		
		myAudioManager = (AudioManager) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.AUDIO_SERVICE);
		System.out.println("DRAIAudio myAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC) " + myAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
		System.out.println("DRAIAudio myAudioManager.toString() " + myAudioManager.toString());
		System.out.println("DRAIAudio myAudioManager.getStreamVolume(AudioManager.STREAM_SYSTEM) " + myAudioManager.getStreamVolume(AudioManager.STREAM_SYSTEM));
		System.out.println("DRAIAudio myAudioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION) " + myAudioManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION));
		System.out.println("DRAIAudio myAudioManager.getMode() " + myAudioManager.getMode());
		System.out.println("DRAIAudio myAudioManager.getProperty(PROPERTY_OUTPUT_SAMPLE_RATE) " + myAudioManager.getProperty("PROPERTY_OUTPUT_SAMPLE_RATE"));
		System.out.println("DRAIAudio myAudioManager.getProperty(PROPERTY_OUTPUT_FRAMES_PER_BUFFER) " + myAudioManager.getProperty("PROPERTY_OUTPUT_FRAMES_PER_BUFFER"));
		System.out.println("DRAIAudio myAudioManager.getParameters(AUDIO_SERVICE) " + myAudioManager.getParameters(Context.AUDIO_SERVICE));
		System.out.println("DRAIAudio myAudioManager.isMusicActive() " + myAudioManager.isMusicActive());
		System.out.println("DRAIAudio myAudioManager.isSpeakerphoneOn() " + myAudioManager.isSpeakerphoneOn());
		System.out.println("DRAIAudio myAudioManager.isVolumeFixed() " + myAudioManager.isVolumeFixed());
		

		
		try {
	        Class c = MediaPlayer.class;
	        short [] outData = new short[1024];
	        int kind = 0;
	        Method m = c.getMethod("snoop", outData.getClass(), Integer.TYPE);
	        m.setAccessible(true);
	        m.invoke(c, outData, kind);
	        System.out.println("DRAIAudio snoop 0 ");
	    } catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	        System.out.println("DRAIAudio snoop 1 ");
//	        return 1;
	    }
		
		
		MediaPlayer myMediaPlayer;		
		myMediaPlayer = (MediaPlayer) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_SESSION_SERVICE);
		System.out.println("DRAIAudio myMediaPlayer.isPlaying " + myMediaPlayer.isPlaying());
		System.out.println("DRAIAudio myMediaPlayer.getAudioSessionId " + myMediaPlayer.getAudioSessionId());
		System.out.println("DRAIAudio myMediaPlayer.getCurrentPosition " + myMediaPlayer.getCurrentPosition());
		System.out.println("DRAIAudio myMediaPlayer.getDuration " + myMediaPlayer.getDuration());
		System.out.println("DRAIAudio myMediaPlayer.getVideoHeight " + myMediaPlayer.getVideoHeight());
		System.out.println("DRAIAudio myMediaPlayer.getVideoWidth " + myMediaPlayer.getVideoWidth());
		System.out.println("DRAIAudio myMediaPlayer.isLooping " + myMediaPlayer.isLooping());
		System.out.println("DRAIAudio myMediaPlayer.getTrackInfo " + myMediaPlayer.getTrackInfo());
		
		MediaRouter myMediaRouter;
		myMediaRouter = (MediaRouter) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_ROUTER_SERVICE);
		System.out.println("DRAIAudio myMediaRouter.getCategoryCount " + myMediaRouter.getCategoryCount());
		System.out.println("DRAIAudio myMediaRouter.getDefaultRoute " + myMediaRouter.getDefaultRoute());
		System.out.println("DRAIAudio myMediaRouter.getRouteCount " + myMediaRouter.getRouteCount());
		
//		MediaSessionManager myMediaSession;
//		SessionManager = (SessionManager) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_SESSION_SERVICE);
//		Context.MEDIA_ROUTER_SERVICE
//		MediaController myMediaController;
		
//		VideoView myVideoView; 
//		myVideoView = (VideoView) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.);
		
		System.out.println("DRAIAudio HELLO2 " );
		
//		MediaPlayer myMediaPlayer;
//		MediaController mMedia = new MediaController(this);
//		mMedia.ge
		MediaSessionManager myMediaSessionManager;
		myMediaSessionManager = (MediaSessionManager) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_SESSION_SERVICE);
		System.out.println("DRAIAudio myMediaSessionManager " + myMediaSessionManager);
		System.out.println("DRAIAudio myMediaSessionManager.hashCode() " + myMediaSessionManager.hashCode());
		System.out.println("DRAIAudio myMediaSessionManager.getClass() " + myMediaSessionManager.getClass());
		System.out.println("DRAIAudio HELLO1 " );
		System.out.println("DRAIAudio HELLO333345 " );
//		myMediaSessionManager.addOnActiveSessionsChangedListener(this, new ComponentName("com.inmobi.richmediatestapp.test", "com.inmobi.richmediatestapp.MyActivity")); 

//		ComponentName notificationListener = null ;
		List<MediaController> myMediaControllerList =  myMediaSessionManager.getActiveSessions(new ComponentName("com.inmobi.richmediatestapp", "com.inmobi.richmediatestapp.InterstitialActivity"));
//		myMediaSessionManager.addOnActiveSessionsChangedListener(null, null);
		System.out.println("DRAIAudio myMediaControllerList " + myMediaControllerList.toString());
		System.out.println("DRAIAudio myMediaControllerList " + myMediaControllerList.size());

		for (android.media.session.MediaController i : myMediaControllerList) {
//			System.out.println("DRAIAudio myMediaControllerList describeContents " + i.describeContents());
//			System.out.println("DRAIAudio myMediaControllerList flattenToShortString " + i.flattenToShortString());
//			System.out.println("DRAIAudio myMediaControllerList flattenToString " + i.flattenToString());
//			System.out.println("DRAIAudio myMediaControllerList getClassName " + i.getClassName());
			System.out.println("DRAIAudio myMediaControllerList getPackageName " + i.getPackageName());
//			System.out.println("DRAIAudio myMediaControllerList getShortClassName " + i.getShortClassName());
			System.out.println("DRAIAudio myMediaControllerList hashCode " + i.hashCode());
//			System.out.println("DRAIAudio myMediaControllerList toShortString " + i.toShortString());
			System.out.println("DRAIAudio myMediaControllerList toString " + i.toString());
		}
//		for(int i = 0, n = myMediaControllerList.size(); i < n; i++) {
//	        System.out.println(myMediaControllerList.get(i));
//	        System.out.println("DRAIAudio myMediaControllerList describeContents " + (myMediaControllerList.get(i)).describeContents());
//	    }

		return Result.successResult();
	}

	@Override
	public String key() {
		return "audio_control_details";
	}
}
