interface SomeTest<T> {
    boolean test(T n, T m);
}
isractor.test(10,3)
SomeTest <Double> isractorD = (n, d) -> (n%d)==0;
isractorD.test(10.0,3.3)
SomeTest <Double> isractor = (n, d) -> (n%d) == 0;
isractor.test(10.0,2.5)
SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
isIn.test("Незачет", "зачет")
isIn.test("зачет", "Незачет")
interface StringFunc {
    String Func(String str);
}
static String changeStr(StringFunc sf, String s) {
    return sf.func(s);
}
String inStr = "Исходная строка";
String outStr;
StringFunc reverse = (str) -> {
    String result = "";
    for(int i = str.length()-1; i>=0; i--)
    result += str.charAt(i);
    return result;
};
outStr = changeStr(reverse, inStr);
outStr = changeStr(reverse, "Вторая строка");
interface MyIQAction {
    boolean ioAction(Reader rdr) throws IOException;
}
MyIQAction myIQ = (rdr) -> {
    int ch = rdr.read();
    System.out.println("Введен символ: " + ch);
    return true;
};