package sh.calaba.instrumentationbackend.actions.media;

import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;

import android.app.Service;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.MediaRouter;
import android.media.*;
import android.media.session.MediaSessionManager;
//import android.media.session.SessionManager;

import android.widget.VideoView;
import android.widget.MediaController;

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
		System.out.println("DRAIAudio myAudioManager.getMode() " + myAudioManager.getMode());
		System.out.println("DRAIAudio myAudioManager.getProperty(PROPERTY_OUTPUT_SAMPLE_RATE) " + myAudioManager.getProperty("PROPERTY_OUTPUT_SAMPLE_RATE"));
		System.out.println("DRAIAudio myAudioManager.getProperty(PROPERTY_OUTPUT_FRAMES_PER_BUFFER) " + myAudioManager.getProperty("PROPERTY_OUTPUT_FRAMES_PER_BUFFER"));
		System.out.println("DRAIAudio myAudioManager.getParameters(AUDIO_SERVICE) " + myAudioManager.getParameters(Context.AUDIO_SERVICE));

//		MediaPlayer myMediaPlayer;		
//		myMediaPlayer = (MediaPlayer) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_SESSION_SERVICE);
		
		MediaRouter myMediaRouter;
		myMediaRouter = (MediaRouter) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_ROUTER_SERVICE);
		System.out.println("DRAIAudio myMediaRouter.getCategoryCount " + myMediaRouter.getCategoryCount());
		System.out.println("DRAIAudio myMediaRouter.getDefaultRoute " + myMediaRouter.getDefaultRoute());
		System.out.println("DRAIAudio myMediaRouter.getRouteCount " + myMediaRouter.getRouteCount());
		
//		MediaSessionManager myMediaSession;
//		SessionManager = (SessionManager) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_SESSION_SERVICE);
//		Context.MEDIA_ROUTER_SERVICE
//		MediaController myMediaController;
		
		VideoView myVideoView; 
//		myVideoView = (VideoView) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.);
		
		
		MediaPlayer myMediaPlayer;
//		MediaController mMedia = new MediaController(this);
//		mMedia.ge
		MediaSessionManager myMediaSessionManager;
		myMediaSessionManager = (MediaSessionManager) InstrumentationBackend.solo.getCurrentActivity().getSystemService(Context.MEDIA_SESSION_SERVICE);
		System.out.println("DRAIAudio myMediaSessionManager " + myMediaSessionManager);


//		List<MediaController> myMediaControllerList =  
		
		
		
		return Result.successResult();
	}

	@Override
	public String key() {
		return "audio_control_details";
	}
}
