package com.ar15.akmalapps;

/** NIM   : 10119230
 * Nama   : Akmal Rizqulloh
 * Kelas  : IF-6
 * Tanggal Pengerjaan : 16-05-2022
 */

public class activity_page {

    private String name_21;
    private int img;

    public activity_page() {
    }

    public activity_page(String name_21, int img) {
        this.name_21 = name_21;
        this.img = img;
    }

    //Get
    public String getname_21() {
        return name_21;
    }
    public int getImg() {
        return img;
    }

    //Set
    public void setname_21(String name_21) {
        this.name_21 = name_21;
    }
    public void setImg(int img) {
        this.img = img;
    }
}