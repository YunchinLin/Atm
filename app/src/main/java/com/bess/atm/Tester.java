package com.bess.atm;

import android.provider.ContactsContract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2018/1/2.
 */

public class Tester {
    public static void main(String[] args) {
        Date now = new Date();//取得當下時間
        System.out.println(now);
        System.out.println(now.getTime());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //規格:https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        System.out.println(sdf.format(now));
        //反過來,有字串,得Date物件?
        String s = "1997-12-31";
        try {
            Date birthday = sdf.parse(s);
            System.out.println(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
