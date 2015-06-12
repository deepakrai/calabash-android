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
		System.out.println("myAudioManager.toString() " + myAudioManager.toString());
		System.out.println("myAudioManager.toString() " + myAudioManager.toString());


		return Result.successResult();
	}

	@Override
	public String key() {
		return "audio_control_details";
	}
}
