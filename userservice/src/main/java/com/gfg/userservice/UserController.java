package com.gfg.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping ( "/cliente" )
        public String check() {
        return "Bienvenido Cliente" ;
    }
}
