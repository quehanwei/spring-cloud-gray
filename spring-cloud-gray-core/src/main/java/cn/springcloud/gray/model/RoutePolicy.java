package cn.springcloud.gray.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author saleson
 * @date 2020-05-10 17:14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoutePolicy implements Serializable {

    private static final long serialVersionUID = 3731275903446445235L;
    private Long id;
    private String type;
    /**
     * 模块id，用于搜索索引，如果serviceId
     */
    private String moduleId;
    /**
     * 路由的资源，如：serviceId, instanceId, service version
     */
    private String resource;

    private Long policyId;

}
