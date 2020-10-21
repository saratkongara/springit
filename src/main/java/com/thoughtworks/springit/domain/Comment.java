package com.thoughtworks.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Comment extends Auditable {
	@Id
	@GeneratedValue
	private Long id;
	
	private String body;
	
	@ManyToOne
	Link link;

	public Comment(String body, Link link) {
		super();
		this.body = body;
		this.link = link;
	}
}
