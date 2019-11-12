package mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ProjectName: demo1112
 * @Package: mybatis
 * @ClassName: MyMapper
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/12 13:38
 * @Version: 1.0
 */
public interface MyMapper<T> extends Mapper<T> , MySqlMapper<T> {

}
