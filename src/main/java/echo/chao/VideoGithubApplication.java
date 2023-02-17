package echo.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @TODO 前端那个设置功能有bug，按钮显示正常，但是因为是从内存读的
 */
@SpringBootApplication
public class VideoGithubApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoGithubApplication.class, args);
    }

}
