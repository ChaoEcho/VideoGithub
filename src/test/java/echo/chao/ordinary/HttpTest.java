package echo.chao.ordinary;

import kong.unirest.Unirest;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by EchoChao on 2023/2/16 17:38
 */
@SpringBootTest
public class HttpTest {

    public static void main(String[] args) {

        String token = """
                c4ce8cf5d55feb3e1ba2c56bfe51b58e
                """;
        String body = Unirest.post("http://127.0.0.1:8524/h5/api/common/guide")
                .header("token", token)
                .asString().getBody();

        System.out.println(body);


    }

}
