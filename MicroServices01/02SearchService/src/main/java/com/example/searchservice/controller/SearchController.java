package com.example.searchservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.searchservice.dto.SearchResponseDTO;
import com.example.searchservice.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchService searchService;

	@GetMapping
	public List<SearchResponseDTO> search(
			@RequestParam String from, 
			@RequestParam String to,
			@RequestParam String day) {
		return searchService.search(from, to, day);
	}
}
