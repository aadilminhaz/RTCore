package com.rt.core.models.story;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Story {
	
	@Id
	private String storyId;
	private String storyName;
	private String author;
	//private StoryPara storyIntro;
	//private List<StoryPara> storyLines;
	
	
	public Story() {
		
	}
	
	public Story(String storyId, String storyName, String author, StoryPara storyIntro,
			List<StoryPara> storyLines) {
		this.storyId = storyId;
		this.storyName = storyName;
		this.author = author;
		/*this.storyIntro = storyIntro;
		this.storyLines = storyLines;*/
	}

	public String getStoryId() {
		return storyId;
	}
	public void setStoryId(String storyId) {
		this.storyId = storyId;
	}
	public String getStoryName() {
		return storyName;
	}
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
/*	public StoryPara getStoryIntro() {
		return storyIntro;
	}
	public void setStoryIntro(StoryPara storyIntro) {
		this.storyIntro = storyIntro;
	}
	public List<StoryPara> getStoryLines() {
		return storyLines;
	}
	public void setStoryLines(List<StoryPara> storyLines) {
		this.storyLines = storyLines;
	}*/
}
