package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    Slf4j가 기본적으로 제공
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // 로그 레벨
        log.trace("trace log={}", name); //
        log.debug("debug log{}", name); // 디버그 개발 서버에서
        log.info(" info log={}", name); // 비지니스 정보 및 운영시스템에서 봐야되는 정보
        log.warn(" warn log={}", name); // 경고
        log.error("error log={}", name); // 에러 로그

        return "ok";
    }
}
