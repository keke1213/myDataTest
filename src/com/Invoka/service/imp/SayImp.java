package com.Invoka.service.imp;

import com.Invoka.service.Say;

public class SayImp implements Say {
    @Override
    public int SayHi(String say) {
        System.out.println(say);return 1;
    }

    @Override
    public void SayBye(String name, String bye) {
        System.out.println(name+":"+bye);
    }
}
