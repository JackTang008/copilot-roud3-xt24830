package org.example.service;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.example.bo.Holidays;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class DemoService {
    private final ConcurrentHashMap<String,Holidays.Holiday> concurrentHashMap = new ConcurrentHashMap<>();
    @PostConstruct
    public void init(){
        Holidays.Holiday holiday1 = new Holidays.Holiday("US2023-04-15", "US", "UNITED STATES", "2023-4-15", "Good Friday");
        Holidays.Holiday holiday2 = new Holidays.Holiday("GB2023-04-15", "GB", "UNITED KINGDOM", "2023-4-15", "Good Friday");
        Holidays.Holiday holiday3 = new Holidays.Holiday("US2023-12-25", "US", "UNITED STATES", "2023-12-25", "Christmas Day");
        Holidays.Holiday holiday4 = new Holidays.Holiday("GB2023-12-25", "GB", "UNITED KINGDOM", "2023/12/25", "Christmas Day");
        Holidays.Holiday holiday5 = new Holidays.Holiday("CN2020-01-01", "CN", "China", "2020-01-01", "New Year's Day");
        Holidays.Holiday holiday6 = new Holidays.Holiday("CN2020-01-24", "CN", "China", "2020-01-24", "Chinese New Year's Eve");
        Holidays.Holiday holiday7 = new Holidays.Holiday("CN2020-01-25", "CN", "China", "2020-01-25", "Chinese New Year");
        Holidays.Holiday holiday8 = new Holidays.Holiday("CN2020-01-26", "CN", "China", "2020-01-26", "Chinese New Year");
        Holidays.Holiday holiday9 = new Holidays.Holiday("CN2020-01-27", "CN", "China", "2020-01-27", "Chinese New Year");
        Holidays.Holiday holiday10 = new Holidays.Holiday("CN2020-01-28", "CN", "China", "2020-01-28", "Chinese New Year");
        Holidays.Holiday holiday11 = new Holidays.Holiday("CN2020-01-29", "CN", "China", "2020-01-29", "Chinese New Year");
        Holidays.Holiday holiday12 = new Holidays.Holiday("CN2020-01-30", "CN", "China", "2020-01-30", "Chinese New Year");
        Holidays.Holiday holiday13 = new Holidays.Holiday("CN2020-06-25", "CN", "China", "2020-06-25", "Duanwu Festival");
        Holidays.Holiday holiday14 = new Holidays.Holiday("CN2020-06-26", "CN", "China", "2020-06-26", "Duanwu Festival");
        Holidays.Holiday holiday15 = new Holidays.Holiday("CN2020-06-27", "CN", "China", "2020-06-27", "Duanwu Festival");
        Holidays.Holiday holiday16 = new Holidays.Holiday("CN2020-10-01", "CN", "China", "2020-10-01", "National Day");
        Holidays.Holiday holiday17 = new Holidays.Holiday("CN2020-10-02", "CN", "China", "2020-10-02", "National Day");
        Holidays.Holiday holiday18 = new Holidays.Holiday("CN2020-10-03", "CN", "China", "2020-10-03", "National Day");
        Holidays.Holiday holiday19 = new Holidays.Holiday("CN2020-10-04", "CN", "China", "2020-10-04", "National Day");
        Holidays.Holiday holiday20 = new Holidays.Holiday("CN2020-10-05", "CN", "China", "2020-10-05", "National Day");
        Holidays.Holiday holiday21 = new Holidays.Holiday("CN2020-10-06", "CN", "China", "2020-10-06", "National Day");
        Holidays.Holiday holiday22 = new Holidays.Holiday("CN2020-10-07", "CN", "China", "2020-10-07", "National Day");
        concurrentHashMap.put(holiday1.getIndex(),holiday1);
        concurrentHashMap.put(holiday2.getIndex(),holiday2);
        concurrentHashMap.put(holiday3.getIndex(),holiday3);
        concurrentHashMap.put(holiday4.getIndex(),holiday4);
        concurrentHashMap.put(holiday5.getIndex(),holiday5);
        concurrentHashMap.put(holiday6.getIndex(),holiday6);
        concurrentHashMap.put(holiday7.getIndex(),holiday7);
        concurrentHashMap.put(holiday8.getIndex(),holiday8);
        concurrentHashMap.put(holiday9.getIndex(),holiday9);
        concurrentHashMap.put(holiday10.getIndex(),holiday10);
        concurrentHashMap.put(holiday11.getIndex(),holiday11);
        concurrentHashMap.put(holiday12.getIndex(),holiday12);
        concurrentHashMap.put(holiday13.getIndex(),holiday13);
        concurrentHashMap.put(holiday14.getIndex(),holiday14);
        concurrentHashMap.put(holiday15.getIndex(),holiday15);
        concurrentHashMap.put(holiday16.getIndex(),holiday16);
        concurrentHashMap.put(holiday17.getIndex(),holiday17);
        concurrentHashMap.put(holiday18.getIndex(),holiday18);
        concurrentHashMap.put(holiday19.getIndex(),holiday19);
        concurrentHashMap.put(holiday20.getIndex(),holiday20);
        concurrentHashMap.put(holiday21.getIndex(),holiday21);
        concurrentHashMap.put(holiday22.getIndex(),holiday22);
    }
    public String createHolidays(Holidays holidays) {
    //生成一个csv文件，至少包含20行数据，包含至少10个国家，数据列包括国家代码，国家描述，节假日日期，节假日描述
    //生成的文件放到项目中的resources目录下
    //文件名为holidays.csv
    //文件编码为UTF-8
    //文件格式为csv格式
    //文件包含表头
    //文件内容为假数据，可以使用excel或者其他工具生成
    //文件内容示例如下：
    //Country Code,Country Description,Holiday Date,Holiday Name
    //CN,China,2020-01-01,New Year's Day
    //CN,China,2020-01-24,Chinese New Year's Eve
    //CN,China,2020-01-25,Chinese New Year
    //CN,China,2020-01-26,Chinese New Year
    //CN,China,2020-01-27,Chinese New Year
    //CN,China,2020-01-28,Chinese New Year
    //CN,China,2020-01-29,Chinese New Year
    //CN,China,2020-01-30,Chinese New Year
    //CN,China,2020-04-04,Tomb Sweeping Day
    //CN,China,2020-05-01,Labour Day
    //CN,China,2020-06-25,Duanwu Festival
    //CN,China,2020-06-26,Duanwu Festival
    //CN,China,2020-06-27,Duanwu Festival
    //CN,China,2020-10-01,National Day
    //CN,China,2020-10-02,National Day
    //CN,China,2020-10-03,National Day
    //CN,China,2020-10-04,National Day
    //CN,China,2020-10-05,National Day
    //CN,China,2020-10-06,National Day
    //CN,China,2020-10-07,National Day

    //生成一个写入数据到csv文件的方法，参数有两个，一个为写入目标文件的路径，一个为写入的内容
        List<Holidays.Holiday> holidayList = holidays.getHolidayList();
        List<String> dataList = new ArrayList<>();
        for (Holidays.Holiday holiday : holidayList) {
            if(concurrentHashMap.containsKey(holiday.getIndex())){
                return "invalid country holiday, already exist ";
            }
            concurrentHashMap.put(holiday.getIndex(),holiday);
        }

        for (Map.Entry<String, Holidays.Holiday> stringHolidayEntry : concurrentHashMap.entrySet()) {
            Holidays.Holiday holiday = stringHolidayEntry.getValue();
            String init = "";
            init += holiday.getCountryCode()+holiday.getHolidayDate()+",";
            init += holiday.getCountryCode()+",";
            init += holiday.getCountryDesc()+",";
            init += holiday.getHolidayDate()+",";
            init += holiday.getHolidayName();
            dataList.add(init);
        }

        writeDataListToCsv("Index,CountryCode,CountryDesc,HolidayDate,HolidayName",dataList,"D:\\txx-workSpace\\copilot-roud3-xt24830\\src\\main\\resources\\holiday.csv",false);
        return "Success";
    }
    public void writeDataListToCsv(String head, List<String> dataList, String csvFilePath, boolean append) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(csvFilePath, append);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
            if (StringUtils.isNotBlank(head)) {
                bufferedWriter.write(head);
                bufferedWriter.newLine();
            }
            for (String rowStr : dataList) {
                if (StringUtils.isNotBlank(rowStr)) {
                    bufferedWriter.write(rowStr);
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String updateHolidays(Holidays holidays) {

// todo choose update key
        return null;
    }

    public String removeHolidays(Holidays holidays) {
        List<Holidays.Holiday> holidayList = holidays.getHolidayList();

        List<String> dataList = new ArrayList<>();
        for (Holidays.Holiday holiday : holidayList) {
                concurrentHashMap.remove(holiday.getIndex());
        }

        for (Map.Entry<String, Holidays.Holiday> stringHolidayEntry : concurrentHashMap.entrySet()) {
            Holidays.Holiday holiday = stringHolidayEntry.getValue();
            String init = "";
            init += holiday.getCountryCode()+holiday.getHolidayDate()+",";
            init += holiday.getCountryCode()+",";
            init += holiday.getCountryDesc()+",";
            init += holiday.getHolidayDate()+",";
            init += holiday.getHolidayName();
            dataList.add(init);
        }

        writeDataListToCsv("Index,CountryCode,CountryDesc,HolidayDate,HolidayName",dataList,"D:\\txx-workSpace\\copilot-roud3-xt24830\\src\\main\\resources\\holiday.csv",false);
        return null;
    }

    public String queryNextYearHolidays(String countryCode) {
        ArrayList<Holidays.Holiday> holidays = null;
        try {
            holidays = new ArrayList<>();

            for (Map.Entry<String, Holidays.Holiday> stringHolidayEntry : concurrentHashMap.entrySet()) {
                Holidays.Holiday holiday = stringHolidayEntry.getValue();

                LocalDateTime parse = LocalDateTime.parse(holiday.getHolidayDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                int year = parse.getYear();
                if(holiday.getCountryCode().equals(countryCode) &&  year  == LocalDateTime.now().getYear() + 1){
                    holidays.add(holiday);
                }
            }
        } catch (Exception e) {
//            throw new RuntimeException(e);
        }
        return JSON.toJSONString(holidays);
    }

    public String queryNextHolidays(String countryCode) {
        ArrayList<Holidays.Holiday> holidays = new ArrayList<>();
        for (Map.Entry<String, Holidays.Holiday> stringHolidayEntry : concurrentHashMap.entrySet()) {
            Holidays.Holiday holiday = stringHolidayEntry.getValue();

            if(holiday.getCountryCode().equals(countryCode)){
                holidays.add(holiday);
            }
        }

        return null;
    }

    public String queryHolidaysCountry(String date) {
        if (StringUtils.isEmpty(date)){
            return "empty holiday date";
        }
        HashSet<String> strings1 = new HashSet<>();
        HashSet<String> strings2 = new HashSet<>();
        for (Map.Entry<String, Holidays.Holiday> stringHolidayEntry : concurrentHashMap.entrySet()) {
            Holidays.Holiday holiday = stringHolidayEntry.getValue();
            if (holiday.getHolidayDate().equals(date)){
                strings1.add(holiday.getCountryCode());
            }else {
                strings2.add(holiday.getCountryCode());
            }
        }
        return "holiday country is " + JSON.toJSONString(strings1)  + "\n not holiday country is" + JSON.toJSONString(strings2);
    }
}
