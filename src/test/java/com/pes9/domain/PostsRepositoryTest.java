package com.pes9.domain;

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
        /** 
        ���� �׽�Ʈ �ڵ忡 ������ ��ġ�� �ʱ� ���� 
        �׽�Ʈ �޼ҵ尡 ������ ���� respository ��ü ���� �ڵ�
        **/
        postsRepository.deleteAll();
    }

    @Test
    public void load() {
        //given
    	Posts posts = new Posts(
  			  "�׽�Ʈ �Խñ�"
  			, "�׽�Ʈ ����"
  			, "jojoldu@gmail.com"
  			);
        
        postsRepository.save(posts);

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts post = postsList.get(0);
        assertThat(post.getTitle(), is("�׽�Ʈ �Խñ�"));
        assertThat(post.getContent(), is("�׽�Ʈ ����"));
    }
    
    @Test
    public void BaseTimeEntity_registration () {
        //given
        LocalDateTime now = LocalDateTime.now();
    	Posts posts = new Posts(
    			  "�׽�Ʈ �Խñ�"
    			, "�׽�Ʈ ����"
    			, "jojoldu@gmail.com"
    			);
        postsRepository.save(posts);
        
        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts post = postsList.get(0);
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
    }
}