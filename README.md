# Tugas Akhir Mata Kuliah Pemrograman Berbasis Objek 1

Proyek ini merupakan tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1 yaitu aplikasi penjualan sederhana menggunakan bahasa pemrograman java.

## Tentang Aplikasi

Saat aplikasi pertama kali dijalankan, akan menampilkan opsi menu yaitu:
1. Daftar Produk
2. Tambah Produk ke Keranjang
3. Lihat Produk di Keranjang
4. Hapus Produk dari Keranjang
5. Proses Pembayaran
6. Keluar (Exit)

Lalu kemudian setelah menu ditampilkan, sistem akan menerima inputan dari pengguna untuk memilih menu dari daftar menu yang ditampilkan sebelumnya sehingga sistem dapat berinteraksi langsung berdasarkan perintah yang dirimkan oleh pengguna.

## Dokumentasi

Berikut merupakan dokumentasi penggunaan berdasarkan masing-masing opsi menu:

#### 1. Daftar Produk
Menampilkan keseluruhan data produk dalam inventaris yang data tersebut sudah diinput sebelumnya melalui hardcode. 

#### 2. Tambah Produk ke Keranjang
Setelah opsi menu ini dipilih, selanjutnya akan menerima inputan dari pengguna yaitu ID Produk (Unik) sehingga sistem dapat membaca data produk mana yang ingin ditambahkan kedalam keranjang. Kemudian apabila produk ditemukan akan menerima inputan kembali yaitu perintah untuk memasukkan jumlah stok produk yang ingin ditambahkan kedalam keranjang. Setiap sistem menerima inputan dari pengguna, sistem akan memvalidasi sebelum perintah benar-benar dieksekusi.

#### 3. Lihat Produk di Keranjang
Menampilkan data produk yang bersumber dari keranjang yang telah dimasukkan sebelumnya. Ketika tidak ada produk dalam keranjang maka sistem mengeluarkan hasil: Produk sedang kosong.

#### 4. Hapus Produk dari Keranjang
Untuk mengetahui data produk mana yang ingin dihapus dari keranjang, sistem mengharapkan pengguna memasukkan inputan berupa ID Produk (Unik) sehingga apabila produk ditemukan sistem akan menghapusnya dari daftar keranjang. 

#### 5. Proses Pembayaran
Aplikasi ini sangat sederhana sehingga ketika pengguna memilih opsi menu ini akan langsung memproses pembayaran dan mengkosongkan kembali data produk dalam keranjang.

#### 6. Keluar (exit)
Keluar dari aplikasi.

## Usulan nilai

Aplikasi ini mengimplementasikan beberapa konsep dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pengembang

Muhammad Zulfa, 2210010080, NREG 4A BJM
