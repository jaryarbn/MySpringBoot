package hello;

import hello.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
    public class HelloController {
        private OrderService orderService;
        @Inject
        public HelloController(OrderService ord erService) {
            this.orderService = orderService;
        }

        @GetMapping("/")
        public String index() {
            return "Greetings from Spring Boot!";
        }

    }

