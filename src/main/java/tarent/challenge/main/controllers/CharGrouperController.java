package tarent.challenge.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tarent.challenge.main.charGrouper.CharGrouper;

@RestController
public class CharGrouperController {
	
	@Autowired
	private CharGrouper charGrouper;
	
	@GetMapping("/chargrouper/{ungroupedStr}")
	public GroupedStrResponse groupStr(@PathVariable String ungroupedStr) {
		return new GroupedStrResponse(charGrouper.group(ungroupedStr));
	}

}
