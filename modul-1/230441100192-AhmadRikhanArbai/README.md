## Pengenalan Class, Object, Attribute, dan Method

Catatan di dalam ini akan menjelaskan konsep dasar tentang apa itu Class, Object, Attribute, dan Method dalam pemrograman berorientasi objek, serta bagaimana mengimplementasikannya dalam sebuah repositori di GitHub.

### Class

Class adalah sebuah blueprint atau cetak biru yang mendefinisikan atribut (data) dan method (fungsi) untuk suatu object.

### Object
Object adalah instance yang dibuat dari class tertentu. Object memiliki atribut yang mendefinisikan keadaan atau karakteristiknya dan method yang mendefinisikan perilaku atau tindakannya.

### Attribute

Attribute adalah variabel yang didefinisikan dalam class dan mewakili keadaan atau karakteristik dari suatu object. Setiap object memiliki nilai yang berbeda untuk setiap atributnya.

### Method

Method adalah fungsi yang didefinisikan dalam class dan digunakan untuk melakukan tindakan atau operasi pada object. Method biasanya digunakan untuk memanipulasi atribut object atau mengembalikan nilai kalkulasi.

### Contoh Implementasi dalam Java

```java
public class Car {
    // Attributes
    String color;
    int speed;

    // Methods
    void accelerate() {
        speed += 10;
    }

    void brake() {
        speed -= 5;
    }
}
