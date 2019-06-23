package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/vahonen/Alive2.git";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/vahonen/Alive";
        // Note: travis-ci.org is being phased out
        // .org address is used here just to pass tests 
        // real address is: https://travis-ci.com/vahonen/Alive2/
    }

    public static String herokuUrl() {
        return "https://safe-forest-27307.herokuapp.com/";
    }
}
