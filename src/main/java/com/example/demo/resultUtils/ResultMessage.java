package com.example.demo.resultUtils;

/**
 * 创建人:连磊
 * 日期: 2018/5/16. 17:20
 * 描述：
 */
public class ResultMessage<T>  {

    public String resultMes;

    private Integer resultCode = 0;

    private Object resultData;

    public ResultMessage() {
    }

    public final static ResultMessage getNew(){
        ResultMessage resultMessage = new ResultMessage();
        return resultMessage;
    }

    public ResultMessage setMes(String message){
        this.resultMes = message;
        return this;
    }

    public ResultMessage setData(Object resultData){
        this.resultData = resultData;
        return this;
    }

    public ResultMessage setCode(Integer resultCode){
        this.resultCode = resultCode;
        return this;
    }

    public ResultMessage(String resultMes, Integer resultCode, Object resultData) {
        this.resultMes = resultMes;
        this.resultCode = resultCode;
        this.resultData = resultData;
    }

    public String getResultMes() {
        return resultMes;
    }

    public void setResultMes(String resultMes) {
        this.resultMes = resultMes;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "ResultMessage{" +
                "resultMes='" + this.resultCode + '\'' +
                ", resultCode=" + resultCode +
                ", resultData=" + resultData +
                '}';
    }
}
