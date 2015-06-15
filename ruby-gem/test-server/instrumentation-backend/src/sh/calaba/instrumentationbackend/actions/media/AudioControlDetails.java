package sh.calaba.instrumentationbackend.actions.media;

import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.MediaRouter;
import android.media.*;

import android.widget.VideoView;

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
		
		return Result.successResult();
	}

	@Override
	public String key() {
		return "audio_control_details";
	}
}
