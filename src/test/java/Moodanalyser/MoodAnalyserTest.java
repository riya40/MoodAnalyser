package Moodanalyser;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple MoodAnalyser.
 */
public class MoodAnalyserTest
{
    @Test
    public void givennullmoodshoulbehappy()
    {
        MoodAnalyser moodanalyser= new MoodAnalyser("Iam in Sad Mood");
        String mood=moodanalyser.analysemood();
        Assert.assertEquals("Happy",mood);
    }
}
