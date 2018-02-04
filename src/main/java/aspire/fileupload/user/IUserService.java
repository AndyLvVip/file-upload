package aspire.fileupload.user;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("aspire-user")
public interface IUserService {

    @RequestMapping("/authenticated")
    String authenticated();
}
