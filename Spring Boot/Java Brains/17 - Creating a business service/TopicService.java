package com.neeraj.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "core java", "core java Description"),
				new Topic("javascript", "JavaScript", "JavaScript Description")
		);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}
