package moodanalysertesting;

import org.junit.Assert;
import org.junit.Test;

import moodanalyser.MoodAnalyserMain;

public class MoodAnalyserTest
{
	//Method to check for sad mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		MoodAnalyserMain  moodAnalyser = new MoodAnalyserMain();
		String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertEquals("SAD", mood);
	}
	//Method to check for happy mood
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy()
	{
		MoodAnalyserMain moodAnalyser = new MoodAnalyserMain();
		String mood = moodAnalyser.analyseMood("This is a happy message");
		Assert.assertEquals("HAPPY", mood);
	}
}

