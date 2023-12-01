package Q2;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // can omit second stating of list type (new ArrayList<>();)
        // ArrayList<WrapperType>

        for (int lcv = 0; lcv < 100; lcv++) {
            int rand = (int)(Math.random() * 100) + 1; // + 1 for 1 inclusive
            list.add(rand);
        }

        for (int lcv = 0; lcv < list.size(); lcv += 2) {
            System.out.print(list.get(lcv) + " "); }
        System.out.println();

        System.out.println("Does list contain 50? " + list.contains(50));
        System.out.println("Index of 50: " + list.indexOf(50));

        list.add(2, 999);
        list.set(0, 123);

        for (int num : list) {
            System.out.println(num);
        }

    }
}
/*
10 1 92 72 15 95 24 92 96 68 72 25 12 57 59 24 60 58 64 77 76 74 86 41 49 32 51 30 90 54 89 85 37 23 6 47 85 87 32 10 60 92 91 56 4 32 55 63 14 58
Does list contain 50? false
Index of 50: -1
123
44
999
1
24
92
93
72
16
15
61
95
46
24
90
92
31
96
83
68
7
72
12
25
43
12
8
57
94
59
63
24
95
60
5
58
71
64
77
77
80
76
92
74
18
86
36
41
65
49
13
32
45
51
30
30
48
90
82
54
65
89
57
85
45
37
91
23
20
6
58
47
2
85
75
87
71
32
3
10
81
60
86
92
5
91
98
56
55
4
44
32
25
55
68
63
11
14
33
58
9
 */