/**
 * 输出A\B\C\D..Z
 */
public class Array {
    public static void main(String[] args){
        char[] s;
        s = new char[26];
        for (int i = 0;i<26;i++){
            s[i] = (char)('A'+i);
            System.out.println(s[i]);
        }
    }
}
/**
 *定义一个长度为10的一维字符串数组，在每一个元素存放一个单词；然后运行时从命令行输入一个单词，程序判断数组是否包含这个单词
 * 包含打印yes，不包含就打印出no
 */
class ArrayWord{
    public static void main(String[] args){
        String[] arr = {"hello","world","my","name","is","a","little","cat","lonely","ca"};
        System.out.println(isFind(arr,"m")?"Yes":"No");
    }
    public static boolean isFind(String[] arr,String word){
        boolean isFlag = false;
        for(int i = 0;i<arr.length;i++){
            if (word.equals(arr[i])){
                isFlag = true;
                break;
            }
        }
        return isFlag;
    }
}