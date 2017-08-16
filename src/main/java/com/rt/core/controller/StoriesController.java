package com.rt.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rt.core.manager.StoriesService;
import com.rt.core.models.story.Story;

@RestController
//@RequestMapping("/story")
public class StoriesController {
	
	@Autowired
	private StoriesService storiesService;
	
	@RequestMapping("/story")
	public List<Story> getAllStories() {
		return storiesService.getAllStories();
	}
	
	@RequestMapping("/story/{storyId}")
	public Story getStoryById(@PathVariable String storyId) {
		return storiesService.getStoryById(storyId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/story")
	public Story addStory(@RequestBody Story story) {
		return storiesService.addStory(story);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/story/{storyId}")
	public Story updateStory(@RequestBody Story story, String storyId) {
		return storiesService.updateStory(story, storyId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/story")
	public void deleteStory(String storyId) {
		storiesService.deleteStory(storyId);
	}

}
