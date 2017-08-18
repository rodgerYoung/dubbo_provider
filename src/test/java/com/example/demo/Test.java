package com.example.demo;

//import redis.clients.jedis.Jedis;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static int[] maopaoSort(int[] array){
        for (int i=0;i<array.length-1;i++ ){
           for (int j=0;j<array.length-i-1;j++){
               int temp;
               if (array[j]>array[j+1]){
                   temp=array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }
           }
        }
        return array;
    }
    static class User{
        String username;
        String password;
        int core;

        public int getCore() {
            return core;
        }

        public void setCore(int core) {
            this.core = core;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", core=" + core +
                    '}';
        }
    }
    public static void BubbleSort(int[] arr) {
        int temp;//定义一个临时变量
        for(int i=0;i<arr.length-1;i++){//冒泡趟数
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        List<User> users=new ArrayList<>();
//        for (int i=0;i<100;i++){
//            User user=new User();
//            user.setUsername("admin"+i);
//            user.setPassword("pass"+i);
//            user.setCore(new Random().nextInt(100));
//            users.add(user);
//        }
//        int[] array={2,34,33,43,22,33,2,1};
//        System.err.println(Arrays.toString(maopaoSort(array)));
//        Jedis jedis = new Jedis("127.0.0.1");
//        System.out.println("连接成功");
//        System.err.println(jedis.get("runoobkey"));
//        jedis.set("runoobkey", "www.runoob.com2222");
//
//        System.err.println(jedis.get("runoobkey"));
//        //查看服务是否运行
//        System.out.println("服务正在运行: "+jedis.ping());

    }
}
