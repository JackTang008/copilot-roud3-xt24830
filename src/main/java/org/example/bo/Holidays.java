package org.example.bo;

import java.util.List;


public class Holidays {
    private List<Holiday> holidayList;

    public List<Holiday> getHolidayList() {
        return holidayList;
    }

    public void setHolidayList(List<Holiday> holidayList) {
        this.holidayList = holidayList;
    }

    public Holidays(List<Holiday> holidayList) {
        this.holidayList = holidayList;
    }

    public Holidays() {
    }

    //生成一个内部类，包含属性国家代码，国家描述，节假日日期，节假日描述
    public static class Holiday {
        private String index;
        private String countryCode;
        private String countryDesc;
        private String holidayDate;
        private String holidayName;

        public Holiday() {
        }

        public Holiday(String index, String countryCode, String countryDesc, String holidayDate, String holidayName) {
            this.index = index;
            this.countryCode = countryCode;
            this.countryDesc = countryDesc;
            this.holidayDate = holidayDate;
            this.holidayName = holidayName;
        }

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        //生成get和set方法
        public String getCountryCode() {
            return countryCode;
        }

        public String getCountryDesc() {
            return countryDesc;
        }

        public String getHolidayDate() {
            return holidayDate;
        }

        public String getHolidayName() {
            return holidayName;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public void setCountryDesc(String countryDesc) {
            this.countryDesc = countryDesc;
        }

        public void setHolidayDate(String holidayDate) {
            this.holidayDate = holidayDate;
        }

        public void setHolidayName(String holidayName) {
            this.holidayName = holidayName;
        }

    }


}
