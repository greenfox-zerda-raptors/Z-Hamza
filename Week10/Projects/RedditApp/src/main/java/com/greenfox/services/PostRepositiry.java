package com.greenfox.services;

import com.greenfox.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zoltán on 2017.01.05..
 */
public interface PostRepositiry extends CrudRepository <Post, Long>{

}
