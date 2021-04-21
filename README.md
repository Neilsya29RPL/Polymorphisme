# Polymorphisme

# Latihan 1
<img width="820" alt="Latihan 1" src="https://user-images.githubusercontent.com/68727623/115554910-2a869c80-a2d9-11eb-95c8-65746cc26979.png">
Pada gambar diatas dihasilkan run dari program latihan 1 yang didapatkan dengan cara memanggil method function(), fuel(), dan walk() di class AeroPlan. Sehingga hasil run yang keluar, tepat dan sesuai dengan ketetapan program yang telah dibuat.

# Latihan 2
<img width="819" alt="Latihan 2" src="https://user-images.githubusercontent.com/68727623/115556077-7259f380-a2da-11eb-8f37-2cac3b0fe238.png">
Pada hasil run latihan 2 terdapat panjang garis A dan garis B yang  diperoleh dengan cara memanggil method getLength() yang terdapat pada class Line. Pada hasil run tersebut menunjukkan bahwa garis A lebih kecil dari pada garis B (A < B) atau garis B lebih lebih besar dari pada garis A (B > A). Maka pernyataan-pernyataan tersebut bernilai TRUE jika memenuhi atau sesuai dengan panjang garis yang diperoleh dan bernilai FALSE jika pernyataan tersebut tidak memenuhi atau tidak sesuai. 

# Latihan 3
<img width="820" alt="Latihan 3" src="https://user-images.githubusercontent.com/68727623/115556414-db416b80-a2da-11eb-993e-053f4d7d6482.png">
Pada hasil run latihan 3 diatas terdapat keluaran jumlah gaji yang dibayarkan untuk Staf dan Direktur. Jumlah gaji staf diperoleh dari penambahan gajiStaf dan bonusStaf yang jika ditambah berjumlah 60000. Sedangkan Jumlah gaji Direktur diperoleh dari penambahan gajiDir dan tunjangan yang jika ditambah berjumlah 150000. Dengan memanggil method hitungGaji() dalam class PembayaranGaji maka akan menghasilkan Output yang sesuai seperti pada gambar ditas.

# Latihan 4
<img width="820" alt="Latihan 4" src="https://user-images.githubusercontent.com/68727623/115557384-dd57fa00-a2db-11eb-8d5a-96565114e63e.png">
Pada hasil run latihan 4 diatas, diperoleh warna dan hasil luas (area) bangun Rectangle dan Triangle yang telah ditetapkan dengan rumus-rumus yang ada pada method getArea(). Panjang sisi pada masing-masing bangun tersebut sesuai dengan settingan data (warna dan angka) yang telah dimasukkan kedalam method Rectangle dan Triangle yang terdapat pada class TestShape. Program tersebut melakukan proses perhitungan luas sesuai rumus, sehingga muncul hasil Output seperti pada gambar diatas.

# Tugas Praktikum
<img width="818" alt="Praktikum" src="https://user-images.githubusercontent.com/68727623/115557558-024c6d00-a2dc-11eb-9808-97d52cc8c40c.png">
Pada hasil run Tugas Praktikum diatas terdapat keluaran data yang sesuai dengan settingan program yang telah dibuat. Dengan memasukkan parameter (angka) di dalam method Rect() dan divariasi dengan memanggil method union(), intersection() yang didalamnya disertai parameter pada class TestRect, maka Output angka dan data akan tersusun tepat dan benar seperti pada gambar diatas.

# Tugas Tambahan
<img width="820" alt="Tugas Tambahan" src="https://user-images.githubusercontent.com/68727623/115557738-3758bf80-a2dc-11eb-81f6-5ae22e8362b3.png">
Pada hasil run Tugas Tambahan diatas menghasilkan beberapa operasi bilangan diantaranya operasi penjumlahan, operasi pengurangan, operasi perkalian, dan operasi pembagian. Dengan memasukkan parameter (angka) pada method set_A() dan set_B() maka program tersebut dapat melakukan proses operasi dan memperoleh hasil operasinya. Dengan memanggil method tampil(), maka akan menghasilkan Output seperti pada gambar diatas dengan tepat dan sesuai dengan program yang telah dibuat.

# Kesimpulan
Polymorphisme dalam OOP adalah sebuah prinsip di mana class dapat memiliki banyak “bentuk” method yang berbeda-beda meskipun namanya sama. “Bentuk” di sini dapat diartikan isinya berbeda, parameternya berbeda, dan tipe datanya berbeda. 

Polymorphisme pada Java ada dua macam yaitu :
1. Polymorphisme statis -----> Menggunakan method Overloading                                                                                                                 
   Method "Overloading" terjadi pada sebuah class yang memiliki nama method yang sama tapi memiliki parameter dan tipe data yang berbeda.
2. Polymorphisme dinamis --> Menggunakan method Overriding                                                                                                                     
   Method "Overriding" adalah sebuah kondisi dimana method yang ada di class utama (Parent class) digunakan kembali pada sub class ( class anak). 
   Polymorphisme dinamis identik dengan menggunakan pewarisan (inheritance), implementasi interface bahkan abstrak class.
   
Jadi dapat disimpulkan bahwa Polymorphisme statis hanya terjadi dalam satu class saja. Sedangkan Polymorphisme dinamis terjadi pada saat ada hubungan dengan class lain seperti inheritance.
