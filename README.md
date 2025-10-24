#Pertanyaan Percobaan 1#
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
Jawab: 
a. inisialisasi (int i = 1) menetapkan nilai awal variabel penghitung i yang dimulai dari 1
b. kondisi (i <= 10) selama kondisinya benar atau true, blok perulangan akan berhenti ketika i > 10
c. update (i++) setelah satu kali perulangan selesai, i akan bertambah 1 sehingga perulangan berjalan hingga i <= 10
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika 
variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
Jawab: 
a. tertinggi diinisialisasikan dengan angka 0 agar bisa digantikan oleh nilai berapapun yang lebih tinggi dari 0
b. terendah dinisialisasikan dengan 100 agar bisa digantikan oleh nilai berapapun yang lebih rendah dari 100
!!Jika dibalik maka tertinggi tidak akan pernah berubah karena tidak ada nilai mahasiswa yang lebih besar dari 100 dan terendah tidak akan berubah karena tidak ada nilai mahasiswa yang lebih kecil dari 0
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
Jawab:
if(nilai > tertinggi){
    tertinggi = nilai;
} Jika nilai yang baru diinput lebih besar dari nilai tertinggi sebelumnya maka program mengubah nilai tertinggi menjadi nilai tersebut.
if (nilai < terendah) {
    terendah = nilai;
} Jika nilai yang baru diinput lebih kecil dari nilai terendah sebelumnya maka program mengubah nilai terendah menjadi nilai tersebut.
Contoh: tertinggi = 80, terendah = 75, lalu user input 85, karena 80 < 85 maka tertinggi = 85, jika nilai berikutnya 70, maka 70 > 85(false), sehingga tertinggi tidak berubah dan turun ke pemilihan selanjutnya yaitu 70 < 75 (true) maka terendah berubah menjadi 70

#Pertanyaan percobaan 2#
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
Jawab:
a. nilai < 0 || nilai > 100 digunakan untuk memvalidasi input nilai agar hanya menerima angka antara 0 sampai 100
b. continue adalah perintah dalam perulangan untuk melewati input atau proses yang tidak valid dan lanjut ke iterasi berikutnya tanpa menghentikan seluruh program 
2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
Jawab:
Karena variabel i digunakan untuk menentukan urutan input mahasiswa (ke-1, ke-2, dst). Posisi i++ di akhir menjamin bahwa setiap mahasiswa akan diproses sesuai urutan dan tidak terlewat. Jika i++ diletakkan di awal perulangan jumlah data yang diinput berkurang satu
3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
Jawab: 
Jika jumlah mahasiswa yang dimasukkan adalah 19, maka perulangan WHILE akan berjalan sebanyak 19 kali.

#Pertanyaan Percobaan 3#
1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
Jawab:
Perulangan dilakukan 1 kali, karena pada perulangan do-while blok kode di dalam do akan dijalankan terlebih dahulu sebelum kondisi while dicek.
Jadi meskipun nama pelanggan pertama adalah "batal", program tetap menjalankan isi do sekali — baru setelah itu break menghentikan perulangan.
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
Jawab:
Dari kondisi dibawah ini  
if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            } 
Program akan berhenti (keluar dari perulangan do-while) ketika pengguna mengetik “batal”, karena ada perintah break yang memaksa keluar dari loop.