package com.sprint.mission.discodeit.dto.request;

import java.util.UUID;

public class UserRequest {
    private UUID userId;

    private String username;
    private String email;
    private String password;

    private String fileName;
    private String contentType;
    private byte[] data;
}
