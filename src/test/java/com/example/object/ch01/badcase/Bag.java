package com.example.object.ch01.badcase;

/**
 * @author chulwoon.jang
 * @since 2019. 06. 20.
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	public Bag(Long amount) {
		this(null, amount);
	}

	public Bag(Invitation invitation, Long amount) {
		this.amount = amount;
		this.invitation = invitation;
	}

	public boolean hasInvitaion() {
		return invitation != null;
	}

	public boolean hasTicket() {
		return ticket != null;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
