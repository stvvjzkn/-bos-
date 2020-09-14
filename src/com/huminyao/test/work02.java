package com.huminyao.test;

public class work02 {
    public static void main(String[] args) {
        int i,j,count=0;
        boolean isflag=true;
        for ( i=2;i<1000;i++){
            for ( j=2;j<=Math.sqrt(i);j++){
                if (i%j==0) {
                    isflag=false;
                    break;
                }
            }
                if (isflag==true){
                    System.out.print("\t"+i);
                    count++;
                    if (count%8==0){
                        System.out.println();
                    }
                }
                isflag=true;
        }
                    System.out.println("geshu wei :"+count);
    }
}
