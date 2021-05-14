package aytugakin.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aytugakin.hmrs.business.abstracts.TitleService;
import aytugakin.hmrs.entities.concretes.Title;

@RestController
@RequestMapping("/api/job_titles")
public class TitleController {
	
	private TitleService titleService;

	@Autowired
	public TitleController(TitleService titleService) {
		this.titleService = titleService;
	}
	
	@GetMapping("/getall")
	public List<Title> getAll(){
		return this.titleService.getAll();
	}
	
	
	
}
