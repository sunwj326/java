package com.mashibing.streamtype;

import java.io.*;

/**
 * @author: 马士兵教育
 * @create: 2019-09-22 21:27
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) {

        File file = new File("abc.txt");
        FileInputStream fileInputStream = null;
//        BufferedInputStream bufferedInputStream = null;
        BufferedReader bufferedReader = null;
        try {
             fileInputStream = new FileInputStream(file);
//             bufferedInputStream = new BufferedInputStream(fileInputStream);
             bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            int read = 0;
            while((read = bufferedReader.read())!=-1){
//                bufferedReader.skip(2);
                System.out.print((char)read);
            }
                    ;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            try {
//                bufferedInputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
