package com.rt.core.dao;

import org.springframework.data.repository.CrudRepository;

import com.rt.core.models.story.Story;

public interface StoryRepository extends CrudRepository<Story, String> {
	
	//getAllStories
	//getStoryById(String id)
	//updateStory(Story story)
	//deleteStory(String id)

}
