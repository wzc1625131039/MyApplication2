package com.example.zx.myapplication2;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.support.v7.widget.AppCompatButton;
public class MyButton extends AppCompatButton{
    public MyButton(Context context , AttributeSet set){
        super(context , set);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode , event);
        Log.v("-crazyit.org-" , "the onKeyDown in MyButton");
        //返回true，表明该事件不会向外扩散
        return true;
    }
}
