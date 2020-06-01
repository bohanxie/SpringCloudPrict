package pri.prictice.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName payment.java
 * @Description TODO
 * @createTime 2020年04月21日 21:15:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
