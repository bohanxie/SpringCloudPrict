package pri.prictice.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName CommonResult.java
 * @Description TODO
 * @createTime 2020年04月23日 21:43:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private  Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
