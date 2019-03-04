package com.yinbao.www.myapplication.bean;

import java.util.List;

/**
 * 创建时间:2018/12/25
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.bean
 * 功能描述:
 */
public class NewsBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"c67f2972babe88c90a7429d7dbb97f9a","title":"红星美羚被评为陕西省优秀民营企业","date":"2018-12-25 14:15","category":"国内","author_name":"国际在线","url":"http://mini.eastday.com/mobile/181225141542697.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_3_mwpm_03200403.jpg"},{"uniquekey":"e7274ea98dcd33fbab26a1328caa7461","title":"不解决观念、资源、体制等问题 , 山西立法控煤也只是看起来很美","date":"2018-12-25 14:15","category":"国内","author_name":"人民网","url":"http://mini.eastday.com/mobile/181225141505619.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225141505_af80d71a71ddbab076ae2390d8bb2b67_1_mwpm_03200403.jpg"},{"uniquekey":"0cab0f9898d9acedfa9660a17061bf66","title":"全市\u201c边巡边改\u201d工作领导小组专题会召开","date":"2018-12-25 14:14","category":"国内","author_name":"小马先锋","url":"http://mini.eastday.com/mobile/181225141449691.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181225/20181225141449_7d887cd12ca6a9d4e28012309997ed62_1_mwpm_03200403.jpg"},{"uniquekey":"1a140e1df5520b8dcd18c5340d7d41d5","title":"热而不闹，回归理性，今年的衡阳\u201c平安夜\u201d向大家报平安！","date":"2018-12-25 14:14","category":"国内","author_name":"衡阳新闻网","url":"http://mini.eastday.com/mobile/181225141435172.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225141435_ff00dde678c1843fa1ed82e0532bdbc0_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181225/20181225141435_ff00dde678c1843fa1ed82e0532bdbc0_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181225/20181225141435_ff00dde678c1843fa1ed82e0532bdbc0_1_mwpm_03200403.jpg"},{"uniquekey":"04b7dd5d4d5b9debe152ad842c7ff469","title":"西延高铁获批：西安至延安仅需50分钟","date":"2018-12-25 14:14","category":"国内","author_name":"晨光旅游","url":"http://mini.eastday.com/mobile/181225141431953.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225141431_a91d44425e8afabc6f4568cad38b36bf_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181225/20181225141431_a91d44425e8afabc6f4568cad38b36bf_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181225/20181225141431_a91d44425e8afabc6f4568cad38b36bf_1_mwpm_03200403.jpg"},{"uniquekey":"2bc396b5855fc51a59661290aed4e2e6","title":"临翔区开展\u201c讲实话说变化感党恩谋幸福\u201d主题教育实践活动","date":"2018-12-25 14:12","category":"国内","author_name":"微播临翔","url":"http://mini.eastday.com/mobile/181225141258978.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225141258_39fc587a4b602c590e5b122709f864b9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225141258_39fc587a4b602c590e5b122709f864b9_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181225/20181225141258_39fc587a4b602c590e5b122709f864b9_1_mwpm_03200403.jpg"},{"uniquekey":"5e965b74020f3284d5e3ae960800038a","title":"大丰传媒与保利剧院共同经营余杭大剧院","date":"2018-12-25 14:12","category":"国内","author_name":"证券日报","url":"http://mini.eastday.com/mobile/181225141232939.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225141232_f6b1910bc616ea93f6ad6bb5a3c55487_1_mwpm_03200403.jpg"},{"uniquekey":"f2ca9c74524e5d8041c7312bfe18a2be","title":"哈尔滨新人承诺：婚礼不燃放烟花爆竹","date":"2018-12-25 14:12","category":"国内","author_name":"生活报","url":"http://mini.eastday.com/mobile/181225141217075.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181225/20181225141217_c2b413d741c0786000430bbdbaa8d6af_1_mwpm_03200403.jpg"},{"uniquekey":"69990aec1d895e56950e205a07c45fc6","title":"中国城市创新指标评价体系研讨会在南阳市召开","date":"2018-12-25 14:12","category":"国内","author_name":"TOM   ","url":"http://mini.eastday.com/mobile/181225141214159.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181225/20181225141214_5ba1226758e0c25ca0c7525b568d0153_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181225/20181225141214_5ba1226758e0c25ca0c7525b568d0153_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181225/20181225141214_5ba1226758e0c25ca0c7525b568d0153_3_mwpm_03200403.jpg"},{"uniquekey":"0890834f46ce7c06bb0b81389a970e64","title":"安徽六安：\u201c小农水\u201d浇出幸福花","date":"2018-12-25 14:10","category":"国内","author_name":"中国水利报","url":"http://mini.eastday.com/mobile/181225141010252.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225141010_50c21e6711e2882ae55872eacc3a4b26_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225141010_50c21e6711e2882ae55872eacc3a4b26_1_mwpm_03200403.jpg"},{"uniquekey":"d12565ccb930ccb3d55ad054b37c9f07","title":"南京长江大桥即将恢复通车，你知道大桥与上海的关系吗？","date":"2018-12-25 14:09","category":"国内","author_name":"上观新闻","url":"http://mini.eastday.com/mobile/181225140936468.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225140936_2acefd5a7f44f29a8e310f9055e5aba1_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225140936_2acefd5a7f44f29a8e310f9055e5aba1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181225/20181225140936_2acefd5a7f44f29a8e310f9055e5aba1_2_mwpm_03200403.jpg"},{"uniquekey":"ea5e68bf964aa56f9b94db5603747099","title":"徐景颜不再担任聊城市委书记 已任济南大学党委书记 ","date":"2018-12-25 14:06","category":"国内","author_name":"光明网","url":"http://mini.eastday.com/mobile/181225140619762.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225140619_e178ac8b92efb51b03f9fb13396e809c_1_mwpm_03200403.jpg"},{"uniquekey":"79b2734a0b1f95b04dc6bb2c2d8fe358","title":"近代桥梁建设完全依赖外国人？改变从钱塘江大桥开始","date":"2018-12-25 14:04","category":"国内","author_name":"解放网","url":"http://mini.eastday.com/mobile/181225140425228.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181225/20181225140425_87e039a305e4d69d8d32789fad9f8098_1_mwpm_03200403.jpg"},{"uniquekey":"8c43e57c8ab5f88e1ba6654403c538ea","title":"武汉江汉区淮海路走一遭瞅见多处破烂脏","date":"2018-12-25 14:04","category":"国内","author_name":"渣心事","url":"http://mini.eastday.com/mobile/181225140419846.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225140419_ada889383bd72aea6d1522ce8618ff2a_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181225/20181225140419_ada889383bd72aea6d1522ce8618ff2a_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181225/20181225140419_ada889383bd72aea6d1522ce8618ff2a_8_mwpm_03200403.jpg"},{"uniquekey":"bc55aecf835ab5f8ce5ff1db8dcfcd1c","title":"到行政服务中心，21个交通类事项\u201c一次办成\u201d","date":"2018-12-25 14:02","category":"国内","author_name":"生活报","url":"http://mini.eastday.com/mobile/181225140202279.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181225/20181225140202_c2b056d79a1431719e537fe15f1ef6e7_1_mwpm_03200403.jpg"},{"uniquekey":"af10d2703e82cb4f56519c1511fdfa27","title":"12306准备放票 成雅铁路有望本周正式开通","date":"2018-12-25 14:02","category":"国内","author_name":"四川新闻网","url":"http://mini.eastday.com/mobile/181225140201011.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225140201_e5da18f78db1ba4ec6c91d8623f0cded_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181225/20181225140201_e5da18f78db1ba4ec6c91d8623f0cded_1_mwpm_03200403.jpg"},{"uniquekey":"e480f5b1bd167463a0cb763a2f3e7170","title":"杭黄高铁正式通车 最美高铁穿越 7 个 5A 级景区","date":"2018-12-25 14:02","category":"国内","author_name":"中国青年网","url":"http://mini.eastday.com/mobile/181225140200044.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225140200_7855208a0ab6e5be8f67d5472ec3363f_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181225/20181225140200_7855208a0ab6e5be8f67d5472ec3363f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181225/20181225140200_7855208a0ab6e5be8f67d5472ec3363f_5_mwpm_03200403.jpg"},{"uniquekey":"40cc68ba6cbfbec74c0a660cd445d2d0","title":"北京市教委主任刘宇辉会见黑山下格理查大学代表团","date":"2018-12-25 14:01","category":"国内","author_name":"黔讯网","url":"http://mini.eastday.com/mobile/181225140147141.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225140147_e83757570fea8e24a779eb8265238eac_1_mwpm_03200403.jpg"},{"uniquekey":"2ae9734fcab570c238e90c6803d3ab30","title":"醴陵：法治+扶贫为贫困户撑起阳光保护伞","date":"2018-12-25 14:01","category":"国内","author_name":"红网","url":"http://mini.eastday.com/mobile/181225140132988.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225140132_a706434b53200973277ebb10160f0027_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181225/20181225140132_a706434b53200973277ebb10160f0027_2_mwpm_03200403.jpg"},{"uniquekey":"f78de6d6f2b4ef3b92a02442237113d5","title":"碧岭｜品圣诞文化，平安相祝福，圣诞贺卡亲子制作","date":"2018-12-25 13:59","category":"国内","author_name":"坪山微报","url":"http://mini.eastday.com/mobile/181225135952769.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181225/20181225135952_3998dba56e11d2d1f0fb74490ac95161_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181225/20181225135952_3998dba56e11d2d1f0fb74490ac95161_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181225/20181225135952_3998dba56e11d2d1f0fb74490ac95161_1_mwpm_03200403.jpg"},{"uniquekey":"fe586d87e8c6e426c7cc733396eba78b","title":"展现古城文化底蕴 弘扬徐派园林特色","date":"2018-12-25 13:58","category":"国内","author_name":"中国徐州网-徐州日报","url":"http://mini.eastday.com/mobile/181225135843824.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181225/20181225135843_76e844a939c6132d795081d5432986da_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181225/20181225135843_76e844a939c6132d795081d5432986da_1_mwpm_03200403.jpg"},{"uniquekey":"7a6b368df6f32fd6eddb04c290ca1030","title":"静安区第二十五届\u201c蓝天下的至爱\u201d系列慈善活动启动","date":"2018-12-25 13:58","category":"国内","author_name":"静安报","url":"http://mini.eastday.com/mobile/181225135823050.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225135823_542619de33cca445fc3c70bdf6bac910_1_mwpm_03200403.jpg"},{"uniquekey":"f50e5c5140d4d3cf6069014a9fc579d2","title":"静安2500余青少年放下书包享受运动乐趣","date":"2018-12-25 13:58","category":"国内","author_name":"静安报","url":"http://mini.eastday.com/mobile/181225135801626.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225135801_6f7bedf884be38447f7d9e4c7de34ae9_1_mwpm_03200403.jpg"},{"uniquekey":"9b403eee512c17a6c49679527dc05437","title":"静安门彭浦举行\u201c上海也有我的家\u201d二十周年故事分享会","date":"2018-12-25 13:57","category":"国内","author_name":"静安报","url":"http://mini.eastday.com/mobile/181225135757211.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225135757_d61c56cccd6bd3561ef842a2529b37e8_1_mwpm_03200403.jpg"},{"uniquekey":"acb92a7f2cb0c49ba9cd4074fa77fdc0","title":"义乌改革开放40年②｜浙江第一强县仍需改革开放这关键一招","date":"2018-12-25 13:57","category":"国内","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/181225135703312.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181225/20181225135703_7d6a53edc56a11b78c4c776990144431_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181225/20181225135703_7d6a53edc56a11b78c4c776990144431_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181225/20181225135703_7d6a53edc56a11b78c4c776990144431_4_mwpm_03200403.jpg"},{"uniquekey":"67c828e5dea23385dd8a517826b13c73","title":"甘肃扶贫路径：由\u201c大水漫灌\u201d到\u201c精准滴灌\u201d ","date":"2018-12-25 13:55","category":"国内","author_name":"光明网","url":"http://mini.eastday.com/mobile/181225135558076.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181225/20181225135558_ad29d9bf531f5b840d86caa79c2b4960_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181225/20181225135558_ad29d9bf531f5b840d86caa79c2b4960_2_mwpm_03200403.jpg"},{"uniquekey":"f72effa33f44b2a604fb337590a0a975","title":"赣深铁路高车隧道胜利贯通","date":"2018-12-25 13:52","category":"国内","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181225135200563.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225135200_eb75be5b6596a5b48a271183c171018a_1_mwpm_03200403.jpg"},{"uniquekey":"33c06fc06b93a8abe4ead1acebe93313","title":"昌景黄高速铁路江西段开工建设 计划工期4年","date":"2018-12-25 13:51","category":"国内","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181225135159507.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225135159_a50191122fd3ce282191ef14a409861c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225135159_a50191122fd3ce282191ef14a409861c_2_mwpm_03200403.jpg"},{"uniquekey":"a3b0ff7c1d58dc87668b43f35b15d7bb","title":"政协沈阳市皇姑区第十五届委员会第二次会议开幕","date":"2018-12-25 13:51","category":"国内","author_name":"沈阳网","url":"http://mini.eastday.com/mobile/181225135139695.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181225/20181225135139_265233cce7aace68ead0bd016b5f5b8d_1_mwpm_03200403.jpg"},{"uniquekey":"e0fbfa02d956c0edfcca645a9c717b97","title":"沈阳市举办首届环保知识进校园活动","date":"2018-12-25 13:51","category":"国内","author_name":"沈阳网","url":"http://mini.eastday.com/mobile/181225135131442.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225135131_315bc8ed498aa5c2301ba9f51255161f_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181225/20181225135131_315bc8ed498aa5c2301ba9f51255161f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181225/20181225135131_315bc8ed498aa5c2301ba9f51255161f_2_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultEntity result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultEntity getResult() {
        return result;
    }

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultEntity {
        /**
         * stat : 1
         * data : [{"uniquekey":"c67f2972babe88c90a7429d7dbb97f9a","title":"红星美羚被评为陕西省优秀民营企业","date":"2018-12-25 14:15","category":"国内","author_name":"国际在线","url":"http://mini.eastday.com/mobile/181225141542697.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_3_mwpm_03200403.jpg"},{"uniquekey":"e7274ea98dcd33fbab26a1328caa7461","title":"不解决观念、资源、体制等问题 , 山西立法控煤也只是看起来很美","date":"2018-12-25 14:15","category":"国内","author_name":"人民网","url":"http://mini.eastday.com/mobile/181225141505619.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225141505_af80d71a71ddbab076ae2390d8bb2b67_1_mwpm_03200403.jpg"},{"uniquekey":"0cab0f9898d9acedfa9660a17061bf66","title":"全市\u201c边巡边改\u201d工作领导小组专题会召开","date":"2018-12-25 14:14","category":"国内","author_name":"小马先锋","url":"http://mini.eastday.com/mobile/181225141449691.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181225/20181225141449_7d887cd12ca6a9d4e28012309997ed62_1_mwpm_03200403.jpg"},{"uniquekey":"1a140e1df5520b8dcd18c5340d7d41d5","title":"热而不闹，回归理性，今年的衡阳\u201c平安夜\u201d向大家报平安！","date":"2018-12-25 14:14","category":"国内","author_name":"衡阳新闻网","url":"http://mini.eastday.com/mobile/181225141435172.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225141435_ff00dde678c1843fa1ed82e0532bdbc0_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181225/20181225141435_ff00dde678c1843fa1ed82e0532bdbc0_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181225/20181225141435_ff00dde678c1843fa1ed82e0532bdbc0_1_mwpm_03200403.jpg"},{"uniquekey":"04b7dd5d4d5b9debe152ad842c7ff469","title":"西延高铁获批：西安至延安仅需50分钟","date":"2018-12-25 14:14","category":"国内","author_name":"晨光旅游","url":"http://mini.eastday.com/mobile/181225141431953.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225141431_a91d44425e8afabc6f4568cad38b36bf_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181225/20181225141431_a91d44425e8afabc6f4568cad38b36bf_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181225/20181225141431_a91d44425e8afabc6f4568cad38b36bf_1_mwpm_03200403.jpg"},{"uniquekey":"2bc396b5855fc51a59661290aed4e2e6","title":"临翔区开展\u201c讲实话说变化感党恩谋幸福\u201d主题教育实践活动","date":"2018-12-25 14:12","category":"国内","author_name":"微播临翔","url":"http://mini.eastday.com/mobile/181225141258978.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225141258_39fc587a4b602c590e5b122709f864b9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225141258_39fc587a4b602c590e5b122709f864b9_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181225/20181225141258_39fc587a4b602c590e5b122709f864b9_1_mwpm_03200403.jpg"},{"uniquekey":"5e965b74020f3284d5e3ae960800038a","title":"大丰传媒与保利剧院共同经营余杭大剧院","date":"2018-12-25 14:12","category":"国内","author_name":"证券日报","url":"http://mini.eastday.com/mobile/181225141232939.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225141232_f6b1910bc616ea93f6ad6bb5a3c55487_1_mwpm_03200403.jpg"},{"uniquekey":"f2ca9c74524e5d8041c7312bfe18a2be","title":"哈尔滨新人承诺：婚礼不燃放烟花爆竹","date":"2018-12-25 14:12","category":"国内","author_name":"生活报","url":"http://mini.eastday.com/mobile/181225141217075.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181225/20181225141217_c2b413d741c0786000430bbdbaa8d6af_1_mwpm_03200403.jpg"},{"uniquekey":"69990aec1d895e56950e205a07c45fc6","title":"中国城市创新指标评价体系研讨会在南阳市召开","date":"2018-12-25 14:12","category":"国内","author_name":"TOM   ","url":"http://mini.eastday.com/mobile/181225141214159.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20181225/20181225141214_5ba1226758e0c25ca0c7525b568d0153_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20181225/20181225141214_5ba1226758e0c25ca0c7525b568d0153_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20181225/20181225141214_5ba1226758e0c25ca0c7525b568d0153_3_mwpm_03200403.jpg"},{"uniquekey":"0890834f46ce7c06bb0b81389a970e64","title":"安徽六安：\u201c小农水\u201d浇出幸福花","date":"2018-12-25 14:10","category":"国内","author_name":"中国水利报","url":"http://mini.eastday.com/mobile/181225141010252.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225141010_50c21e6711e2882ae55872eacc3a4b26_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225141010_50c21e6711e2882ae55872eacc3a4b26_1_mwpm_03200403.jpg"},{"uniquekey":"d12565ccb930ccb3d55ad054b37c9f07","title":"南京长江大桥即将恢复通车，你知道大桥与上海的关系吗？","date":"2018-12-25 14:09","category":"国内","author_name":"上观新闻","url":"http://mini.eastday.com/mobile/181225140936468.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225140936_2acefd5a7f44f29a8e310f9055e5aba1_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225140936_2acefd5a7f44f29a8e310f9055e5aba1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20181225/20181225140936_2acefd5a7f44f29a8e310f9055e5aba1_2_mwpm_03200403.jpg"},{"uniquekey":"ea5e68bf964aa56f9b94db5603747099","title":"徐景颜不再担任聊城市委书记 已任济南大学党委书记 ","date":"2018-12-25 14:06","category":"国内","author_name":"光明网","url":"http://mini.eastday.com/mobile/181225140619762.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225140619_e178ac8b92efb51b03f9fb13396e809c_1_mwpm_03200403.jpg"},{"uniquekey":"79b2734a0b1f95b04dc6bb2c2d8fe358","title":"近代桥梁建设完全依赖外国人？改变从钱塘江大桥开始","date":"2018-12-25 14:04","category":"国内","author_name":"解放网","url":"http://mini.eastday.com/mobile/181225140425228.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20181225/20181225140425_87e039a305e4d69d8d32789fad9f8098_1_mwpm_03200403.jpg"},{"uniquekey":"8c43e57c8ab5f88e1ba6654403c538ea","title":"武汉江汉区淮海路走一遭瞅见多处破烂脏","date":"2018-12-25 14:04","category":"国内","author_name":"渣心事","url":"http://mini.eastday.com/mobile/181225140419846.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225140419_ada889383bd72aea6d1522ce8618ff2a_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20181225/20181225140419_ada889383bd72aea6d1522ce8618ff2a_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20181225/20181225140419_ada889383bd72aea6d1522ce8618ff2a_8_mwpm_03200403.jpg"},{"uniquekey":"bc55aecf835ab5f8ce5ff1db8dcfcd1c","title":"到行政服务中心，21个交通类事项\u201c一次办成\u201d","date":"2018-12-25 14:02","category":"国内","author_name":"生活报","url":"http://mini.eastday.com/mobile/181225140202279.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181225/20181225140202_c2b056d79a1431719e537fe15f1ef6e7_1_mwpm_03200403.jpg"},{"uniquekey":"af10d2703e82cb4f56519c1511fdfa27","title":"12306准备放票 成雅铁路有望本周正式开通","date":"2018-12-25 14:02","category":"国内","author_name":"四川新闻网","url":"http://mini.eastday.com/mobile/181225140201011.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225140201_e5da18f78db1ba4ec6c91d8623f0cded_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181225/20181225140201_e5da18f78db1ba4ec6c91d8623f0cded_1_mwpm_03200403.jpg"},{"uniquekey":"e480f5b1bd167463a0cb763a2f3e7170","title":"杭黄高铁正式通车 最美高铁穿越 7 个 5A 级景区","date":"2018-12-25 14:02","category":"国内","author_name":"中国青年网","url":"http://mini.eastday.com/mobile/181225140200044.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225140200_7855208a0ab6e5be8f67d5472ec3363f_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20181225/20181225140200_7855208a0ab6e5be8f67d5472ec3363f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20181225/20181225140200_7855208a0ab6e5be8f67d5472ec3363f_5_mwpm_03200403.jpg"},{"uniquekey":"40cc68ba6cbfbec74c0a660cd445d2d0","title":"北京市教委主任刘宇辉会见黑山下格理查大学代表团","date":"2018-12-25 14:01","category":"国内","author_name":"黔讯网","url":"http://mini.eastday.com/mobile/181225140147141.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20181225/20181225140147_e83757570fea8e24a779eb8265238eac_1_mwpm_03200403.jpg"},{"uniquekey":"2ae9734fcab570c238e90c6803d3ab30","title":"醴陵：法治+扶贫为贫困户撑起阳光保护伞","date":"2018-12-25 14:01","category":"国内","author_name":"红网","url":"http://mini.eastday.com/mobile/181225140132988.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225140132_a706434b53200973277ebb10160f0027_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181225/20181225140132_a706434b53200973277ebb10160f0027_2_mwpm_03200403.jpg"},{"uniquekey":"f78de6d6f2b4ef3b92a02442237113d5","title":"碧岭｜品圣诞文化，平安相祝福，圣诞贺卡亲子制作","date":"2018-12-25 13:59","category":"国内","author_name":"坪山微报","url":"http://mini.eastday.com/mobile/181225135952769.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20181225/20181225135952_3998dba56e11d2d1f0fb74490ac95161_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20181225/20181225135952_3998dba56e11d2d1f0fb74490ac95161_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20181225/20181225135952_3998dba56e11d2d1f0fb74490ac95161_1_mwpm_03200403.jpg"},{"uniquekey":"fe586d87e8c6e426c7cc733396eba78b","title":"展现古城文化底蕴 弘扬徐派园林特色","date":"2018-12-25 13:58","category":"国内","author_name":"中国徐州网-徐州日报","url":"http://mini.eastday.com/mobile/181225135843824.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181225/20181225135843_76e844a939c6132d795081d5432986da_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20181225/20181225135843_76e844a939c6132d795081d5432986da_1_mwpm_03200403.jpg"},{"uniquekey":"7a6b368df6f32fd6eddb04c290ca1030","title":"静安区第二十五届\u201c蓝天下的至爱\u201d系列慈善活动启动","date":"2018-12-25 13:58","category":"国内","author_name":"静安报","url":"http://mini.eastday.com/mobile/181225135823050.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225135823_542619de33cca445fc3c70bdf6bac910_1_mwpm_03200403.jpg"},{"uniquekey":"f50e5c5140d4d3cf6069014a9fc579d2","title":"静安2500余青少年放下书包享受运动乐趣","date":"2018-12-25 13:58","category":"国内","author_name":"静安报","url":"http://mini.eastday.com/mobile/181225135801626.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225135801_6f7bedf884be38447f7d9e4c7de34ae9_1_mwpm_03200403.jpg"},{"uniquekey":"9b403eee512c17a6c49679527dc05437","title":"静安门彭浦举行\u201c上海也有我的家\u201d二十周年故事分享会","date":"2018-12-25 13:57","category":"国内","author_name":"静安报","url":"http://mini.eastday.com/mobile/181225135757211.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225135757_d61c56cccd6bd3561ef842a2529b37e8_1_mwpm_03200403.jpg"},{"uniquekey":"acb92a7f2cb0c49ba9cd4074fa77fdc0","title":"义乌改革开放40年②｜浙江第一强县仍需改革开放这关键一招","date":"2018-12-25 13:57","category":"国内","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/181225135703312.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20181225/20181225135703_7d6a53edc56a11b78c4c776990144431_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20181225/20181225135703_7d6a53edc56a11b78c4c776990144431_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20181225/20181225135703_7d6a53edc56a11b78c4c776990144431_4_mwpm_03200403.jpg"},{"uniquekey":"67c828e5dea23385dd8a517826b13c73","title":"甘肃扶贫路径：由\u201c大水漫灌\u201d到\u201c精准滴灌\u201d ","date":"2018-12-25 13:55","category":"国内","author_name":"光明网","url":"http://mini.eastday.com/mobile/181225135558076.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20181225/20181225135558_ad29d9bf531f5b840d86caa79c2b4960_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20181225/20181225135558_ad29d9bf531f5b840d86caa79c2b4960_2_mwpm_03200403.jpg"},{"uniquekey":"f72effa33f44b2a604fb337590a0a975","title":"赣深铁路高车隧道胜利贯通","date":"2018-12-25 13:52","category":"国内","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181225135200563.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20181225/20181225135200_eb75be5b6596a5b48a271183c171018a_1_mwpm_03200403.jpg"},{"uniquekey":"33c06fc06b93a8abe4ead1acebe93313","title":"昌景黄高速铁路江西段开工建设 计划工期4年","date":"2018-12-25 13:51","category":"国内","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/181225135159507.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20181225/20181225135159_a50191122fd3ce282191ef14a409861c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20181225/20181225135159_a50191122fd3ce282191ef14a409861c_2_mwpm_03200403.jpg"},{"uniquekey":"a3b0ff7c1d58dc87668b43f35b15d7bb","title":"政协沈阳市皇姑区第十五届委员会第二次会议开幕","date":"2018-12-25 13:51","category":"国内","author_name":"沈阳网","url":"http://mini.eastday.com/mobile/181225135139695.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20181225/20181225135139_265233cce7aace68ead0bd016b5f5b8d_1_mwpm_03200403.jpg"},{"uniquekey":"e0fbfa02d956c0edfcca645a9c717b97","title":"沈阳市举办首届环保知识进校园活动","date":"2018-12-25 13:51","category":"国内","author_name":"沈阳网","url":"http://mini.eastday.com/mobile/181225135131442.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20181225/20181225135131_315bc8ed498aa5c2301ba9f51255161f_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20181225/20181225135131_315bc8ed498aa5c2301ba9f51255161f_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20181225/20181225135131_315bc8ed498aa5c2301ba9f51255161f_2_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataEntity> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataEntity> getData() {
            return data;
        }

        public void setData(List<DataEntity> data) {
            this.data = data;
        }

        public static class DataEntity {
            /**
             * uniquekey : c67f2972babe88c90a7429d7dbb97f9a
             * title : 红星美羚被评为陕西省优秀民营企业
             * date : 2018-12-25 14:15
             * category : 国内
             * author_name : 国际在线
             * url : http://mini.eastday.com/mobile/181225141542697.html
             * thumbnail_pic_s : http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://00imgmini.eastday.com/mobile/20181225/20181225141542_a03fcf38e53c64fdbf3222c9962793a4_3_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
