package leetcode;

public class LC0838_Push_Dominoes {
    public String pushDominoes(String dominoes) {
        int i = 0;
        int length = dominoes.length();
        StringBuilder sb = new StringBuilder(dominoes);

        while (i < length) {
            char ch = sb.charAt(i);
            if (ch == '.') {
                i++;
                continue;
            }

            if (ch == 'L') {
                int temp = i;
                temp--;
                while (temp >= 0 && sb.charAt(temp) == '.') {
                    sb.setCharAt(temp, 'L');
                    temp--;
                }
                i++;
                continue;
            }

            if (ch == 'R') {
                int temp = i;
                temp++;
                int count = 0;
                while (temp < length && sb.charAt(temp) == '.') {
                    temp++;
                    count++;
                }

                // System.out.println("count = " + count);

                if (temp < length && sb.charAt(temp) == 'R') {
                    // System.out.println("1");
                    for (int j = i; j < temp; j++) {
                        sb.setCharAt(j, 'R');
                    }
                } else if (temp < length && sb.charAt(temp) == 'L') {
                    // System.out.println("2");
                    if (count % 2 == 0) {
                        for (int j = i + 1; j <= i + count / 2; j++) {
                            sb.setCharAt(j, 'R');
                        }

                        for (int j = i + count / 2 + 1; j < temp; j++) {
                            sb.setCharAt(j, 'L');
                        }

                    } else if (count != 1) {
                        for (int j = i + 1; j <= i + count / 2; j++) {
                            sb.setCharAt(j, 'R');
                        }

                        for (int j = i + count / 2 + 2; j < temp; j++) {
                            sb.setCharAt(j, 'L');
                        }
                    }
                    count++;
                } else {
                    for (int j = i + 1; j <= i + count; j++) {
                        sb.setCharAt(j, 'R');
                    }
                }
                // System.out.println("3 : " + sb.toString());

                i+=count;
                i++;

                // System.out.println("4 : " + i);
            }

        }

        // System.out.println(sb);
        // return "LL.RR.LLRRLL..";
        return sb.toString();
    }
}
