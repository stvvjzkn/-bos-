package com.huminyao.test;

class Top  {
      static int x=1;
                public Top (int y) {
        x*=3;
    }

    public Top() {

    }
}
     class Middle extends Top {
        public Middle() {
            x+=1;  }
          public  static void main(String[] args){
              Middle m = new Middle();
             System. out .println (x);
           }
          }
