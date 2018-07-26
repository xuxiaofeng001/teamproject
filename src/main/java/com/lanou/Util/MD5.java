package com.lanou.Util;

public class MD5 {
    // 如何用最快的方式实现 5*8
    // main函数 psvm
    public static void main(String[] args) {
        // << 表示二进制位往左移动三维 后面的3表示是几次方
        System.out.println(5 << 3);
        // 表示8进制 以0开头
        System.out.println(0123);
        // 表示16进制 以0x开头
        System.out.println(0x123);
        // &运算写成二进制之后 按位 对两个 作&运算（都为1 返回1 否则返回0）
        // 5 & 3 ==》 0101 & 0011 = 0001
        // |运算写成二进制之后 按位 对两个 作&运算（都为0 返回0 否则返回1）
        // 5 | 3 ==》 0101 & 0011 = 0111
        System.out.println(5 & 3);

        // 8进制的数 转换 成16进制
        // 012 =》0xA
        // 0xcafe =》12，10，15，14
        // 014121716

        // 加密算法
        // abcdefg ==> 1234567可逆
        // MD5 不可逆
    }
}
