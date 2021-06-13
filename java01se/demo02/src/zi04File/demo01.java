package zi04File;

import java.io.File;

/*pathSeparator:与系统有关的路径分隔符，为了方便，它被表示为一个字符串
pathSeparatorChar:与系统有关的路径分隔符。
Separator:与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
separatorChar:与系统有关的默认名称分隔符*/
public class demo01 {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//;  linus :
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);//;
        String separator = File.separator;
        System.out.println(separator);//\
        char separatorChar = File.separatorChar;
        System.out.println(separator);//\   linus /(正斜杠)
        //可以使用跨平台
    }
}
