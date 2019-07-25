package com.pes.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pes.entity.posts.Posts;
import com.pes.repository.posts.PostsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void load() {
        //given
    	Posts Posts = new Posts(
  			  "1"
  			, "2"
  			, "jojoldu@gmail.com"
  			);
        
        postsRepository.save(Posts);

        //when
        List<Posts> PostsList = postsRepository.findAll();

        //then
        Posts post = PostsList.get(0);
        assertThat(post.getTitle(), is("1"));
        assertThat(post.getContent(), is("2"));
    }
    
    @Test
    public void BaseTimeEntity_registration () {
        //given
        LocalDateTime now = LocalDateTime.now();
    	Posts Posts = new Posts(
    			  "1"
    			, "2"
    			, "jojoldu@gmail.com"
    			);
        postsRepository.save(Posts);
        
        //when
        List<Posts> PostsList = postsRepository.findAll();

        //then
        Posts post = PostsList.get(0);
        assertTrue(post.getCreatedDate().isAfter(now));
        assertTrue(post.getModifiedDate().isAfter(now));
    }
}