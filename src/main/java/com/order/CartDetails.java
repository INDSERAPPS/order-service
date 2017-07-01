package com.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * TODO - Describe the purpose and operation of this class
 * 
 * @author RXD117 -
 */
@Entity
@Table(name = "CART_DETAILS")
public class CartDetails {

	/**
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}

	/**
	 * @param cartId
	 *            the cartId to set
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the isActive
	 */
	public int getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the dateCreated
	 */
	public String getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            the dateCreated to set
	 */
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the dateUpdated
	 */
	public String getDateUpdated() {
		return dateUpdated;
	}

	/**
	 * @param dateUpdated
	 *            the dateUpdated to set
	 */
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Id
	@Column(name = "cart_id")
	private int cartId;

	@Column(name = "product_id")
	private int productId;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "is_active")
	private int isActive;

	@Column(name = "date_created")
	private String dateCreated;

	@Column(name = "date_updated")
	private String dateUpdated;
}

/*
 * Copyright 2017 Capital One Financial Corporation All Rights Reserved.
 * 
 * This software contains valuable trade secrets and proprietary information of
 * Capital One and is protected by law. It may not be copied or distributed in
 * any form or medium, disclosed to third parties, reverse engineered or used in
 * any manner without prior written authorization from Capital One.
 */
