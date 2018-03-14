package java.com.demo.spring.bo;

/**
 * Created by bqhuy on 3/14/2018.
 */
public class Meter {
    private String meterCode;
    private String meterName;
    private String meterType;
    private Integer numberOfWheel;

    public String getMeterCode() {
        return meterCode;
    }

    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

    public Integer getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(Integer numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }
}
