/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp_Decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Aashish Kumar Yadav
 */
public class compressor {
    
    public static void method(File file) throws IOException{
        String filedirectory = file.getParent();
        
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(filedirectory+"compresedFile.gz");
        GZIPOutputStream gzip = GZIPOutputStream(fos);
        
        byte[] buffer = new byte[1024];
        
        int len;
              while((len=fis.read(buffer))!=-1){
            gzip.write(buffer,0,len);
              }
            gzip.close();
            fos.close();
            fis.close();
    }
              
    public static void main (String[] args) throws IOException{
        
         //File path = new File("/Users/Aashish Kumar Yadav/downloads/compessordecompressor/compressor");
         File path = new File("C:\\Users\\Aashish Kumar Yadav\\Downloads\\compressorDecompressor\\compressor");
         method(path);
    }

    private static GZIPOutputStream GZIPOutputStream(FileOutputStream fos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

