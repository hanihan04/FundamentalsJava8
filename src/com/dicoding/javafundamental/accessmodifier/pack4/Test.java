package com.dicoding.javafundamental.accessmodifier.pack4;

import java.io.Serializable;

class Test implements Serializable {

    // Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;

    // Variabel ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;

}
