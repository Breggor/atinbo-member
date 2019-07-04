package com.atinbo.member.utils;


/**
 * @author :ricky
 * @description:分享链接
 * @create :2014年9月28日
 * <p>
 * 上海创乐人企业发展有限公司
 */
public class ShareLinkUtil {

    private static String link = PropertyUtil.getValue("/domain.properties",
            "DEFAULT")
            + "/share/link?version=1.0&appkey=10001&moduleId={moduleid}&sourceId={sourceid}&modId={modId}";

    private static String braceletlink = PropertyUtil.getValue(
            "/domain.properties", "DEFAULT")
            + "/share/braceletlink?version=1.0&appkey=10001&moduleId={moduleid}&sourceId={sourceid}";

    /**
     * "ID" "NAME" "1" "活动" "2" "谈吃谈喝" "3" "吃了瘦/吃了胖(食材)" "4" "节气" "5" "餐前贴士" "6"
     * "广告" "7" "餐前餐后解决方案" "8" "PK结果"
     */
    public static final String activityLink(Long id) {
        return buildLink(1, id);
    }

    public static final String talkeatLink(Long id) {
        return buildLink(2, id);
    }

    // public static final String stuffLink(Long id) {
    // return buildLink(3, id);
    // }

    public static final String termLink(Long id) {
        return buildLink(4, id);
    }

    public static final String tipsLink(Long id) {
        return buildLink(5, id);
    }

    public static final String adLink(Long... id) {
        return buildLink(6, id);
    }

    public static final String soluLink(Long id) {
        return buildLink(7, id);
    }

    public static final String pkLink(Long id) {
        return buildLink(8, id);
    }

    public static final String stuffLink(Long id) {
        return buildLink(10, id);
    }

    public static final String articleLink(Long id) {
        return buildLink(12, id);
    }

    public static final String braceletLink(Integer moduleid, Long id) {
        return buildBraceletLink(moduleid, id);
    }

    public static final String buildLink(Integer moduleid, Long... id) {
        return link
                .replace("{moduleid}", moduleid.toString())
                .replace("{sourceid}", id.length == 0 ? "0" : id[0].toString())
                .replace(
                        "&modId={modId}",
                        id.length == 0 ? "" : id.length <= 1 ? "" : "&modId="
                                + id[1]);
    }

    public static final String buildBraceletLink(Integer moduleid, Long id) {
        return braceletlink.replace("{moduleid}", moduleid.toString()).replace(
                "{sourceid}", id.toString());
    }
}
