package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.dto.request.UserRequest;
import com.sprint.mission.discodeit.dto.response.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // create, find, findAll, update, delete
    UserResponse create(UserRequest request);
    UserResponse find(UUID userId);
    List<UserResponse> findAll();
    UserResponse update(UserRequest request);
    void delete(UUID userId);
}