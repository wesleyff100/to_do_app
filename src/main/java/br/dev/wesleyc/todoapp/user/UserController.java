package br.dev.wesleyc.todoapp.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
 @RestController
 @RequestMapping("/users")

public class UserController {
    /**
     * String (texto)
     * Integer (int) Numeros inteiros
     * Double (double) Numero 0.0000
     * Float (float) Numero 0.0000
     * chat (A B C)
     * Date (data)
     * void (Vazio)
     */
    /**
     * Body
     */
    @PostMapping("/")
    @GetMapping("/")
    public void create(@RequestBody userModel userModel) {
        System.out.println (userModel.name);
    }
}
