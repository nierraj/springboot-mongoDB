package com.neeraj.joblisting.repository;

import com.neeraj.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
