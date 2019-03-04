package com.yinbao.www.myapplication.bean;

import java.util.List;

/**
 * 创建时间:2018/12/22
 * 编写人:guobin
 * 包名路径:com.yinbao.www.myapplication.bean
 * 功能描述:
 */
public class JokeBean {

    /**
     * reason : Success
     * result : {"data":[{"content":"某先生是地方上的要人。一天，他像往常一样在书房里例览当日报纸，突然对妻子大声喊道：喂，安娜，你看到今天早报上的流言蜚语了吗？真可笑！他们说，你收拾行装出走了。你听见了吗？安娜、你在哪儿？安娜？啊！","hashId":"90B182FC7F74865B40B1E5807CFEBF41","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"有一天我看着报纸，小声嘟囔着一篇文章的题目鸟儿也有外语，丈夫听了对了一句：鸟儿当然也有\u2018外遇\u2019。原来丈夫听错了，我笑得前仰后合。","hashId":"206F5C52FD2ED94772CBC66C8AC61F2A","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"},{"content":"新提拔的经理觉得从员工中得到的尊重不够，于是一天戴上一枚自制的徽章，上面写着：\u201c我是头儿！\u201d然后在办公室神气地来回巡视。中午吃完饭后，经理回到办公室，看见桌上留着一张字条，上面写着：\u201c你的妻子打来电话，说让你记着下班后把徽章带回去，她要用。\u201d","hashId":"B36BF69DC3B622BD8A4F5A7740C31806","unixtime":1418745227,"updatetime":"2014-12-16 23:53:47"}]}
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
        private List<DataEntity> data;

        public List<DataEntity> getData() {
            return data;
        }

        public void setData(List<DataEntity> data) {
            this.data = data;
        }

        public static class DataEntity {
            /**
             * content : 某先生是地方上的要人。一天，他像往常一样在书房里例览当日报纸，突然对妻子大声喊道：喂，安娜，你看到今天早报上的流言蜚语了吗？真可笑！他们说，你收拾行装出走了。你听见了吗？安娜、你在哪儿？安娜？啊！
             * hashId : 90B182FC7F74865B40B1E5807CFEBF41
             * unixtime : 1418745227
             * updatetime : 2014-12-16 23:53:47
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
