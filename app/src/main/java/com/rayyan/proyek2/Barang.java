package com.rayyan.proyek2;

public class Barang extends Koneksi{
    String URL = "http://serverproyek.000webhostapp.com/cobap3/server.php";
    String url = "";
    String response = "";

    // Menampilkan biodata dari database
    public String tampilBarang() {
        try {
            url = URL + "?operasi=view";
            System.out.println("URL Tampil Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

    public String tampilBarang1() {
        try {
            url = URL + "?operasi=barang1";
            System.out.println("URL Tampil Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }
    public String tampilBarang2() {
        try {
            url = URL + "?operasi=barang2";
            System.out.println("URL Tampil Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }
    public String tampilBarang3() {
        try {
            url = URL + "?operasi=barang3";
            System.out.println("URL Tampil Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

    // Memasukkan data biodata baru ke database
    public String insertBarang(String kodebarang, String namabarang, String stok, String hargajual, String hargabeli, String jenisbarang) {
        try {
            url = URL + "?operasi=insert&kodebarang=" + kodebarang + "&namabarang=" + namabarang + "&stok="
                    + stok + "&hargajual=" + hargajual +"&hargabeli=" + hargabeli + "&jenisbarang=" + jenisbarang;
            System.out.println("URL Insert Barang : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return  response;
    }

    // Melihat biodata yang diinginkan melalui ID
    public String getBarangyKD (int kodebarang) {
        try {
            url = URL + "?operasi=get_barang_by_kd&kodebarang=" + kodebarang;
            System.out.println("URL Insert Barang : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

    // Mengubah isi biodata yang sudah ada di database
    public String updateBarang (String kodebarang, String namabarang, String stok, String hargajual, String hargabeli, String jenisbarang) {
        try {
            url = URL + "?operasi=update&kodebarang=" + kodebarang + "&namabarang=" + namabarang + "&stok=" + stok
                    + "&hargajual=" + hargajual + "&hargabeli=" + hargabeli + "&jenisbarang=" + jenisbarang;
            System.out.println("URL Insert Barang : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

    // Menghapus salah satu biodata pada database
    public String deleteBarang (int kodebarang) {
        try {
            url = URL + "?operasi=delete&kodebarang=" + kodebarang;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return response;
    }

}
