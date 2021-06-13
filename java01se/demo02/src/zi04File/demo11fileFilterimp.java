package zi04File;

import java.io.File;
import java.io.FileFilter;

//创建 过滤器Fileter的实现列 重写ACCPET
public class demo11fileFilterimp implements FileFilter {
    @Override
    public boolean accept(File pathname) {
//        return true;
        //修改规则
        if (pathname.isDirectory())
        {
            return true;
        }
        return pathname.getName().toLowerCase().endsWith("java");
    }
}
