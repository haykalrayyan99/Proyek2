package com.rayyan.proyek2;

public class Transaksis extends Koneksi{

    String URL = "http://serverproyek.000webhostapp.com/cobap3/server2.php";
    String url = "";
    String response = "";

    // Menampilkan biodata dari database
    public String tampilUser() {
        try {
            url = URL + "?operasi=view";
            System.out.println("URL Tampil Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String insertTransaksi(String idbarang, String iduser, String qty, String hsb) {
        try {
            url = URL + "?operasi=insert&idbarang=" + idbarang + "&iduser=" + iduser + "&qty=" + qty +"&hsb=" + hsb;
            System.out.println("URL Insert Barang : " + url);
            response = call(url);
        }
        catch (Exception e) {
        }
        return  response;
    }


    public String deleteUser(int iduser) {
        try {
            url = URL + "?operasi=delete&idtransaksi=" + iduser;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }


}
