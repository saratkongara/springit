package com.thoughtworks.springit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@Data
public class Link extends Auditable {
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String title;
	
	@NonNull
	private String url;
	
	@OneToMany(mappedBy = "link")
	List<Comment> comments = new ArrayList<Comment>();

	public Link(@NonNull String title, @NonNull String url) {
		super();
		this.title = title;
		this.url = url;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}
}