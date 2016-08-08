package springBootApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Superduo on 8/8/16.
 */
@RestController
public class JsonRestController {

    @RequestMapping("/rest/")
    public String index() {
        return "<h4> ground control to major Tom... can you here me major Tom???</h4>";
    }
    @RequestMapping("/rest/test")
    public String test() {
        return "<h1> this is a test...</h1>";

    }
}



//@RestController
//public class JsonRestController {
//
//    @RequestMapping("/rest/")
//    public String index() {
//        return "<h1>Greetings from Spring Boot!</h1>";
//    }
//
//    @RequestMapping("/rest/test")
//    public String test() {
//        return "<h1>This is a test...</h1>";
//    }
//}