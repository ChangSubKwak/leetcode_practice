package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC3484_Design_Spreadsheet {
    static class Spreadsheet {

        private Map<String, Integer> map;

        private static boolean isNumericRegex(String str) {
            if (str == null || str.isEmpty()) {
                return false;
            }
            return str.matches("\\d+(\\d+)?");
        }

        public Spreadsheet(int rows) {
            map = new HashMap<String, Integer>();
        }

        public void setCell(String cell, int value) {
            map.put(cell, value);
        }

        public void resetCell(String cell) {
            map.put(cell, 0);
        }

        public int getValue(String formula) {
            formula = formula.substring(1);
            String[] operands = formula.split("\\+");


            int result = 0;
            for (String operand : operands) {
                if (isNumericRegex(operand)) {
                    result += Integer.valueOf(operand);
                    continue;
                }

                result += Integer.valueOf(map.getOrDefault(operand, 0));
            }
            return result;
        }
    }
}
