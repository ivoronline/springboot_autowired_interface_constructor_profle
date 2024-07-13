package com.ivoronline.springboot_autowired_interface_constructor_profle.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Profile2")
public class MyServiceImplementation2 implements MyServiceInterface {

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello 2";
  }

}
