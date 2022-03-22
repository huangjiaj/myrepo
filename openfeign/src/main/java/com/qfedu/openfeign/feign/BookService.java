package com.qfedu.openfeign.feign;

import com.qfedu.service.api.IBookController;
import org.springframework.cloud.openfeign.FeignClient;

/**

 */

@FeignClient("storage")
public interface BookService extends IBookController {
}
