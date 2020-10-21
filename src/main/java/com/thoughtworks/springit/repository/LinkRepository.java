package com.thoughtworks.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtworks.springit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {
	Link findByTitle(String title);
}
