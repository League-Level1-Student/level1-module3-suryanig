package _07_cow_timer;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class CowTimer {

	/*
	 * 1. Make a constructor for the CowTimer class that initializes the minutes
	 * variable
	 */

	/* 4. Complete the main method of the CowTimerRunner class */

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow time set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for the number
		 * of minutes using Thread.sleep(int milliseconds).
		 */

Thread.sleep(minutes*1000);
playSound("moo.wav");
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it intothe default package.
		 */

	}
boolean canPlaySounds = true;
	private void playSound(String fileName) {
		
			if (canPlaySounds) {	
				File sound = new File("src/_07_cow_timer/"+fileName);
				if (sound.exists()) {
					new Thread(() -> {
					try {
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sound));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength()/1000);
					}
					catch (Exception e) {
						System.out.println("Could not play this sound");
					}}).start();
		 		}
				else {
					System.out.println("File does not exist");
				}
			}
		}
	
	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
