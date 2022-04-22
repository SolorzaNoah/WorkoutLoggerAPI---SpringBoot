package com.workoutlog.post.management.service;

import com.workoutlog.post.management.dto.PostDTO;

import java.util.List;

public interface PostManagementService {

    List<PostDTO> list();

    Boolean add(PostDTO workout);

    Boolean edit(String id,PostDTO workout);

    Boolean delete(String id);


}
