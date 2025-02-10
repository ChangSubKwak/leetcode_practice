package util;

import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.fixed.FixedWidthFields;
import com.univocity.parsers.fixed.FixedWidthParser;
import com.univocity.parsers.fixed.FixedWidthParserSettings;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class UnivocityTest {
    public static void main(String[] args) {
        String fixedWidthData = "John      0025USA     \nAlice     0030Canada  ";

        // 고정 폭 필드 설정
        FixedWidthFields fields = new FixedWidthFields();
        fields.addField("name", 10);
        fields.addField("age", 4);
        fields.addField("country", 8);

        // Fixed width 설정
        FixedWidthParserSettings settings = new FixedWidthParserSettings(fields);
        settings.getFormat().setLineSeparator("\n");

        // 파서 생성
        FixedWidthParser parser = new FixedWidthParser(settings);

        // StringReader를 사용하여 문자열 데이터를 파싱
        List<Record> parsedRecords;
        try (StringReader reader = new StringReader(fixedWidthData)) {
            parsedRecords = parser.parseAllRecords(reader);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Record 리스트를 SampleFixedWidthRecord 리스트로 변환
        List<SampleFixedWidthRecord> records = new ArrayList<>();
        for (Record record : parsedRecords) {
            SampleFixedWidthRecord sampleRecord = new SampleFixedWidthRecord();
            sampleRecord.setName(record.getString("name").trim());
            sampleRecord.setAge(Integer.parseInt(record.getString("age").trim()));
            sampleRecord.setCountry(record.getString("country").trim());
            records.add(sampleRecord);
        }

        // 결과 출력
        for (SampleFixedWidthRecord record : records) {
            System.out.println(record);
        }
    }
}

