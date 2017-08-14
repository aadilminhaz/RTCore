package com.rt.core.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.core.models.Story;
import com.rt.core.populator.StoryPopulator;

@Component
public class StoriesManager {

	@Autowired
	private StoryPopulator storyPopulator;
	
	public List<Story> getAllStories() {
		
		return storyPopulator.populateStories();
	}
}
