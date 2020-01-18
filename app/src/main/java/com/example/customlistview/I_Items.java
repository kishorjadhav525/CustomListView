package com.example.customlistview;

class I_Items {

    String Name;
    int image;

    public int getImage() {
        return image;
    }

    public I_Items(String name, int image) {
        Name = name;
        this.image = image;


    }

    public void setName(String name) {
        Name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return Name;
    }
}

