package sjm;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sjm5858
 * @date 2021/3/3 16:52
 */
@NoArgsConstructor
@Data
public class GsonFormat {

    /**
     * id : 1
     * name : test
     * age : 22
     */

    private Integer id;
    private String name;
    private Integer age;
}
