package com.rt.core.populator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rt.core.models.Story;
import com.rt.core.models.StoryPara;

@Component
public class StoryPopulator {
	
	public List<Story> populateStories() {
		List<Story> stories = new ArrayList<Story>();
		stories.add(populateStory());
		stories.add(populate2ndStory());
		
		return stories;
	}
	
	public Story populateStory() {
		StoryPara storyIntro = new StoryPara("01", "Beautiful Life", "http://rt.com/octa/story02/img001.jpg", "Story Intro");
		
		Story story = new Story("01", "Beatiful Life", "Aaditya", storyIntro, null);
		
		story.setStoryLines(populateStoryParas());
		
		
		
		return story;
		
	}
	
	/**Temp Duplicate Story Populator, Delete after prototype is done*/
	public Story populate2ndStory() {
		StoryPara storyIntro2 = new StoryPara("01", "Money or Glory", "http://rt.com/octa/story02/img001.jpg", "Story Intro");
		
		Story story2 = new Story("03", "Money or Glory", "Aadi", storyIntro2, null);
		story2.setStoryLines(populateStoryParas());
		return story2;
	}
	
	
	public List<StoryPara> populateStoryParas() {
		List<StoryPara> storyParaList = new ArrayList<StoryPara>();
		
		
		/**Temp Populator*/
		
		StoryPara storyPara1 = new StoryPara("02", "Fist Title", "http://rt.com/octa/story02/img001.jpg", "Story paragraph goes here");
		StoryPara storyPara2 = new StoryPara("03", "Second Title", "http://rt.com/octa/story02/img002.jpg", "Story paragraph goes here");
		StoryPara storyPara3 = new StoryPara("04", "Third Title", "http://rt.com/octa/story02/img003.jpg", "Story paragraph goes here");
		
		storyParaList.add(storyPara1);
		storyParaList.add(storyPara2);
		storyParaList.add(storyPara3);
		return storyParaList;
	}
	
	public StoryPara populateStoryPara() {
		StoryPara storyPara = new StoryPara();
		storyPara.setStoryParaId("01");
		storyPara.setParaTitle("Story Line Title");
		storyPara.setParaImage("paraImageLink");
		storyPara.setParaText("Para Content");
		
		return storyPara;
	}
}
