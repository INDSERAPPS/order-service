package com.order;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/cart")
public class CartController {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private CartDetailsRepository cartDetailsRepository;

	@GetMapping(path = "/allcarts")
	public @ResponseBody Iterable<Cart> GetCarts() {
		return cartRepository.findAll();
	}

	@GetMapping(path = "/allcartdetails")
	public @ResponseBody Iterable<CartDetails> GetCartDetails() {
		return cartDetailsRepository.findAll();
	}

	@GetMapping(path = "/add") // Map ONLY GET Requests
	public @ResponseBody String addCart() {

		// TODO transaction based for these 2 tables

		Cart cart = new Cart();
		Random random = new Random();
		cart.setCartId(random.nextInt());
		cart.setCustId(random.nextInt());
		cart.setDateCreated("dateCreated");
		cart.setDateUpdated("dateUpdated");
		cart.setIsActive(1);
		cartRepository.save(cart);

		CartDetails cartdetails = new CartDetails();
		cartdetails.setCartId(random.nextInt());
		cartdetails.setProductId(random.nextInt());
		cartdetails.setDateCreated("dateCreated");
		cartdetails.setDateUpdated("dateUpdated");
		cartdetails.setQuantity(random.nextInt(20));
		cartdetails.setIsActive(1);
		cartDetailsRepository.save(cartdetails);
		return "Saved";
	}

}