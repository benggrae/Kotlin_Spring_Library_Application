package com.group.libraryapp.dto.user.request;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UserCreateRequest {

  public UserCreateRequest(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  private String name;
  @Nullable
  private Integer age;

  @NotNull
  public String getName() {
    return name;
  }

  @Nullable
  public Integer getAge() {
    return age;
  }

}
