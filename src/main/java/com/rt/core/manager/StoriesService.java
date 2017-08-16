package com.rt.core.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rt.core.dao.StoryRepository;
import com.rt.core.models.story.Story;
import com.rt.core.populator.StoryPopulator;

@Service
public class StoriesService {

	@Autowired
	private StoryPopulator storyPopulator;
	
	@Autowired
	private StoryRepository storyRepo;
	
	//List<Story> allStories = storyPopulator.populateStories();
	//List<Story> allStories = new ArrayList<Story>();
	
	public StoriesService() {
		//this.allStories = storyPopulator.populateStories();
	}
	
	public List<Story> getAllStories() {
		//List<Story> testStories = storyPopulator.populateStories();
		//return storyPopulator.populateStories();
		List<Story> stories = new ArrayList<Story>();
		
		/**Basically adding all the result of storyRepo.findAll() to stories list*/
		storyRepo.findAll()
		.forEach(stories :: add); 
		
		return stories;
	}
	
	public Story getStoryById(String storyId) {
		
		//List<Story> allStories = storyPopulator.populateStories();
		//return  allStories.stream().filter(s -> s.getStoryId().equals(storyId)).findFirst().get();
		return storyRepo.findOne(storyId);
	}
	
	public Story addStory(Story story) {
		//allStories.add(story);
		storyRepo.save(story);
		return story;
	}
	
	public Story updateStory(Story inputStory, String storyId) {
		
		storyRepo.save(inputStory);
		return inputStory;
		//Story storyToUpdate = null;
		/*int index = 0;
		for (Story story : allStories) {
			if (storyId.equals(story.getStoryId())) {
				
				allStories.set(index, inputStory);
				//storyToUpdate = story;
				return inputStory;
			}
			index++;
		}
		return null;*/
	}
	
	public void deleteStory(String storyId) {
		storyRepo.delete(storyId);
		
		/*int index = 0;
		for (Story story : allStories) {
			if (storyId.equals(story.getStoryId())) {
				allStories.remove(index);
				return;
			}
			index++;
		}*/
	}
	
	
}
