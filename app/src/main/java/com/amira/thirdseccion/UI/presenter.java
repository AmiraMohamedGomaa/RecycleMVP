package com.amira.thirdseccion.UI;

import com.amira.thirdseccion.R;
import com.amira.thirdseccion.pojo.cat;

import java.util.ArrayList;

public class presenter {
    contract c;

    public presenter(contract c) {
        this.c = c;
    }

    public ArrayList<cat> getModelData(){
        ArrayList<cat>arrayList=new ArrayList<>(  );
        arrayList.add( new cat( " cat 1" , R.drawable.img_1) );
        arrayList.add( new cat( " cat 2" ,R.drawable.img_2) );
        arrayList.add( new cat( " cat 3" ,R.drawable.img_3) );
        arrayList.add( new cat( " cat 4" ,R.drawable.img_4) );
        arrayList.add( new cat( " cat 5" ,R.drawable.img_5) );
        arrayList.add( new cat( " cat 6" ,R.drawable.img_6) );

        return arrayList;
    }

    public void passDataToContract(){
        c.passData(getModelData());
    }
}
