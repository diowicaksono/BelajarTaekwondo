package com.dwiaryantodiowicaksono_3145161971_mobcom.ytapps;

import java.util.ArrayList;

public class KyourugiKickData {

    private static String[] kyourugiKickNames = {
            "Dollyo Chagi",
            "Narae Chagi",
            "Dolke Chagi",
            "Bal Chagi",
            "Ap Chagi",
            "Yap Chagi",
            "Dwi Hurigi",
            "Dwi Chagi",
            "Eolgol Makki",
            "Jireugi"
    };

    private static String[] kyourugiKickDetails = {
            "Tendangan Menggunakan Punggung Kaki",
            "Tendangan ganda",
            "Tendangan Tornado",
            "Tendangan Mencangkul ke arah Kepala",
            "Tendangan depan menggunakan kaki depan",
            "Tendangan samping menggunakan pisau kaki",
            "Tendangan berputar menampar dengan kaki belakang.",
            "Tendangan berputar mendorong dengan kaki belakang",
            "Tangkisan ke arah kepala",
            "Pukulan"
    };

    private static int[] kyourugiKickThumbnnailsImages = {
            R.drawable.person_practicing_kickboxing,
            R.drawable.person_practicing_kickboxing,
            R.drawable.person_practicing_kickboxing,
            R.drawable.person_practicing_kickboxing,
            R.drawable.person_practicing_kickboxing,
            R.drawable.person_practicing_kickboxing,
            R.drawable.person_practicing_kickboxing,
            R.drawable.person_practicing_kickboxing,
            R.drawable.boxing_silhouette,
            R.drawable.boxing_silhouette
    };

    private static int[] kyourugiKickPosterImages = {
            R.drawable.dolyo,
            R.drawable.narae_chagi,
            R.drawable.dolke_chagi,
            R.drawable.bal_chagi,
            R.drawable.ap_chagi,
            R.drawable.yap_chagi,
            R.drawable.dwi_hurigi,
            R.drawable.dwi_chagi,
            R.drawable.eolgol_makki,
            R.drawable.jireugi
    };

    static ArrayList<KyourugiKick> getListData(){
        ArrayList<KyourugiKick> list = new ArrayList<>();
        for(int position = 0; position < kyourugiKickNames.length; position++){
            KyourugiKick kyourugiKick = new KyourugiKick();
            kyourugiKick.setName(kyourugiKickNames[position]);
            kyourugiKick.setDetail(kyourugiKickDetails[position]);
            kyourugiKick.setPhotoThumbnail(kyourugiKickThumbnnailsImages[position]);
            kyourugiKick.setPhotoPoster(kyourugiKickPosterImages[position]);
            list.add(kyourugiKick);
        }
        return list;
    }
}
