package Vita_Dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Vita_Model.Buku;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author ViTA
 */
public class BukuDb {
    
    public void insert(Buku buku) throws Exception {
        DBHelper db = new DBHelper();
        String query = "insert into buku values(?,?,?,?,?)";
        PreparedStatement ps = (PreparedStatement) db.getKoneksi().prepareStatement(query);
        ps.setString(1, buku.getkodeBuku());
        ps.setString(2, buku.getjudulbuku());
        ps.setString(3, buku.getpengarang());
        ps.setString(4, buku.getpenerbit());
        ps.setString(5, buku.gettahunTerbit());
        ps.executeUpdate();
    }
    
    public void update(Buku buku) throws Exception {
        DBHelper db = new DBHelper();
        String query = "update mahasiswa set nama=?, alamat=?, "
                + "jeniskelamin=?, tanggallahir=? where nobp=?";
        java.sql.PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        ps.setString(1, buku.getkodeBuku());
        ps.setString(2, buku.getjudulBuku());
        ps.setString(3, buku.getpengarang());
        ps.setString(4, buku.getpenerbit());
        ps.setString(5, buku.gettahunTerbit());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws Exception{
        DBHelper db = new DBHelper();
        String query = "delete from mahasiswa where nobp=?";
        PreparedStatement ps = (PreparedStatement) db.getKoneksi().prepareStatement(query);
        ps.setString(1, nobp);
        ps.executeUpdate();
    }
    
    public Buku getBuku(String nobp) throws Exception{
        DBHelper db = new DBHelper();
        String query = "select * from buku where nobp=?";
        PreparedStatement ps = (PreparedStatement) db.getKoneksi().prepareStatement(query);
        ps.setString(1, nobp);
        Buku buku = null;
        java.sql.ResultSet rs = ps.executeQuery();
        if(rs.next()){
            buku = new Buku();
            buku.setkodeBuku(rs.getString(1));
            buku.setjudulBuku(rs.getString(2));
            buku.setpengarang(rs.getString(3));
            buku.setpenerbit(rs.getString(4));
            buku.settahunTerbit(rs.getString(5));
        }
        return buku;
    }
    
    public List<Buku> getAllBuku()  throws Exception{
        DBHelper db = new DBHelper();
        String query = "select * from buku";
        java.sql.PreparedStatement ps = db.getKoneksi().prepareStatement(query);
        List<Buku> list = new ArrayList();
        Buku buku = null;
        java.sql.ResultSet rs = ps.executeQuery();
        while(rs.next()){
            buku = new Buku();
            buku.setkodeBuku(rs.getString(1));
            buku.setjudulBuku(rs.getString(2));
            buku.setpengarang(rs.getString(3));
            buku.setpenerbit(rs.getString(4));
            buku.settahunTerbit(rs.getString(5));
            list.add(buku);
        }
        return list;
    }
}
