package com.rt.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.core.manager.StoriesManager;
import com.rt.core.models.Story;

@RestController
@RequestMapping("/story")
public class StoriesController {
	
	@Autowired
	private StoriesManager storiesManager;
	
	@RequestMapping("/all")
	public List<Story> getAllStories() {
		return storiesManager.getAllStories();
	}

}
