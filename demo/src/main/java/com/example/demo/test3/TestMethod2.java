package com.example.demo.test3;

public class TestMethod2 {
    public static void main(String[] args) {
        H h = new H();
        h.a();
    }


}


class T {
    public void a(){
    }

    private void a2(){

    }
}

class H extends T {

    @Override
    public void a() {
        super.a();
    }
}