package k24.modelViewHarj.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import k24.modelViewHarj.domain.Friend;

@Controller
public class FriendController {
	private List<Friend> friends = new ArrayList<>();

	@GetMapping("/friends")
	public String listFriends(Model model) {		
		model.addAttribute("friends", friends);
		model.addAttribute("newFriend", new Friend());
		
		return "friendlist";

	}
	
	@GetMapping("/add")
	public String addFriend(Model model) {
		model.addAttribute("newFriend", new Friend());
		return "addfriend";
	}
	
	@PostMapping("/add")
	public String addFriend(@ModelAttribute Friend newFriend, Model model) {
		friends.add(newFriend);
		return "redirect:/friends";
		
	}@GetMapping("/allFriends")
	public String listAndAddFriends(Model model) {
	    model.addAttribute("friends", friends);
	    model.addAttribute("newFriend", new Friend());
	    return "allfriends";
	}
	
	@PostMapping("/addFromAll")
	public String addFriendFromAll(@ModelAttribute Friend newFriend, Model model) {
	    friends.add(newFriend);
	    return "redirect:/allFriends";
	}


	
	

}
