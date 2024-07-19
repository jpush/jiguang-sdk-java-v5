package cn.jiguang.sdk.bean.image;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImageUrlUpdateResult {

    @JsonProperty("media_id")
    private String mediaId;

    @JsonProperty("jiguang_image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String jiguangImageUrl;

    @JsonProperty("xiaomi_image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String xiaomiImageUrl;

    @JsonProperty("huawei_image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String huaweiImageUrl;

    @JsonProperty("honor_image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String honorImageUrl;

    @JsonProperty("oppo_image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String oppoImageUrl;

    @JsonProperty("fcm_image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fcmImageUrl;

    @JsonProperty("hmos_image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String hmosImageUrl;
}
